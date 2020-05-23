package typings.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress/types/sinon.SinonExposeOptions> */
trait PartialSinonExposeOptions extends js.Object {
  var includeFail: js.UndefOr[Boolean] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
}

object PartialSinonExposeOptions {
  @scala.inline
  def apply(includeFail: js.UndefOr[Boolean] = js.undefined, prefix: String = null): PartialSinonExposeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeFail)) __obj.updateDynamic("includeFail")(includeFail.get.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSinonExposeOptions]
  }
}

