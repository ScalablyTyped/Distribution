package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderableDBInstanceOptionsMessage extends js.Object {
  
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
  implicit class OrderableDBInstanceOptionsMessageOps[Self <: OrderableDBInstanceOptionsMessage] (val x: Self) extends AnyVal {
    
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
    def setOrderableDBInstanceOptionsVarargs(value: OrderableDBInstanceOption*): Self = this.set("OrderableDBInstanceOptions", js.Array(value :_*))
    
    @scala.inline
    def setOrderableDBInstanceOptions(value: OrderableDBInstanceOptionsList): Self = this.set("OrderableDBInstanceOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderableDBInstanceOptions: Self = this.set("OrderableDBInstanceOptions", js.undefined)
  }
}
