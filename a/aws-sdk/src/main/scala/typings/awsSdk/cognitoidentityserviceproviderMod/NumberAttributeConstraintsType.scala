package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberAttributeConstraintsType extends StObject {
  
  /**
    * The maximum value of an attribute that is of the number data type.
    */
  var MaxValue: js.UndefOr[StringType] = js.undefined
  
  /**
    * The minimum value of an attribute that is of the number data type.
    */
  var MinValue: js.UndefOr[StringType] = js.undefined
}
object NumberAttributeConstraintsType {
  
  inline def apply(): NumberAttributeConstraintsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberAttributeConstraintsType]
  }
  
  extension [Self <: NumberAttributeConstraintsType](x: Self) {
    
    inline def setMaxValue(value: StringType): Self = StObject.set(x, "MaxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "MaxValue", js.undefined)
    
    inline def setMinValue(value: StringType): Self = StObject.set(x, "MinValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "MinValue", js.undefined)
  }
}
