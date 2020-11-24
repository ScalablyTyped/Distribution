package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateImageVersionRequest extends js.Object {
  
  /**
    * The registry path of the container image to use as the starting point for this version. The path is an Amazon Container Registry (ECR) URI in the following format:  &lt;acct-id&gt;.dkr.ecr.&lt;region&gt;.amazonaws.com/&lt;repo-name[:tag] or [@digest]&gt; 
    */
  var BaseImage: ImageBaseImage = js.native
  
  /**
    * A unique ID. If not specified, the AWS CLI and AWS SDKs, such as the SDK for Python (Boto3), add a unique value to the call.
    */
  var ClientToken: typings.awsSdk.sagemakerMod.ClientToken = js.native
  
  /**
    * The ImageName of the Image to create a version of.
    */
  var ImageName: typings.awsSdk.sagemakerMod.ImageName = js.native
}
object CreateImageVersionRequest {
  
  @scala.inline
  def apply(BaseImage: ImageBaseImage, ClientToken: ClientToken, ImageName: ImageName): CreateImageVersionRequest = {
    val __obj = js.Dynamic.literal(BaseImage = BaseImage.asInstanceOf[js.Any], ClientToken = ClientToken.asInstanceOf[js.Any], ImageName = ImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImageVersionRequest]
  }
  
  @scala.inline
  implicit class CreateImageVersionRequestOps[Self <: CreateImageVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaseImage(value: ImageBaseImage): Self = this.set("BaseImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageName(value: ImageName): Self = this.set("ImageName", value.asInstanceOf[js.Any])
  }
}
