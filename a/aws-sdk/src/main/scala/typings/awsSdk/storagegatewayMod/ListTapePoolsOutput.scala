package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTapePoolsOutput extends js.Object {
  
  /**
    * A string that indicates the position at which to begin the returned list of tape pools. Use the marker in your next request to continue pagination of tape pools. If there are no more tape pools to list, this element does not appear in the response body. 
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.native
  
  /**
    * An array of PoolInfo objects, where each object describes a single custom tape pool. If there are no custom tape pools, the PoolInfos is an empty array. 
    */
  var PoolInfos: js.UndefOr[typings.awsSdk.storagegatewayMod.PoolInfos] = js.native
}
object ListTapePoolsOutput {
  
  @scala.inline
  def apply(): ListTapePoolsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTapePoolsOutput]
  }
  
  @scala.inline
  implicit class ListTapePoolsOutputOps[Self <: ListTapePoolsOutput] (val x: Self) extends AnyVal {
    
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
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setPoolInfosVarargs(value: PoolInfo*): Self = this.set("PoolInfos", js.Array(value :_*))
    
    @scala.inline
    def setPoolInfos(value: PoolInfos): Self = this.set("PoolInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoolInfos: Self = this.set("PoolInfos", js.undefined)
  }
}
