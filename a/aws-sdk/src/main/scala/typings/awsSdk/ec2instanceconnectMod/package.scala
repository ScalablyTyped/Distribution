package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ec2instanceconnectMod {
  
  type AvailabilityZone = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.ec2instanceconnectMod.ClientApiVersions
  
  type InstanceId = java.lang.String
  
  type InstanceOSUser = java.lang.String
  
  type RequestId = java.lang.String
  
  type SSHPublicKey = java.lang.String
  
  type Success = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-04-02`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.ec2instanceconnectMod._apiVersion | java.lang.String
}
