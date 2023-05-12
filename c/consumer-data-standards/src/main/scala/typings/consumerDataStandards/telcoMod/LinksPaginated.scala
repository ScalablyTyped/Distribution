package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinksPaginated
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * URI to the first page of this set. Mandatory if this response is not the first page
    */
  var first: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI to the last page of this set. Mandatory if this response is not the last page
    */
  var last: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI to the next page of this set. Mandatory if this response is not the last page
    */
  var next: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI to the previous page of this set. Mandatory if this response is not the first page
    */
  var prev: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Fully qualified link that generated the current response document
    */
  var self: String
}
object LinksPaginated {
  
  inline def apply(self: String): LinksPaginated = {
    val __obj = js.Dynamic.literal(self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinksPaginated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinksPaginated] (val x: Self) extends AnyVal {
    
    inline def setFirst(value: String): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setFirstNull: Self = StObject.set(x, "first", null)
    
    inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    inline def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setLastNull: Self = StObject.set(x, "last", null)
    
    inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextNull: Self = StObject.set(x, "next", null)
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setPrevNull: Self = StObject.set(x, "prev", null)
    
    inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    
    inline def setSelf(value: String): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
  }
}
