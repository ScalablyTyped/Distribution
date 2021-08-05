package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportedEndpointType extends StObject {
  
  /**
    * The type of endpoint. Valid values are source and target.
    */
  var EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.undefined
  
  /**
    * The expanded name for the engine name. For example, if the EngineName parameter is "aurora," this value would be "Amazon Aurora MySQL."
    */
  var EngineDisplayName: js.UndefOr[String] = js.undefined
  
  /**
    * The database engine name. Valid values, depending on the EndpointType, include "mysql", "oracle", "postgres", "mariadb", "aurora", "aurora-postgresql", "redshift", "s3", "db2", "azuredb", "sybase", "dynamodb", "mongodb", "kinesis", "kafka", "elasticsearch", "documentdb", "sqlserver", and "neptune".
    */
  var EngineName: js.UndefOr[String] = js.undefined
  
  /**
    * The earliest AWS DMS engine version that supports this endpoint engine. Note that endpoint engines released with AWS DMS versions earlier than 3.1.1 do not return a value for this parameter.
    */
  var ReplicationInstanceEngineMinimumVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates if Change Data Capture (CDC) is supported.
    */
  var SupportsCDC: js.UndefOr[Boolean] = js.undefined
}
object SupportedEndpointType {
  
  inline def apply(): SupportedEndpointType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportedEndpointType]
  }
  
  extension [Self <: SupportedEndpointType](x: Self) {
    
    inline def setEndpointType(value: ReplicationEndpointTypeValue): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    inline def setEndpointTypeUndefined: Self = StObject.set(x, "EndpointType", js.undefined)
    
    inline def setEngineDisplayName(value: String): Self = StObject.set(x, "EngineDisplayName", value.asInstanceOf[js.Any])
    
    inline def setEngineDisplayNameUndefined: Self = StObject.set(x, "EngineDisplayName", js.undefined)
    
    inline def setEngineName(value: String): Self = StObject.set(x, "EngineName", value.asInstanceOf[js.Any])
    
    inline def setEngineNameUndefined: Self = StObject.set(x, "EngineName", js.undefined)
    
    inline def setReplicationInstanceEngineMinimumVersion(value: String): Self = StObject.set(x, "ReplicationInstanceEngineMinimumVersion", value.asInstanceOf[js.Any])
    
    inline def setReplicationInstanceEngineMinimumVersionUndefined: Self = StObject.set(x, "ReplicationInstanceEngineMinimumVersion", js.undefined)
    
    inline def setSupportsCDC(value: Boolean): Self = StObject.set(x, "SupportsCDC", value.asInstanceOf[js.Any])
    
    inline def setSupportsCDCUndefined: Self = StObject.set(x, "SupportsCDC", js.undefined)
  }
}
