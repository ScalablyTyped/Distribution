package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object personalizeeventsMod {
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.personalizeeventsMod.ClientApiVersions
  type Date = typings.std.Date
  type EventList = js.Array[typings.awsSdk.personalizeeventsMod.Event]
  type EventPropertiesJSON = java.lang.String
  type StringType = java.lang.String
  type UserId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-03-22`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.personalizeeventsMod._apiVersion | java.lang.String
}
