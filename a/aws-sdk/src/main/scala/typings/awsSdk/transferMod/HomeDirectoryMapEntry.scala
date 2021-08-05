package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HomeDirectoryMapEntry extends StObject {
  
  /**
    * Represents an entry and a target for HomeDirectoryMappings.
    */
  var Entry: MapEntry
  
  /**
    * Represents the map target that is used in a HomeDirectorymapEntry.
    */
  var Target: MapTarget
}
object HomeDirectoryMapEntry {
  
  inline def apply(Entry: MapEntry, Target: MapTarget): HomeDirectoryMapEntry = {
    val __obj = js.Dynamic.literal(Entry = Entry.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[HomeDirectoryMapEntry]
  }
  
  extension [Self <: HomeDirectoryMapEntry](x: Self) {
    
    inline def setEntry(value: MapEntry): Self = StObject.set(x, "Entry", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: MapTarget): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
