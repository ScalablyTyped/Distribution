package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connector extends StObject {
  
  /**
    * The ARN of the connector.
    */
  var ConnectorArn: string
  
  /**
    * A descriptive or arbitrary ID for the connector. This value must be unique within the connector definition version. Max length is 128 characters with pattern [a-zA-Z0-9:_-]+.
    */
  var Id: string
  
  /**
    * The parameters or configuration that the connector uses.
    */
  var Parameters: js.UndefOr[mapOfString] = js.undefined
}
object Connector {
  
  @scala.inline
  def apply(ConnectorArn: string, Id: string): Connector = {
    val __obj = js.Dynamic.literal(ConnectorArn = ConnectorArn.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connector]
  }
  
  @scala.inline
  implicit class ConnectorMutableBuilder[Self <: Connector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorArn(value: string): Self = StObject.set(x, "ConnectorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: mapOfString): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
  }
}
