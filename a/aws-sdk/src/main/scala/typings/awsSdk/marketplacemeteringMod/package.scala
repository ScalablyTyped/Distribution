package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object marketplacemeteringMod {
  
  type AllocatedUsageQuantity = scala.Double
  
  type Boolean = scala.Boolean
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.marketplacemeteringMod.ClientApiVersions
  
  type CustomerIdentifier = java.lang.String
  
  type NonEmptyString = java.lang.String
  
  type Nonce = java.lang.String
  
  type ProductCode = java.lang.String
  
  type String = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagList = js.Array[typings.awsSdk.marketplacemeteringMod.Tag]
  
  type TagValue = java.lang.String
  
  type Timestamp = typings.std.Date
  
  type UsageAllocations = js.Array[typings.awsSdk.marketplacemeteringMod.UsageAllocation]
  
  type UsageDimension = java.lang.String
  
  type UsageQuantity = scala.Double
  
  type UsageRecordList = js.Array[typings.awsSdk.marketplacemeteringMod.UsageRecord]
  
  type UsageRecordResultList = js.Array[typings.awsSdk.marketplacemeteringMod.UsageRecordResult]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Success_
    - typings.awsSdk.awsSdkStrings.CustomerNotSubscribed
    - typings.awsSdk.awsSdkStrings.DuplicateRecord
    - java.lang.String
  */
  type UsageRecordResultStatus = typings.awsSdk.marketplacemeteringMod._UsageRecordResultStatus | java.lang.String
  
  type VersionInteger = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2016-01-14`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.marketplacemeteringMod._apiVersion | java.lang.String
}
