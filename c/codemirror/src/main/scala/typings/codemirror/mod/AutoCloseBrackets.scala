package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCloseBrackets extends js.Object {
  /**
    * If the next character is in the string, opening a bracket should be auto-closed.
    */
  var closeBefore: js.UndefOr[String] = js.native
  /**
    * explode should be a similar string that gives the pairs of characters that, when enter is pressed between them, should have the second character also moved to its own line.
    */
  var explode: js.UndefOr[String] = js.native
  /**
    * By default, if the active mode has a closeBrackets property, that overrides the configuration given in the option.
    * But you can add an override property with a truthy value to override mode-specific configuration.
    */
  var `override`: js.UndefOr[Boolean] = js.native
  /**
    * String containing pairs of matching characters.
    */
  var pairs: js.UndefOr[String] = js.native
  /**
    * String containing chars that could do a triple quote.
    */
  var triples: js.UndefOr[String] = js.native
}

object AutoCloseBrackets {
  @scala.inline
  def apply(): AutoCloseBrackets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoCloseBrackets]
  }
  @scala.inline
  implicit class AutoCloseBracketsOps[Self <: AutoCloseBrackets] (val x: Self) extends AnyVal {
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
    def setCloseBefore(value: String): Self = this.set("closeBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseBefore: Self = this.set("closeBefore", js.undefined)
    @scala.inline
    def setExplode(value: String): Self = this.set("explode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplode: Self = this.set("explode", js.undefined)
    @scala.inline
    def setOverride(value: Boolean): Self = this.set("override", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverride: Self = this.set("override", js.undefined)
    @scala.inline
    def setPairs(value: String): Self = this.set("pairs", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePairs: Self = this.set("pairs", js.undefined)
    @scala.inline
    def setTriples(value: String): Self = this.set("triples", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriples: Self = this.set("triples", js.undefined)
  }
  
}

