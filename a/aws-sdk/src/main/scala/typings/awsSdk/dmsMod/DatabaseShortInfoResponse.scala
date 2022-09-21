package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseShortInfoResponse extends StObject {
  
  /**
    * The database engine of a database in a Fleet Advisor collector inventory, for example PostgreSQL.
    */
  var DatabaseEngine: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of a database in a Fleet Advisor collector inventory.
    */
  var DatabaseId: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address of a database in a Fleet Advisor collector inventory.
    */
  var DatabaseIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a database in a Fleet Advisor collector inventory.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
}
object DatabaseShortInfoResponse {
  
  inline def apply(): DatabaseShortInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseShortInfoResponse]
  }
  
  extension [Self <: DatabaseShortInfoResponse](x: Self) {
    
    inline def setDatabaseEngine(value: String): Self = StObject.set(x, "DatabaseEngine", value.asInstanceOf[js.Any])
    
    inline def setDatabaseEngineUndefined: Self = StObject.set(x, "DatabaseEngine", js.undefined)
    
    inline def setDatabaseId(value: String): Self = StObject.set(x, "DatabaseId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIdUndefined: Self = StObject.set(x, "DatabaseId", js.undefined)
    
    inline def setDatabaseIpAddress(value: String): Self = StObject.set(x, "DatabaseIpAddress", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIpAddressUndefined: Self = StObject.set(x, "DatabaseIpAddress", js.undefined)
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
  }
}
