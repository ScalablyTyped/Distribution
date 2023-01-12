package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  left :number,   top :number}> */
trait Partialleftnumbertopnumbe extends StObject {
  
  var left: js.UndefOr[Double] = js.undefined
  
  var top: js.UndefOr[Double] = js.undefined
}
object Partialleftnumbertopnumbe {
  
  inline def apply(): Partialleftnumbertopnumbe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialleftnumbertopnumbe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Partialleftnumbertopnumbe] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
