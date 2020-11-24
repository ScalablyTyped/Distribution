package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCheckLayerAvailabilityResponse extends js.Object {
  
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[LayerFailureList] = js.native
  
  /**
    * A list of image layer objects corresponding to the image layer references in the request.
    */
  var layers: js.UndefOr[LayerList] = js.native
}
object BatchCheckLayerAvailabilityResponse {
  
  @scala.inline
  def apply(): BatchCheckLayerAvailabilityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCheckLayerAvailabilityResponse]
  }
  
  @scala.inline
  implicit class BatchCheckLayerAvailabilityResponseOps[Self <: BatchCheckLayerAvailabilityResponse] (val x: Self) extends AnyVal {
    
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
    def setFailuresVarargs(value: LayerFailure*): Self = this.set("failures", js.Array(value :_*))
    
    @scala.inline
    def setFailures(value: LayerFailureList): Self = this.set("failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailures: Self = this.set("failures", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: Layer*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: LayerList): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
  }
}
