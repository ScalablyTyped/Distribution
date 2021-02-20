package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HomeDirectoryMapEntry extends StObject {
  
  /**
    * Represents an entry and a target for HomeDirectoryMappings.
    */
  var Entry: MapEntry = js.native
  
  /**
    * Represents the map target that is used in a HomeDirectorymapEntry.
    */
  var Target: MapTarget = js.native
}
object HomeDirectoryMapEntry {
  
  @scala.inline
  def apply(Entry: MapEntry, Target: MapTarget): HomeDirectoryMapEntry = {
    val __obj = js.Dynamic.literal(Entry = Entry.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[HomeDirectoryMapEntry]
  }
  
  @scala.inline
  implicit class HomeDirectoryMapEntryMutableBuilder[Self <: HomeDirectoryMapEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntry(value: MapEntry): Self = StObject.set(x, "Entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: MapTarget): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
