package typings.carlo.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchOptions extends WindowOptions {
  
  /**
    * Additional arguments to pass to the browser instance.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Browser to be used, defaults to ['stable']
    */
  var channel: js.UndefOr[js.Array[Channel]] = js.native
  
  /**
    * Path to a Chromium or Chrome executable to run instead of the automatically located Chrome.
    * If executablePath is a relative path, then it is resolved relative to current working directory.
    * Carlo is only guaranteed to work with the latest Chrome stable version.
    */
  var executablePath: js.UndefOr[String] = js.native
  
  /**
    * Application icon to be used in the system dock.
    * Either buffer containing PNG or a path to the PNG file on the file system.
    * This feature is only available in Chrome M72+.
    * One can use 'canary' channel to see it in action before M72 hits stable.
    */
  var icon: js.UndefOr[Buffer | String] = js.native
  
  /**
    * Optional parameters to share between Carlo instances.
    */
  var paramsForReuse: js.UndefOr[js.Any] = js.native
  
  /**
    * Application title
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    *  Path to a User Data Directory. This folder is created upon the first app launch and contains user settings and Web storage data. Defaults to '.profile'.
    */
  var userDataDir: js.UndefOr[String] = js.native
}
object LaunchOptions {
  
  @scala.inline
  def apply(): LaunchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchOptions]
  }
  
  @scala.inline
  implicit class LaunchOptionsOps[Self <: LaunchOptions] (val x: Self) extends AnyVal {
    
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setChannelVarargs(value: Channel*): Self = this.set("channel", js.Array(value :_*))
    
    @scala.inline
    def setChannel(value: js.Array[Channel]): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    
    @scala.inline
    def setExecutablePath(value: String): Self = this.set("executablePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutablePath: Self = this.set("executablePath", js.undefined)
    
    @scala.inline
    def setIcon(value: Buffer | String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setParamsForReuse(value: js.Any): Self = this.set("paramsForReuse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParamsForReuse: Self = this.set("paramsForReuse", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUserDataDir(value: String): Self = this.set("userDataDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDataDir: Self = this.set("userDataDir", js.undefined)
  }
}
