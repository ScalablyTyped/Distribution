package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderableDBInstanceOptionsMessage extends StObject {
  
  /**
    *  An optional pagination token provided by a previous OrderableDBInstanceOptions request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords .
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * An OrderableDBInstanceOption structure containing information about orderable options for the DB instance.
    */
  var OrderableDBInstanceOptions: js.UndefOr[OrderableDBInstanceOptionsList] = js.native
}
object OrderableDBInstanceOptionsMessage {
  
  @scala.inline
  def apply(): OrderableDBInstanceOptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderableDBInstanceOptionsMessage]
  }
  
  @scala.inline
  implicit class OrderableDBInstanceOptionsMessageMutableBuilder[Self <: OrderableDBInstanceOptionsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setOrderableDBInstanceOptions(value: OrderableDBInstanceOptionsList): Self = StObject.set(x, "OrderableDBInstanceOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderableDBInstanceOptionsUndefined: Self = StObject.set(x, "OrderableDBInstanceOptions", js.undefined)
    
    @scala.inline
    def setOrderableDBInstanceOptionsVarargs(value: OrderableDBInstanceOption*): Self = StObject.set(x, "OrderableDBInstanceOptions", js.Array(value :_*))
  }
}
