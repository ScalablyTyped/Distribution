package typings.blessed.mod.Widgets

import typings.blessed.anon.X
import typings.blessed.mod.Widgets.Types.TPosition
import typings.blessed.mod.Widgets.Types.TTopLeft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coords extends StObject {
  
  var _contentEnd: X
  
  var base: Double
  
  var nobot: TPosition
  
  var noleft: TTopLeft
  
  var noright: TPosition
  
  var notop: TTopLeft
  
  var xi: Double
  
  var xl: Double
  
  var yi: Double
  
  var yl: Double
}
object Coords {
  
  inline def apply(
    _contentEnd: X,
    base: Double,
    nobot: TPosition,
    noleft: TTopLeft,
    noright: TPosition,
    notop: TTopLeft,
    xi: Double,
    xl: Double,
    yi: Double,
    yl: Double
  ): Coords = {
    val __obj = js.Dynamic.literal(_contentEnd = _contentEnd.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], nobot = nobot.asInstanceOf[js.Any], noleft = noleft.asInstanceOf[js.Any], noright = noright.asInstanceOf[js.Any], notop = notop.asInstanceOf[js.Any], xi = xi.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], yi = yi.asInstanceOf[js.Any], yl = yl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coords]
  }
  
  extension [Self <: Coords](x: Self) {
    
    inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setNobot(value: TPosition): Self = StObject.set(x, "nobot", value.asInstanceOf[js.Any])
    
    inline def setNoleft(value: TTopLeft): Self = StObject.set(x, "noleft", value.asInstanceOf[js.Any])
    
    inline def setNoright(value: TPosition): Self = StObject.set(x, "noright", value.asInstanceOf[js.Any])
    
    inline def setNotop(value: TTopLeft): Self = StObject.set(x, "notop", value.asInstanceOf[js.Any])
    
    inline def setXi(value: Double): Self = StObject.set(x, "xi", value.asInstanceOf[js.Any])
    
    inline def setXl(value: Double): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
    
    inline def setYi(value: Double): Self = StObject.set(x, "yi", value.asInstanceOf[js.Any])
    
    inline def setYl(value: Double): Self = StObject.set(x, "yl", value.asInstanceOf[js.Any])
    
    inline def set_contentEnd(value: X): Self = StObject.set(x, "_contentEnd", value.asInstanceOf[js.Any])
  }
}
