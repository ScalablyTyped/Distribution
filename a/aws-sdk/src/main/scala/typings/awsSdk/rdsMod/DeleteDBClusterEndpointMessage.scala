package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDBClusterEndpointMessage extends js.Object {
  
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
  implicit class DeleteDBClusterEndpointMessageOps[Self <: DeleteDBClusterEndpointMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDBClusterEndpointIdentifier(value: String): Self = this.set("DBClusterEndpointIdentifier", value.asInstanceOf[js.Any])
  }
}
