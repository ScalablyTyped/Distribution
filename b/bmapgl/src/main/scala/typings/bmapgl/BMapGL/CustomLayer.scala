package typings.bmapgl.BMapGL

import typings.bmapgl.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomLayer extends TileLayer {
  
  def onhotspotclick(event: Content): Unit = js.native
}
object CustomLayer {
  
  @scala.inline
  def apply(
    getCopyright: () => Copyright,
    getTilesUrl: (Pixel, Double) => String,
    isTransparentPng: () => Boolean,
    onhotspotclick: Content => Unit
  ): CustomLayer = {
    val __obj = js.Dynamic.literal(getCopyright = js.Any.fromFunction0(getCopyright), getTilesUrl = js.Any.fromFunction2(getTilesUrl), isTransparentPng = js.Any.fromFunction0(isTransparentPng), onhotspotclick = js.Any.fromFunction1(onhotspotclick))
    __obj.asInstanceOf[CustomLayer]
  }
  
  @scala.inline
  implicit class CustomLayerMutableBuilder[Self <: CustomLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnhotspotclick(value: Content => Unit): Self = StObject.set(x, "onhotspotclick", js.Any.fromFunction1(value))
  }
}
