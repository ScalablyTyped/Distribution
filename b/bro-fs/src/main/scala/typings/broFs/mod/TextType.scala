package typings.broFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.broFs.broFsStrings.Text
  - typings.broFs.broFsStrings.BinaryString
  - typings.broFs.broFsStrings.DataURL
*/
trait TextType extends js.Object

object TextType {
  @scala.inline
  def BinaryString: typings.broFs.broFsStrings.BinaryString = this.cast("BinaryString")
  @scala.inline
  def DataURL: typings.broFs.broFsStrings.DataURL = this.cast("DataURL")
  @scala.inline
  def Text: typings.broFs.broFsStrings.Text = this.cast("Text")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

