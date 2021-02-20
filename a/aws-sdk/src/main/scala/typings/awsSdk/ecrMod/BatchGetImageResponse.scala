package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetImageResponse extends StObject {
  
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[ImageFailureList] = js.native
  
  /**
    * A list of image objects corresponding to the image references in the request.
    */
  var images: js.UndefOr[ImageList] = js.native
}
object BatchGetImageResponse {
  
  @scala.inline
  def apply(): BatchGetImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetImageResponse]
  }
  
  @scala.inline
  implicit class BatchGetImageResponseMutableBuilder[Self <: BatchGetImageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailures(value: ImageFailureList): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    @scala.inline
    def setFailuresVarargs(value: ImageFailure*): Self = StObject.set(x, "failures", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: ImageList): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value :_*))
  }
}
