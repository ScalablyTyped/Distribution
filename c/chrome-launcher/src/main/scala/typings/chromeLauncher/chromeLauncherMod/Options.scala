package typings.chromeLauncher.chromeLauncherMod

import org.scalablytyped.runtime.StringDictionary
import typings.chromeLauncher.chromeLauncherStrings.error
import typings.chromeLauncher.chromeLauncherStrings.info
import typings.chromeLauncher.chromeLauncherStrings.silent
import typings.chromeLauncher.chromeLauncherStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var chromeFlags: js.UndefOr[js.Array[String]] = js.native
  
  var chromePath: js.UndefOr[String] = js.native
  
  var connectionPollInterval: js.UndefOr[Double] = js.native
  
  var envVars: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
  
  var handleSIGINT: js.UndefOr[Boolean] = js.native
  
  var ignoreDefaultFlags: js.UndefOr[Boolean] = js.native
  
  var logLevel: js.UndefOr[verbose | info | error | silent] = js.native
  
  var maxConnectionRetries: js.UndefOr[Double] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var startingUrl: js.UndefOr[String] = js.native
  
  var userDataDir: js.UndefOr[String | Boolean] = js.native
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
    def setChromeFlagsVarargs(value: String*): Self = this.set("chromeFlags", js.Array(value :_*))
    
    @scala.inline
    def setChromeFlags(value: js.Array[String]): Self = this.set("chromeFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChromeFlags: Self = this.set("chromeFlags", js.undefined)
    
    @scala.inline
    def setChromePath(value: String): Self = this.set("chromePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChromePath: Self = this.set("chromePath", js.undefined)
    
    @scala.inline
    def setConnectionPollInterval(value: Double): Self = this.set("connectionPollInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionPollInterval: Self = this.set("connectionPollInterval", js.undefined)
    
    @scala.inline
    def setEnvVars(value: StringDictionary[js.UndefOr[String]]): Self = this.set("envVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvVars: Self = this.set("envVars", js.undefined)
    
    @scala.inline
    def setHandleSIGINT(value: Boolean): Self = this.set("handleSIGINT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleSIGINT: Self = this.set("handleSIGINT", js.undefined)
    
    @scala.inline
    def setIgnoreDefaultFlags(value: Boolean): Self = this.set("ignoreDefaultFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreDefaultFlags: Self = this.set("ignoreDefaultFlags", js.undefined)
    
    @scala.inline
    def setLogLevel(value: verbose | info | error | silent): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setMaxConnectionRetries(value: Double): Self = this.set("maxConnectionRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConnectionRetries: Self = this.set("maxConnectionRetries", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setStartingUrl(value: String): Self = this.set("startingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartingUrl: Self = this.set("startingUrl", js.undefined)
    
    @scala.inline
    def setUserDataDir(value: String | Boolean): Self = this.set("userDataDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDataDir: Self = this.set("userDataDir", js.undefined)
  }
}
