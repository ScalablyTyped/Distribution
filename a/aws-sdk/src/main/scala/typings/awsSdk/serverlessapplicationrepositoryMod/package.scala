package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object serverlessapplicationrepositoryMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CAPABILITY_IAM
    - typings.awsSdk.awsSdkStrings.CAPABILITY_NAMED_IAM
    - typings.awsSdk.awsSdkStrings.CAPABILITY_AUTO_EXPAND
    - typings.awsSdk.awsSdkStrings.CAPABILITY_RESOURCE_POLICY
    - java.lang.String
  */
  type Capability = typings.awsSdk.serverlessapplicationrepositoryMod._Capability | java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.serverlessapplicationrepositoryMod.ClientApiVersions
  
  type MaxItems = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PREPARING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.EXPIRED
    - java.lang.String
  */
  type Status = typings.awsSdk.serverlessapplicationrepositoryMod._Status | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-09-08`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.serverlessapplicationrepositoryMod._apiVersion | java.lang.String
  
  type boolean = scala.Boolean
  
  type integer = scala.Double
  
  type listOfApplicationDependencySummary = js.Array[typings.awsSdk.serverlessapplicationrepositoryMod.ApplicationDependencySummary]
  
  type listOfApplicationPolicyStatement = js.Array[typings.awsSdk.serverlessapplicationrepositoryMod.ApplicationPolicyStatement]
  
  type listOfApplicationSummary = js.Array[typings.awsSdk.serverlessapplicationrepositoryMod.ApplicationSummary]
  
  type listOfCapability = js.Array[typings.awsSdk.serverlessapplicationrepositoryMod.Capability]
  
  type listOfParameterDefinition = js.Array[typings.awsSdk.serverlessapplicationrepositoryMod.ParameterDefinition]
  
  type listOfParameterValue = js.Array[typings.awsSdk.serverlessapplicationrepositoryMod.ParameterValue]
  
  type listOfRollbackTrigger = js.Array[typings.awsSdk.serverlessapplicationrepositoryMod.RollbackTrigger]
  
  type listOfString = js.Array[typings.awsSdk.serverlessapplicationrepositoryMod.string]
  
  type listOfTag = js.Array[typings.awsSdk.serverlessapplicationrepositoryMod.Tag]
  
  type listOfVersionSummary = js.Array[typings.awsSdk.serverlessapplicationrepositoryMod.VersionSummary]
  
  type string = java.lang.String
}
