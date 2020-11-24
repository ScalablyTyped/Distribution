package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object piMod {
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.piMod.ClientApiVersions
  
  type DataPointsList = js.Array[typings.awsSdk.piMod.DataPoint]
  
  type DimensionKeyDescriptionList = js.Array[typings.awsSdk.piMod.DimensionKeyDescription]
  
  type DimensionMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.piMod.String]
  
  type Double = scala.Double
  
  type ISOTimestamp = typings.std.Date
  
  type Integer = scala.Double
  
  type Limit = scala.Double
  
  type MaxResults = scala.Double
  
  type MetricKeyDataPointsList = js.Array[typings.awsSdk.piMod.MetricKeyDataPoints]
  
  type MetricQueryFilterMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.piMod.String]
  
  type MetricQueryList = js.Array[typings.awsSdk.piMod.MetricQuery]
  
  type MetricValuesList = js.Array[typings.awsSdk.piMod.Double]
  
  type ResponsePartitionKeyList = js.Array[typings.awsSdk.piMod.ResponsePartitionKey]
  
  type ServiceType = typings.awsSdk.awsSdkStrings.RDS | java.lang.String
  
  type String = java.lang.String
  
  type StringList = js.Array[typings.awsSdk.piMod.String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-02-27`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.piMod._apiVersion | java.lang.String
}
