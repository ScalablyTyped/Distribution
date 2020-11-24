package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestUploadCredentialsInput extends js.Object {
  
  /**
    * A unique identifier for a build to get credentials for. You can use either the build ID or ARN value. 
    */
  var BuildId: BuildIdOrArn = js.native
}
object RequestUploadCredentialsInput {
  
  @scala.inline
  def apply(BuildId: BuildIdOrArn): RequestUploadCredentialsInput = {
    val __obj = js.Dynamic.literal(BuildId = BuildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestUploadCredentialsInput]
  }
  
  @scala.inline
  implicit class RequestUploadCredentialsInputOps[Self <: RequestUploadCredentialsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuildId(value: BuildIdOrArn): Self = this.set("BuildId", value.asInstanceOf[js.Any])
  }
}
