package typings.azdata.mod.connection

import org.scalablytyped.runtime.StringDictionary
import typings.azdata.mod.ConnectionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends ConnectionInfo {
  
  /**
    * A unique identifier for the connection
    */
  var connectionId: String = js.native
  
  /**
    * The name of the provider managing the connection (e.g. MSSQL)
    */
  var providerName: String = js.native
}
object Connection {
  
  @scala.inline
  def apply(connectionId: String, options: StringDictionary[js.Any], providerName: String): Connection = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
  
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
    
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
    def setConnectionId(value: String): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderName(value: String): Self = this.set("providerName", value.asInstanceOf[js.Any])
  }
}
