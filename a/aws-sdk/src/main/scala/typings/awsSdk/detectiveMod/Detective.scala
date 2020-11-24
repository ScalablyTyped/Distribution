package typings.awsSdk.detectiveMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Detective extends Service {
  
  /**
    * Accepts an invitation for the member account to contribute data to a behavior graph. This operation can only be called by an invited member account.  The request provides the ARN of behavior graph. The member account status in the graph must be INVITED.
    */
  def acceptInvitation(): Request[js.Object, AWSError] = js.native
  def acceptInvitation(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Accepts an invitation for the member account to contribute data to a behavior graph. This operation can only be called by an invited member account.  The request provides the ARN of behavior graph. The member account status in the graph must be INVITED.
    */
  def acceptInvitation(params: AcceptInvitationRequest): Request[js.Object, AWSError] = js.native
  def acceptInvitation(
    params: AcceptInvitationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  @JSName("config")
  var config_Detective: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates a new behavior graph for the calling account, and sets that account as the master account. This operation is called by the account that is enabling Detective. Before you try to enable Detective, make sure that your account has been enrolled in Amazon GuardDuty for at least 48 hours. If you do not meet this requirement, you cannot enable Detective. If you do meet the GuardDuty prerequisite, then when you make the request to enable Detective, it checks whether your data volume is within the Detective quota. If it exceeds the quota, then you cannot enable Detective.  The operation also enables Detective for the calling account in the currently selected Region. It returns the ARN of the new behavior graph.  CreateGraph triggers a process to create the corresponding data tables for the new behavior graph. An account can only be the master account for one behavior graph within a Region. If the same account calls CreateGraph with the same master account, it always returns the same behavior graph ARN. It does not create a new behavior graph.
    */
  def createGraph(): Request[CreateGraphResponse, AWSError] = js.native
  def createGraph(callback: js.Function2[/* err */ AWSError, /* data */ CreateGraphResponse, Unit]): Request[CreateGraphResponse, AWSError] = js.native
  
  /**
    * Sends a request to invite the specified AWS accounts to be member accounts in the behavior graph. This operation can only be called by the master account for a behavior graph.   CreateMembers verifies the accounts and then sends invitations to the verified accounts. The request provides the behavior graph ARN and the list of accounts to invite. The response separates the requested accounts into two lists:   The accounts that CreateMembers was able to start the verification for. This list includes member accounts that are being verified, that have passed verification and are being sent an invitation, and that have failed verification.   The accounts that CreateMembers was unable to process. This list includes accounts that were already invited to be member accounts in the behavior graph.  
    */
  def createMembers(): Request[CreateMembersResponse, AWSError] = js.native
  def createMembers(callback: js.Function2[/* err */ AWSError, /* data */ CreateMembersResponse, Unit]): Request[CreateMembersResponse, AWSError] = js.native
  /**
    * Sends a request to invite the specified AWS accounts to be member accounts in the behavior graph. This operation can only be called by the master account for a behavior graph.   CreateMembers verifies the accounts and then sends invitations to the verified accounts. The request provides the behavior graph ARN and the list of accounts to invite. The response separates the requested accounts into two lists:   The accounts that CreateMembers was able to start the verification for. This list includes member accounts that are being verified, that have passed verification and are being sent an invitation, and that have failed verification.   The accounts that CreateMembers was unable to process. This list includes accounts that were already invited to be member accounts in the behavior graph.  
    */
  def createMembers(params: CreateMembersRequest): Request[CreateMembersResponse, AWSError] = js.native
  def createMembers(
    params: CreateMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMembersResponse, Unit]
  ): Request[CreateMembersResponse, AWSError] = js.native
  
  /**
    * Disables the specified behavior graph and queues it to be deleted. This operation removes the graph from each member account's list of behavior graphs.  DeleteGraph can only be called by the master account for a behavior graph.
    */
  def deleteGraph(): Request[js.Object, AWSError] = js.native
  def deleteGraph(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disables the specified behavior graph and queues it to be deleted. This operation removes the graph from each member account's list of behavior graphs.  DeleteGraph can only be called by the master account for a behavior graph.
    */
  def deleteGraph(params: DeleteGraphRequest): Request[js.Object, AWSError] = js.native
  def deleteGraph(params: DeleteGraphRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes one or more member accounts from the master account behavior graph. This operation can only be called by a Detective master account. That account cannot use DeleteMembers to delete their own account from the behavior graph. To disable a behavior graph, the master account uses the DeleteGraph API method.
    */
  def deleteMembers(): Request[DeleteMembersResponse, AWSError] = js.native
  def deleteMembers(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMembersResponse, Unit]): Request[DeleteMembersResponse, AWSError] = js.native
  /**
    * Deletes one or more member accounts from the master account behavior graph. This operation can only be called by a Detective master account. That account cannot use DeleteMembers to delete their own account from the behavior graph. To disable a behavior graph, the master account uses the DeleteGraph API method.
    */
  def deleteMembers(params: DeleteMembersRequest): Request[DeleteMembersResponse, AWSError] = js.native
  def deleteMembers(
    params: DeleteMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMembersResponse, Unit]
  ): Request[DeleteMembersResponse, AWSError] = js.native
  
  /**
    * Removes the member account from the specified behavior graph. This operation can only be called by a member account that has the ENABLED status.
    */
  def disassociateMembership(): Request[js.Object, AWSError] = js.native
  def disassociateMembership(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the member account from the specified behavior graph. This operation can only be called by a member account that has the ENABLED status.
    */
  def disassociateMembership(params: DisassociateMembershipRequest): Request[js.Object, AWSError] = js.native
  def disassociateMembership(
    params: DisassociateMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Returns the membership details for specified member accounts for a behavior graph.
    */
  def getMembers(): Request[GetMembersResponse, AWSError] = js.native
  def getMembers(callback: js.Function2[/* err */ AWSError, /* data */ GetMembersResponse, Unit]): Request[GetMembersResponse, AWSError] = js.native
  /**
    * Returns the membership details for specified member accounts for a behavior graph.
    */
  def getMembers(params: GetMembersRequest): Request[GetMembersResponse, AWSError] = js.native
  def getMembers(
    params: GetMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMembersResponse, Unit]
  ): Request[GetMembersResponse, AWSError] = js.native
  
  /**
    * Returns the list of behavior graphs that the calling account is a master of. This operation can only be called by a master account. Because an account can currently only be the master of one behavior graph within a Region, the results always contain a single graph.
    */
  def listGraphs(): Request[ListGraphsResponse, AWSError] = js.native
  def listGraphs(callback: js.Function2[/* err */ AWSError, /* data */ ListGraphsResponse, Unit]): Request[ListGraphsResponse, AWSError] = js.native
  /**
    * Returns the list of behavior graphs that the calling account is a master of. This operation can only be called by a master account. Because an account can currently only be the master of one behavior graph within a Region, the results always contain a single graph.
    */
  def listGraphs(params: ListGraphsRequest): Request[ListGraphsResponse, AWSError] = js.native
  def listGraphs(
    params: ListGraphsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGraphsResponse, Unit]
  ): Request[ListGraphsResponse, AWSError] = js.native
  
  /**
    * Retrieves the list of open and accepted behavior graph invitations for the member account. This operation can only be called by a member account. Open invitations are invitations that the member account has not responded to. The results do not include behavior graphs for which the member account declined the invitation. The results also do not include behavior graphs that the member account resigned from or was removed from.
    */
  def listInvitations(): Request[ListInvitationsResponse, AWSError] = js.native
  def listInvitations(callback: js.Function2[/* err */ AWSError, /* data */ ListInvitationsResponse, Unit]): Request[ListInvitationsResponse, AWSError] = js.native
  /**
    * Retrieves the list of open and accepted behavior graph invitations for the member account. This operation can only be called by a member account. Open invitations are invitations that the member account has not responded to. The results do not include behavior graphs for which the member account declined the invitation. The results also do not include behavior graphs that the member account resigned from or was removed from.
    */
  def listInvitations(params: ListInvitationsRequest): Request[ListInvitationsResponse, AWSError] = js.native
  def listInvitations(
    params: ListInvitationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInvitationsResponse, Unit]
  ): Request[ListInvitationsResponse, AWSError] = js.native
  
  /**
    * Retrieves the list of member accounts for a behavior graph. Does not return member accounts that were removed from the behavior graph.
    */
  def listMembers(): Request[ListMembersResponse, AWSError] = js.native
  def listMembers(callback: js.Function2[/* err */ AWSError, /* data */ ListMembersResponse, Unit]): Request[ListMembersResponse, AWSError] = js.native
  /**
    * Retrieves the list of member accounts for a behavior graph. Does not return member accounts that were removed from the behavior graph.
    */
  def listMembers(params: ListMembersRequest): Request[ListMembersResponse, AWSError] = js.native
  def listMembers(
    params: ListMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMembersResponse, Unit]
  ): Request[ListMembersResponse, AWSError] = js.native
  
  /**
    * Rejects an invitation to contribute the account data to a behavior graph. This operation must be called by a member account that has the INVITED status.
    */
  def rejectInvitation(): Request[js.Object, AWSError] = js.native
  def rejectInvitation(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Rejects an invitation to contribute the account data to a behavior graph. This operation must be called by a member account that has the INVITED status.
    */
  def rejectInvitation(params: RejectInvitationRequest): Request[js.Object, AWSError] = js.native
  def rejectInvitation(
    params: RejectInvitationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Sends a request to enable data ingest for a member account that has a status of ACCEPTED_BUT_DISABLED. For valid member accounts, the status is updated as follows.   If Detective enabled the member account, then the new status is ENABLED.   If Detective cannot enable the member account, the status remains ACCEPTED_BUT_DISABLED.   
    */
  def startMonitoringMember(): Request[js.Object, AWSError] = js.native
  def startMonitoringMember(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sends a request to enable data ingest for a member account that has a status of ACCEPTED_BUT_DISABLED. For valid member accounts, the status is updated as follows.   If Detective enabled the member account, then the new status is ENABLED.   If Detective cannot enable the member account, the status remains ACCEPTED_BUT_DISABLED.   
    */
  def startMonitoringMember(params: StartMonitoringMemberRequest): Request[js.Object, AWSError] = js.native
  def startMonitoringMember(
    params: StartMonitoringMemberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
}
