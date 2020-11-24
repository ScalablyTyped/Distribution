package typings.bmapgl.BMapGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapType extends js.Object {
  
  def getMaxZoom(): Double = js.native
  
  def getMinZoom(): Double = js.native
  
  def getName(): String = js.native
  
  def getProjection(): Projection = js.native
  
  def getTextColor(): String = js.native
  
  def getTileLayer(): TileLayer = js.native
  
  def getTips(): String = js.native
}
object MapType {
  
  @scala.inline
  def apply(
    getMaxZoom: () => Double,
    getMinZoom: () => Double,
    getName: () => String,
    getProjection: () => Projection,
    getTextColor: () => String,
    getTileLayer: () => TileLayer,
    getTips: () => String
  ): MapType = {
    val __obj = js.Dynamic.literal(getMaxZoom = js.Any.fromFunction0(getMaxZoom), getMinZoom = js.Any.fromFunction0(getMinZoom), getName = js.Any.fromFunction0(getName), getProjection = js.Any.fromFunction0(getProjection), getTextColor = js.Any.fromFunction0(getTextColor), getTileLayer = js.Any.fromFunction0(getTileLayer), getTips = js.Any.fromFunction0(getTips))
    __obj.asInstanceOf[MapType]
  }
  
  @scala.inline
  implicit class MapTypeOps[Self <: MapType] (val x: Self) extends AnyVal {
    
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
    def setGetMaxZoom(value: () => Double): Self = this.set("getMaxZoom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinZoom(value: () => Double): Self = this.set("getMinZoom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProjection(value: () => Projection): Self = this.set("getProjection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTextColor(value: () => String): Self = this.set("getTextColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTileLayer(value: () => TileLayer): Self = this.set("getTileLayer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTips(value: () => String): Self = this.set("getTips", js.Any.fromFunction0(value))
  }
}
