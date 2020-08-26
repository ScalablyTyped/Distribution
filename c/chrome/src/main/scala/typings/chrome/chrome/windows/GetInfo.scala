package typings.chrome.chrome.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInfo extends js.Object {
  /**
    * Optional.
    * If true, the windows.Window object will have a tabs property that contains a list of the tabs.Tab objects. The Tab objects only contain the url, title and favIconUrl properties if the extension's manifest file includes the "tabs" permission.
    */
  var populate: js.UndefOr[Boolean] = js.native
  /**
    * If set, the windows.Window returned will be filtered based on its type. If unset the default filter is set to ['app', 'normal', 'panel', 'popup'], with 'app' and 'panel' window types limited to the extension's own windows.
    * Each one of: "normal", "popup", "panel", "app", or "devtools"
    * @since Chrome 46. Warning: this is the current Beta channel.
    */
  var windowTypes: js.UndefOr[js.Array[String]] = js.native
}

object GetInfo {
  @scala.inline
  def apply(): GetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInfo]
  }
  @scala.inline
  implicit class GetInfoOps[Self <: GetInfo] (val x: Self) extends AnyVal {
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
    def setPopulate(value: Boolean): Self = this.set("populate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopulate: Self = this.set("populate", js.undefined)
    @scala.inline
    def setWindowTypesVarargs(value: String*): Self = this.set("windowTypes", js.Array(value :_*))
    @scala.inline
    def setWindowTypes(value: js.Array[String]): Self = this.set("windowTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowTypes: Self = this.set("windowTypes", js.undefined)
  }
  
}

