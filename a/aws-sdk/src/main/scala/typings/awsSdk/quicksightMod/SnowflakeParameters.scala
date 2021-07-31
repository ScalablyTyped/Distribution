package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnowflakeParameters extends StObject {
  
  /**
    * Database.
    */
  var Database: typings.awsSdk.quicksightMod.Database
  
  /**
    * Host.
    */
  var Host: typings.awsSdk.quicksightMod.Host
  
  /**
    * Warehouse.
    */
  var Warehouse: typings.awsSdk.quicksightMod.Warehouse
}
object SnowflakeParameters {
  
  @scala.inline
  def apply(Database: Database, Host: Host, Warehouse: Warehouse): SnowflakeParameters = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any], Warehouse = Warehouse.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnowflakeParameters]
  }
  
  @scala.inline
  implicit class SnowflakeParametersMutableBuilder[Self <: SnowflakeParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabase(value: Database): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: Host): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarehouse(value: Warehouse): Self = StObject.set(x, "Warehouse", value.asInstanceOf[js.Any])
  }
}
