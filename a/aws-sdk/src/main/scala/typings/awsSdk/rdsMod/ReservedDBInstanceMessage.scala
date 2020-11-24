package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservedDBInstanceMessage extends js.Object {
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * A list of reserved DB instances.
    */
  var ReservedDBInstances: js.UndefOr[ReservedDBInstanceList] = js.native
}
object ReservedDBInstanceMessage {
  
  @scala.inline
  def apply(): ReservedDBInstanceMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedDBInstanceMessage]
  }
  
  @scala.inline
  implicit class ReservedDBInstanceMessageOps[Self <: ReservedDBInstanceMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setReservedDBInstancesVarargs(value: ReservedDBInstance*): Self = this.set("ReservedDBInstances", js.Array(value :_*))
    
    @scala.inline
    def setReservedDBInstances(value: ReservedDBInstanceList): Self = this.set("ReservedDBInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedDBInstances: Self = this.set("ReservedDBInstances", js.undefined)
  }
}
