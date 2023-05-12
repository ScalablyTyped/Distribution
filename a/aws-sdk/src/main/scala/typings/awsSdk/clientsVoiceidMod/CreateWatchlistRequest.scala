package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWatchlistRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see Making retries safe with idempotent APIs.
    */
  var ClientToken: js.UndefOr[ClientTokenString] = js.undefined
  
  /**
    * A brief description of this watchlist.
    */
  var Description: js.UndefOr[WatchlistDescription] = js.undefined
  
  /**
    * The identifier of the domain that contains the watchlist.
    */
  var DomainId: typings.awsSdk.clientsVoiceidMod.DomainId
  
  /**
    * The name of the watchlist.
    */
  var Name: WatchlistName
}
object CreateWatchlistRequest {
  
  inline def apply(DomainId: DomainId, Name: WatchlistName): CreateWatchlistRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWatchlistRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWatchlistRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientTokenString): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: WatchlistDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setName(value: WatchlistName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
