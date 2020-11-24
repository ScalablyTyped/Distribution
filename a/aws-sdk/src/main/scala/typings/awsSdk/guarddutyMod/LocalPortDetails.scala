package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalPortDetails extends js.Object {
  
  /**
    * The port number of the local connection.
    */
  var Port: js.UndefOr[Integer] = js.native
  
  /**
    * The port name of the local connection.
    */
  var PortName: js.UndefOr[String] = js.native
}
object LocalPortDetails {
  
  @scala.inline
  def apply(): LocalPortDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalPortDetails]
  }
  
  @scala.inline
  implicit class LocalPortDetailsOps[Self <: LocalPortDetails] (val x: Self) extends AnyVal {
    
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
    def setPort(value: Integer): Self = this.set("Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    
    @scala.inline
    def setPortName(value: String): Self = this.set("PortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortName: Self = this.set("PortName", js.undefined)
  }
}
