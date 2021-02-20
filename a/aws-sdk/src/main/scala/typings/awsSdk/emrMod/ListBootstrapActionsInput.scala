package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBootstrapActionsInput extends StObject {
  
  /**
    * The cluster identifier for the bootstrap actions to list.
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId = js.native
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.native
}
object ListBootstrapActionsInput {
  
  @scala.inline
  def apply(ClusterId: ClusterId): ListBootstrapActionsInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBootstrapActionsInput]
  }
  
  @scala.inline
  implicit class ListBootstrapActionsInputMutableBuilder[Self <: ListBootstrapActionsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
