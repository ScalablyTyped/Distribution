package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLayersResponse extends js.Object {
  
  /**
    * A list of function layers.
    */
  var Layers: js.UndefOr[LayersList] = js.native
  
  /**
    * A pagination token returned when the response doesn't contain all layers.
    */
  var NextMarker: js.UndefOr[String] = js.native
}
object ListLayersResponse {
  
  @scala.inline
  def apply(): ListLayersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLayersResponse]
  }
  
  @scala.inline
  implicit class ListLayersResponseOps[Self <: ListLayersResponse] (val x: Self) extends AnyVal {
    
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
    def setLayersVarargs(value: LayersListItem*): Self = this.set("Layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: LayersList): Self = this.set("Layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("Layers", js.undefined)
    
    @scala.inline
    def setNextMarker(value: String): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
}
