package typings.d3OrgChart.anon

import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsSvg extends StObject {
  
  var isSvg: js.UndefOr[Boolean] = js.undefined
  
  var node: SVGElement
  
  var onAlreadySerialized: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onLoad: js.UndefOr[js.Function1[/* s */ String, Unit]] = js.undefined
  
  var save: js.UndefOr[Boolean] = js.undefined
  
  var scale: js.UndefOr[Double] = js.undefined
}
object IsSvg {
  
  inline def apply(node: SVGElement): IsSvg = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSvg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsSvg] (val x: Self) extends AnyVal {
    
    inline def setIsSvg(value: Boolean): Self = StObject.set(x, "isSvg", value.asInstanceOf[js.Any])
    
    inline def setIsSvgUndefined: Self = StObject.set(x, "isSvg", js.undefined)
    
    inline def setNode(value: SVGElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setOnAlreadySerialized(value: () => Unit): Self = StObject.set(x, "onAlreadySerialized", js.Any.fromFunction0(value))
    
    inline def setOnAlreadySerializedUndefined: Self = StObject.set(x, "onAlreadySerialized", js.undefined)
    
    inline def setOnLoad(value: /* s */ String => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setSave(value: Boolean): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
