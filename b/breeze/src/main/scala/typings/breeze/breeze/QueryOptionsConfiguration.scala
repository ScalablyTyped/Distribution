package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOptionsConfiguration extends StObject {
  
  var fetchStrategy: js.UndefOr[FetchStrategySymbol] = js.undefined
  
  var mergeStrategy: js.UndefOr[MergeStrategySymbol] = js.undefined
}
object QueryOptionsConfiguration {
  
  inline def apply(): QueryOptionsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptionsConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryOptionsConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFetchStrategy(value: FetchStrategySymbol): Self = StObject.set(x, "fetchStrategy", value.asInstanceOf[js.Any])
    
    inline def setFetchStrategyUndefined: Self = StObject.set(x, "fetchStrategy", js.undefined)
    
    inline def setMergeStrategy(value: MergeStrategySymbol): Self = StObject.set(x, "mergeStrategy", value.asInstanceOf[js.Any])
    
    inline def setMergeStrategyUndefined: Self = StObject.set(x, "mergeStrategy", js.undefined)
  }
}
