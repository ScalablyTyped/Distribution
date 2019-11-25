package typings.broDashFs.broDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.broDashFs.broDashFsStrings.Text
  - typings.broDashFs.broDashFsStrings.BinaryString
  - typings.broDashFs.broDashFsStrings.DataURL
*/
trait TextType extends js.Object

object TextType {
  @scala.inline
  def BinaryString: typings.broDashFs.broDashFsStrings.BinaryString = this.cast("BinaryString")
  @scala.inline
  def DataURL: typings.broDashFs.broDashFsStrings.DataURL = this.cast("DataURL")
  @scala.inline
  def Text: typings.broDashFs.broDashFsStrings.Text = this.cast("Text")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

