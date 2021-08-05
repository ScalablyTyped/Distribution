package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeFilter extends StObject {
  
  /**
    * Performs a logical AND operation on all supplied filters.
    */
  var AndAllFilters: js.UndefOr[AttributeFilterList] = js.undefined
  
  /**
    * Returns true when a document contains all of the specified document attributes. This filter is only applicable to StringListValue metadata.
    */
  var ContainsAll: js.UndefOr[DocumentAttribute] = js.undefined
  
  /**
    * Returns true when a document contains any of the specified document attributes. This filter is only applicable to StringListValue metadata.
    */
  var ContainsAny: js.UndefOr[DocumentAttribute] = js.undefined
  
  /**
    * Performs an equals operation on two document attributes.
    */
  var EqualsTo: js.UndefOr[DocumentAttribute] = js.undefined
  
  /**
    * Performs a greater than operation on two document attributes. Use with a document attribute of type Integer or Long.
    */
  var GreaterThan: js.UndefOr[DocumentAttribute] = js.undefined
  
  /**
    * Performs a greater or equals than operation on two document attributes. Use with a document attribute of type Integer or Long.
    */
  var GreaterThanOrEquals: js.UndefOr[DocumentAttribute] = js.undefined
  
  /**
    * Performs a less than operation on two document attributes. Use with a document attribute of type Integer or Long.
    */
  var LessThan: js.UndefOr[DocumentAttribute] = js.undefined
  
  /**
    * Performs a less than or equals operation on two document attributes. Use with a document attribute of type Integer or Long.
    */
  var LessThanOrEquals: js.UndefOr[DocumentAttribute] = js.undefined
  
  /**
    * Performs a logical NOT operation on all supplied filters.
    */
  var NotFilter: js.UndefOr[AttributeFilter] = js.undefined
  
  /**
    * Performs a logical OR operation on all supplied filters.
    */
  var OrAllFilters: js.UndefOr[AttributeFilterList] = js.undefined
}
object AttributeFilter {
  
  inline def apply(): AttributeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeFilter]
  }
  
  extension [Self <: AttributeFilter](x: Self) {
    
    inline def setAndAllFilters(value: AttributeFilterList): Self = StObject.set(x, "AndAllFilters", value.asInstanceOf[js.Any])
    
    inline def setAndAllFiltersUndefined: Self = StObject.set(x, "AndAllFilters", js.undefined)
    
    inline def setAndAllFiltersVarargs(value: AttributeFilter*): Self = StObject.set(x, "AndAllFilters", js.Array(value :_*))
    
    inline def setContainsAll(value: DocumentAttribute): Self = StObject.set(x, "ContainsAll", value.asInstanceOf[js.Any])
    
    inline def setContainsAllUndefined: Self = StObject.set(x, "ContainsAll", js.undefined)
    
    inline def setContainsAny(value: DocumentAttribute): Self = StObject.set(x, "ContainsAny", value.asInstanceOf[js.Any])
    
    inline def setContainsAnyUndefined: Self = StObject.set(x, "ContainsAny", js.undefined)
    
    inline def setEqualsTo(value: DocumentAttribute): Self = StObject.set(x, "EqualsTo", value.asInstanceOf[js.Any])
    
    inline def setEqualsToUndefined: Self = StObject.set(x, "EqualsTo", js.undefined)
    
    inline def setGreaterThan(value: DocumentAttribute): Self = StObject.set(x, "GreaterThan", value.asInstanceOf[js.Any])
    
    inline def setGreaterThanOrEquals(value: DocumentAttribute): Self = StObject.set(x, "GreaterThanOrEquals", value.asInstanceOf[js.Any])
    
    inline def setGreaterThanOrEqualsUndefined: Self = StObject.set(x, "GreaterThanOrEquals", js.undefined)
    
    inline def setGreaterThanUndefined: Self = StObject.set(x, "GreaterThan", js.undefined)
    
    inline def setLessThan(value: DocumentAttribute): Self = StObject.set(x, "LessThan", value.asInstanceOf[js.Any])
    
    inline def setLessThanOrEquals(value: DocumentAttribute): Self = StObject.set(x, "LessThanOrEquals", value.asInstanceOf[js.Any])
    
    inline def setLessThanOrEqualsUndefined: Self = StObject.set(x, "LessThanOrEquals", js.undefined)
    
    inline def setLessThanUndefined: Self = StObject.set(x, "LessThan", js.undefined)
    
    inline def setNotFilter(value: AttributeFilter): Self = StObject.set(x, "NotFilter", value.asInstanceOf[js.Any])
    
    inline def setNotFilterUndefined: Self = StObject.set(x, "NotFilter", js.undefined)
    
    inline def setOrAllFilters(value: AttributeFilterList): Self = StObject.set(x, "OrAllFilters", value.asInstanceOf[js.Any])
    
    inline def setOrAllFiltersUndefined: Self = StObject.set(x, "OrAllFilters", js.undefined)
    
    inline def setOrAllFiltersVarargs(value: AttributeFilter*): Self = StObject.set(x, "OrAllFilters", js.Array(value :_*))
  }
}
