package typings.desmos.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MathCoordinates extends StObject {
  
  var mathCoordinates: Left
  
  var pixelCoordinates: Left
}
object MathCoordinates {
  
  inline def apply(mathCoordinates: Left, pixelCoordinates: Left): MathCoordinates = {
    val __obj = js.Dynamic.literal(mathCoordinates = mathCoordinates.asInstanceOf[js.Any], pixelCoordinates = pixelCoordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[MathCoordinates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MathCoordinates] (val x: Self) extends AnyVal {
    
    inline def setMathCoordinates(value: Left): Self = StObject.set(x, "mathCoordinates", value.asInstanceOf[js.Any])
    
    inline def setPixelCoordinates(value: Left): Self = StObject.set(x, "pixelCoordinates", value.asInstanceOf[js.Any])
  }
}
