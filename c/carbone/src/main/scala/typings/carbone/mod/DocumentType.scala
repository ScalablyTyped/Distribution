package typings.carbone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.carbone.carboneStrings.document
  - typings.carbone.carboneStrings.web
  - typings.carbone.carboneStrings.graphics
  - typings.carbone.carboneStrings.spreadsheet
  - typings.carbone.carboneStrings.presentation
*/
trait DocumentType extends js.Object

object DocumentType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def document: typings.carbone.carboneStrings.document = this.cast("document")
  @scala.inline
  def graphics: typings.carbone.carboneStrings.graphics = this.cast("graphics")
  @scala.inline
  def presentation: typings.carbone.carboneStrings.presentation = this.cast("presentation")
  @scala.inline
  def spreadsheet: typings.carbone.carboneStrings.spreadsheet = this.cast("spreadsheet")
  @scala.inline
  def web: typings.carbone.carboneStrings.web = this.cast("web")
}

