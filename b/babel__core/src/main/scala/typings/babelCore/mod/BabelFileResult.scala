package typings.babelCore.mod

import typings.babelCore.anon.File
import typings.babelTypes.mod.File_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BabelFileResult extends js.Object {
  var ast: js.UndefOr[File_ | Null] = js.native
  var code: js.UndefOr[String | Null] = js.native
  var ignored: js.UndefOr[Boolean] = js.native
  var map: js.UndefOr[File | Null] = js.native
  var metadata: js.UndefOr[BabelFileMetadata] = js.native
}

object BabelFileResult {
  @scala.inline
  def apply(): BabelFileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BabelFileResult]
  }
  @scala.inline
  implicit class BabelFileResultOps[Self <: BabelFileResult] (val x: Self) extends AnyVal {
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
    def setAst(value: File_): Self = this.set("ast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAst: Self = this.set("ast", js.undefined)
    @scala.inline
    def setAstNull: Self = this.set("ast", null)
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setCodeNull: Self = this.set("code", null)
    @scala.inline
    def setIgnored(value: Boolean): Self = this.set("ignored", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnored: Self = this.set("ignored", js.undefined)
    @scala.inline
    def setMap(value: File): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setMapNull: Self = this.set("map", null)
    @scala.inline
    def setMetadata(value: BabelFileMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}

