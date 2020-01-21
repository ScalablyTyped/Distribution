package typings.dateUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.dateUtils.dateUtilsStrings.es
  - typings.dateUtils.dateUtilsStrings.fr
  - typings.dateUtils.dateUtilsStrings.`pt-BR`
*/
trait LanguageType extends js.Object

object LanguageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def es: typings.dateUtils.dateUtilsStrings.es = this.cast("es")
  @scala.inline
  def fr: typings.dateUtils.dateUtilsStrings.fr = this.cast("fr")
  @scala.inline
  def `pt-BR`: typings.dateUtils.dateUtilsStrings.`pt-BR` = this.cast("pt-BR")
}

