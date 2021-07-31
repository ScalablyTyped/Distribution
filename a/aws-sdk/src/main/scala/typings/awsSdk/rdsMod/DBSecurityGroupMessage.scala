package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBSecurityGroupMessage extends StObject {
  
  /**
    *  A list of DBSecurityGroup instances. 
    */
  var DBSecurityGroups: js.UndefOr[typings.awsSdk.rdsMod.DBSecurityGroups] = js.undefined
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DBSecurityGroupMessage {
  
  @scala.inline
  def apply(): DBSecurityGroupMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBSecurityGroupMessage]
  }
  
  @scala.inline
  implicit class DBSecurityGroupMessageMutableBuilder[Self <: DBSecurityGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBSecurityGroups(value: DBSecurityGroups): Self = StObject.set(x, "DBSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSecurityGroupsUndefined: Self = StObject.set(x, "DBSecurityGroups", js.undefined)
    
    @scala.inline
    def setDBSecurityGroupsVarargs(value: DBSecurityGroup*): Self = StObject.set(x, "DBSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
