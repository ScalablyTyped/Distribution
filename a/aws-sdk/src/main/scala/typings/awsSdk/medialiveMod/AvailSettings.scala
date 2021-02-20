package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailSettings extends StObject {
  
  var Scte35SpliceInsert: js.UndefOr[typings.awsSdk.medialiveMod.Scte35SpliceInsert] = js.native
  
  var Scte35TimeSignalApos: js.UndefOr[typings.awsSdk.medialiveMod.Scte35TimeSignalApos] = js.native
}
object AvailSettings {
  
  @scala.inline
  def apply(): AvailSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailSettings]
  }
  
  @scala.inline
  implicit class AvailSettingsMutableBuilder[Self <: AvailSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScte35SpliceInsert(value: Scte35SpliceInsert): Self = StObject.set(x, "Scte35SpliceInsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScte35SpliceInsertUndefined: Self = StObject.set(x, "Scte35SpliceInsert", js.undefined)
    
    @scala.inline
    def setScte35TimeSignalApos(value: Scte35TimeSignalApos): Self = StObject.set(x, "Scte35TimeSignalApos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScte35TimeSignalAposUndefined: Self = StObject.set(x, "Scte35TimeSignalApos", js.undefined)
  }
}
