package typings.cypress.anon

import typings.cypress.Cypress.Encodings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.Cypress.WriteFileOptions> */
trait PartialWriteFileOptions extends js.Object {
  var encoding: js.UndefOr[Encodings] = js.undefined
  var flag: js.UndefOr[String] = js.undefined
  var log: js.UndefOr[Boolean] = js.undefined
}

object PartialWriteFileOptions {
  @scala.inline
  def apply(encoding: Encodings = null, flag: String = null, log: js.UndefOr[Boolean] = js.undefined): PartialWriteFileOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialWriteFileOptions]
  }
}

