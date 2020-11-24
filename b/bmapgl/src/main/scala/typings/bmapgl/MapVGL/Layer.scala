package typings.bmapgl.MapVGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Layer extends js.Object {
  
  def destroy(): Unit = js.native
  
  def getData(): js.Array[GeoJSON] = js.native
  
  def getDefaultOptions(): LayerOptions = js.native
  
  def getOptions(): LayerOptions = js.native
  
  def setData(x: js.Array[GeoJSON]): Unit = js.native
  
  def setOptions(x: LayerOptions): Unit = js.native
}
object Layer {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    getData: () => js.Array[GeoJSON],
    getDefaultOptions: () => LayerOptions,
    getOptions: () => LayerOptions,
    setData: js.Array[GeoJSON] => Unit,
    setOptions: LayerOptions => Unit
  ): Layer = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getData = js.Any.fromFunction0(getData), getDefaultOptions = js.Any.fromFunction0(getDefaultOptions), getOptions = js.Any.fromFunction0(getOptions), setData = js.Any.fromFunction1(setData), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[Layer]
  }
  
  @scala.inline
  implicit class LayerOps[Self <: Layer] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetData(value: () => js.Array[GeoJSON]): Self = this.set("getData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultOptions(value: () => LayerOptions): Self = this.set("getDefaultOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOptions(value: () => LayerOptions): Self = this.set("getOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetData(value: js.Array[GeoJSON] => Unit): Self = this.set("setData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOptions(value: LayerOptions => Unit): Self = this.set("setOptions", js.Any.fromFunction1(value))
  }
}
