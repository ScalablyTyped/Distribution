package typings.browserslist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /** path to config if you want to set it manually */
  var config: js.UndefOr[String] = js.native
  
  /** Disable security checks for extend query.  */
  var dangerousExtend: js.UndefOr[Boolean] = js.native
  
  /** what environment section use from config */
  var env: js.UndefOr[String] = js.native
  
  /** do not throw on direct query (like ie 12). */
  var ignoreUnknownVersions: js.UndefOr[Boolean] = js.native
  
  /** Use desktop browsers if Can I Use doesn’t have data about this mobile version */
  var mobileToDesktop: js.UndefOr[Boolean] = js.native
  
  /** file or a directory path to look for config file */
  var path: js.UndefOr[String] = js.native
  
  /** custom usage statistics data */
  var stats: js.UndefOr[Stats] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: String): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setDangerousExtend(value: Boolean): Self = this.set("dangerousExtend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDangerousExtend: Self = this.set("dangerousExtend", js.undefined)
    
    @scala.inline
    def setEnv(value: String): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setIgnoreUnknownVersions(value: Boolean): Self = this.set("ignoreUnknownVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreUnknownVersions: Self = this.set("ignoreUnknownVersions", js.undefined)
    
    @scala.inline
    def setMobileToDesktop(value: Boolean): Self = this.set("mobileToDesktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileToDesktop: Self = this.set("mobileToDesktop", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setStats(value: Stats): Self = this.set("stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
  }
}
