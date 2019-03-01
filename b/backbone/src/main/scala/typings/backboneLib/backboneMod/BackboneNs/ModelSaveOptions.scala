package typings
package backboneLib.backboneMod.BackboneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelSaveOptions
  extends Silenceable
     with Waitable
     with Validable
     with Parseable
     with PersistenceOptions {
  var patch: js.UndefOr[scala.Boolean] = js.undefined
}

object ModelSaveOptions {
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
    patch: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    success: js.Function3[
      /* modelOrCollection */ js.UndefOr[js.Any], 
      /* response */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    url: java.lang.String = null,
    validate: js.UndefOr[scala.Boolean] = js.undefined,
    wait: js.UndefOr[scala.Boolean] = js.undefined
  ): ModelSaveOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend)
    if (data != null) __obj.updateDynamic("data")(data)
    if (error != null) __obj.updateDynamic("error")(error)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (!js.isUndefined(patch)) __obj.updateDynamic("patch")(patch)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (success != null) __obj.updateDynamic("success")(success)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[ModelSaveOptions]
  }
}

