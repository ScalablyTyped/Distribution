package typings.awsSdk.kinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipFragmentSelector extends StObject {
  
  /**
    * The origin of the timestamps to use (Server or Producer).
    */
  var FragmentSelectorType: ClipFragmentSelectorType
  
  /**
    * The range of timestamps to return.
    */
  var TimestampRange: ClipTimestampRange
}
object ClipFragmentSelector {
  
  @scala.inline
  def apply(FragmentSelectorType: ClipFragmentSelectorType, TimestampRange: ClipTimestampRange): ClipFragmentSelector = {
    val __obj = js.Dynamic.literal(FragmentSelectorType = FragmentSelectorType.asInstanceOf[js.Any], TimestampRange = TimestampRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipFragmentSelector]
  }
  
  @scala.inline
  implicit class ClipFragmentSelectorMutableBuilder[Self <: ClipFragmentSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFragmentSelectorType(value: ClipFragmentSelectorType): Self = StObject.set(x, "FragmentSelectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampRange(value: ClipTimestampRange): Self = StObject.set(x, "TimestampRange", value.asInstanceOf[js.Any])
  }
}
