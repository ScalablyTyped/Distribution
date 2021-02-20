package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryOptionsConfiguration extends StObject {
  
  var fetchStrategy: js.UndefOr[FetchStrategySymbol] = js.native
  
  var mergeStrategy: js.UndefOr[MergeStrategySymbol] = js.native
}
object QueryOptionsConfiguration {
  
  @scala.inline
  def apply(): QueryOptionsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptionsConfiguration]
  }
  
  @scala.inline
  implicit class QueryOptionsConfigurationMutableBuilder[Self <: QueryOptionsConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFetchStrategy(value: FetchStrategySymbol): Self = StObject.set(x, "fetchStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchStrategyUndefined: Self = StObject.set(x, "fetchStrategy", js.undefined)
    
    @scala.inline
    def setMergeStrategy(value: MergeStrategySymbol): Self = StObject.set(x, "mergeStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeStrategyUndefined: Self = StObject.set(x, "mergeStrategy", js.undefined)
  }
}
