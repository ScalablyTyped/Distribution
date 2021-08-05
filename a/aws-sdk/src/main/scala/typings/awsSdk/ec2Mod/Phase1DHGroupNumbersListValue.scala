package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phase1DHGroupNumbersListValue extends StObject {
  
  /**
    * The Diffie-Hellmann group number.
    */
  var Value: js.UndefOr[Integer] = js.undefined
}
object Phase1DHGroupNumbersListValue {
  
  inline def apply(): Phase1DHGroupNumbersListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phase1DHGroupNumbersListValue]
  }
  
  extension [Self <: Phase1DHGroupNumbersListValue](x: Self) {
    
    inline def setValue(value: Integer): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
