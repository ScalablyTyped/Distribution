package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object curMod {
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`us-east-1`
    - typings.awsSdk.awsSdkStrings.`us-west-1`
    - typings.awsSdk.awsSdkStrings.`us-west-2`
    - typings.awsSdk.awsSdkStrings.`eu-central-1`
    - typings.awsSdk.awsSdkStrings.`eu-west-1`
    - typings.awsSdk.awsSdkStrings.`ap-southeast-1`
    - typings.awsSdk.awsSdkStrings.`ap-southeast-2`
    - typings.awsSdk.awsSdkStrings.`ap-northeast-1`
    - typings.awsSdk.awsSdkStrings.`eu-north-1`
    - typings.awsSdk.awsSdkStrings.`ap-northeast-3`
    - typings.awsSdk.awsSdkStrings.`ap-east-1`
    - java.lang.String
  */
  type AWSRegion = typings.awsSdk.curMod._AWSRegion | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.REDSHIFT
    - typings.awsSdk.awsSdkStrings.QUICKSIGHT
    - typings.awsSdk.awsSdkStrings.ATHENA
    - java.lang.String
  */
  type AdditionalArtifact = typings.awsSdk.curMod._AdditionalArtifact | java.lang.String
  type AdditionalArtifactList = js.Array[typings.awsSdk.curMod.AdditionalArtifact]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.curMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ZIP
    - typings.awsSdk.awsSdkStrings.GZIP
    - typings.awsSdk.awsSdkStrings.Parquet
    - java.lang.String
  */
  type CompressionFormat = typings.awsSdk.curMod._CompressionFormat | java.lang.String
  type DeleteResponseMessage = java.lang.String
  type GenericString = java.lang.String
  type MaxResults = scala.Double
  type RefreshClosedReports = scala.Boolean
  type ReportDefinitionList = js.Array[typings.awsSdk.curMod.ReportDefinition]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.textORcsv
    - typings.awsSdk.awsSdkStrings.Parquet
    - java.lang.String
  */
  type ReportFormat = typings.awsSdk.curMod._ReportFormat | java.lang.String
  type ReportName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATE_NEW_REPORT
    - typings.awsSdk.awsSdkStrings.OVERWRITE_REPORT
    - java.lang.String
  */
  type ReportVersioning = typings.awsSdk.curMod._ReportVersioning | java.lang.String
  type S3Bucket = java.lang.String
  type S3Prefix = java.lang.String
  type SchemaElement = typings.awsSdk.awsSdkStrings.RESOURCES | java.lang.String
  type SchemaElementList = js.Array[typings.awsSdk.curMod.SchemaElement]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.HOURLY
    - typings.awsSdk.awsSdkStrings.DAILY
    - java.lang.String
  */
  type TimeUnit = typings.awsSdk.curMod._TimeUnit | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-01-06`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.curMod._apiVersion | java.lang.String
}
