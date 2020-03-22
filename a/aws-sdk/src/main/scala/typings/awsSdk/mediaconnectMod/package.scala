package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mediaconnectMod {
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.aes128_
    - typings.awsSdk.awsSdkStrings.aes192
    - typings.awsSdk.awsSdkStrings.aes256_
    - java.lang.String
  */
  type Algorithm = typings.awsSdk.mediaconnectMod._Algorithm | java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.mediaconnectMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.speke_
    - typings.awsSdk.awsSdkStrings.`static-key`
    - java.lang.String
  */
  type KeyType = typings.awsSdk.mediaconnectMod._KeyType | java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`zixi-push`
    - typings.awsSdk.awsSdkStrings.`rtp-fec`
    - typings.awsSdk.awsSdkStrings.rtp
    - typings.awsSdk.awsSdkStrings.`zixi-pull`
    - typings.awsSdk.awsSdkStrings.rist
    - java.lang.String
  */
  type Protocol = typings.awsSdk.mediaconnectMod._Protocol | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OWNED
    - typings.awsSdk.awsSdkStrings.ENTITLED
    - java.lang.String
  */
  type SourceType = typings.awsSdk.mediaconnectMod._SourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type State = typings.awsSdk.mediaconnectMod._State | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STANDBY
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.STARTING
    - typings.awsSdk.awsSdkStrings.STOPPING
    - typings.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type Status = typings.awsSdk.mediaconnectMod._Status | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-11-14`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.mediaconnectMod._apiVersion | java.lang.String
  type integer = scala.Double
  type listOfAddOutputRequest = js.Array[typings.awsSdk.mediaconnectMod.AddOutputRequest]
  type listOfEntitlement = js.Array[typings.awsSdk.mediaconnectMod.Entitlement]
  type listOfGrantEntitlementRequest = js.Array[typings.awsSdk.mediaconnectMod.GrantEntitlementRequest]
  type listOfListedEntitlement = js.Array[typings.awsSdk.mediaconnectMod.ListedEntitlement]
  type listOfListedFlow = js.Array[typings.awsSdk.mediaconnectMod.ListedFlow]
  type listOfOutput = js.Array[typings.awsSdk.mediaconnectMod.Output]
  type listOfSetSourceRequest = js.Array[typings.awsSdk.mediaconnectMod.SetSourceRequest]
  type listOfSource = js.Array[typings.awsSdk.mediaconnectMod.Source]
  type listOfString = js.Array[typings.awsSdk.mediaconnectMod.string]
  type mapOfString = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.mediaconnectMod.string]
  type string = java.lang.String
}
