package typings.contentfulManagement.contentTypeMod

import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import typings.contentfulManagement.contentTypeFieldsMod.ContentFields
import typings.contentfulManagement.editorInterfaceMod.EditorInterface
import typings.contentfulManagement.snapshotMod.Snapshot
import typings.contentfulManagement.snapshotMod.SnapshotProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentType
  extends ContentTypeProps
     with DefaultElements[ContentTypeProps]
     with ContentTypeApi
object ContentType {
  
  @scala.inline
  def apply(
    delete: () => js.Promise[Unit],
    description: String,
    displayField: String,
    fields: js.Array[ContentFields],
    getEditorInterface: () => js.Promise[EditorInterface],
    getSnapshot: String => js.Promise[SnapshotProps[ContentTypeProps]],
    getSnapshots: () => js.Promise[Collection[Snapshot[ContentTypeProps], SnapshotProps[ContentTypeProps]]],
    isDraft: () => Boolean,
    isPublished: () => Boolean,
    isUpdated: () => Boolean,
    name: String,
    omitAndDeleteField: String => js.Promise[ContentType],
    publish: () => js.Promise[ContentType],
    sys: MetaSysProps,
    toPlainObject: () => ContentTypeProps,
    unpublish: () => js.Promise[ContentType],
    update: () => js.Promise[ContentType]
  ): ContentType = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), description = description.asInstanceOf[js.Any], displayField = displayField.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], getEditorInterface = js.Any.fromFunction0(getEditorInterface), getSnapshot = js.Any.fromFunction1(getSnapshot), getSnapshots = js.Any.fromFunction0(getSnapshots), isDraft = js.Any.fromFunction0(isDraft), isPublished = js.Any.fromFunction0(isPublished), isUpdated = js.Any.fromFunction0(isUpdated), name = name.asInstanceOf[js.Any], omitAndDeleteField = js.Any.fromFunction1(omitAndDeleteField), publish = js.Any.fromFunction0(publish), sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), unpublish = js.Any.fromFunction0(unpublish), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[ContentType]
  }
}
