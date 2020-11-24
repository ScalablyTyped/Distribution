package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ssoMod {
  
  type AccessKeyType = java.lang.String
  
  type AccessTokenType = java.lang.String
  
  type AccountIdType = java.lang.String
  
  type AccountListType = js.Array[typings.awsSdk.ssoMod.AccountInfo]
  
  type AccountNameType = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.ssoMod.ClientApiVersions
  
  type EmailAddressType = java.lang.String
  
  type ExpirationTimestampType = scala.Double
  
  type MaxResultType = scala.Double
  
  type NextTokenType = java.lang.String
  
  type RoleListType = js.Array[typings.awsSdk.ssoMod.RoleInfo]
  
  type RoleNameType = java.lang.String
  
  type SecretAccessKeyType = java.lang.String
  
  type SessionTokenType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-06-10`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.ssoMod._apiVersion | java.lang.String
}
