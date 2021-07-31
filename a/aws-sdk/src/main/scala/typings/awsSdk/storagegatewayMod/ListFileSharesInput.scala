package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFileSharesInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the gateway whose file shares you want to list. If this field is not present, all file shares under your account are listed.
    */
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.undefined
  
  /**
    * The maximum number of file shares to return in the response. The value must be an integer with a value greater than zero. Optional.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.undefined
  
  /**
    * Opaque pagination token returned from a previous ListFileShares operation. If present, Marker specifies where to continue the list from after a previous call to ListFileShares. Optional.
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.undefined
}
object ListFileSharesInput {
  
  @scala.inline
  def apply(): ListFileSharesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFileSharesInput]
  }
  
  @scala.inline
  implicit class ListFileSharesInputMutableBuilder[Self <: ListFileSharesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    @scala.inline
    def setLimit(value: PositiveIntObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
