package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JDBCConnectorSource extends StObject {
  
  /**
    * Additional connection options for the connector.
    */
  var AdditionalOptions: js.UndefOr[JDBCConnectorOptions] = js.undefined
  
  /**
    * The name of the connection that is associated with the connector.
    */
  var ConnectionName: EnclosedInStringProperty
  
  /**
    * The name of the table in the data source.
    */
  var ConnectionTable: js.UndefOr[EnclosedInStringPropertyWithQuote] = js.undefined
  
  /**
    * The type of connection, such as marketplace.jdbc or custom.jdbc, designating a connection to a JDBC data store.
    */
  var ConnectionType: EnclosedInStringProperty
  
  /**
    * The name of a connector that assists with accessing the data store in Glue Studio.
    */
  var ConnectorName: EnclosedInStringProperty
  
  /**
    * The name of the data source.
    */
  var Name: NodeName
  
  /**
    * Specifies the data schema for the custom JDBC source.
    */
  var OutputSchemas: js.UndefOr[GlueSchemas] = js.undefined
  
  /**
    * The table or SQL query to get the data from. You can specify either ConnectionTable or query, but not both.
    */
  var Query: js.UndefOr[SqlQuery] = js.undefined
}
object JDBCConnectorSource {
  
  inline def apply(
    ConnectionName: EnclosedInStringProperty,
    ConnectionType: EnclosedInStringProperty,
    ConnectorName: EnclosedInStringProperty,
    Name: NodeName
  ): JDBCConnectorSource = {
    val __obj = js.Dynamic.literal(ConnectionName = ConnectionName.asInstanceOf[js.Any], ConnectionType = ConnectionType.asInstanceOf[js.Any], ConnectorName = ConnectorName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JDBCConnectorSource]
  }
  
  extension [Self <: JDBCConnectorSource](x: Self) {
    
    inline def setAdditionalOptions(value: JDBCConnectorOptions): Self = StObject.set(x, "AdditionalOptions", value.asInstanceOf[js.Any])
    
    inline def setAdditionalOptionsUndefined: Self = StObject.set(x, "AdditionalOptions", js.undefined)
    
    inline def setConnectionName(value: EnclosedInStringProperty): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    inline def setConnectionTable(value: EnclosedInStringPropertyWithQuote): Self = StObject.set(x, "ConnectionTable", value.asInstanceOf[js.Any])
    
    inline def setConnectionTableUndefined: Self = StObject.set(x, "ConnectionTable", js.undefined)
    
    inline def setConnectionType(value: EnclosedInStringProperty): Self = StObject.set(x, "ConnectionType", value.asInstanceOf[js.Any])
    
    inline def setConnectorName(value: EnclosedInStringProperty): Self = StObject.set(x, "ConnectorName", value.asInstanceOf[js.Any])
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemas(value: GlueSchemas): Self = StObject.set(x, "OutputSchemas", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemasUndefined: Self = StObject.set(x, "OutputSchemas", js.undefined)
    
    inline def setOutputSchemasVarargs(value: GlueSchema*): Self = StObject.set(x, "OutputSchemas", js.Array(value*))
    
    inline def setQuery(value: SqlQuery): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "Query", js.undefined)
  }
}
