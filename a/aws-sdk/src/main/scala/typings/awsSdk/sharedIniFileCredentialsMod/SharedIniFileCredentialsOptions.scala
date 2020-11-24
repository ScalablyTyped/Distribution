package typings.awsSdk.sharedIniFileCredentialsMod

import typings.awsSdk.configBaseMod.HTTPOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedIniFileCredentialsOptions extends js.Object {
  
  var callback: js.UndefOr[js.Function1[/* err */ js.UndefOr[Error], Unit]] = js.native
  
  var disableAssumeRole: js.UndefOr[Boolean] = js.native
  
  var filename: js.UndefOr[String] = js.native
  
  var httpOptions: js.UndefOr[HTTPOptions] = js.native
  
  var profile: js.UndefOr[String] = js.native
  
  var tokenCodeFn: js.UndefOr[
    js.Function2[
      /* mfaSerial */ String, 
      /* callback */ js.Function2[/* err */ js.UndefOr[Error], /* token */ js.UndefOr[String], Unit], 
      Unit
    ]
  ] = js.native
}
object SharedIniFileCredentialsOptions {
  
  @scala.inline
  def apply(): SharedIniFileCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedIniFileCredentialsOptions]
  }
  
  @scala.inline
  implicit class SharedIniFileCredentialsOptionsOps[Self <: SharedIniFileCredentialsOptions] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: /* err */ js.UndefOr[Error] => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setDisableAssumeRole(value: Boolean): Self = this.set("disableAssumeRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAssumeRole: Self = this.set("disableAssumeRole", js.undefined)
    
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
    
    @scala.inline
    def setTokenCodeFn(
      value: (/* mfaSerial */ String, /* callback */ js.Function2[/* err */ js.UndefOr[Error], /* token */ js.UndefOr[String], Unit]) => Unit
    ): Self = this.set("tokenCodeFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTokenCodeFn: Self = this.set("tokenCodeFn", js.undefined)
  }
}
