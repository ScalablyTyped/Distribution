package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArchiveGroupSettings extends StObject {
  
  /**
    * A directory and base filename where archive files should be written.
    */
  var Destination: OutputLocationRef = js.native
  
  /**
    * Number of seconds to write to archive file before closing and starting a new one.
    */
  var RolloverInterval: js.UndefOr[integerMin1] = js.native
}
object ArchiveGroupSettings {
  
  @scala.inline
  def apply(Destination: OutputLocationRef): ArchiveGroupSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveGroupSettings]
  }
  
  @scala.inline
  implicit class ArchiveGroupSettingsMutableBuilder[Self <: ArchiveGroupSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: OutputLocationRef): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolloverInterval(value: integerMin1): Self = StObject.set(x, "RolloverInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolloverIntervalUndefined: Self = StObject.set(x, "RolloverInterval", js.undefined)
  }
}
