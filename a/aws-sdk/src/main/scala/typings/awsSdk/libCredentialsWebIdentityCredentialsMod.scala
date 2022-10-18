package typings.awsSdk

import typings.awsSdk.clientsStsMod.AssumeRoleWithWebIdentityRequest
import typings.awsSdk.clientsStsMod.AssumeRoleWithWebIdentityResponse
import typings.awsSdk.libConfigBaseMod.ConfigurationOptions
import typings.awsSdk.libCredentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCredentialsWebIdentityCredentialsMod {
  
  @js.native
  trait WebIdentityCredentials extends Credentials {
    
    var data: AssumeRoleWithWebIdentityResponse = js.native
    
    var params: AssumeRoleWithWebIdentityRequest = js.native
  }
  // Needed to expose interfaces on the class
  object WebIdentityCredentials {
    
    type ClientConfiguration = ConfigurationOptions
    
    type WebIdentityCredentialsOptions = AssumeRoleWithWebIdentityRequest
  }
}
