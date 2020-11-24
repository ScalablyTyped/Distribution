package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorDefinitionVersion extends js.Object {
  
  /**
    * A list of references to connectors in this version, with their corresponding configuration settings.
    */
  var Connectors: js.UndefOr[listOfConnector] = js.native
}
object ConnectorDefinitionVersion {
  
  @scala.inline
  def apply(): ConnectorDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorDefinitionVersion]
  }
  
  @scala.inline
  implicit class ConnectorDefinitionVersionOps[Self <: ConnectorDefinitionVersion] (val x: Self) extends AnyVal {
    
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
    def setConnectorsVarargs(value: Connector*): Self = this.set("Connectors", js.Array(value :_*))
    
    @scala.inline
    def setConnectors(value: listOfConnector): Self = this.set("Connectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectors: Self = this.set("Connectors", js.undefined)
  }
}
