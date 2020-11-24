package typings.chromeApps.chrome.extensionTypes

import typings.chromeApps.chrome.extensionTypes.internal.InjectDetailsBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InjectCodeDetails extends InjectDetailsBase {
  
  /**
    * JavaScript or CSS code to inject.
    * **⚠ Warning**
    * Be careful using the code parameter.
    * Incorrect use of it may open your app
    * to cross site scripting attacks.
    * @see[More information]{@link https://en.wikipedia.org/wiki/Cross-site_scripting}
    */
  var code: String = js.native
}
object InjectCodeDetails {
  
  @scala.inline
  def apply(code: String, cssOrigin: CSSOrigin, runAt: RunAt): InjectCodeDetails = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], cssOrigin = cssOrigin.asInstanceOf[js.Any], runAt = runAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectCodeDetails]
  }
  
  @scala.inline
  implicit class InjectCodeDetailsOps[Self <: InjectCodeDetails] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
  }
}
