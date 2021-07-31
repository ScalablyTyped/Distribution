package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedDBInstanceMessage extends StObject {
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * A list of reserved DB instances.
    */
  var ReservedDBInstances: js.UndefOr[ReservedDBInstanceList] = js.undefined
}
object ReservedDBInstanceMessage {
  
  @scala.inline
  def apply(): ReservedDBInstanceMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedDBInstanceMessage]
  }
  
  @scala.inline
  implicit class ReservedDBInstanceMessageMutableBuilder[Self <: ReservedDBInstanceMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setReservedDBInstances(value: ReservedDBInstanceList): Self = StObject.set(x, "ReservedDBInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedDBInstancesUndefined: Self = StObject.set(x, "ReservedDBInstances", js.undefined)
    
    @scala.inline
    def setReservedDBInstancesVarargs(value: ReservedDBInstance*): Self = StObject.set(x, "ReservedDBInstances", js.Array(value :_*))
  }
}
