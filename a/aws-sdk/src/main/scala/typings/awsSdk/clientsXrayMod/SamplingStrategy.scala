package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SamplingStrategy extends StObject {
  
  /**
    * The name of a sampling rule.
    */
  var Name: js.UndefOr[SamplingStrategyName] = js.undefined
  
  /**
    * The value of a sampling rule.
    */
  var Value: js.UndefOr[NullableDouble] = js.undefined
}
object SamplingStrategy {
  
  inline def apply(): SamplingStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamplingStrategy]
  }
  
  extension [Self <: SamplingStrategy](x: Self) {
    
    inline def setName(value: SamplingStrategyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: NullableDouble): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
