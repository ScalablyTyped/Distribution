package typings.chromeApps.WebView

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextMenuUpdateProperties extends StObject {
  
  /**
    * The state of a checkbox or radio item: true for selected and false for unselected.
    * Only one radio item can be selected at a time in a given group of radio items.
    */
  var checked: js.UndefOr[Boolean] = js.native
  
  /**
    * List of contexts this menu item will appear in.
    */
  var contexts: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Lets you restrict the item to apply only to documents whose URL matches one of the given patterns.
    * (This applies to frames as well.)
    */
  var documentUrlPatterns: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Whether this context menu item is enabled or disabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A function that will be called back when the menu item is clicked.
    * @param callback
    */
  var onclick: js.UndefOr[js.Function1[/* info */ js.Any, Unit]] = js.native
  
  /**
    * The ID of a parent menu item; this makes the item a child of a previously added item. <em>Note:</em> You cannot change an item to be a child of one of its own descendants.
    */
  var parentId: js.UndefOr[integer | String] = js.native
  
  /**
    * Similar to documentUrlPatterns, but lets you filter based on the src attribute of img/audio/video tags and the href of anchor tags.
    */
  var targetUrlPatterns: js.UndefOr[js.Array[_]] = js.native
  
  /** The text to be displayed in the item */
  var title: js.UndefOr[String] = js.native
  
  /** The type of menu item. */
  var `type`: js.UndefOr[ContextType] = js.native
}
object ContextMenuUpdateProperties {
  
  @scala.inline
  def apply(): ContextMenuUpdateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuUpdateProperties]
  }
  
  @scala.inline
  implicit class ContextMenuUpdatePropertiesMutableBuilder[Self <: ContextMenuUpdateProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setContexts(value: js.Array[_]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    @scala.inline
    def setContextsVarargs(value: js.Any*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    @scala.inline
    def setDocumentUrlPatterns(value: js.Array[_]): Self = StObject.set(x, "documentUrlPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUrlPatternsUndefined: Self = StObject.set(x, "documentUrlPatterns", js.undefined)
    
    @scala.inline
    def setDocumentUrlPatternsVarargs(value: js.Any*): Self = StObject.set(x, "documentUrlPatterns", js.Array(value :_*))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setOnclick(value: /* info */ js.Any => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    @scala.inline
    def setParentId(value: integer | String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    @scala.inline
    def setTargetUrlPatterns(value: js.Array[_]): Self = StObject.set(x, "targetUrlPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUrlPatternsUndefined: Self = StObject.set(x, "targetUrlPatterns", js.undefined)
    
    @scala.inline
    def setTargetUrlPatternsVarargs(value: js.Any*): Self = StObject.set(x, "targetUrlPatterns", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: ContextType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
