package typings.awsSdkEc2ErrorUnmarshaller.constantsMod

import typings.awsSdkEc2ErrorUnmarshaller.anon.Error
import typings.awsSdkEc2ErrorUnmarshaller.anon.RequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedLegacyErrorResponse extends js.Object {
  
  @JSName("$metadata")
  var $metadata: RequestId = js.native
  
  var Errors: js.UndefOr[Error] = js.native
}
object ParsedLegacyErrorResponse {
  
  @scala.inline
  def apply($metadata: RequestId): ParsedLegacyErrorResponse = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedLegacyErrorResponse]
  }
  
  @scala.inline
  implicit class ParsedLegacyErrorResponseOps[Self <: ParsedLegacyErrorResponse] (val x: Self) extends AnyVal {
    
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
    def set$metadata(value: RequestId): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: Error): Self = this.set("Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
  }
}
