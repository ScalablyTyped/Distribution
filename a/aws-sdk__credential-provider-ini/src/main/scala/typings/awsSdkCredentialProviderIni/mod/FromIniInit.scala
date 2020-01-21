package typings.awsSdkCredentialProviderIni.mod

import typings.awsSdkSharedIniFileLoader.mod.SharedConfigFiles
import typings.awsSdkSharedIniFileLoader.mod.SharedConfigInit
import typings.awsSdkTypes.credentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromIniInit extends SharedConfigInit {
  /**
    * A promise that will be resolved with loaded and parsed credentials files.
    * Used to avoid loading shared config files multiple times.
    */
  var loadedConfig: js.UndefOr[js.Promise[SharedConfigFiles]] = js.undefined
  /**
    * A function that returna a promise fulfilled with an MFA token code for
    * the provided MFA Serial code. If a profile requires an MFA code and
    * `mfaCodeProvider` is not a valid function, the credential provider
    * promise will be rejected.
    *
    * @param mfaSerial The serial code of the MFA device specified.
    */
  var mfaCodeProvider: js.UndefOr[js.Function1[/* mfaSerial */ String, js.Promise[String]]] = js.undefined
  /**
    * The configuration profile to use.
    */
  var profile: js.UndefOr[String] = js.undefined
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
  ] = js.undefined
}

object FromIniInit {
  @scala.inline
  def apply(
    configFilepath: String = null,
    filepath: String = null,
    loadedConfig: js.Promise[SharedConfigFiles] = null,
    mfaCodeProvider: /* mfaSerial */ String => js.Promise[String] = null,
    profile: String = null,
    roleAssumer: (/* sourceCreds */ Credentials, /* params */ AssumeRoleParams) => js.Promise[Credentials] = null
  ): FromIniInit = {
    val __obj = js.Dynamic.literal()
    if (configFilepath != null) __obj.updateDynamic("configFilepath")(configFilepath.asInstanceOf[js.Any])
    if (filepath != null) __obj.updateDynamic("filepath")(filepath.asInstanceOf[js.Any])
    if (loadedConfig != null) __obj.updateDynamic("loadedConfig")(loadedConfig.asInstanceOf[js.Any])
    if (mfaCodeProvider != null) __obj.updateDynamic("mfaCodeProvider")(js.Any.fromFunction1(mfaCodeProvider))
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (roleAssumer != null) __obj.updateDynamic("roleAssumer")(js.Any.fromFunction2(roleAssumer))
    __obj.asInstanceOf[FromIniInit]
  }
}

