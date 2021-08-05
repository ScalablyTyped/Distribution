package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimension extends StObject {
  
  /**
    * The value to use in the custom metric dimension.
    */
  var Value: DimensionValue
}
object Dimension {
  
  inline def apply(Value: DimensionValue): Dimension = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimension]
  }
  
  extension [Self <: Dimension](x: Self) {
    
    inline def setValue(value: DimensionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
