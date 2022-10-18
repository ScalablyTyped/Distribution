package typings.cypress.typesLodashMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThrottleSettings extends StObject {
  
  /**
    * @see _.leading
    */
  var leading: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @see _.trailing
    */
  var trailing: js.UndefOr[Boolean] = js.undefined
}
object ThrottleSettings {
  
  inline def apply(): ThrottleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThrottleSettings]
  }
  
  extension [Self <: ThrottleSettings](x: Self) {
    
    inline def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
    
    inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
    
    inline def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
    
    inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
  }
}
