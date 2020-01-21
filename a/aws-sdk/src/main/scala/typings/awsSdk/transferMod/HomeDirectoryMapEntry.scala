package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

