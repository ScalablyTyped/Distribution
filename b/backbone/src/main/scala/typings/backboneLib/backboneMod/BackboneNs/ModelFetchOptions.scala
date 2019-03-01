package typings
package backboneLib.backboneMod.BackboneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelFetchOptions
  extends ModelSetOptions
     with PersistenceOptions
     with Parseable

object ModelFetchOptions {
  @scala.inline
  def apply(
    beforeSend: js.Function1[/* jqxhr */ jqueryLib.JQueryXHR, scala.Unit] = null,
    data: js.Any = null,
    error: js.Function3[
      /* modelOrCollection */ js.UndefOr[js.Any], 
      /* jqxhr */ js.UndefOr[jqueryLib.JQueryXHR], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    parse: js.Any = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    success: js.Function3[
      /* modelOrCollection */ js.UndefOr[js.Any], 
      /* response */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    url: java.lang.String = null,
    validate: js.UndefOr[scala.Boolean] = js.undefined
  ): ModelFetchOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend)
    if (data != null) __obj.updateDynamic("data")(data)
    if (error != null) __obj.updateDynamic("error")(error)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (success != null) __obj.updateDynamic("success")(success)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[ModelFetchOptions]
  }
}

