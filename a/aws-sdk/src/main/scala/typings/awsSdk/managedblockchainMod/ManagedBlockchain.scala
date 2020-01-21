package typings.awsSdk.managedblockchainMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedBlockchain extends Service {
  @JSName("config")
  var config_ManagedBlockchain: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a member within a Managed Blockchain network.
    */
  def createMember(): Request[CreateMemberOutput, AWSError] = js.native
  def createMember(callback: js.Function2[/* err */ AWSError, /* data */ CreateMemberOutput, Unit]): Request[CreateMemberOutput, AWSError] = js.native
  /**
    * Creates a member within a Managed Blockchain network.
    */
  def createMember(params: CreateMemberInput): Request[CreateMemberOutput, AWSError] = js.native
  def createMember(
    params: CreateMemberInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMemberOutput, Unit]
  ): Request[CreateMemberOutput, AWSError] = js.native
  /**
    * Creates a new blockchain network using Amazon Managed Blockchain.
    */
  def createNetwork(): Request[CreateNetworkOutput, AWSError] = js.native
  def createNetwork(callback: js.Function2[/* err */ AWSError, /* data */ CreateNetworkOutput, Unit]): Request[CreateNetworkOutput, AWSError] = js.native
  /**
    * Creates a new blockchain network using Amazon Managed Blockchain.
    */
  def createNetwork(params: CreateNetworkInput): Request[CreateNetworkOutput, AWSError] = js.native
  def createNetwork(
    params: CreateNetworkInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNetworkOutput, Unit]
  ): Request[CreateNetworkOutput, AWSError] = js.native
  /**
    * Creates a peer node in a member.
    */
  def createNode(): Request[CreateNodeOutput, AWSError] = js.native
  def createNode(callback: js.Function2[/* err */ AWSError, /* data */ CreateNodeOutput, Unit]): Request[CreateNodeOutput, AWSError] = js.native
  /**
    * Creates a peer node in a member.
    */
  def createNode(params: CreateNodeInput): Request[CreateNodeOutput, AWSError] = js.native
  def createNode(
    params: CreateNodeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNodeOutput, Unit]
  ): Request[CreateNodeOutput, AWSError] = js.native
  /**
    * Creates a proposal for a change to the network that other members of the network can vote on, for example, a proposal to add a new member to the network. Any member can create a proposal.
    */
  def createProposal(): Request[CreateProposalOutput, AWSError] = js.native
  def createProposal(callback: js.Function2[/* err */ AWSError, /* data */ CreateProposalOutput, Unit]): Request[CreateProposalOutput, AWSError] = js.native
  /**
    * Creates a proposal for a change to the network that other members of the network can vote on, for example, a proposal to add a new member to the network. Any member can create a proposal.
    */
  def createProposal(params: CreateProposalInput): Request[CreateProposalOutput, AWSError] = js.native
  def createProposal(
    params: CreateProposalInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProposalOutput, Unit]
  ): Request[CreateProposalOutput, AWSError] = js.native
  /**
    * Deletes a member. Deleting a member removes the member and all associated resources from the network. DeleteMember can only be called for a specified MemberId if the principal performing the action is associated with the AWS account that owns the member. In all other cases, the DeleteMember action is carried out as the result of an approved proposal to remove a member. If MemberId is the last member in a network specified by the last AWS account, the network is deleted also.
    */
  def deleteMember(): Request[DeleteMemberOutput, AWSError] = js.native
  def deleteMember(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMemberOutput, Unit]): Request[DeleteMemberOutput, AWSError] = js.native
  /**
    * Deletes a member. Deleting a member removes the member and all associated resources from the network. DeleteMember can only be called for a specified MemberId if the principal performing the action is associated with the AWS account that owns the member. In all other cases, the DeleteMember action is carried out as the result of an approved proposal to remove a member. If MemberId is the last member in a network specified by the last AWS account, the network is deleted also.
    */
  def deleteMember(params: DeleteMemberInput): Request[DeleteMemberOutput, AWSError] = js.native
  def deleteMember(
    params: DeleteMemberInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMemberOutput, Unit]
  ): Request[DeleteMemberOutput, AWSError] = js.native
  /**
    * Deletes a peer node from a member that your AWS account owns. All data on the node is lost and cannot be recovered.
    */
  def deleteNode(): Request[DeleteNodeOutput, AWSError] = js.native
  def deleteNode(callback: js.Function2[/* err */ AWSError, /* data */ DeleteNodeOutput, Unit]): Request[DeleteNodeOutput, AWSError] = js.native
  /**
    * Deletes a peer node from a member that your AWS account owns. All data on the node is lost and cannot be recovered.
    */
  def deleteNode(params: DeleteNodeInput): Request[DeleteNodeOutput, AWSError] = js.native
  def deleteNode(
    params: DeleteNodeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteNodeOutput, Unit]
  ): Request[DeleteNodeOutput, AWSError] = js.native
  /**
    * Returns detailed information about a member.
    */
  def getMember(): Request[GetMemberOutput, AWSError] = js.native
  def getMember(callback: js.Function2[/* err */ AWSError, /* data */ GetMemberOutput, Unit]): Request[GetMemberOutput, AWSError] = js.native
  /**
    * Returns detailed information about a member.
    */
  def getMember(params: GetMemberInput): Request[GetMemberOutput, AWSError] = js.native
  def getMember(
    params: GetMemberInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMemberOutput, Unit]
  ): Request[GetMemberOutput, AWSError] = js.native
  /**
    * Returns detailed information about a network.
    */
  def getNetwork(): Request[GetNetworkOutput, AWSError] = js.native
  def getNetwork(callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkOutput, Unit]): Request[GetNetworkOutput, AWSError] = js.native
  /**
    * Returns detailed information about a network.
    */
  def getNetwork(params: GetNetworkInput): Request[GetNetworkOutput, AWSError] = js.native
  def getNetwork(
    params: GetNetworkInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkOutput, Unit]
  ): Request[GetNetworkOutput, AWSError] = js.native
  /**
    * Returns detailed information about a peer node.
    */
  def getNode(): Request[GetNodeOutput, AWSError] = js.native
  def getNode(callback: js.Function2[/* err */ AWSError, /* data */ GetNodeOutput, Unit]): Request[GetNodeOutput, AWSError] = js.native
  /**
    * Returns detailed information about a peer node.
    */
  def getNode(params: GetNodeInput): Request[GetNodeOutput, AWSError] = js.native
  def getNode(params: GetNodeInput, callback: js.Function2[/* err */ AWSError, /* data */ GetNodeOutput, Unit]): Request[GetNodeOutput, AWSError] = js.native
  /**
    * Returns detailed information about a proposal.
    */
  def getProposal(): Request[GetProposalOutput, AWSError] = js.native
  def getProposal(callback: js.Function2[/* err */ AWSError, /* data */ GetProposalOutput, Unit]): Request[GetProposalOutput, AWSError] = js.native
  /**
    * Returns detailed information about a proposal.
    */
  def getProposal(params: GetProposalInput): Request[GetProposalOutput, AWSError] = js.native
  def getProposal(
    params: GetProposalInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetProposalOutput, Unit]
  ): Request[GetProposalOutput, AWSError] = js.native
  /**
    * Returns a listing of all invitations made on the specified network.
    */
  def listInvitations(): Request[ListInvitationsOutput, AWSError] = js.native
  def listInvitations(callback: js.Function2[/* err */ AWSError, /* data */ ListInvitationsOutput, Unit]): Request[ListInvitationsOutput, AWSError] = js.native
  /**
    * Returns a listing of all invitations made on the specified network.
    */
  def listInvitations(params: ListInvitationsInput): Request[ListInvitationsOutput, AWSError] = js.native
  def listInvitations(
    params: ListInvitationsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInvitationsOutput, Unit]
  ): Request[ListInvitationsOutput, AWSError] = js.native
  /**
    * Returns a listing of the members in a network and properties of their configurations.
    */
  def listMembers(): Request[ListMembersOutput, AWSError] = js.native
  def listMembers(callback: js.Function2[/* err */ AWSError, /* data */ ListMembersOutput, Unit]): Request[ListMembersOutput, AWSError] = js.native
  /**
    * Returns a listing of the members in a network and properties of their configurations.
    */
  def listMembers(params: ListMembersInput): Request[ListMembersOutput, AWSError] = js.native
  def listMembers(
    params: ListMembersInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMembersOutput, Unit]
  ): Request[ListMembersOutput, AWSError] = js.native
  /**
    * Returns information about the networks in which the current AWS account has members.
    */
  def listNetworks(): Request[ListNetworksOutput, AWSError] = js.native
  def listNetworks(callback: js.Function2[/* err */ AWSError, /* data */ ListNetworksOutput, Unit]): Request[ListNetworksOutput, AWSError] = js.native
  /**
    * Returns information about the networks in which the current AWS account has members.
    */
  def listNetworks(params: ListNetworksInput): Request[ListNetworksOutput, AWSError] = js.native
  def listNetworks(
    params: ListNetworksInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNetworksOutput, Unit]
  ): Request[ListNetworksOutput, AWSError] = js.native
  /**
    * Returns information about the nodes within a network.
    */
  def listNodes(): Request[ListNodesOutput, AWSError] = js.native
  def listNodes(callback: js.Function2[/* err */ AWSError, /* data */ ListNodesOutput, Unit]): Request[ListNodesOutput, AWSError] = js.native
  /**
    * Returns information about the nodes within a network.
    */
  def listNodes(params: ListNodesInput): Request[ListNodesOutput, AWSError] = js.native
  def listNodes(
    params: ListNodesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNodesOutput, Unit]
  ): Request[ListNodesOutput, AWSError] = js.native
  /**
    * Returns the listing of votes for a specified proposal, including the value of each vote and the unique identifier of the member that cast the vote.
    */
  def listProposalVotes(): Request[ListProposalVotesOutput, AWSError] = js.native
  def listProposalVotes(callback: js.Function2[/* err */ AWSError, /* data */ ListProposalVotesOutput, Unit]): Request[ListProposalVotesOutput, AWSError] = js.native
  /**
    * Returns the listing of votes for a specified proposal, including the value of each vote and the unique identifier of the member that cast the vote.
    */
  def listProposalVotes(params: ListProposalVotesInput): Request[ListProposalVotesOutput, AWSError] = js.native
  def listProposalVotes(
    params: ListProposalVotesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProposalVotesOutput, Unit]
  ): Request[ListProposalVotesOutput, AWSError] = js.native
  /**
    * Returns a listing of proposals for the network.
    */
  def listProposals(): Request[ListProposalsOutput, AWSError] = js.native
  def listProposals(callback: js.Function2[/* err */ AWSError, /* data */ ListProposalsOutput, Unit]): Request[ListProposalsOutput, AWSError] = js.native
  /**
    * Returns a listing of proposals for the network.
    */
  def listProposals(params: ListProposalsInput): Request[ListProposalsOutput, AWSError] = js.native
  def listProposals(
    params: ListProposalsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProposalsOutput, Unit]
  ): Request[ListProposalsOutput, AWSError] = js.native
  /**
    * Rejects an invitation to join a network. This action can be called by a principal in an AWS account that has received an invitation to create a member and join a network.
    */
  def rejectInvitation(): Request[RejectInvitationOutput, AWSError] = js.native
  def rejectInvitation(callback: js.Function2[/* err */ AWSError, /* data */ RejectInvitationOutput, Unit]): Request[RejectInvitationOutput, AWSError] = js.native
  /**
    * Rejects an invitation to join a network. This action can be called by a principal in an AWS account that has received an invitation to create a member and join a network.
    */
  def rejectInvitation(params: RejectInvitationInput): Request[RejectInvitationOutput, AWSError] = js.native
  def rejectInvitation(
    params: RejectInvitationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RejectInvitationOutput, Unit]
  ): Request[RejectInvitationOutput, AWSError] = js.native
  /**
    * Casts a vote for a specified ProposalId on behalf of a member. The member to vote as, specified by VoterMemberId, must be in the same AWS account as the principal that calls the action.
    */
  def voteOnProposal(): Request[VoteOnProposalOutput, AWSError] = js.native
  def voteOnProposal(callback: js.Function2[/* err */ AWSError, /* data */ VoteOnProposalOutput, Unit]): Request[VoteOnProposalOutput, AWSError] = js.native
  /**
    * Casts a vote for a specified ProposalId on behalf of a member. The member to vote as, specified by VoterMemberId, must be in the same AWS account as the principal that calls the action.
    */
  def voteOnProposal(params: VoteOnProposalInput): Request[VoteOnProposalOutput, AWSError] = js.native
  def voteOnProposal(
    params: VoteOnProposalInput,
    callback: js.Function2[/* err */ AWSError, /* data */ VoteOnProposalOutput, Unit]
  ): Request[VoteOnProposalOutput, AWSError] = js.native
}

