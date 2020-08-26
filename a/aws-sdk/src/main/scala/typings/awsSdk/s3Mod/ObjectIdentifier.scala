package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectIdentifier extends js.Object {
  /**
    * Key name of the object to delete.
    */
  var Key: ObjectKey = js.native
  /**
    * VersionId for the specific version of the object to delete.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object ObjectIdentifier {
  @scala.inline
  def apply(Key: ObjectKey): ObjectIdentifier = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectIdentifier]
  }
  @scala.inline
  implicit class ObjectIdentifierOps[Self <: ObjectIdentifier] (val x: Self) extends AnyVal {
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
    def setKey(value: ObjectKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionId(value: ObjectVersionId): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
  
}

