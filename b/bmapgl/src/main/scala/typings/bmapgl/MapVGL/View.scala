package typings.bmapgl.MapVGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait View extends js.Object {
  
  def addLayer(x: Layer): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def getAllLayers(x: Layer): js.Array[Layer] = js.native
  
  def getAllThreeLayers(x: Layer): js.Array[Layer] = js.native
  
  def removeLayer(x: Layer): Unit = js.native
}
object View {
  
  @scala.inline
  def apply(
    addLayer: Layer => Unit,
    destroy: () => Unit,
    getAllLayers: Layer => js.Array[Layer],
    getAllThreeLayers: Layer => js.Array[Layer],
    removeLayer: Layer => Unit
  ): View = {
    val __obj = js.Dynamic.literal(addLayer = js.Any.fromFunction1(addLayer), destroy = js.Any.fromFunction0(destroy), getAllLayers = js.Any.fromFunction1(getAllLayers), getAllThreeLayers = js.Any.fromFunction1(getAllThreeLayers), removeLayer = js.Any.fromFunction1(removeLayer))
    __obj.asInstanceOf[View]
  }
  
  @scala.inline
  implicit class ViewOps[Self <: View] (val x: Self) extends AnyVal {
    
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
    def setAddLayer(value: Layer => Unit): Self = this.set("addLayer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAllLayers(value: Layer => js.Array[Layer]): Self = this.set("getAllLayers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAllThreeLayers(value: Layer => js.Array[Layer]): Self = this.set("getAllThreeLayers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveLayer(value: Layer => Unit): Self = this.set("removeLayer", js.Any.fromFunction1(value))
  }
}
