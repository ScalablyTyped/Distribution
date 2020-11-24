package typings.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClipFragmentSelector extends js.Object {
  
  /**
    * The origin of the timestamps to use (Server or Producer).
    */
  var FragmentSelectorType: ClipFragmentSelectorType = js.native
  
  /**
    * The range of timestamps to return.
    */
  var TimestampRange: ClipTimestampRange = js.native
}
object ClipFragmentSelector {
  
  @scala.inline
  def apply(FragmentSelectorType: ClipFragmentSelectorType, TimestampRange: ClipTimestampRange): ClipFragmentSelector = {
    val __obj = js.Dynamic.literal(FragmentSelectorType = FragmentSelectorType.asInstanceOf[js.Any], TimestampRange = TimestampRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipFragmentSelector]
  }
  
  @scala.inline
  implicit class ClipFragmentSelectorOps[Self <: ClipFragmentSelector] (val x: Self) extends AnyVal {
    
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
    def setFragmentSelectorType(value: ClipFragmentSelectorType): Self = this.set("FragmentSelectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampRange(value: ClipTimestampRange): Self = this.set("TimestampRange", value.asInstanceOf[js.Any])
  }
}
