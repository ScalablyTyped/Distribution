package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object codegurureviewerMod {
  type Arn = java.lang.String
  type AssociationId = java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.codegurureviewerMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  type MaxResults = scala.Double
  type Name = java.lang.String
  type Names = js.Array[typings.awsSdk.codegurureviewerMod.Name]
  type NextToken = java.lang.String
  type Owner = java.lang.String
  type Owners = js.Array[typings.awsSdk.codegurureviewerMod.Owner]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CodeCommit_
    - typings.awsSdk.awsSdkStrings.GitHub_
    - java.lang.String
  */
  type ProviderType = typings.awsSdk.codegurureviewerMod._ProviderType | java.lang.String
  type ProviderTypes = js.Array[typings.awsSdk.codegurureviewerMod.ProviderType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Associated_
    - typings.awsSdk.awsSdkStrings.Associating_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Disassociating_
    - java.lang.String
  */
  type RepositoryAssociationState = typings.awsSdk.codegurureviewerMod._RepositoryAssociationState | java.lang.String
  type RepositoryAssociationStates = js.Array[typings.awsSdk.codegurureviewerMod.RepositoryAssociationState]
  type RepositoryAssociationSummaries = js.Array[typings.awsSdk.codegurureviewerMod.RepositoryAssociationSummary]
  type StateReason = java.lang.String
  type TimeStamp = typings.std.Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-09-19`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.codegurureviewerMod._apiVersion | java.lang.String
}
