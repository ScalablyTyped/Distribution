package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionPoolConfigurationInfo extends StObject {
  
  /**
    * The number of seconds for a proxy to wait for a connection to become available in the connection pool. Only applies when the proxy has opened its maximum number of connections and all connections are busy with client sessions.
    */
  var ConnectionBorrowTimeout: js.UndefOr[Integer] = js.undefined
  
  /**
    *  One or more SQL statements for the proxy to run when opening each new database connection. Typically used with SET statements to make sure that each connection has identical settings such as time zone and character set. This setting is empty by default. For multiple statements, use semicolons as the separator. You can also include multiple variables in a single SET statement, such as SET x=1, y=2. 
    */
  var InitQuery: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum size of the connection pool for each target in a target group. For Aurora MySQL, it is expressed as a percentage of the max_connections setting for the RDS DB instance or Aurora DB cluster used by the target group.
    */
  var MaxConnectionsPercent: js.UndefOr[Integer] = js.undefined
  
  /**
    *  Controls how actively the proxy closes idle database connections in the connection pool. A high value enables the proxy to leave a high percentage of idle connections open. A low value causes the proxy to close idle client connections and return the underlying database connections to the connection pool. For Aurora MySQL, it is expressed as a percentage of the max_connections setting for the RDS DB instance or Aurora DB cluster used by the target group. 
    */
  var MaxIdleConnectionsPercent: js.UndefOr[Integer] = js.undefined
  
  /**
    * Each item in the list represents a class of SQL operations that normally cause all later statements in a session using a proxy to be pinned to the same underlying database connection. Including an item in the list exempts that class of SQL operations from the pinning behavior. Currently, the only allowed value is EXCLUDE_VARIABLE_SETS.
    */
  var SessionPinningFilters: js.UndefOr[StringList] = js.undefined
}
object ConnectionPoolConfigurationInfo {
  
  inline def apply(): ConnectionPoolConfigurationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionPoolConfigurationInfo]
  }
  
  extension [Self <: ConnectionPoolConfigurationInfo](x: Self) {
    
    inline def setConnectionBorrowTimeout(value: Integer): Self = StObject.set(x, "ConnectionBorrowTimeout", value.asInstanceOf[js.Any])
    
    inline def setConnectionBorrowTimeoutUndefined: Self = StObject.set(x, "ConnectionBorrowTimeout", js.undefined)
    
    inline def setInitQuery(value: String): Self = StObject.set(x, "InitQuery", value.asInstanceOf[js.Any])
    
    inline def setInitQueryUndefined: Self = StObject.set(x, "InitQuery", js.undefined)
    
    inline def setMaxConnectionsPercent(value: Integer): Self = StObject.set(x, "MaxConnectionsPercent", value.asInstanceOf[js.Any])
    
    inline def setMaxConnectionsPercentUndefined: Self = StObject.set(x, "MaxConnectionsPercent", js.undefined)
    
    inline def setMaxIdleConnectionsPercent(value: Integer): Self = StObject.set(x, "MaxIdleConnectionsPercent", value.asInstanceOf[js.Any])
    
    inline def setMaxIdleConnectionsPercentUndefined: Self = StObject.set(x, "MaxIdleConnectionsPercent", js.undefined)
    
    inline def setSessionPinningFilters(value: StringList): Self = StObject.set(x, "SessionPinningFilters", value.asInstanceOf[js.Any])
    
    inline def setSessionPinningFiltersUndefined: Self = StObject.set(x, "SessionPinningFilters", js.undefined)
    
    inline def setSessionPinningFiltersVarargs(value: String*): Self = StObject.set(x, "SessionPinningFilters", js.Array(value :_*))
  }
}
