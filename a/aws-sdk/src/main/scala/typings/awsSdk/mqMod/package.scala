package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mqMod {
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SIMPLE
    - typings.awsSdk.awsSdkStrings.LDAP
    - java.lang.String
  */
  type AuthenticationStrategy = typings.awsSdk.mqMod._AuthenticationStrategy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATION_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.CREATION_FAILED
    - typings.awsSdk.awsSdkStrings.DELETION_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.REBOOT_IN_PROGRESS
    - java.lang.String
  */
  type BrokerState = typings.awsSdk.mqMod._BrokerState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EBS
    - typings.awsSdk.awsSdkStrings.EFS
    - java.lang.String
  */
  type BrokerStorageType = typings.awsSdk.mqMod._BrokerStorageType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATE
    - typings.awsSdk.awsSdkStrings.UPDATE
    - typings.awsSdk.awsSdkStrings.DELETE
    - java.lang.String
  */
  type ChangeType = typings.awsSdk.mqMod._ChangeType | java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.mqMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.MONDAY
    - typings.awsSdk.awsSdkStrings.TUESDAY
    - typings.awsSdk.awsSdkStrings.WEDNESDAY
    - typings.awsSdk.awsSdkStrings.THURSDAY
    - typings.awsSdk.awsSdkStrings.FRIDAY
    - typings.awsSdk.awsSdkStrings.SATURDAY
    - typings.awsSdk.awsSdkStrings.SUNDAY
    - java.lang.String
  */
  type DayOfWeek = typings.awsSdk.mqMod._DayOfWeek | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SINGLE_INSTANCE
    - typings.awsSdk.awsSdkStrings.ACTIVE_STANDBY_MULTI_AZ
    - java.lang.String
  */
  type DeploymentMode = typings.awsSdk.mqMod._DeploymentMode | java.lang.String
  type EngineType = typings.awsSdk.awsSdkStrings.ACTIVEMQ | java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DISALLOWED_ELEMENT_REMOVED
    - typings.awsSdk.awsSdkStrings.DISALLOWED_ATTRIBUTE_REMOVED
    - typings.awsSdk.awsSdkStrings.INVALID_ATTRIBUTE_VALUE_REMOVED
    - java.lang.String
  */
  type SanitizationWarningReason = typings.awsSdk.mqMod._SanitizationWarningReason | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-11-27`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.mqMod._apiVersion | java.lang.String
  type boolean = scala.Boolean
  type integer = scala.Double
  type integerMin5Max100 = scala.Double
  type listOfAvailabilityZone = js.Array[typings.awsSdk.mqMod.AvailabilityZone]
  type listOfBrokerEngineType = js.Array[typings.awsSdk.mqMod.BrokerEngineType]
  type listOfBrokerInstance = js.Array[typings.awsSdk.mqMod.BrokerInstance]
  type listOfBrokerInstanceOption = js.Array[typings.awsSdk.mqMod.BrokerInstanceOption]
  type listOfBrokerSummary = js.Array[typings.awsSdk.mqMod.BrokerSummary]
  type listOfConfiguration = js.Array[typings.awsSdk.mqMod.Configuration]
  type listOfConfigurationId = js.Array[typings.awsSdk.mqMod.ConfigurationId]
  type listOfConfigurationRevision = js.Array[typings.awsSdk.mqMod.ConfigurationRevision]
  type listOfDeploymentMode = js.Array[typings.awsSdk.mqMod.DeploymentMode]
  type listOfEngineVersion = js.Array[typings.awsSdk.mqMod.EngineVersion]
  type listOfSanitizationWarning = js.Array[typings.awsSdk.mqMod.SanitizationWarning]
  type listOfString = js.Array[typings.awsSdk.mqMod.string]
  type listOfUser = js.Array[typings.awsSdk.mqMod.User]
  type listOfUserSummary = js.Array[typings.awsSdk.mqMod.UserSummary]
  type mapOfString = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.mqMod.string]
  type string = java.lang.String
  type timestampIso8601 = typings.std.Date
}
