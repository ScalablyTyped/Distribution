package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tick extends StObject {
  
  var label: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var major: js.UndefOr[Boolean] = js.undefined
  
  var value: Double
}
object Tick {
  
  inline def apply(value: Double): Tick = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tick] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String | js.Array[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLabelVarargs(value: String*): Self = StObject.set(x, "label", js.Array(value*))
    
    inline def setMajor(value: Boolean): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
