package typings.contentfulManagement.entryMod

import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.snapshotMod.Snapshot
import typings.contentfulManagement.snapshotMod.SnapshotProps
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entry
  extends EntryProp
     with DefaultElements[EntryProp]
     with EntryApi
object Entry {
  
  @scala.inline
  def apply(
    archive: () => js.Promise[Entry],
    delete: () => js.Promise[Unit],
    fields: Record[String, _],
    getSnapshot: String => js.Promise[Snapshot[EntryProp]],
    getSnapshots: () => js.Promise[Collection[Snapshot[EntryProp], SnapshotProps[EntryProp]]],
    isArchived: () => Boolean,
    isDraft: () => Boolean,
    isPublished: () => Boolean,
    isUpdated: () => Boolean,
    publish: () => js.Promise[Entry],
    sys: EntrySys,
    toPlainObject: () => EntryProp,
    unarchive: () => js.Promise[Entry],
    unpublish: () => js.Promise[Entry],
    update: () => js.Promise[Entry]
  ): Entry = {
    val __obj = js.Dynamic.literal(archive = js.Any.fromFunction0(archive), delete = js.Any.fromFunction0(delete), fields = fields.asInstanceOf[js.Any], getSnapshot = js.Any.fromFunction1(getSnapshot), getSnapshots = js.Any.fromFunction0(getSnapshots), isArchived = js.Any.fromFunction0(isArchived), isDraft = js.Any.fromFunction0(isDraft), isPublished = js.Any.fromFunction0(isPublished), isUpdated = js.Any.fromFunction0(isUpdated), publish = js.Any.fromFunction0(publish), sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), unarchive = js.Any.fromFunction0(unarchive), unpublish = js.Any.fromFunction0(unpublish), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Entry]
  }
}
