package typings.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FragmentSelector extends js.Object {
  
  /**
    * The origin of the timestamps to use (Server or Producer).
    */
  var FragmentSelectorType: typings.awsSdk.kinesisvideoarchivedmediaMod.FragmentSelectorType = js.native
  
  /**
    * The range of timestamps to return.
    */
  var TimestampRange: typings.awsSdk.kinesisvideoarchivedmediaMod.TimestampRange = js.native
}
object FragmentSelector {
  
  @scala.inline
  def apply(FragmentSelectorType: FragmentSelectorType, TimestampRange: TimestampRange): FragmentSelector = {
    val __obj = js.Dynamic.literal(FragmentSelectorType = FragmentSelectorType.asInstanceOf[js.Any], TimestampRange = TimestampRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentSelector]
  }
  
  @scala.inline
  implicit class FragmentSelectorOps[Self <: FragmentSelector] (val x: Self) extends AnyVal {
    
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
    def setFragmentSelectorType(value: FragmentSelectorType): Self = this.set("FragmentSelectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampRange(value: TimestampRange): Self = this.set("TimestampRange", value.asInstanceOf[js.Any])
  }
}
