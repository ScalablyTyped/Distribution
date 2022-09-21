package typings.awsSdk.finspaceMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AttributeMap = StringDictionary[url]

type DataBundleArn = String

type DataBundleArns = js.Array[DataBundleArn]

type Description = String

type EmailId = String

type EnvironmentArn = String

type EnvironmentList = js.Array[Environment]

type EnvironmentName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_REQUESTED
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.DELETE_REQUESTED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.FAILED_CREATION
  - typings.awsSdk.awsSdkStrings.RETRY_DELETION
  - typings.awsSdk.awsSdkStrings.FAILED_DELETION
  - typings.awsSdk.awsSdkStrings.SUSPENDED
  - java.lang.String
*/
type EnvironmentStatus = _EnvironmentStatus | String

type FederationAttributeKey = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FEDERATED
  - typings.awsSdk.awsSdkStrings.LOCAL
  - java.lang.String
*/
type FederationMode = _FederationMode | String

type FederationProviderName = String

type IdType = String

type KmsKeyId = String

type NameString = String

type PaginationToken = String

type ResultLimit = Double

type SamlMetadataDocument = String

type SmsDomainUrl = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2021-03-12`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type url = String

type urn = String
