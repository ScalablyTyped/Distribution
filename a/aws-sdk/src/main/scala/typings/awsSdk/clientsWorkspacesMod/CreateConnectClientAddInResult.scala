package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectClientAddInResult extends StObject {
  
  /**
    * The client add-in identifier.
    */
  var AddInId: js.UndefOr[AmazonUuid] = js.undefined
}
object CreateConnectClientAddInResult {
  
  inline def apply(): CreateConnectClientAddInResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConnectClientAddInResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateConnectClientAddInResult] (val x: Self) extends AnyVal {
    
    inline def setAddInId(value: AmazonUuid): Self = StObject.set(x, "AddInId", value.asInstanceOf[js.Any])
    
    inline def setAddInIdUndefined: Self = StObject.set(x, "AddInId", js.undefined)
  }
}
