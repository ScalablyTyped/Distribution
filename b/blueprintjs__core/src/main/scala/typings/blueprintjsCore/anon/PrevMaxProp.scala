package typings.blueprintjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrevMaxProp extends StObject {
  
  var prevMaxProp: js.UndefOr[Double] = js.undefined
  
  var prevMinProp: js.UndefOr[Double] = js.undefined
  
  var stepMaxPrecision: Double
  
  var value: String
}
object PrevMaxProp {
  
  inline def apply(stepMaxPrecision: Double, value: String): PrevMaxProp = {
    val __obj = js.Dynamic.literal(stepMaxPrecision = stepMaxPrecision.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrevMaxProp]
  }
  
  extension [Self <: PrevMaxProp](x: Self) {
    
    inline def setPrevMaxProp(value: Double): Self = StObject.set(x, "prevMaxProp", value.asInstanceOf[js.Any])
    
    inline def setPrevMaxPropUndefined: Self = StObject.set(x, "prevMaxProp", js.undefined)
    
    inline def setPrevMinProp(value: Double): Self = StObject.set(x, "prevMinProp", value.asInstanceOf[js.Any])
    
    inline def setPrevMinPropUndefined: Self = StObject.set(x, "prevMinProp", js.undefined)
    
    inline def setStepMaxPrecision(value: Double): Self = StObject.set(x, "stepMaxPrecision", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
