package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object macieMod {
  
  type AWSAccountId = java.lang.String
  
  type BucketName = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.macieMod.ClientApiVersions
  
  type ErrorCode = java.lang.String
  
  type ExceptionMessage = java.lang.String
  
  type FailedS3Resources = js.Array[typings.awsSdk.macieMod.FailedS3Resource]
  
  type MaxResults = scala.Double
  
  type MemberAccounts = js.Array[typings.awsSdk.macieMod.MemberAccount]
  
  type NextToken = java.lang.String
  
  type Prefix = java.lang.String
  
  type S3ContinuousClassificationType = typings.awsSdk.awsSdkStrings.FULL | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FULL
    - typings.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type S3OneTimeClassificationType = typings.awsSdk.macieMod._S3OneTimeClassificationType | java.lang.String
  
  type S3Resources = js.Array[typings.awsSdk.macieMod.S3Resource]
  
  type S3ResourcesClassification = js.Array[typings.awsSdk.macieMod.S3ResourceClassification]
  
  type S3ResourcesClassificationUpdate = js.Array[typings.awsSdk.macieMod.S3ResourceClassificationUpdate]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-12-19`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.macieMod._apiVersion | java.lang.String
}
