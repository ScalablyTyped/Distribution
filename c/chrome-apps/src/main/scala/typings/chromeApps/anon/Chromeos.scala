package typings.chromeApps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chromeos extends js.Object {
  
  var chromeos: js.UndefOr[String] = js.native
  
  var default: js.UndefOr[String] = js.native
  
  var linux: js.UndefOr[String] = js.native
  
  var mac: js.UndefOr[String] = js.native
  
  var windows: js.UndefOr[String] = js.native
}
object Chromeos {
  
  @scala.inline
  def apply(): Chromeos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chromeos]
  }
  
  @scala.inline
  implicit class ChromeosOps[Self <: Chromeos] (val x: Self) extends AnyVal {
    
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
    def setChromeos(value: String): Self = this.set("chromeos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChromeos: Self = this.set("chromeos", js.undefined)
    
    @scala.inline
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setLinux(value: String): Self = this.set("linux", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinux: Self = this.set("linux", js.undefined)
    
    @scala.inline
    def setMac(value: String): Self = this.set("mac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMac: Self = this.set("mac", js.undefined)
    
    @scala.inline
    def setWindows(value: String): Self = this.set("windows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindows: Self = this.set("windows", js.undefined)
  }
}
