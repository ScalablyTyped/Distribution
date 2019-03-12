package typings
package backboneLib.backboneMod.BackboneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionFetchOptions
  extends CollectionSetOptions
     with PersistenceOptions
     with Parseable {
  var reset: js.UndefOr[scala.Boolean] = js.undefined
}

object CollectionFetchOptions {
  @scala.inline
  def apply(
    add: js.UndefOr[scala.Boolean] = js.undefined,
    beforeSend: /* jqxhr */ jqueryLib.JQueryXHR => scala.Unit = null,
    data: js.Any = null,
    error: (/* modelOrCollection */ js.UndefOr[js.Any], /* jqxhr */ js.UndefOr[jqueryLib.JQueryXHR], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    merge: js.UndefOr[scala.Boolean] = js.undefined,
    parse: js.Any = null,
    remove: js.UndefOr[scala.Boolean] = js.undefined,
    reset: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    success: (/* modelOrCollection */ js.UndefOr[js.Any], /* response */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    url: java.lang.String = null
  ): CollectionFetchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add)
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1(beforeSend))
    if (data != null) __obj.updateDynamic("data")(data)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove)
    if (!js.isUndefined(reset)) __obj.updateDynamic("reset")(reset)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3(success))
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[CollectionFetchOptions]
  }
}

