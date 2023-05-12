package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Circumference extends StObject {
  
  var circumference: Double
  
  var rotation: Double
}
object Circumference {
  
  inline def apply(circumference: Double, rotation: Double): Circumference = {
    val __obj = js.Dynamic.literal(circumference = circumference.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Circumference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Circumference] (val x: Self) extends AnyVal {
    
    inline def setCircumference(value: Double): Self = StObject.set(x, "circumference", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
  }
}
