package typings.bootstrapTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FilterAlgorithm extends StObject {
    
    var filterAlgorithm: String
  }
  object FilterAlgorithm {
    
    inline def apply(filterAlgorithm: String): FilterAlgorithm = {
      val __obj = js.Dynamic.literal(filterAlgorithm = filterAlgorithm.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterAlgorithm]
    }
    
    extension [Self <: FilterAlgorithm](x: Self) {
      
      inline def setFilterAlgorithm(value: String): Self = StObject.set(x, "filterAlgorithm", value.asInstanceOf[js.Any])
    }
  }
  
  trait Limit extends StObject {
    
    var limit: Double
    
    var offset: Double
    
    var order: js.UndefOr[Any] = js.undefined
    
    var search: String
    
    var sort: js.UndefOr[Any] = js.undefined
  }
  object Limit {
    
    inline def apply(limit: Double, offset: Double, search: String): Limit = {
      val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[Limit]
    }
    
    extension [Self <: Limit](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: Any): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSort(value: Any): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  trait TagName extends StObject {
    
    var tagName: Any
  }
  object TagName {
    
    inline def apply(tagName: Any): TagName = {
      val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagName]
    }
    
    extension [Self <: TagName](x: Self) {
      
      inline def setTagName(value: Any): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
}
