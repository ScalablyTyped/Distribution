package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object worklinkMod {
  
  type AcmCertificateArn = java.lang.String
  
  type AuditStreamArn = java.lang.String
  
  type AuthorizationProviderType = typings.awsSdk.awsSdkStrings.SAML | java.lang.String
  
  type Boolean = scala.Boolean
  
  type Certificate = java.lang.String
  
  type CertificateChain = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.worklinkMod.ClientApiVersions
  
  type CompanyCode = java.lang.String
  
  type DateTime = typings.std.Date
  
  type DeviceManufacturer = java.lang.String
  
  type DeviceModel = java.lang.String
  
  type DeviceOperatingSystemName = java.lang.String
  
  type DeviceOperatingSystemVersion = java.lang.String
  
  type DevicePatchLevel = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.SIGNED_OUT
    - java.lang.String
  */
  type DeviceStatus = typings.awsSdk.worklinkMod._DeviceStatus | java.lang.String
  
  type DeviceSummaryList = js.Array[typings.awsSdk.worklinkMod.DeviceSummary]
  
  type DisplayName = java.lang.String
  
  type DomainName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING_VALIDATION
    - typings.awsSdk.awsSdkStrings.ASSOCIATING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - typings.awsSdk.awsSdkStrings.DISASSOCIATING
    - typings.awsSdk.awsSdkStrings.DISASSOCIATED
    - typings.awsSdk.awsSdkStrings.FAILED_TO_ASSOCIATE
    - typings.awsSdk.awsSdkStrings.FAILED_TO_DISASSOCIATE
    - java.lang.String
  */
  type DomainStatus = typings.awsSdk.worklinkMod._DomainStatus | java.lang.String
  
  type DomainSummaryList = js.Array[typings.awsSdk.worklinkMod.DomainSummary]
  
  type FleetArn = java.lang.String
  
  type FleetName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.DELETED
    - typings.awsSdk.awsSdkStrings.FAILED_TO_CREATE
    - typings.awsSdk.awsSdkStrings.FAILED_TO_DELETE
    - java.lang.String
  */
  type FleetStatus = typings.awsSdk.worklinkMod._FleetStatus | java.lang.String
  
  type FleetSummaryList = js.Array[typings.awsSdk.worklinkMod.FleetSummary]
  
  type Id = java.lang.String
  
  type IdentityProviderType = typings.awsSdk.awsSdkStrings.SAML | java.lang.String
  
  type MaxResults = scala.Double
  
  type NextToken = java.lang.String
  
  type SamlMetadata = java.lang.String
  
  type SecurityGroupId = java.lang.String
  
  type SecurityGroupIds = js.Array[typings.awsSdk.worklinkMod.SecurityGroupId]
  
  type SubnetId = java.lang.String
  
  type SubnetIds = js.Array[typings.awsSdk.worklinkMod.SubnetId]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.worklinkMod.TagKey]
  
  type TagMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.worklinkMod.TagValue]
  
  type TagValue = java.lang.String
  
  type Username = java.lang.String
  
  type VpcId = java.lang.String
  
  type WebsiteAuthorizationProvidersSummaryList = js.Array[typings.awsSdk.worklinkMod.WebsiteAuthorizationProviderSummary]
  
  type WebsiteCaSummaryList = js.Array[typings.awsSdk.worklinkMod.WebsiteCaSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-09-25`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.worklinkMod._apiVersion | java.lang.String
}
