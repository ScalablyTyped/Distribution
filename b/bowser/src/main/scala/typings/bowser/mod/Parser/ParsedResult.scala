package typings.bowser.mod.Parser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedResult extends js.Object {
  
  var browser: BrowserDetails = js.native
  
  var engine: EngineDetails = js.native
  
  var os: OSDetails = js.native
  
  var platform: PlatformDetails = js.native
}
object ParsedResult {
  
  @scala.inline
  def apply(browser: BrowserDetails, engine: EngineDetails, os: OSDetails, platform: PlatformDetails): ParsedResult = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedResult]
  }
  
  @scala.inline
  implicit class ParsedResultOps[Self <: ParsedResult] (val x: Self) extends AnyVal {
    
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
    def setBrowser(value: BrowserDetails): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngine(value: EngineDetails): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: OSDetails): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: PlatformDetails): Self = this.set("platform", value.asInstanceOf[js.Any])
  }
}
