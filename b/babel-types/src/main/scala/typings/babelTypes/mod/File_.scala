package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File_ extends Node {
  var comments: js.Array[Comment] = js.native
  var program: Program_ = js.native
  var tokens: js.Array[_] = js.native
  @JSName("type")
  var type_File_ : File = js.native
}

object File_ {
  @scala.inline
  def apply(
    comments: js.Array[Comment],
    end: Double,
    loc: SourceLocation,
    program: Program_,
    start: Double,
    tokens: js.Array[_],
    `type`: File
  ): File_ = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[File_]
  }
  @scala.inline
  implicit class File_Ops[Self <: File_] (val x: Self) extends AnyVal {
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
    def setCommentsVarargs(value: Comment*): Self = this.set("comments", js.Array(value :_*))
    @scala.inline
    def setComments(value: js.Array[Comment]): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgram(value: Program_): Self = this.set("program", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokensVarargs(value: js.Any*): Self = this.set("tokens", js.Array(value :_*))
    @scala.inline
    def setTokens(value: js.Array[_]): Self = this.set("tokens", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: File): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

