package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorDefinitionVersion extends StObject {
  
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
  implicit class ConnectorDefinitionVersionMutableBuilder[Self <: ConnectorDefinitionVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectors(value: listOfConnector): Self = StObject.set(x, "Connectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorsUndefined: Self = StObject.set(x, "Connectors", js.undefined)
    
    @scala.inline
    def setConnectorsVarargs(value: Connector*): Self = StObject.set(x, "Connectors", js.Array(value :_*))
  }
}
