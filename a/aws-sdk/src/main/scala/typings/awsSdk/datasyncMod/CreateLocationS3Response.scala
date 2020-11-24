package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLocationS3Response extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the source Amazon S3 bucket location that is created.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.native
}
object CreateLocationS3Response {
  
  @scala.inline
  def apply(): CreateLocationS3Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocationS3Response]
  }
  
  @scala.inline
  implicit class CreateLocationS3ResponseOps[Self <: CreateLocationS3Response] (val x: Self) extends AnyVal {
    
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
    def setLocationArn(value: LocationArn): Self = this.set("LocationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationArn: Self = this.set("LocationArn", js.undefined)
  }
}
