package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object managedblockchainMod {
  type AvailabilityZoneString = java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.managedblockchainMod.ClientApiVersions
  type ClientRequestTokenString = java.lang.String
  type DescriptionString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STARTER
    - typings.awsSdk.awsSdkStrings.STANDARD
    - java.lang.String
  */
  type Edition = typings.awsSdk.managedblockchainMod._Edition | java.lang.String
  type Enabled = scala.Boolean
  type Framework = typings.awsSdk.awsSdkStrings.HYPERLEDGER_FABRIC | java.lang.String
  type FrameworkVersionString = java.lang.String
  type InstanceTypeString = java.lang.String
  type InvitationList = js.Array[typings.awsSdk.managedblockchainMod.Invitation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.ACCEPTED
    - typings.awsSdk.awsSdkStrings.ACCEPTING
    - typings.awsSdk.awsSdkStrings.REJECTED
    - typings.awsSdk.awsSdkStrings.EXPIRED
    - java.lang.String
  */
  type InvitationStatus = typings.awsSdk.managedblockchainMod._InvitationStatus | java.lang.String
  type InviteActionList = js.Array[typings.awsSdk.managedblockchainMod.InviteAction]
  type IsOwned = scala.Boolean
  type MemberListMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.CREATE_FAILED
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type MemberStatus = typings.awsSdk.managedblockchainMod._MemberStatus | java.lang.String
  type MemberSummaryList = js.Array[typings.awsSdk.managedblockchainMod.MemberSummary]
  type NameString = java.lang.String
  type NetworkListMaxResults = scala.Double
  type NetworkMemberNameString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.CREATE_FAILED
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type NetworkStatus = typings.awsSdk.managedblockchainMod._NetworkStatus | java.lang.String
  type NetworkSummaryList = js.Array[typings.awsSdk.managedblockchainMod.NetworkSummary]
  type NodeListMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.CREATE_FAILED
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.DELETED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type NodeStatus = typings.awsSdk.managedblockchainMod._NodeStatus | java.lang.String
  type NodeSummaryList = js.Array[typings.awsSdk.managedblockchainMod.NodeSummary]
  type PaginationToken = java.lang.String
  type PasswordString = java.lang.String
  type PrincipalString = java.lang.String
  type ProposalDurationInt = scala.Double
  type ProposalListMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.APPROVED
    - typings.awsSdk.awsSdkStrings.REJECTED
    - typings.awsSdk.awsSdkStrings.EXPIRED
    - typings.awsSdk.awsSdkStrings.ACTION_FAILED
    - java.lang.String
  */
  type ProposalStatus = typings.awsSdk.managedblockchainMod._ProposalStatus | java.lang.String
  type ProposalSummaryList = js.Array[typings.awsSdk.managedblockchainMod.ProposalSummary]
  type ProposalVoteList = js.Array[typings.awsSdk.managedblockchainMod.VoteSummary]
  type RemoveActionList = js.Array[typings.awsSdk.managedblockchainMod.RemoveAction]
  type ResourceIdString = java.lang.String
  type String = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GREATER_THAN
    - typings.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUAL_TO
    - java.lang.String
  */
  type ThresholdComparator = typings.awsSdk.managedblockchainMod._ThresholdComparator | java.lang.String
  type ThresholdPercentageInt = scala.Double
  type Timestamp = typings.std.Date
  type UsernameString = java.lang.String
  type VoteCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.YES
    - typings.awsSdk.awsSdkStrings.NO
    - java.lang.String
  */
  type VoteValue = typings.awsSdk.managedblockchainMod._VoteValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-09-24`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.managedblockchainMod._apiVersion | java.lang.String
}
