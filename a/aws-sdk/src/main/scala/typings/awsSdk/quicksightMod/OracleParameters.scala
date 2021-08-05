package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OracleParameters extends StObject {
  
  /**
    * Database.
    */
  var Database: typings.awsSdk.quicksightMod.Database
  
  /**
    * An Oracle host.
    */
  var Host: typings.awsSdk.quicksightMod.Host
  
  /**
    * Port.
    */
  var Port: typings.awsSdk.quicksightMod.Port
}
object OracleParameters {
  
  inline def apply(Database: Database, Host: Host, Port: Port): OracleParameters = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[OracleParameters]
  }
  
  extension [Self <: OracleParameters](x: Self) {
    
    inline def setDatabase(value: Database): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setHost(value: Host): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Port): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
  }
}
