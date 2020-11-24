package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object identitystoreMod {
  
  type AttributePath = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.identitystoreMod.ClientApiVersions
  
  type Filters = js.Array[typings.awsSdk.identitystoreMod.Filter]
  
  type GroupDisplayName = java.lang.String
  
  type Groups = js.Array[typings.awsSdk.identitystoreMod.Group]
  
  type IdentityStoreId = java.lang.String
  
  type MaxResults = scala.Double
  
  type NextToken = java.lang.String
  
  type ResourceId = java.lang.String
  
  type SensitiveStringType = java.lang.String
  
  type UserName = java.lang.String
  
  type Users = js.Array[typings.awsSdk.identitystoreMod.User]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2020-06-15`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.identitystoreMod._apiVersion | java.lang.String
}
