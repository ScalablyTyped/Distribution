package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailSettings extends StObject {
  
  var Scte35SpliceInsert: js.UndefOr[typings.awsSdk.medialiveMod.Scte35SpliceInsert] = js.undefined
  
  var Scte35TimeSignalApos: js.UndefOr[typings.awsSdk.medialiveMod.Scte35TimeSignalApos] = js.undefined
}
object AvailSettings {
  
  inline def apply(): AvailSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailSettings]
  }
  
  extension [Self <: AvailSettings](x: Self) {
    
    inline def setScte35SpliceInsert(value: Scte35SpliceInsert): Self = StObject.set(x, "Scte35SpliceInsert", value.asInstanceOf[js.Any])
    
    inline def setScte35SpliceInsertUndefined: Self = StObject.set(x, "Scte35SpliceInsert", js.undefined)
    
    inline def setScte35TimeSignalApos(value: Scte35TimeSignalApos): Self = StObject.set(x, "Scte35TimeSignalApos", value.asInstanceOf[js.Any])
    
    inline def setScte35TimeSignalAposUndefined: Self = StObject.set(x, "Scte35TimeSignalApos", js.undefined)
  }
}
