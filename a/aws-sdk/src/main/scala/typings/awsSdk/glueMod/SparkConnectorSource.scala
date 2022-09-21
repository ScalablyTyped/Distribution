package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparkConnectorSource extends StObject {
  
  /**
    * Additional connection options for the connector.
    */
  var AdditionalOptions: js.UndefOr[typings.awsSdk.glueMod.AdditionalOptions] = js.undefined
  
  /**
    * The name of the connection that is associated with the connector.
    */
  var ConnectionName: EnclosedInStringProperty
  
  /**
    * The type of connection, such as marketplace.spark or custom.spark, designating a connection to an Apache Spark data store.
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
    * Specifies data schema for the custom spark source.
    */
  var OutputSchemas: js.UndefOr[GlueSchemas] = js.undefined
}
object SparkConnectorSource {
  
  inline def apply(
    ConnectionName: EnclosedInStringProperty,
    ConnectionType: EnclosedInStringProperty,
    ConnectorName: EnclosedInStringProperty,
    Name: NodeName
  ): SparkConnectorSource = {
    val __obj = js.Dynamic.literal(ConnectionName = ConnectionName.asInstanceOf[js.Any], ConnectionType = ConnectionType.asInstanceOf[js.Any], ConnectorName = ConnectorName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkConnectorSource]
  }
  
  extension [Self <: SparkConnectorSource](x: Self) {
    
    inline def setAdditionalOptions(value: AdditionalOptions): Self = StObject.set(x, "AdditionalOptions", value.asInstanceOf[js.Any])
    
    inline def setAdditionalOptionsUndefined: Self = StObject.set(x, "AdditionalOptions", js.undefined)
    
    inline def setConnectionName(value: EnclosedInStringProperty): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    inline def setConnectionType(value: EnclosedInStringProperty): Self = StObject.set(x, "ConnectionType", value.asInstanceOf[js.Any])
    
    inline def setConnectorName(value: EnclosedInStringProperty): Self = StObject.set(x, "ConnectorName", value.asInstanceOf[js.Any])
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemas(value: GlueSchemas): Self = StObject.set(x, "OutputSchemas", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemasUndefined: Self = StObject.set(x, "OutputSchemas", js.undefined)
    
    inline def setOutputSchemasVarargs(value: GlueSchema*): Self = StObject.set(x, "OutputSchemas", js.Array(value*))
  }
}
