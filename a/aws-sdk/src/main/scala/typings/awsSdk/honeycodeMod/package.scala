package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object honeycodeMod {
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.honeycodeMod.ClientApiVersions
  
  type ClientRequestToken = java.lang.String
  
  type DataItems = js.Array[typings.awsSdk.honeycodeMod.DataItem]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AUTO
    - typings.awsSdk.awsSdkStrings.NUMBER
    - typings.awsSdk.awsSdkStrings.CURRENCY
    - typings.awsSdk.awsSdkStrings.DATE
    - typings.awsSdk.awsSdkStrings.TIME
    - typings.awsSdk.awsSdkStrings.DATE_TIME
    - typings.awsSdk.awsSdkStrings.PERCENTAGE
    - typings.awsSdk.awsSdkStrings.TEXT
    - typings.awsSdk.awsSdkStrings.ACCOUNTING
    - typings.awsSdk.awsSdkStrings.CONTACT
    - typings.awsSdk.awsSdkStrings.ROWLINK
    - java.lang.String
  */
  type Format = typings.awsSdk.honeycodeMod._Format | java.lang.String
  
  type FormattedValue = java.lang.String
  
  type MaxResults = scala.Double
  
  type Name = java.lang.String
  
  type PaginationToken = java.lang.String
  
  type RawValue = java.lang.String
  
  type ResourceId = java.lang.String
  
  type ResultHeader = js.Array[typings.awsSdk.honeycodeMod.ColumnMetadata]
  
  type ResultRows = js.Array[typings.awsSdk.honeycodeMod.ResultRow]
  
  type ResultSetMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.honeycodeMod.ResultSet]
  
  type RowId = java.lang.String
  
  type VariableName = java.lang.String
  
  type VariableValueMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.honeycodeMod.VariableValue]
  
  type WorkbookCursor = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2020-03-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.honeycodeMod._apiVersion | java.lang.String
}
