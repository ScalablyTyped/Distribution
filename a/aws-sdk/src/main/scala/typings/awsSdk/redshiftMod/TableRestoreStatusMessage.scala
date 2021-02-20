package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableRestoreStatusMessage extends StObject {
  
  /**
    * A pagination token that can be used in a subsequent DescribeTableRestoreStatus request.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * A list of status details for one or more table restore requests.
    */
  var TableRestoreStatusDetails: js.UndefOr[TableRestoreStatusList] = js.native
}
object TableRestoreStatusMessage {
  
  @scala.inline
  def apply(): TableRestoreStatusMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRestoreStatusMessage]
  }
  
  @scala.inline
  implicit class TableRestoreStatusMessageMutableBuilder[Self <: TableRestoreStatusMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setTableRestoreStatusDetails(value: TableRestoreStatusList): Self = StObject.set(x, "TableRestoreStatusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableRestoreStatusDetailsUndefined: Self = StObject.set(x, "TableRestoreStatusDetails", js.undefined)
    
    @scala.inline
    def setTableRestoreStatusDetailsVarargs(value: TableRestoreStatus*): Self = StObject.set(x, "TableRestoreStatusDetails", js.Array(value :_*))
  }
}
