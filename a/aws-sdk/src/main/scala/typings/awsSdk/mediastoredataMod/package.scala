package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mediastoredataMod {
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.mediastoredataMod.ClientApiVersions
  
  type ContentRangePattern = java.lang.String
  
  type ContentType = java.lang.String
  
  type ETag = java.lang.String
  
  type ItemList = js.Array[typings.awsSdk.mediastoredataMod.Item]
  
  type ItemName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OBJECT
    - typings.awsSdk.awsSdkStrings.FOLDER
    - java.lang.String
  */
  type ItemType = typings.awsSdk.mediastoredataMod._ItemType | java.lang.String
  
  type ListLimit = scala.Double
  
  type ListPathNaming = java.lang.String
  
  type NonNegativeLong = scala.Double
  
  type PaginationToken = java.lang.String
  
  type PathNaming = java.lang.String
  
  type PayloadBlob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.mediastoredataMod.Blob | java.lang.String | typings.node.streamMod.Readable
  
  type RangePattern = java.lang.String
  
  type SHA256Hash = java.lang.String
  
  type StorageClass = typings.awsSdk.awsSdkStrings.TEMPORAL | java.lang.String
  
  type StringPrimitive = java.lang.String
  
  type TimeStamp = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STANDARD
    - typings.awsSdk.awsSdkStrings.STREAMING
    - java.lang.String
  */
  type UploadAvailability = typings.awsSdk.mediastoredataMod._UploadAvailability | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-09-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.mediastoredataMod._apiVersion | java.lang.String
  
  type statusCode = scala.Double
}
