package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pixel extends StObject {
  
  def equals(other: Pixel): Boolean
  
  var x: Double
  
  var y: Double
}
object Pixel {
  
  inline def apply(equals_ : Pixel => Boolean, x: Double, y: Double): Pixel = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Pixel]
  }
  
  extension [Self <: Pixel](x: Self) {
    
    inline def setEquals_(value: Pixel => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
