package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofanimations extends StObject {
  
  val numbers: Typeofnumbers
  
  val opacity: Typeofopacity
}
object Typeofanimations {
  
  inline def apply(numbers: Typeofnumbers, opacity: Typeofopacity): Typeofanimations = {
    val __obj = js.Dynamic.literal(numbers = numbers.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofanimations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofanimations] (val x: Self) extends AnyVal {
    
    inline def setNumbers(value: Typeofnumbers): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Typeofopacity): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
  }
}
