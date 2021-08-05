package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expression extends StObject {
  
  /**
    * Return results that match both Dimension objects.
    */
  var And: js.UndefOr[Expressions] = js.undefined
  
  /**
    * The filter based on CostCategory values.
    */
  var CostCategories: js.UndefOr[CostCategoryValues] = js.undefined
  
  /**
    * The specific Dimension to use for Expression.
    */
  var Dimensions: js.UndefOr[DimensionValues] = js.undefined
  
  /**
    * Return results that don't match a Dimension object.
    */
  var Not: js.UndefOr[Expression] = js.undefined
  
  /**
    * Return results that match either Dimension object.
    */
  var Or: js.UndefOr[Expressions] = js.undefined
  
  /**
    * The specific Tag to use for Expression.
    */
  var Tags: js.UndefOr[TagValues] = js.undefined
}
object Expression {
  
  inline def apply(): Expression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expression]
  }
  
  extension [Self <: Expression](x: Self) {
    
    inline def setAnd(value: Expressions): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
    
    inline def setAndUndefined: Self = StObject.set(x, "And", js.undefined)
    
    inline def setAndVarargs(value: Expression*): Self = StObject.set(x, "And", js.Array(value :_*))
    
    inline def setCostCategories(value: CostCategoryValues): Self = StObject.set(x, "CostCategories", value.asInstanceOf[js.Any])
    
    inline def setCostCategoriesUndefined: Self = StObject.set(x, "CostCategories", js.undefined)
    
    inline def setDimensions(value: DimensionValues): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setNot(value: Expression): Self = StObject.set(x, "Not", value.asInstanceOf[js.Any])
    
    inline def setNotUndefined: Self = StObject.set(x, "Not", js.undefined)
    
    inline def setOr(value: Expressions): Self = StObject.set(x, "Or", value.asInstanceOf[js.Any])
    
    inline def setOrUndefined: Self = StObject.set(x, "Or", js.undefined)
    
    inline def setOrVarargs(value: Expression*): Self = StObject.set(x, "Or", js.Array(value :_*))
    
    inline def setTags(value: TagValues): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
