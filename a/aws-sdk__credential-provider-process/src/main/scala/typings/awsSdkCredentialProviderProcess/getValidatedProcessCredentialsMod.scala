package typings.awsSdkCredentialProviderProcess

import typings.awsSdkCredentialProviderProcess.processCredentialsMod.ProcessCredentials
import typings.awsSdkTypes.credentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getValidatedProcessCredentialsMod {
  
  @JSImport("@aws-sdk/credential-provider-process/dist-types/getValidatedProcessCredentials", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getValidatedProcessCredentials(profileName: String, data: ProcessCredentials): Credentials = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidatedProcessCredentials")(profileName.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Credentials]
}
