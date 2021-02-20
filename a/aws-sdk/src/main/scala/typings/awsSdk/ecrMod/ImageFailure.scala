package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageFailure extends StObject {
  
  /**
    * The code associated with the failure.
    */
  var failureCode: js.UndefOr[ImageFailureCode] = js.native
  
  /**
    * The reason for the failure.
    */
  var failureReason: js.UndefOr[ImageFailureReason] = js.native
  
  /**
    * The image ID associated with the failure.
    */
  var imageId: js.UndefOr[ImageIdentifier] = js.native
}
object ImageFailure {
  
  @scala.inline
  def apply(): ImageFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageFailure]
  }
  
  @scala.inline
  implicit class ImageFailureMutableBuilder[Self <: ImageFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailureCode(value: ImageFailureCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    @scala.inline
    def setFailureReason(value: ImageFailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    @scala.inline
    def setImageId(value: ImageIdentifier): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
  }
}
