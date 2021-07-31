package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderableClusterOptionsMessage extends StObject {
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * An OrderableClusterOption structure containing information about orderable options for the cluster.
    */
  var OrderableClusterOptions: js.UndefOr[OrderableClusterOptionsList] = js.undefined
}
object OrderableClusterOptionsMessage {
  
  @scala.inline
  def apply(): OrderableClusterOptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderableClusterOptionsMessage]
  }
  
  @scala.inline
  implicit class OrderableClusterOptionsMessageMutableBuilder[Self <: OrderableClusterOptionsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setOrderableClusterOptions(value: OrderableClusterOptionsList): Self = StObject.set(x, "OrderableClusterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderableClusterOptionsUndefined: Self = StObject.set(x, "OrderableClusterOptions", js.undefined)
    
    @scala.inline
    def setOrderableClusterOptionsVarargs(value: OrderableClusterOption*): Self = StObject.set(x, "OrderableClusterOptions", js.Array(value :_*))
  }
}
