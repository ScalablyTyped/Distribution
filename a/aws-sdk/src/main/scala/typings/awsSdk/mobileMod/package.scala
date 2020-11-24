package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mobileMod {
  
  type AttributeKey = java.lang.String
  
  type AttributeValue = java.lang.String
  
  type Attributes = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.mobileMod.AttributeValue]
  
  type Boolean = scala.Boolean
  
  type BundleDescription = java.lang.String
  
  type BundleId = java.lang.String
  
  type BundleList = js.Array[typings.awsSdk.mobileMod.BundleDetails]
  
  type BundleTitle = java.lang.String
  
  type BundleVersion = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.mobileMod.ClientApiVersions
  
  type ConsoleUrl = java.lang.String
  
  type Contents = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.mobileMod.Blob | java.lang.String
  
  type Date = typings.std.Date
  
  type DownloadUrl = java.lang.String
  
  type Feature = java.lang.String
  
  type IconUrl = java.lang.String
  
  type MaxResults = scala.Double
  
  type NextToken = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OSX
    - typings.awsSdk.awsSdkStrings.WINDOWS
    - typings.awsSdk.awsSdkStrings.LINUX
    - typings.awsSdk.awsSdkStrings.OBJC
    - typings.awsSdk.awsSdkStrings.SWIFT
    - typings.awsSdk.awsSdkStrings.ANDROID
    - typings.awsSdk.awsSdkStrings.JAVASCRIPT
    - java.lang.String
  */
  type Platform = typings.awsSdk.mobileMod._Platform | java.lang.String
  
  type Platforms = js.Array[typings.awsSdk.mobileMod.Platform]
  
  type ProjectId = java.lang.String
  
  type ProjectName = java.lang.String
  
  type ProjectRegion = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NORMAL
    - typings.awsSdk.awsSdkStrings.SYNCING
    - typings.awsSdk.awsSdkStrings.IMPORTING
    - java.lang.String
  */
  type ProjectState = typings.awsSdk.mobileMod._ProjectState | java.lang.String
  
  type ProjectSummaries = js.Array[typings.awsSdk.mobileMod.ProjectSummary]
  
  type ResourceArn = java.lang.String
  
  type ResourceName = java.lang.String
  
  type ResourceType = java.lang.String
  
  type Resources = js.Array[typings.awsSdk.mobileMod.Resource]
  
  type ShareUrl = java.lang.String
  
  type SnapshotId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-07-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.mobileMod._apiVersion | java.lang.String
}
