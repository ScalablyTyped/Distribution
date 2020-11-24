package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object s3outpostsMod {
  
  type CidrBlock = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.s3outpostsMod.ClientApiVersions
  
  type CreationTime = typings.std.Date
  
  type EndpointArn = java.lang.String
  
  type EndpointId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - java.lang.String
  */
  type EndpointStatus = typings.awsSdk.s3outpostsMod._EndpointStatus | java.lang.String
  
  type Endpoints = js.Array[typings.awsSdk.s3outpostsMod.Endpoint]
  
  type MaxResults = scala.Double
  
  type NetworkInterfaceId = java.lang.String
  
  type NetworkInterfaces = js.Array[typings.awsSdk.s3outpostsMod.NetworkInterface]
  
  type NextToken = java.lang.String
  
  type OutpostId = java.lang.String
  
  type SecurityGroupId = java.lang.String
  
  type SubnetId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-07-25`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.s3outpostsMod._apiVersion | java.lang.String
}
