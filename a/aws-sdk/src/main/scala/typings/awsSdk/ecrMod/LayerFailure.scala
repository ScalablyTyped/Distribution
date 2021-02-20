package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerFailure extends StObject {
  
  /**
    * The failure code associated with the failure.
    */
  var failureCode: js.UndefOr[LayerFailureCode] = js.native
  
  /**
    * The reason for the failure.
    */
  var failureReason: js.UndefOr[LayerFailureReason] = js.native
  
  /**
    * The layer digest associated with the failure.
    */
  var layerDigest: js.UndefOr[BatchedOperationLayerDigest] = js.native
}
object LayerFailure {
  
  @scala.inline
  def apply(): LayerFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerFailure]
  }
  
  @scala.inline
  implicit class LayerFailureMutableBuilder[Self <: LayerFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailureCode(value: LayerFailureCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    @scala.inline
    def setFailureReason(value: LayerFailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    @scala.inline
    def setLayerDigest(value: BatchedOperationLayerDigest): Self = StObject.set(x, "layerDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerDigestUndefined: Self = StObject.set(x, "layerDigest", js.undefined)
  }
}
