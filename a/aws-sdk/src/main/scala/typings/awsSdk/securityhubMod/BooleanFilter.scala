package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanFilter extends StObject {
  
  /**
    * The value of the boolean.
    */
  var Value: js.UndefOr[Boolean] = js.undefined
}
object BooleanFilter {
  
  inline def apply(): BooleanFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BooleanFilter]
  }
  
  extension [Self <: BooleanFilter](x: Self) {
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
