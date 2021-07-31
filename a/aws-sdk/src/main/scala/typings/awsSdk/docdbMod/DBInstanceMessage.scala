package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBInstanceMessage extends StObject {
  
  /**
    * Detailed information about one or more instances. 
    */
  var DBInstances: js.UndefOr[DBInstanceList] = js.undefined
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DBInstanceMessage {
  
  @scala.inline
  def apply(): DBInstanceMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBInstanceMessage]
  }
  
  @scala.inline
  implicit class DBInstanceMessageMutableBuilder[Self <: DBInstanceMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBInstances(value: DBInstanceList): Self = StObject.set(x, "DBInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstancesUndefined: Self = StObject.set(x, "DBInstances", js.undefined)
    
    @scala.inline
    def setDBInstancesVarargs(value: DBInstance*): Self = StObject.set(x, "DBInstances", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
