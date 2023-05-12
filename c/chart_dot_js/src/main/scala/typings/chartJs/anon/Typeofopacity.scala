package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofopacity extends StObject {
  
  val duration_1: Double
  
  val easing_1: String
}
object Typeofopacity {
  
  inline def apply(duration_1: Double, easing_1: String): Typeofopacity = {
    val __obj = js.Dynamic.literal(duration_1 = duration_1.asInstanceOf[js.Any], easing_1 = easing_1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofopacity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofopacity] (val x: Self) extends AnyVal {
    
    inline def setDuration_1(value: Double): Self = StObject.set(x, "duration_1", value.asInstanceOf[js.Any])
    
    inline def setEasing_1(value: String): Self = StObject.set(x, "easing_1", value.asInstanceOf[js.Any])
  }
}
