package typings.backbone.backboneMod

import typings.jquery.JQueryXHR
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
    beforeSend: /* jqxhr */ JQueryXHR => Unit = null,
    data: js.Any = null,
    error: (/* modelOrCollection */ js.UndefOr[js.Any], /* jqxhr */ js.UndefOr[JQueryXHR], /* options */ js.UndefOr[js.Any]) => Unit = null,
    parse: js.Any = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    success: (/* modelOrCollection */ js.UndefOr[js.Any], /* response */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    url: String = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): ModelFetchOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1(beforeSend))
    if (data != null) __obj.updateDynamic("data")(data)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3(success))
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[ModelFetchOptions]
  }
}

