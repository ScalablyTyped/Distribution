package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelEndpointDataBlob extends js.Object {
  
  /**
    * The byte buffer of the Amazon SageMaker model endpoint input data blob.
    */
  var byteBuffer: js.UndefOr[blob] = js.native
  
  /**
    * The content type of the Amazon SageMaker model endpoint input data blob. 
    */
  var contentType: js.UndefOr[typings.awsSdk.frauddetectorMod.contentType] = js.native
}
object ModelEndpointDataBlob {
  
  @scala.inline
  def apply(): ModelEndpointDataBlob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelEndpointDataBlob]
  }
  
  @scala.inline
  implicit class ModelEndpointDataBlobOps[Self <: ModelEndpointDataBlob] (val x: Self) extends AnyVal {
    
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
    def setByteBuffer(value: blob): Self = this.set("byteBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByteBuffer: Self = this.set("byteBuffer", js.undefined)
    
    @scala.inline
    def setContentType(value: contentType): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
  }
}
