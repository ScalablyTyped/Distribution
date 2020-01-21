package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object forecastqueryserviceMod {
  type Arn = java.lang.String
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.forecastqueryserviceMod.ClientApiVersions
  type DateTime = java.lang.String
  type Double = scala.Double
  type Filters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.forecastqueryserviceMod.AttributeValue]
  type NextToken = java.lang.String
  type Predictions = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.forecastqueryserviceMod.TimeSeries]
  type Statistic = java.lang.String
  type TimeSeries = js.Array[typings.awsSdk.forecastqueryserviceMod.DataPoint]
  type Timestamp = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-06-26`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.forecastqueryserviceMod._apiVersion | java.lang.String
}
