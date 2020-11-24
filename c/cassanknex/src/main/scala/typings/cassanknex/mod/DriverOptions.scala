package typings.cassanknex.mod

import typings.cassandraDriver.mod.Client
import typings.cassandraDriver.mod.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriverOptions extends js.Object {
  
  var connection: js.UndefOr[Client | ClientOptions] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
}
object DriverOptions {
  
  @scala.inline
  def apply(): DriverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriverOptions]
  }
  
  @scala.inline
  implicit class DriverOptionsOps[Self <: DriverOptions] (val x: Self) extends AnyVal {
    
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
    def setConnection(value: Client | ClientOptions): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
  }
}
