package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTapePoolsInput extends StObject {
  
  /**
    * An optional number limit for the tape pools in the list returned by this call.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.native
  
  /**
    * A string that indicates the position at which to begin the returned list of tape pools.
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of each of the custom tape pools you want to list. If you don't specify a custom tape pool ARN, the response lists all custom tape pools. 
    */
  var PoolARNs: js.UndefOr[typings.awsSdk.storagegatewayMod.PoolARNs] = js.native
}
object ListTapePoolsInput {
  
  @scala.inline
  def apply(): ListTapePoolsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTapePoolsInput]
  }
  
  @scala.inline
  implicit class ListTapePoolsInputMutableBuilder[Self <: ListTapePoolsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: PositiveIntObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setPoolARNs(value: PoolARNs): Self = StObject.set(x, "PoolARNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolARNsUndefined: Self = StObject.set(x, "PoolARNs", js.undefined)
    
    @scala.inline
    def setPoolARNsVarargs(value: PoolARN*): Self = StObject.set(x, "PoolARNs", js.Array(value :_*))
  }
}
