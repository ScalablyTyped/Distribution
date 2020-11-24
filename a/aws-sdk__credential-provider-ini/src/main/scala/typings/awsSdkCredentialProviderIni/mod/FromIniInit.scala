package typings.awsSdkCredentialProviderIni.mod

import typings.awsSdkSharedIniFileLoader.mod.SharedConfigFiles
import typings.awsSdkSharedIniFileLoader.mod.SharedConfigInit
import typings.awsSdkTypes.credentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromIniInit extends SharedConfigInit {
  
  /**
    * A promise that will be resolved with loaded and parsed credentials files.
    * Used to avoid loading shared config files multiple times.
    */
  var loadedConfig: js.UndefOr[js.Promise[SharedConfigFiles]] = js.native
  
  /**
    * A function that returna a promise fulfilled with an MFA token code for
    * the provided MFA Serial code. If a profile requires an MFA code and
    * `mfaCodeProvider` is not a valid function, the credential provider
    * promise will be rejected.
    *
    * @param mfaSerial The serial code of the MFA device specified.
    */
  var mfaCodeProvider: js.UndefOr[js.Function1[/* mfaSerial */ String, js.Promise[String]]] = js.native
  
  /**
    * The configuration profile to use.
    */
  var profile: js.UndefOr[String] = js.native
  
  /**
    * A function that assumes a role and returns a promise fulfilled with
    * credentials for the assumed role.
    *
    * @param sourceCreds The credentials with which to assume a role.
    * @param params
    */
  var roleAssumer: js.UndefOr[
    js.Function2[
      /* sourceCreds */ Credentials, 
      /* params */ AssumeRoleParams, 
      js.Promise[Credentials]
    ]
  ] = js.native
}
object FromIniInit {
  
  @scala.inline
  def apply(): FromIniInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromIniInit]
  }
  
  @scala.inline
  implicit class FromIniInitOps[Self <: FromIniInit] (val x: Self) extends AnyVal {
    
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
    def setLoadedConfig(value: js.Promise[SharedConfigFiles]): Self = this.set("loadedConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadedConfig: Self = this.set("loadedConfig", js.undefined)
    
    @scala.inline
    def setMfaCodeProvider(value: /* mfaSerial */ String => js.Promise[String]): Self = this.set("mfaCodeProvider", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMfaCodeProvider: Self = this.set("mfaCodeProvider", js.undefined)
    
    @scala.inline
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    
    @scala.inline
    def setRoleAssumer(value: (/* sourceCreds */ Credentials, /* params */ AssumeRoleParams) => js.Promise[Credentials]): Self = this.set("roleAssumer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRoleAssumer: Self = this.set("roleAssumer", js.undefined)
  }
}
