package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object outpostsMod {
  
  type AccountId = java.lang.String
  
  type AvailabilityZone = java.lang.String
  
  type AvailabilityZoneId = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.outpostsMod.ClientApiVersions
  
  type InstanceType = java.lang.String
  
  type InstanceTypeListDefinition = js.Array[typings.awsSdk.outpostsMod.InstanceTypeItem]
  
  type LifeCycleStatus = java.lang.String
  
  type MaxResults1000 = scala.Double
  
  type OutpostArn = java.lang.String
  
  type OutpostDescription = java.lang.String
  
  type OutpostId = java.lang.String
  
  type OutpostName = java.lang.String
  
  type OwnerId = java.lang.String
  
  type SiteDescription = java.lang.String
  
  type SiteId = java.lang.String
  
  type SiteName = java.lang.String
  
  type Token = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-12-03`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.outpostsMod._apiVersion | java.lang.String
  
  type outpostListDefinition = js.Array[typings.awsSdk.outpostsMod.Outpost]
  
  type siteListDefinition = js.Array[typings.awsSdk.outpostsMod.Site]
}
