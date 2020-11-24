package typings.contentfulManagement.snapshotMod

import typings.contentfulManagement.anon.MetaSysPropssnapshotTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotProps[T] extends js.Object {
  
  var snapshot: T = js.native
  
  var sys: MetaSysPropssnapshotTypes = js.native
}
object SnapshotProps {
  
  @scala.inline
  def apply[T](snapshot: T, sys: MetaSysPropssnapshotTypes): SnapshotProps[T] = {
    val __obj = js.Dynamic.literal(snapshot = snapshot.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotProps[T]]
  }
  
  @scala.inline
  implicit class SnapshotPropsOps[Self <: SnapshotProps[_], T] (val x: Self with SnapshotProps[T]) extends AnyVal {
    
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
    def setSnapshot(value: T): Self = this.set("snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSys(value: MetaSysPropssnapshotTypes): Self = this.set("sys", value.asInstanceOf[js.Any])
  }
}
