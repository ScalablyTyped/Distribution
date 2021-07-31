package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scte35TimeSignalScheduleActionSettings extends StObject {
  
  /**
    * The list of SCTE-35 descriptors accompanying the SCTE-35 time_signal.
    */
  var Scte35Descriptors: listOfScte35Descriptor
}
object Scte35TimeSignalScheduleActionSettings {
  
  @scala.inline
  def apply(Scte35Descriptors: listOfScte35Descriptor): Scte35TimeSignalScheduleActionSettings = {
    val __obj = js.Dynamic.literal(Scte35Descriptors = Scte35Descriptors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scte35TimeSignalScheduleActionSettings]
  }
  
  @scala.inline
  implicit class Scte35TimeSignalScheduleActionSettingsMutableBuilder[Self <: Scte35TimeSignalScheduleActionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScte35Descriptors(value: listOfScte35Descriptor): Self = StObject.set(x, "Scte35Descriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScte35DescriptorsVarargs(value: Scte35Descriptor*): Self = StObject.set(x, "Scte35Descriptors", js.Array(value :_*))
  }
}
