package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListOptions[TStyle /* <: ListElementStyle */] extends BoxOptions {
  
  /**
    * Whether the list is interactive and can have items selected (Default: true).
    */
  var interactive: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to automatically override tags and invert fg of item when selected (Default: true).
    */
  var invertSelected: js.UndefOr[Boolean] = js.native
  
  /**
    * An array of strings which become the list's items.
    */
  var items: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A function that is called when vi mode is enabled and the key / is pressed. This function accepts a
    * callback function which should be called with the search string. The search string is then used to
    * jump to an item that is found in items.
    */
  var search: js.UndefOr[js.Function2[/* err */ js.Any, /* value */ js.UndefOr[String], Unit]] = js.native
  
  /**
    * Style for a selected item. Style for an unselected item.
    */
  @JSName("style")
  var style_ListOptions: js.UndefOr[TStyle] = js.native
}
object ListOptions {
  
  @scala.inline
  def apply[TStyle /* <: ListElementStyle */](): ListOptions[TStyle] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOptions[TStyle]]
  }
  
  @scala.inline
  implicit class ListOptionsMutableBuilder[Self <: ListOptions[_], TStyle /* <: ListElementStyle */] (val x: Self with ListOptions[TStyle]) extends AnyVal {
    
    @scala.inline
    def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    @scala.inline
    def setInvertSelected(value: Boolean): Self = StObject.set(x, "invertSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertSelectedUndefined: Self = StObject.set(x, "invertSelected", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setSearch(value: (/* err */ js.Any, /* value */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "search", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    @scala.inline
    def setStyle(value: TStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
