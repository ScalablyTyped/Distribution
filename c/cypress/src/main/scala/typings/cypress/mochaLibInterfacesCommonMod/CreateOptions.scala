package typings.cypress.mochaLibInterfacesCommonMod

import typings.cypress.Mocha.Suite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOptions extends js.Object {
  /** Filepath where this Suite resides */
  var file: js.UndefOr[String] = js.undefined
  /** Suite function */
  var fn: js.UndefOr[js.ThisFunction0[/* this */ Suite, Unit]] = js.undefined
  /** Is suite exclusive? */
  var isOnly: js.UndefOr[Boolean] = js.undefined
  /** Is suite pending? */
  var pending: js.UndefOr[Boolean] = js.undefined
  /** Title of suite */
  var title: String
}

object CreateOptions {
  @scala.inline
  def apply(
    title: String,
    file: String = null,
    fn: js.ThisFunction0[/* this */ Suite, Unit] = null,
    isOnly: js.UndefOr[Boolean] = js.undefined,
    pending: js.UndefOr[Boolean] = js.undefined
  ): CreateOptions = {
    val __obj = js.Dynamic.literal(title = title)
    if (file != null) __obj.updateDynamic("file")(file)
    if (fn != null) __obj.updateDynamic("fn")(fn)
    if (!js.isUndefined(isOnly)) __obj.updateDynamic("isOnly")(isOnly)
    if (!js.isUndefined(pending)) __obj.updateDynamic("pending")(pending)
    __obj.asInstanceOf[CreateOptions]
  }
}

