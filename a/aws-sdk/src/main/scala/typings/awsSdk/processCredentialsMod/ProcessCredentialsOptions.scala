package typings.awsSdk.processCredentialsMod

import typings.awsSdk.configBaseMod.HTTPOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessCredentialsOptions extends js.Object {
  
  var filename: js.UndefOr[String] = js.native
  
  var httpOptions: js.UndefOr[HTTPOptions] = js.native
  
  var profile: js.UndefOr[String] = js.native
}
object ProcessCredentialsOptions {
  
  @scala.inline
  def apply(): ProcessCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessCredentialsOptions]
  }
  
  @scala.inline
  implicit class ProcessCredentialsOptionsOps[Self <: ProcessCredentialsOptions] (val x: Self) extends AnyVal {
    
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setHttpOptions(value: HTTPOptions): Self = this.set("httpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpOptions: Self = this.set("httpOptions", js.undefined)
    
    @scala.inline
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
  }
}
