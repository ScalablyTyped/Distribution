package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object importexportMod {
  type APIVersion_ = java.lang.String
  type ArtifactList = js.Array[typings.awsSdk.importexportMod.Artifact]
  type Carrier = java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.importexportMod.ClientApiVersions
  type CreationDate = typings.std.Date
  type CurrentManifest = java.lang.String
  type Description = java.lang.String
  type ErrorCount = scala.Double
  type GenericString = java.lang.String
  type IsCanceled = scala.Boolean
  type IsTruncated = scala.Boolean
  type JobId = java.lang.String
  type JobIdList = js.Array[typings.awsSdk.importexportMod.GenericString]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Import_
    - typings.awsSdk.awsSdkStrings.Export_
    - java.lang.String
  */
  type JobType = typings.awsSdk.importexportMod._JobType | java.lang.String
  type JobsList = js.Array[typings.awsSdk.importexportMod.Job]
  type LocationCode = java.lang.String
  type LocationMessage = java.lang.String
  type LogBucket = java.lang.String
  type LogKey = java.lang.String
  type Manifest = java.lang.String
  type ManifestAddendum = java.lang.String
  type Marker = java.lang.String
  type MaxJobs = scala.Double
  type ProgressCode = java.lang.String
  type ProgressMessage = java.lang.String
  type Signature = java.lang.String
  type SignatureFileContents = java.lang.String
  type Success = scala.Boolean
  type TrackingNumber = java.lang.String
  type URL = java.lang.String
  type ValidateOnly = scala.Boolean
  type WarningMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2010-06-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.importexportMod._apiVersion | java.lang.String
  type city = java.lang.String
  type company = java.lang.String
  type country = java.lang.String
  type name = java.lang.String
  type phoneNumber = java.lang.String
  type postalCode = java.lang.String
  type stateOrProvince = java.lang.String
  type street1 = java.lang.String
  type street2 = java.lang.String
  type street3 = java.lang.String
}
