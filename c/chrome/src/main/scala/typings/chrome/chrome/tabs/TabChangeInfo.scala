package typings.chrome.chrome.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabChangeInfo extends StObject {
  
  /**
    * The tab's new audible state.
    * @since Chrome 45.
    */
  var audible: js.UndefOr[Boolean] = js.native
  
  /**
    * The tab's new auto-discardable
    * @since Chrome 54.
    */
  var autoDiscardable: js.UndefOr[Boolean] = js.native
  
  /**
    * The tab's new discarded state.
    * @since Chrome 54.
    */
  var discarded: js.UndefOr[Boolean] = js.native
  
  /**
    * The tab's new favicon URL.
    * @since Chrome 27.
    */
  var favIconUrl: js.UndefOr[String] = js.native
  
  /**
    * The tab's new muted state and the reason for the change.
    * @since Chrome 46. Warning: this is the current Beta channel.
    */
  var mutedInfo: js.UndefOr[MutedInfo] = js.native
  
  /**
    * The tab's new pinned state.
    * @since Chrome 9.
    */
  var pinned: js.UndefOr[Boolean] = js.native
  
  /** Optional. The status of the tab. Can be either loading or complete. */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The tab's new title.
    * @since Chrome 48.
    */
  var title: js.UndefOr[String] = js.native
  
  /** Optional. The tab's URL if it has changed. */
  var url: js.UndefOr[String] = js.native
}
object TabChangeInfo {
  
  @scala.inline
  def apply(): TabChangeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabChangeInfo]
  }
  
  @scala.inline
  implicit class TabChangeInfoMutableBuilder[Self <: TabChangeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudible(value: Boolean): Self = StObject.set(x, "audible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudibleUndefined: Self = StObject.set(x, "audible", js.undefined)
    
    @scala.inline
    def setAutoDiscardable(value: Boolean): Self = StObject.set(x, "autoDiscardable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDiscardableUndefined: Self = StObject.set(x, "autoDiscardable", js.undefined)
    
    @scala.inline
    def setDiscarded(value: Boolean): Self = StObject.set(x, "discarded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscardedUndefined: Self = StObject.set(x, "discarded", js.undefined)
    
    @scala.inline
    def setFavIconUrl(value: String): Self = StObject.set(x, "favIconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFavIconUrlUndefined: Self = StObject.set(x, "favIconUrl", js.undefined)
    
    @scala.inline
    def setMutedInfo(value: MutedInfo): Self = StObject.set(x, "mutedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutedInfoUndefined: Self = StObject.set(x, "mutedInfo", js.undefined)
    
    @scala.inline
    def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
