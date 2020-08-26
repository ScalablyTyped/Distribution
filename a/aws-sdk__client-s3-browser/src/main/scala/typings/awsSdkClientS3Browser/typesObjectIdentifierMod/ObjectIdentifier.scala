package typings.awsSdkClientS3Browser.typesObjectIdentifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectIdentifier extends js.Object {
  /**
    * <p>Key name of the object to delete.</p>
    */
  var Key: String = js.native
  /**
    * <p>VersionId for the specific version of the object to delete.</p>
    */
  var VersionId: js.UndefOr[String] = js.native
}

object ObjectIdentifier {
  @scala.inline
  def apply(Key: String): ObjectIdentifier = {
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
    def setKey(value: String): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionId(value: String): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
  
}

