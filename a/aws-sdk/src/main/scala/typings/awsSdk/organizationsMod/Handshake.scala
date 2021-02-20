package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Handshake extends StObject {
  
  /**
    * The type of handshake, indicating what action occurs when the recipient accepts the handshake. The following handshake types are supported:    INVITE: This type of handshake represents a request to join an organization. It is always sent from the management account to only non-member accounts.    ENABLE_ALL_FEATURES: This type of handshake represents a request to enable all features in an organization. It is always sent from the management account to only invited member accounts. Created accounts do not receive this because those accounts were created by the organization's management account and approval is inferred.    APPROVE_ALL_FEATURES: This type of handshake is sent from the Organizations service when all member accounts have approved the ENABLE_ALL_FEATURES invitation. It is sent only to the management account and signals the master that it can finalize the process to enable all features.  
    */
  var Action: js.UndefOr[ActionType] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of a handshake. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
    */
  var Arn: js.UndefOr[HandshakeArn] = js.native
  
  /**
    * The date and time that the handshake expires. If the recipient of the handshake request fails to respond before the specified date and time, the handshake becomes inactive and is no longer valid.
    */
  var ExpirationTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The unique identifier (ID) of a handshake. The originating account creates the ID when it initiates the handshake. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lowercase letters or digits.
    */
  var Id: js.UndefOr[HandshakeId] = js.native
  
  /**
    * Information about the two accounts that are participating in the handshake.
    */
  var Parties: js.UndefOr[HandshakeParties] = js.native
  
  /**
    * The date and time that the handshake request was made.
    */
  var RequestedTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * Additional information that is needed to process the handshake.
    */
  var Resources: js.UndefOr[HandshakeResources] = js.native
  
  /**
    * The current state of the handshake. Use the state to trace the flow of the handshake through the process from its creation to its acceptance. The meaning of each of the valid values is as follows:    REQUESTED: This handshake was sent to multiple recipients (applicable to only some handshake types) and not all recipients have responded yet. The request stays in this state until all recipients respond.    OPEN: This handshake was sent to multiple recipients (applicable to only some policy types) and all recipients have responded, allowing the originator to complete the handshake action.    CANCELED: This handshake is no longer active because it was canceled by the originating account.    ACCEPTED: This handshake is complete because it has been accepted by the recipient.    DECLINED: This handshake is no longer active because it was declined by the recipient account.    EXPIRED: This handshake is no longer active because the originator did not receive a response of any kind from the recipient before the expiration time (15 days).  
    */
  var State: js.UndefOr[HandshakeState] = js.native
}
object Handshake {
  
  @scala.inline
  def apply(): Handshake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Handshake]
  }
  
  @scala.inline
  implicit class HandshakeMutableBuilder[Self <: Handshake] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ActionType): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setArn(value: HandshakeArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setExpirationTimestamp(value: Timestamp): Self = StObject.set(x, "ExpirationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimestampUndefined: Self = StObject.set(x, "ExpirationTimestamp", js.undefined)
    
    @scala.inline
    def setId(value: HandshakeId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setParties(value: HandshakeParties): Self = StObject.set(x, "Parties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartiesUndefined: Self = StObject.set(x, "Parties", js.undefined)
    
    @scala.inline
    def setPartiesVarargs(value: HandshakeParty*): Self = StObject.set(x, "Parties", js.Array(value :_*))
    
    @scala.inline
    def setRequestedTimestamp(value: Timestamp): Self = StObject.set(x, "RequestedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedTimestampUndefined: Self = StObject.set(x, "RequestedTimestamp", js.undefined)
    
    @scala.inline
    def setResources(value: HandshakeResources): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: HandshakeResource*): Self = StObject.set(x, "Resources", js.Array(value :_*))
    
    @scala.inline
    def setState(value: HandshakeState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
