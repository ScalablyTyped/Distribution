package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLensInput extends StObject {
  
  var ClientRequestToken: typings.awsSdk.clientsWellarchitectedMod.ClientRequestToken
  
  var LensAlias: typings.awsSdk.clientsWellarchitectedMod.LensAlias
  
  /**
    * The status of the lens to be deleted.
    */
  var LensStatus: LensStatusType
}
object DeleteLensInput {
  
  inline def apply(ClientRequestToken: ClientRequestToken, LensAlias: LensAlias, LensStatus: LensStatusType): DeleteLensInput = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], LensAlias = LensAlias.asInstanceOf[js.Any], LensStatus = LensStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLensInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteLensInput] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setLensStatus(value: LensStatusType): Self = StObject.set(x, "LensStatus", value.asInstanceOf[js.Any])
  }
}
