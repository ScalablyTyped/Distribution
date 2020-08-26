package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "file")
@js.native
object file extends js.Object {
  def apply(program: Program_): File_ = js.native
  def apply(program: Program_, comments: js.UndefOr[scala.Nothing], tokens: js.Array[_]): File_ = js.native
  def apply(program: Program_, comments: js.Array[CommentBlock | CommentLine]): File_ = js.native
  def apply(program: Program_, comments: js.Array[CommentBlock | CommentLine], tokens: js.Array[_]): File_ = js.native
  def apply(program: Program_, comments: Null, tokens: js.Array[_]): File_ = js.native
}

