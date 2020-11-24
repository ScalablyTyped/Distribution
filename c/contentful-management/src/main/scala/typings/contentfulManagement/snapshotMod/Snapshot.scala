package typings.contentfulManagement.snapshotMod

import typings.contentfulManagement.anon.MetaSysPropssnapshotTypes
import typings.contentfulManagement.commonTypesMod.DefaultElements
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Snapshot[T]
  extends SnapshotProps[T]
     with DefaultElements[SnapshotProps[T]]
object Snapshot {
  
  @scala.inline
  def apply[T](snapshot: T, sys: MetaSysPropssnapshotTypes, toPlainObject: () => SnapshotProps[T]): Snapshot[T] = {
    val __obj = js.Dynamic.literal(snapshot = snapshot.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject))
    __obj.asInstanceOf[Snapshot[T]]
  }
}
