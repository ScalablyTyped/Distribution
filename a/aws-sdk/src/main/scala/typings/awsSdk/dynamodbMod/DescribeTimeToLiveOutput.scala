package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTimeToLiveOutput extends js.Object {
  
  /**
    * 
    */
  var TimeToLiveDescription: js.UndefOr[typings.awsSdk.dynamodbMod.TimeToLiveDescription] = js.native
}
object DescribeTimeToLiveOutput {
  
  @scala.inline
  def apply(): DescribeTimeToLiveOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTimeToLiveOutput]
  }
  
  @scala.inline
  implicit class DescribeTimeToLiveOutputOps[Self <: DescribeTimeToLiveOutput] (val x: Self) extends AnyVal {
    
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
    def setTimeToLiveDescription(value: TimeToLiveDescription): Self = this.set("TimeToLiveDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeToLiveDescription: Self = this.set("TimeToLiveDescription", js.undefined)
  }
}
