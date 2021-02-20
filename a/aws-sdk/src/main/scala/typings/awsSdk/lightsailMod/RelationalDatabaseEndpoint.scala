package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationalDatabaseEndpoint extends StObject {
  
  /**
    * Specifies the DNS address of the database.
    */
  var address: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Specifies the port that the database is listening on.
    */
  var port: js.UndefOr[integer] = js.native
}
object RelationalDatabaseEndpoint {
  
  @scala.inline
  def apply(): RelationalDatabaseEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseEndpoint]
  }
  
  @scala.inline
  implicit class RelationalDatabaseEndpointMutableBuilder[Self <: RelationalDatabaseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: NonEmptyString): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setPort(value: integer): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
