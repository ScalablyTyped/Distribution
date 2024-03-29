package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'left' | 'top' | 'bottom' | 'right', number> */
trait Recordlefttopbottomrightn extends StObject {
  
  var bottom: Double
  
  var left: Double
  
  var right: Double
  
  var top: Double
}
object Recordlefttopbottomrightn {
  
  inline def apply(bottom: Double, left: Double, right: Double, top: Double): Recordlefttopbottomrightn = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordlefttopbottomrightn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Recordlefttopbottomrightn] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
