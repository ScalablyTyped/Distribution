package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileLayer extends js.Object {
  
  def getCopyright(): Copyright = js.native
  
  def getTilesUrl(tileCoord: Pixel, zoom: Double): String = js.native
  
  def isTransparentPng(): Boolean = js.native
}
object TileLayer {
  
  @scala.inline
  def apply(
    getCopyright: () => Copyright,
    getTilesUrl: (Pixel, Double) => String,
    isTransparentPng: () => Boolean
  ): TileLayer = {
    val __obj = js.Dynamic.literal(getCopyright = js.Any.fromFunction0(getCopyright), getTilesUrl = js.Any.fromFunction2(getTilesUrl), isTransparentPng = js.Any.fromFunction0(isTransparentPng))
    __obj.asInstanceOf[TileLayer]
  }
  
  @scala.inline
  implicit class TileLayerOps[Self <: TileLayer] (val x: Self) extends AnyVal {
    
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
    def setGetCopyright(value: () => Copyright): Self = this.set("getCopyright", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTilesUrl(value: (Pixel, Double) => String): Self = this.set("getTilesUrl", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsTransparentPng(value: () => Boolean): Self = this.set("isTransparentPng", js.Any.fromFunction0(value))
  }
}
