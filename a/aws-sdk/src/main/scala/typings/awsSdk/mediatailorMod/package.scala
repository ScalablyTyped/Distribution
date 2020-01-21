package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mediatailorMod {
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.mediatailorMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SINGLE_PERIOD
    - typings.awsSdk.awsSdkStrings.MULTI_PERIOD
    - java.lang.String
  */
  type OriginManifestType = typings.awsSdk.mediatailorMod._OriginManifestType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-04-23`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.mediatailorMod._apiVersion | java.lang.String
  type integer = scala.Double
  type integerMin1Max100 = scala.Double
  type listOfPlaybackConfigurations = js.Array[typings.awsSdk.mediatailorMod.PlaybackConfiguration]
  type listOfString = js.Array[typings.awsSdk.mediatailorMod.string]
  type mapOfString = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.mediatailorMod.string]
  type string = java.lang.String
}
