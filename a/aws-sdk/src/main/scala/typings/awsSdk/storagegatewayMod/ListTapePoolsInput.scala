package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTapePoolsInput extends js.Object {
  
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
  implicit class ListTapePoolsInputOps[Self <: ListTapePoolsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLimit(value: PositiveIntObject): Self = this.set("Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setPoolARNsVarargs(value: PoolARN*): Self = this.set("PoolARNs", js.Array(value :_*))
    
    @scala.inline
    def setPoolARNs(value: PoolARNs): Self = this.set("PoolARNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoolARNs: Self = this.set("PoolARNs", js.undefined)
  }
}
