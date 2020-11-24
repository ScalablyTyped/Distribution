package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateProperties extends js.Object {
  
  /**
    * Optional. Whether the tab should be active. Does not affect whether the window is focused (see windows.update).
    * @since Chrome 16.
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Whether the tab should be discarded automatically by the browser when resources are low.
    * @since Chrome 54.
    */
  var autoDiscardable: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Adds or removes the tab from the current selection.
    * @since Chrome 16.
    */
  var highlighted: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Whether the tab should be muted.
    * @since Chrome 45.
    */
  var muted: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as this tab.
    * @since Chrome 18.
    */
  var openerTabId: js.UndefOr[Double] = js.native
  
  /**
    * Optional. Whether the tab should be pinned.
    * @since Chrome 9.
    */
  var pinned: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Whether the tab should be selected.
    * @deprecated since Chrome 33. Please use highlighted.
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  /** Optional. A URL to navigate the tab to. */
  var url: js.UndefOr[String] = js.native
}
object UpdateProperties {
  
  @scala.inline
  def apply(): UpdateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProperties]
  }
  
  @scala.inline
  implicit class UpdatePropertiesOps[Self <: UpdateProperties] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAutoDiscardable(value: Boolean): Self = this.set("autoDiscardable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDiscardable: Self = this.set("autoDiscardable", js.undefined)
    
    @scala.inline
    def setHighlighted(value: Boolean): Self = this.set("highlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlighted: Self = this.set("highlighted", js.undefined)
    
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    
    @scala.inline
    def setOpenerTabId(value: Double): Self = this.set("openerTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenerTabId: Self = this.set("openerTabId", js.undefined)
    
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
