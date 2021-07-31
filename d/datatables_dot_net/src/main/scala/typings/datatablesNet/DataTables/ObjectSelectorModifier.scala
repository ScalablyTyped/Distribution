package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectSelectorModifier extends StObject {
  
  /**
    * The order modifier provides the ability to control which order the rows are processed in.
    * Values: 'current', 'applied', 'index',  'original'
    */
  var order: js.UndefOr[String] = js.undefined
  
  /**
    * The page modifier allows you to control if the selector should consider all data in the table, regardless of paging, or if only the rows in the currently disabled page should be used.
    * Values: 'all', 'current'
    */
  var page: js.UndefOr[String] = js.undefined
  
  /**
    * The search modifier provides the ability to govern which rows are used by the selector using the search options that are applied to the table.
    * Values: 'none', 'applied', 'removed'
    */
  var search: js.UndefOr[String] = js.undefined
  
  /**
    * The searchPlaceholder modifier provides the ability to provide informational text for an input control when it has no value.
    */
  var searchPlaceholder: js.UndefOr[String] = js.undefined
}
object ObjectSelectorModifier {
  
  @scala.inline
  def apply(): ObjectSelectorModifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectSelectorModifier]
  }
  
  @scala.inline
  implicit class ObjectSelectorModifierMutableBuilder[Self <: ObjectSelectorModifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
  }
}
