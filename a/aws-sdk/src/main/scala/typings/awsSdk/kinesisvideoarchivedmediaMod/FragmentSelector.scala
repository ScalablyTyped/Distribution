package typings.awsSdk.kinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentSelector extends StObject {
  
  /**
    * The origin of the timestamps to use (Server or Producer).
    */
  var FragmentSelectorType: typings.awsSdk.kinesisvideoarchivedmediaMod.FragmentSelectorType
  
  /**
    * The range of timestamps to return.
    */
  var TimestampRange: typings.awsSdk.kinesisvideoarchivedmediaMod.TimestampRange
}
object FragmentSelector {
  
  inline def apply(FragmentSelectorType: FragmentSelectorType, TimestampRange: TimestampRange): FragmentSelector = {
    val __obj = js.Dynamic.literal(FragmentSelectorType = FragmentSelectorType.asInstanceOf[js.Any], TimestampRange = TimestampRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentSelector]
  }
  
  extension [Self <: FragmentSelector](x: Self) {
    
    inline def setFragmentSelectorType(value: FragmentSelectorType): Self = StObject.set(x, "FragmentSelectorType", value.asInstanceOf[js.Any])
    
    inline def setTimestampRange(value: TimestampRange): Self = StObject.set(x, "TimestampRange", value.asInstanceOf[js.Any])
  }
}
