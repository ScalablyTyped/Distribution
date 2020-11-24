package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStreamingDistributionsResult extends js.Object {
  
  /**
    * The StreamingDistributionList type. 
    */
  var StreamingDistributionList: js.UndefOr[typings.awsSdk.cloudfrontMod.StreamingDistributionList] = js.native
}
object ListStreamingDistributionsResult {
  
  @scala.inline
  def apply(): ListStreamingDistributionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamingDistributionsResult]
  }
  
  @scala.inline
  implicit class ListStreamingDistributionsResultOps[Self <: ListStreamingDistributionsResult] (val x: Self) extends AnyVal {
    
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
    def setStreamingDistributionList(value: StreamingDistributionList): Self = this.set("StreamingDistributionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamingDistributionList: Self = this.set("StreamingDistributionList", js.undefined)
  }
}
