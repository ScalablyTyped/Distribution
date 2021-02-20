package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDBClusterEndpointMessage extends StObject {
  
  /**
    * The identifier associated with the custom endpoint. This parameter is stored as a lowercase string.
    */
  var DBClusterEndpointIdentifier: String = js.native
}
object DeleteDBClusterEndpointMessage {
  
  @scala.inline
  def apply(DBClusterEndpointIdentifier: String): DeleteDBClusterEndpointMessage = {
    val __obj = js.Dynamic.literal(DBClusterEndpointIdentifier = DBClusterEndpointIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBClusterEndpointMessage]
  }
  
  @scala.inline
  implicit class DeleteDBClusterEndpointMessageMutableBuilder[Self <: DeleteDBClusterEndpointMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterEndpointIdentifier(value: String): Self = StObject.set(x, "DBClusterEndpointIdentifier", value.asInstanceOf[js.Any])
  }
}
