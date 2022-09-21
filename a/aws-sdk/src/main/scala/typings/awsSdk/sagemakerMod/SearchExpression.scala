package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchExpression extends StObject {
  
  /**
    * A list of filter objects.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * A list of nested filter objects.
    */
  var NestedFilters: js.UndefOr[NestedFiltersList] = js.undefined
  
  /**
    * A Boolean operator used to evaluate the search expression. If you want every conditional statement in all lists to be satisfied for the entire search expression to be true, specify And. If only a single conditional statement needs to be true for the entire search expression to be true, specify Or. The default value is And.
    */
  var Operator: js.UndefOr[BooleanOperator] = js.undefined
  
  /**
    * A list of search expression objects.
    */
  var SubExpressions: js.UndefOr[SearchExpressionList] = js.undefined
}
object SearchExpression {
  
  inline def apply(): SearchExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchExpression]
  }
  
  extension [Self <: SearchExpression](x: Self) {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setNestedFilters(value: NestedFiltersList): Self = StObject.set(x, "NestedFilters", value.asInstanceOf[js.Any])
    
    inline def setNestedFiltersUndefined: Self = StObject.set(x, "NestedFilters", js.undefined)
    
    inline def setNestedFiltersVarargs(value: NestedFilters*): Self = StObject.set(x, "NestedFilters", js.Array(value*))
    
    inline def setOperator(value: BooleanOperator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "Operator", js.undefined)
    
    inline def setSubExpressions(value: SearchExpressionList): Self = StObject.set(x, "SubExpressions", value.asInstanceOf[js.Any])
    
    inline def setSubExpressionsUndefined: Self = StObject.set(x, "SubExpressions", js.undefined)
    
    inline def setSubExpressionsVarargs(value: SearchExpression*): Self = StObject.set(x, "SubExpressions", js.Array(value*))
  }
}
