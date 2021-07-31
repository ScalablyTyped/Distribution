package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestUploadCredentialsInput extends StObject {
  
  /**
    * A unique identifier for a build to get credentials for. You can use either the build ID or ARN value. 
    */
  var BuildId: BuildIdOrArn
}
object RequestUploadCredentialsInput {
  
  @scala.inline
  def apply(BuildId: BuildIdOrArn): RequestUploadCredentialsInput = {
    val __obj = js.Dynamic.literal(BuildId = BuildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestUploadCredentialsInput]
  }
  
  @scala.inline
  implicit class RequestUploadCredentialsInputMutableBuilder[Self <: RequestUploadCredentialsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildId(value: BuildIdOrArn): Self = StObject.set(x, "BuildId", value.asInstanceOf[js.Any])
  }
}
