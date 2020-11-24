package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object marketplaceentitlementserviceMod {
  
  type Boolean = scala.Boolean
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.marketplaceentitlementserviceMod.ClientApiVersions
  
  type Double = scala.Double
  
  type EntitlementList = js.Array[typings.awsSdk.marketplaceentitlementserviceMod.Entitlement]
  
  type FilterValue = java.lang.String
  
  type FilterValueList = js.Array[typings.awsSdk.marketplaceentitlementserviceMod.FilterValue]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CUSTOMER_IDENTIFIER
    - typings.awsSdk.awsSdkStrings.DIMENSION
    - java.lang.String
  */
  type GetEntitlementFilterName = typings.awsSdk.marketplaceentitlementserviceMod._GetEntitlementFilterName | java.lang.String
  
  type GetEntitlementFilters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.marketplaceentitlementserviceMod.FilterValueList]
  
  type Integer = scala.Double
  
  type NonEmptyString = java.lang.String
  
  type ProductCode = java.lang.String
  
  type String = java.lang.String
  
  type Timestamp = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-01-11`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.marketplaceentitlementserviceMod._apiVersion | java.lang.String
}
