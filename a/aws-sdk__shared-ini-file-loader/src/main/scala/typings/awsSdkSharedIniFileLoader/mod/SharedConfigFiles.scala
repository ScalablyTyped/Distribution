package typings.awsSdkSharedIniFileLoader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedConfigFiles extends js.Object {
  
  var configFile: ParsedIniData = js.native
  
  var credentialsFile: ParsedIniData = js.native
}
object SharedConfigFiles {
  
  @scala.inline
  def apply(configFile: ParsedIniData, credentialsFile: ParsedIniData): SharedConfigFiles = {
    val __obj = js.Dynamic.literal(configFile = configFile.asInstanceOf[js.Any], credentialsFile = credentialsFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedConfigFiles]
  }
  
  @scala.inline
  implicit class SharedConfigFilesOps[Self <: SharedConfigFiles] (val x: Self) extends AnyVal {
    
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
    def setConfigFile(value: ParsedIniData): Self = this.set("configFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsFile(value: ParsedIniData): Self = this.set("credentialsFile", value.asInstanceOf[js.Any])
  }
}
