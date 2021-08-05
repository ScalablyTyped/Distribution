package typings.breeze.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsCaseSensitive extends StObject {
  
  var isCaseSensitive: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var usesSql92CompliantStringComparison: js.UndefOr[Boolean] = js.undefined
}
object IsCaseSensitive {
  
  inline def apply(): IsCaseSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsCaseSensitive]
  }
  
  extension [Self <: IsCaseSensitive](x: Self) {
    
    inline def setIsCaseSensitive(value: Boolean): Self = StObject.set(x, "isCaseSensitive", value.asInstanceOf[js.Any])
    
    inline def setIsCaseSensitiveUndefined: Self = StObject.set(x, "isCaseSensitive", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUsesSql92CompliantStringComparison(value: Boolean): Self = StObject.set(x, "usesSql92CompliantStringComparison", value.asInstanceOf[js.Any])
    
    inline def setUsesSql92CompliantStringComparisonUndefined: Self = StObject.set(x, "usesSql92CompliantStringComparison", js.undefined)
  }
}
