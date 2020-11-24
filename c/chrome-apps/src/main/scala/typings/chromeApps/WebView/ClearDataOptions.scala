package typings.chromeApps.WebView

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options that determine what data should be cleared by *clearData* */
@js.native
trait ClearDataOptions extends js.Object {
  
  /**
    * Clear data accumulated on or after this date,
    * represented in milliseconds since the epoch
    * (accessible via the getTime method of the JavaScript Date object).
    * If absent, defaults to 0 (which would remove all browsing data).
    * @default 0
    */
  var since: js.UndefOr[integer] = js.native
}
object ClearDataOptions {
  
  @scala.inline
  def apply(): ClearDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearDataOptions]
  }
  
  @scala.inline
  implicit class ClearDataOptionsOps[Self <: ClearDataOptions] (val x: Self) extends AnyVal {
    
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
    def setSince(value: integer): Self = this.set("since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSince: Self = this.set("since", js.undefined)
  }
}
