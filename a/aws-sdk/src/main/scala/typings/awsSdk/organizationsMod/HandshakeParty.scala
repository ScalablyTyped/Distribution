package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandshakeParty extends StObject {
  
  /**
    * The unique identifier (ID) for the party. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lowercase letters or digits.
    */
  var Id: HandshakePartyId
  
  /**
    * The type of party.
    */
  var Type: HandshakePartyType
}
object HandshakeParty {
  
  @scala.inline
  def apply(Id: HandshakePartyId, Type: HandshakePartyType): HandshakeParty = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandshakeParty]
  }
  
  @scala.inline
  implicit class HandshakePartyMutableBuilder[Self <: HandshakeParty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: HandshakePartyId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: HandshakePartyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
