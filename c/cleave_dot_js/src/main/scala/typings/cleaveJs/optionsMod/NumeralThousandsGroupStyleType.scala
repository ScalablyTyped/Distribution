package typings.cleaveJs.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cleaveJs.cleaveJsStrings.lakh
  - typings.cleaveJs.cleaveJsStrings.thousand
  - typings.cleaveJs.cleaveJsStrings.wan
  - typings.cleaveJs.cleaveJsStrings.none
*/
trait NumeralThousandsGroupStyleType extends js.Object

object NumeralThousandsGroupStyleType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def lakh: typings.cleaveJs.cleaveJsStrings.lakh = this.cast("lakh")
  @scala.inline
  def none: typings.cleaveJs.cleaveJsStrings.none = this.cast("none")
  @scala.inline
  def thousand: typings.cleaveJs.cleaveJsStrings.thousand = this.cast("thousand")
  @scala.inline
  def wan: typings.cleaveJs.cleaveJsStrings.wan = this.cast("wan")
}

