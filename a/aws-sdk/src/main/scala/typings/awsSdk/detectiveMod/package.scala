package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object detectiveMod {
  
  type AccountId = java.lang.String
  
  type AccountIdList = js.Array[typings.awsSdk.detectiveMod.AccountId]
  
  type AccountList = js.Array[typings.awsSdk.detectiveMod.Account]
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.detectiveMod.ClientApiVersions
  
  type EmailAddress = java.lang.String
  
  type EmailMessage = java.lang.String
  
  type GraphArn = java.lang.String
  
  type GraphList = js.Array[typings.awsSdk.detectiveMod.Graph]
  
  type MemberDetailList = js.Array[typings.awsSdk.detectiveMod.MemberDetail]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.VOLUME_TOO_HIGH
    - typings.awsSdk.awsSdkStrings.VOLUME_UNKNOWN
    - java.lang.String
  */
  type MemberDisabledReason = typings.awsSdk.detectiveMod._MemberDisabledReason | java.lang.String
  
  type MemberResultsLimit = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INVITED
    - typings.awsSdk.awsSdkStrings.VERIFICATION_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.VERIFICATION_FAILED
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.ACCEPTED_BUT_DISABLED
    - java.lang.String
  */
  type MemberStatus = typings.awsSdk.detectiveMod._MemberStatus | java.lang.String
  
  type PaginationToken = java.lang.String
  
  type Percentage = scala.Double
  
  type Timestamp = typings.std.Date
  
  type UnprocessedAccountList = js.Array[typings.awsSdk.detectiveMod.UnprocessedAccount]
  
  type UnprocessedReason = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-10-26`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.detectiveMod._apiVersion | java.lang.String
}
