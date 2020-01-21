package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pricingMod {
  type AttributeNameList = js.Array[typings.awsSdk.pricingMod.String]
  type AttributeValueList = js.Array[typings.awsSdk.pricingMod.AttributeValue]
  type BoxedInteger = scala.Double
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.pricingMod.ClientApiVersions
  type FilterType = typings.awsSdk.awsSdkStrings.TERM_MATCH | java.lang.String
  type Filters = js.Array[typings.awsSdk.pricingMod.Filter]
  type PriceList = js.Array[typings.awsSdk.pricingMod.PriceListItemJSON]
  type PriceListItemJSON = java.lang.String
  type ServiceList = js.Array[typings.awsSdk.pricingMod.Service]
  type String = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-10-15`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.pricingMod._apiVersion | java.lang.String
}
