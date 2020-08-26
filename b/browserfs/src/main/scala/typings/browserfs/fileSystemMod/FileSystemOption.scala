package typings.browserfs.fileSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemOption[T] extends js.Object {
  var description: String = js.native
  var optional: js.UndefOr[Boolean] = js.native
  var `type`: String | js.Array[String] = js.native
  var validator: js.UndefOr[js.Function2[/* opt */ T, /* cb */ BFSOneArgCallback, Unit]] = js.native
}

object FileSystemOption {
  @scala.inline
  def apply[T](description: String, `type`: String | js.Array[String]): FileSystemOption[T] = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemOption[T]]
  }
  @scala.inline
  implicit class FileSystemOptionOps[Self <: FileSystemOption[_], T] (val x: Self with FileSystemOption[T]) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeVarargs(value: String*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: String | js.Array[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
    @scala.inline
    def setValidator(value: (/* opt */ T, /* cb */ BFSOneArgCallback) => Unit): Self = this.set("validator", js.Any.fromFunction2(value))
    @scala.inline
    def deleteValidator: Self = this.set("validator", js.undefined)
  }
  
}

