package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLayer
  extends StObject
     with TileLayer {
  
  def onhotspotclick(event: Content): Unit
}
object CustomLayer {
  
  inline def apply(
    getCopyright: () => Copyright,
    getTilesUrl: (Pixel, Double) => String,
    isTransparentPng: () => Boolean,
    onhotspotclick: Content => Unit
  ): CustomLayer = {
    val __obj = js.Dynamic.literal(getCopyright = js.Any.fromFunction0(getCopyright), getTilesUrl = js.Any.fromFunction2(getTilesUrl), isTransparentPng = js.Any.fromFunction0(isTransparentPng), onhotspotclick = js.Any.fromFunction1(onhotspotclick))
    __obj.asInstanceOf[CustomLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomLayer] (val x: Self) extends AnyVal {
    
    inline def setOnhotspotclick(value: Content => Unit): Self = StObject.set(x, "onhotspotclick", js.Any.fromFunction1(value))
  }
}
