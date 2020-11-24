package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectedContext extends js.Object {
  
  /**
    * The connection information for the selected object.
    * Note that the connection is not guaranteed to be in a connected
    * state on click.
    */
  var connectionProfile: IConnectionProfile = js.native
}
object ConnectedContext {
  
  @scala.inline
  def apply(connectionProfile: IConnectionProfile): ConnectedContext = {
    val __obj = js.Dynamic.literal(connectionProfile = connectionProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectedContext]
  }
  
  @scala.inline
  implicit class ConnectedContextOps[Self <: ConnectedContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnectionProfile(value: IConnectionProfile): Self = this.set("connectionProfile", value.asInstanceOf[js.Any])
  }
}
