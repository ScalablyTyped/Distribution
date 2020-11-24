package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HomeDirectoryMapEntry extends js.Object {
  
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
  implicit class HomeDirectoryMapEntryOps[Self <: HomeDirectoryMapEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntry(value: MapEntry): Self = this.set("Entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: MapTarget): Self = this.set("Target", value.asInstanceOf[js.Any])
  }
}
