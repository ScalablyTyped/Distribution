package typings.awsSdkCredentialProviderIni

import typings.awsSdkCredentialProviderIni.distTypesResolveAssumeRoleCredentialsMod.AssumeRoleParams
import typings.awsSdkCredentialProviderWebIdentity.distTypesFromWebTokenMod.AssumeRoleWithWebIdentityParams
import typings.awsSdkSharedIniFileLoader.distTypesParseKnownFilesMod.SourceProfileInit
import typings.awsSdkTypes.distTypesCredentialsMod.CredentialProvider
import typings.awsSdkTypes.distTypesCredentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromIniMod {
  
  @JSImport("@aws-sdk/credential-provider-ini/dist-types/fromIni", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromIni(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIni")().asInstanceOf[CredentialProvider]
  inline def fromIni(init: FromIniInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIni")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  trait FromIniInit
    extends StObject
       with SourceProfileInit {
    
    /**
      * A function that returns a promise fulfilled with an MFA token code for
      * the provided MFA Serial code. If a profile requires an MFA code and
      * `mfaCodeProvider` is not a valid function, the credential provider
      * promise will be rejected.
      *
      * @param mfaSerial The serial code of the MFA device specified.
      */
    var mfaCodeProvider: js.UndefOr[js.Function1[/* mfaSerial */ String, js.Promise[String]]] = js.undefined
    
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
    
    /**
      * A function that assumes a role with web identity and returns a promise fulfilled with
      * credentials for the assumed role.
      *
      * @param sourceCreds The credentials with which to assume a role.
      * @param params
      */
    var roleAssumerWithWebIdentity: js.UndefOr[
        js.Function1[/* params */ AssumeRoleWithWebIdentityParams, js.Promise[Credentials]]
      ] = js.undefined
  }
  object FromIniInit {
    
    inline def apply(): FromIniInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromIniInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FromIniInit] (val x: Self) extends AnyVal {
      
      inline def setMfaCodeProvider(value: /* mfaSerial */ String => js.Promise[String]): Self = StObject.set(x, "mfaCodeProvider", js.Any.fromFunction1(value))
      
      inline def setMfaCodeProviderUndefined: Self = StObject.set(x, "mfaCodeProvider", js.undefined)
      
      inline def setRoleAssumer(value: (/* sourceCreds */ Credentials, /* params */ AssumeRoleParams) => js.Promise[Credentials]): Self = StObject.set(x, "roleAssumer", js.Any.fromFunction2(value))
      
      inline def setRoleAssumerUndefined: Self = StObject.set(x, "roleAssumer", js.undefined)
      
      inline def setRoleAssumerWithWebIdentity(value: /* params */ AssumeRoleWithWebIdentityParams => js.Promise[Credentials]): Self = StObject.set(x, "roleAssumerWithWebIdentity", js.Any.fromFunction1(value))
      
      inline def setRoleAssumerWithWebIdentityUndefined: Self = StObject.set(x, "roleAssumerWithWebIdentity", js.undefined)
    }
  }
}
