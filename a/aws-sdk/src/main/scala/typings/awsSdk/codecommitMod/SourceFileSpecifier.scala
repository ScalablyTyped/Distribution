package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceFileSpecifier extends js.Object {
  /**
    * The full path to the file, including the name of the file.
    */
  var filePath: Path = js.native
  /**
    * Whether to remove the source file from the parent commit.
    */
  var isMove: js.UndefOr[IsMove] = js.native
}

object SourceFileSpecifier {
  @scala.inline
  def apply(filePath: Path): SourceFileSpecifier = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceFileSpecifier]
  }
  @scala.inline
  implicit class SourceFileSpecifierOps[Self <: SourceFileSpecifier] (val x: Self) extends AnyVal {
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
    def setFilePath(value: Path): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMove(value: IsMove): Self = this.set("isMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMove: Self = this.set("isMove", js.undefined)
  }
  
}

