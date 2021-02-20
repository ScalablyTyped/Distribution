package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object timestreamwriteMod {
  
  type AmazonResourceName = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.timestreamwriteMod.ClientApiVersions
  
  type DatabaseList = js.Array[typings.awsSdk.timestreamwriteMod.Database]
  
  type Date = typings.std.Date
  
  type DimensionValueType = typings.awsSdk.awsSdkStrings.VARCHAR | java.lang.String
  
  type Dimensions = js.Array[typings.awsSdk.timestreamwriteMod.Dimension]
  
  type Endpoints = js.Array[typings.awsSdk.timestreamwriteMod.Endpoint]
  
  type Long = scala.Double
  
  type MagneticStoreRetentionPeriodInDays = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DOUBLE
    - typings.awsSdk.awsSdkStrings.BIGINT
    - typings.awsSdk.awsSdkStrings.VARCHAR
    - typings.awsSdk.awsSdkStrings.BOOLEAN
    - java.lang.String
  */
  type MeasureValueType = typings.awsSdk.timestreamwriteMod._MeasureValueType | java.lang.String
  
  type MemoryStoreRetentionPeriodInHours = scala.Double
  
  type PaginationLimit = scala.Double
  
  type Records = js.Array[typings.awsSdk.timestreamwriteMod.Record]
  
  type ResourceName = java.lang.String
  
  type String = java.lang.String
  
  type StringValue2048 = java.lang.String
  
  type StringValue256 = java.lang.String
  
  type TableList = js.Array[typings.awsSdk.timestreamwriteMod.Table]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type TableStatus = typings.awsSdk.timestreamwriteMod._TableStatus | java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.timestreamwriteMod.TagKey]
  
  type TagList = js.Array[typings.awsSdk.timestreamwriteMod.Tag]
  
  type TagValue = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.MILLISECONDS
    - typings.awsSdk.awsSdkStrings.SECONDS
    - typings.awsSdk.awsSdkStrings.MICROSECONDS
    - typings.awsSdk.awsSdkStrings.NANOSECONDS
    - java.lang.String
  */
  type TimeUnit = typings.awsSdk.timestreamwriteMod._TimeUnit | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-11-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.timestreamwriteMod._apiVersion | java.lang.String
}
