package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JDBCConnectorTarget extends StObject {
  
  /**
    * Additional connection options for the connector.
    */
  var AdditionalOptions: js.UndefOr[typings.awsSdk.glueMod.AdditionalOptions] = js.undefined
  
  /**
    * The name of the connection that is associated with the connector.
    */
  var ConnectionName: EnclosedInStringProperty
  
  /**
    * The name of the table in the data target.
    */
  var ConnectionTable: EnclosedInStringPropertyWithQuote
  
  /**
    * The type of connection, such as marketplace.jdbc or custom.jdbc, designating a connection to a JDBC data target.
    */
  var ConnectionType: EnclosedInStringProperty
  
  /**
    * The name of a connector that will be used.
    */
  var ConnectorName: EnclosedInStringProperty
  
  /**
    * The nodes that are inputs to the data target.
    */
  var Inputs: OneInput
  
  /**
    * The name of the data target.
    */
  var Name: NodeName
  
  /**
    * Specifies the data schema for the JDBC target.
    */
  var OutputSchemas: js.UndefOr[GlueSchemas] = js.undefined
}
object JDBCConnectorTarget {
  
  inline def apply(
    ConnectionName: EnclosedInStringProperty,
    ConnectionTable: EnclosedInStringPropertyWithQuote,
    ConnectionType: EnclosedInStringProperty,
    ConnectorName: EnclosedInStringProperty,
    Inputs: OneInput,
    Name: NodeName
  ): JDBCConnectorTarget = {
    val __obj = js.Dynamic.literal(ConnectionName = ConnectionName.asInstanceOf[js.Any], ConnectionTable = ConnectionTable.asInstanceOf[js.Any], ConnectionType = ConnectionType.asInstanceOf[js.Any], ConnectorName = ConnectorName.asInstanceOf[js.Any], Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JDBCConnectorTarget]
  }
  
  extension [Self <: JDBCConnectorTarget](x: Self) {
    
    inline def setAdditionalOptions(value: AdditionalOptions): Self = StObject.set(x, "AdditionalOptions", value.asInstanceOf[js.Any])
    
    inline def setAdditionalOptionsUndefined: Self = StObject.set(x, "AdditionalOptions", js.undefined)
    
    inline def setConnectionName(value: EnclosedInStringProperty): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    inline def setConnectionTable(value: EnclosedInStringPropertyWithQuote): Self = StObject.set(x, "ConnectionTable", value.asInstanceOf[js.Any])
    
    inline def setConnectionType(value: EnclosedInStringProperty): Self = StObject.set(x, "ConnectionType", value.asInstanceOf[js.Any])
    
    inline def setConnectorName(value: EnclosedInStringProperty): Self = StObject.set(x, "ConnectorName", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: OneInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemas(value: GlueSchemas): Self = StObject.set(x, "OutputSchemas", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemasUndefined: Self = StObject.set(x, "OutputSchemas", js.undefined)
    
    inline def setOutputSchemasVarargs(value: GlueSchema*): Self = StObject.set(x, "OutputSchemas", js.Array(value*))
  }
}
