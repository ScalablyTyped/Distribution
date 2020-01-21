package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clouddirectoryMod {
  type Arn = java.lang.String
  type Arns = js.Array[typings.awsSdk.clouddirectoryMod.Arn]
  type AttributeKeyAndValueList = js.Array[typings.awsSdk.clouddirectoryMod.AttributeKeyAndValue]
  type AttributeKeyList = js.Array[typings.awsSdk.clouddirectoryMod.AttributeKey]
  type AttributeName = java.lang.String
  type AttributeNameAndValueList = js.Array[typings.awsSdk.clouddirectoryMod.AttributeNameAndValue]
  type AttributeNameList = js.Array[typings.awsSdk.clouddirectoryMod.AttributeName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ValidationException
    - typings.awsSdk.awsSdkStrings.InvalidArnException
    - typings.awsSdk.awsSdkStrings.ResourceNotFoundException
    - typings.awsSdk.awsSdkStrings.InvalidNextTokenException
    - typings.awsSdk.awsSdkStrings.AccessDeniedException
    - typings.awsSdk.awsSdkStrings.NotNodeException
    - typings.awsSdk.awsSdkStrings.FacetValidationException
    - typings.awsSdk.awsSdkStrings.CannotListParentOfRootException
    - typings.awsSdk.awsSdkStrings.NotIndexException
    - typings.awsSdk.awsSdkStrings.NotPolicyException
    - typings.awsSdk.awsSdkStrings.DirectoryNotEnabledException
    - typings.awsSdk.awsSdkStrings.LimitExceededException
    - typings.awsSdk.awsSdkStrings.InternalServiceException
    - java.lang.String
  */
  type BatchReadExceptionType = typings.awsSdk.clouddirectoryMod._BatchReadExceptionType | java.lang.String
  type BatchReadOperationList = js.Array[typings.awsSdk.clouddirectoryMod.BatchReadOperation]
  type BatchReadOperationResponseList = js.Array[typings.awsSdk.clouddirectoryMod.BatchReadOperationResponse]
  type BatchReferenceName = java.lang.String
  type BatchWriteOperationList = js.Array[typings.awsSdk.clouddirectoryMod.BatchWriteOperation]
  type BatchWriteOperationResponseList = js.Array[typings.awsSdk.clouddirectoryMod.BatchWriteOperationResponse]
  type BinaryAttributeValue = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.clouddirectoryMod.Blob | java.lang.String
  type Bool = scala.Boolean
  type BooleanAttributeValue = scala.Boolean
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.clouddirectoryMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SERIALIZABLE
    - typings.awsSdk.awsSdkStrings.EVENTUAL
    - java.lang.String
  */
  type ConsistencyLevel = typings.awsSdk.clouddirectoryMod._ConsistencyLevel | java.lang.String
  type Date = typings.std.Date
  type DatetimeAttributeValue = typings.std.Date
  type DirectoryArn = java.lang.String
  type DirectoryList = js.Array[typings.awsSdk.clouddirectoryMod.Directory]
  type DirectoryName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - typings.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type DirectoryState = typings.awsSdk.clouddirectoryMod._DirectoryState | java.lang.String
  type ExceptionMessage = java.lang.String
  type FacetAttributeList = js.Array[typings.awsSdk.clouddirectoryMod.FacetAttribute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STRING
    - typings.awsSdk.awsSdkStrings.BINARY
    - typings.awsSdk.awsSdkStrings.BOOLEAN
    - typings.awsSdk.awsSdkStrings.NUMBER
    - typings.awsSdk.awsSdkStrings.DATETIME
    - typings.awsSdk.awsSdkStrings.VARIANT
    - java.lang.String
  */
  type FacetAttributeType = typings.awsSdk.clouddirectoryMod._FacetAttributeType | java.lang.String
  type FacetAttributeUpdateList = js.Array[typings.awsSdk.clouddirectoryMod.FacetAttributeUpdate]
  type FacetName = java.lang.String
  type FacetNameList = js.Array[typings.awsSdk.clouddirectoryMod.FacetName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STATIC
    - typings.awsSdk.awsSdkStrings.DYNAMIC
    - java.lang.String
  */
  type FacetStyle = typings.awsSdk.clouddirectoryMod._FacetStyle | java.lang.String
  type IndexAttachmentList = js.Array[typings.awsSdk.clouddirectoryMod.IndexAttachment]
  type LinkAttributeUpdateList = js.Array[typings.awsSdk.clouddirectoryMod.LinkAttributeUpdate]
  type LinkName = java.lang.String
  type LinkNameToObjectIdentifierMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.clouddirectoryMod.ObjectIdentifier]
  type NextToken = java.lang.String
  type NumberAttributeValue = java.lang.String
  type NumberResults = scala.Double
  type ObjectAttributeRangeList = js.Array[typings.awsSdk.clouddirectoryMod.ObjectAttributeRange]
  type ObjectAttributeUpdateList = js.Array[typings.awsSdk.clouddirectoryMod.ObjectAttributeUpdate]
  type ObjectIdentifier = java.lang.String
  type ObjectIdentifierAndLinkNameList = js.Array[typings.awsSdk.clouddirectoryMod.ObjectIdentifierAndLinkNameTuple]
  type ObjectIdentifierList = js.Array[typings.awsSdk.clouddirectoryMod.ObjectIdentifier]
  type ObjectIdentifierToLinkNameMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.clouddirectoryMod.LinkName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NODE
    - typings.awsSdk.awsSdkStrings.LEAF_NODE
    - typings.awsSdk.awsSdkStrings.POLICY
    - typings.awsSdk.awsSdkStrings.INDEX
    - java.lang.String
  */
  type ObjectType = typings.awsSdk.clouddirectoryMod._ObjectType | java.lang.String
  type PathString = java.lang.String
  type PathToObjectIdentifiersList = js.Array[typings.awsSdk.clouddirectoryMod.PathToObjectIdentifiers]
  type PolicyAttachmentList = js.Array[typings.awsSdk.clouddirectoryMod.PolicyAttachment]
  type PolicyToPathList = js.Array[typings.awsSdk.clouddirectoryMod.PolicyToPath]
  type PolicyType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FIRST
    - typings.awsSdk.awsSdkStrings.LAST
    - typings.awsSdk.awsSdkStrings.LAST_BEFORE_MISSING_VALUES
    - typings.awsSdk.awsSdkStrings.INCLUSIVE
    - typings.awsSdk.awsSdkStrings.EXCLUSIVE
    - java.lang.String
  */
  type RangeMode = typings.awsSdk.clouddirectoryMod._RangeMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.REQUIRED_ALWAYS
    - typings.awsSdk.awsSdkStrings.NOT_REQUIRED
    - java.lang.String
  */
  type RequiredAttributeBehavior = typings.awsSdk.clouddirectoryMod._RequiredAttributeBehavior | java.lang.String
  type RuleKey = java.lang.String
  type RuleMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.clouddirectoryMod.Rule]
  type RuleParameterKey = java.lang.String
  type RuleParameterMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.clouddirectoryMod.RuleParameterValue]
  type RuleParameterValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.BINARY_LENGTH
    - typings.awsSdk.awsSdkStrings.NUMBER_COMPARISON
    - typings.awsSdk.awsSdkStrings.STRING_FROM_SET
    - typings.awsSdk.awsSdkStrings.STRING_LENGTH
    - java.lang.String
  */
  type RuleType = typings.awsSdk.clouddirectoryMod._RuleType | java.lang.String
  type SchemaFacetList = js.Array[typings.awsSdk.clouddirectoryMod.SchemaFacet]
  type SchemaJsonDocument = java.lang.String
  type SchemaName = java.lang.String
  type SelectorObjectReference = java.lang.String
  type StringAttributeValue = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.clouddirectoryMod.TagKey]
  type TagList = js.Array[typings.awsSdk.clouddirectoryMod.Tag]
  type TagValue = java.lang.String
  type TagsNumberResults = scala.Double
  type TypedLinkAttributeDefinitionList = js.Array[typings.awsSdk.clouddirectoryMod.TypedLinkAttributeDefinition]
  type TypedLinkAttributeRangeList = js.Array[typings.awsSdk.clouddirectoryMod.TypedLinkAttributeRange]
  type TypedLinkFacetAttributeUpdateList = js.Array[typings.awsSdk.clouddirectoryMod.TypedLinkFacetAttributeUpdate]
  type TypedLinkName = java.lang.String
  type TypedLinkNameList = js.Array[typings.awsSdk.clouddirectoryMod.TypedLinkName]
  type TypedLinkSpecifierList = js.Array[typings.awsSdk.clouddirectoryMod.TypedLinkSpecifier]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATE_OR_UPDATE
    - typings.awsSdk.awsSdkStrings.DELETE
    - java.lang.String
  */
  type UpdateActionType = typings.awsSdk.clouddirectoryMod._UpdateActionType | java.lang.String
  type Version = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2016-05-10`
    - typings.awsSdk.awsSdkStrings.`2017-01-11`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.clouddirectoryMod._apiVersion | java.lang.String
}
