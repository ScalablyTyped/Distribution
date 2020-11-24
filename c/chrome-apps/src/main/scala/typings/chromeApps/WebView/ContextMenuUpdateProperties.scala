package typings.chromeApps.WebView

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextMenuUpdateProperties extends js.Object {
  
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
  implicit class ContextMenuUpdatePropertiesOps[Self <: ContextMenuUpdateProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setContextsVarargs(value: js.Any*): Self = this.set("contexts", js.Array(value :_*))
    
    @scala.inline
    def setContexts(value: js.Array[_]): Self = this.set("contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContexts: Self = this.set("contexts", js.undefined)
    
    @scala.inline
    def setDocumentUrlPatternsVarargs(value: js.Any*): Self = this.set("documentUrlPatterns", js.Array(value :_*))
    
    @scala.inline
    def setDocumentUrlPatterns(value: js.Array[_]): Self = this.set("documentUrlPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentUrlPatterns: Self = this.set("documentUrlPatterns", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setOnclick(value: /* info */ js.Any => Unit): Self = this.set("onclick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnclick: Self = this.set("onclick", js.undefined)
    
    @scala.inline
    def setParentId(value: integer | String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    
    @scala.inline
    def setTargetUrlPatternsVarargs(value: js.Any*): Self = this.set("targetUrlPatterns", js.Array(value :_*))
    
    @scala.inline
    def setTargetUrlPatterns(value: js.Array[_]): Self = this.set("targetUrlPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetUrlPatterns: Self = this.set("targetUrlPatterns", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: ContextType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
