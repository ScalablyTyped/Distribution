package typings.builderUtil.fsMod

import typings.fsExtra.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileConsumer extends js.Object {
  /**
    * @default false
    */
  var isIncludeDir: js.UndefOr[Boolean] = js.native
  def consume(file: String, fileStat: Stats, parent: String, siblingNames: js.Array[String]): js.Any = js.native
}

object FileConsumer {
  @scala.inline
  def apply(consume: (String, Stats, String, js.Array[String]) => js.Any): FileConsumer = {
    val __obj = js.Dynamic.literal(consume = js.Any.fromFunction4(consume))
    __obj.asInstanceOf[FileConsumer]
  }
  @scala.inline
  implicit class FileConsumerOps[Self <: FileConsumer] (val x: Self) extends AnyVal {
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
    def setConsume(value: (String, Stats, String, js.Array[String]) => js.Any): Self = this.set("consume", js.Any.fromFunction4(value))
    @scala.inline
    def setIsIncludeDir(value: Boolean): Self = this.set("isIncludeDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsIncludeDir: Self = this.set("isIncludeDir", js.undefined)
  }
  
}

