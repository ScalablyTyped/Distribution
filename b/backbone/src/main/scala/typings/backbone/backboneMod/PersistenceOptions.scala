package typings.backbone.backboneMod

import typings.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistenceOptions extends js.Object {
  var beforeSend: js.UndefOr[js.Function1[/* jqxhr */ JQueryXHR, Unit]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var error: js.UndefOr[
    js.Function3[
      /* modelOrCollection */ js.UndefOr[js.Any], 
      /* jqxhr */ js.UndefOr[JQueryXHR], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  var success: js.UndefOr[
    js.Function3[
      /* modelOrCollection */ js.UndefOr[js.Any], 
      /* response */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object PersistenceOptions {
  @scala.inline
  def apply(
    beforeSend: /* jqxhr */ JQueryXHR => Unit = null,
    data: js.Any = null,
    error: (/* modelOrCollection */ js.UndefOr[js.Any], /* jqxhr */ js.UndefOr[JQueryXHR], /* options */ js.UndefOr[js.Any]) => Unit = null,
    success: (/* modelOrCollection */ js.UndefOr[js.Any], /* response */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    url: String = null
  ): PersistenceOptions = {
    val __obj = js.Dynamic.literal()
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1(beforeSend))
    if (data != null) __obj.updateDynamic("data")(data)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3(success))
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[PersistenceOptions]
  }
}

