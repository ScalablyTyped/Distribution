package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArchiveGroupSettings extends StObject {
  
  /**
    * A directory and base filename where archive files should be written.
    */
  var Destination: OutputLocationRef
  
  /**
    * Number of seconds to write to archive file before closing and starting a new one.
    */
  var RolloverInterval: js.UndefOr[integerMin1] = js.undefined
}
object ArchiveGroupSettings {
  
  inline def apply(Destination: OutputLocationRef): ArchiveGroupSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveGroupSettings]
  }
  
  extension [Self <: ArchiveGroupSettings](x: Self) {
    
    inline def setDestination(value: OutputLocationRef): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setRolloverInterval(value: integerMin1): Self = StObject.set(x, "RolloverInterval", value.asInstanceOf[js.Any])
    
    inline def setRolloverIntervalUndefined: Self = StObject.set(x, "RolloverInterval", js.undefined)
  }
}
