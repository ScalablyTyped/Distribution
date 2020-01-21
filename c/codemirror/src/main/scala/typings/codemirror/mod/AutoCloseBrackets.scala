package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCloseBrackets extends js.Object {
  /**
    * If the next character is in the string, opening a bracket should be auto-closed.
    */
  var closeBefore: js.UndefOr[String] = js.undefined
  /**
    * explode should be a similar string that gives the pairs of characters that, when enter is pressed between them, should have the second character also moved to its own line.
    */
  var explode: js.UndefOr[String] = js.undefined
  /**
    * By default, if the active mode has a closeBrackets property, that overrides the configuration given in the option.
    * But you can add an override property with a truthy value to override mode-specific configuration.
    */
  var `override`: js.UndefOr[Boolean] = js.undefined
  /**
    * String containing pairs of matching characters.
    */
  var pairs: js.UndefOr[String] = js.undefined
  /**
    * String containing chars that could do a triple quote.
    */
  var triples: js.UndefOr[String] = js.undefined
}

object AutoCloseBrackets {
  @scala.inline
  def apply(
    closeBefore: String = null,
    explode: String = null,
    `override`: js.UndefOr[Boolean] = js.undefined,
    pairs: String = null,
    triples: String = null
  ): AutoCloseBrackets = {
    val __obj = js.Dynamic.literal()
    if (closeBefore != null) __obj.updateDynamic("closeBefore")(closeBefore.asInstanceOf[js.Any])
    if (explode != null) __obj.updateDynamic("explode")(explode.asInstanceOf[js.Any])
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    if (pairs != null) __obj.updateDynamic("pairs")(pairs.asInstanceOf[js.Any])
    if (triples != null) __obj.updateDynamic("triples")(triples.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCloseBrackets]
  }
}

