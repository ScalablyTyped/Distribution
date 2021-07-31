package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteImageResponse extends StObject {
  
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[ImageFailureList] = js.undefined
  
  /**
    * The image IDs of the deleted images.
    */
  var imageIds: js.UndefOr[ImageIdentifierList] = js.undefined
}
object BatchDeleteImageResponse {
  
  @scala.inline
  def apply(): BatchDeleteImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteImageResponse]
  }
  
  @scala.inline
  implicit class BatchDeleteImageResponseMutableBuilder[Self <: BatchDeleteImageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailures(value: ImageFailureList): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    @scala.inline
    def setFailuresVarargs(value: ImageFailure*): Self = StObject.set(x, "failures", js.Array(value :_*))
    
    @scala.inline
    def setImageIds(value: ImageIdentifierList): Self = StObject.set(x, "imageIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdsUndefined: Self = StObject.set(x, "imageIds", js.undefined)
    
    @scala.inline
    def setImageIdsVarargs(value: ImageIdentifier*): Self = StObject.set(x, "imageIds", js.Array(value :_*))
  }
}
