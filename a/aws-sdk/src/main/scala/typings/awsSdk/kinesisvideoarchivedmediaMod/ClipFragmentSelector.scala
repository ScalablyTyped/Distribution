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
  
  inline def apply(FragmentSelectorType: ClipFragmentSelectorType, TimestampRange: ClipTimestampRange): ClipFragmentSelector = {
    val __obj = js.Dynamic.literal(FragmentSelectorType = FragmentSelectorType.asInstanceOf[js.Any], TimestampRange = TimestampRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipFragmentSelector]
  }
  
  extension [Self <: ClipFragmentSelector](x: Self) {
    
    inline def setFragmentSelectorType(value: ClipFragmentSelectorType): Self = StObject.set(x, "FragmentSelectorType", value.asInstanceOf[js.Any])
    
    inline def setTimestampRange(value: ClipTimestampRange): Self = StObject.set(x, "TimestampRange", value.asInstanceOf[js.Any])
  }
}
