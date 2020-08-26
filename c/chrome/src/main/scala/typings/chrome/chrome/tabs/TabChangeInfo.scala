package typings.chrome.chrome.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabChangeInfo extends js.Object {
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
  implicit class TabChangeInfoOps[Self <: TabChangeInfo] (val x: Self) extends AnyVal {
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
    def setAudible(value: Boolean): Self = this.set("audible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudible: Self = this.set("audible", js.undefined)
    @scala.inline
    def setAutoDiscardable(value: Boolean): Self = this.set("autoDiscardable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoDiscardable: Self = this.set("autoDiscardable", js.undefined)
    @scala.inline
    def setDiscarded(value: Boolean): Self = this.set("discarded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscarded: Self = this.set("discarded", js.undefined)
    @scala.inline
    def setFavIconUrl(value: String): Self = this.set("favIconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFavIconUrl: Self = this.set("favIconUrl", js.undefined)
    @scala.inline
    def setMutedInfo(value: MutedInfo): Self = this.set("mutedInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMutedInfo: Self = this.set("mutedInfo", js.undefined)
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

