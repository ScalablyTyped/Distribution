package typings.dav.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined dav.dav.Partial<dav.dav.Request> */
trait RequestOptions extends js.Object {
  var constructor: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], js.Any]] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var onerror: js.UndefOr[js.Function1[/* error */ Error, _]] = js.undefined
  var requestData: js.UndefOr[String] = js.undefined
  var transformRequest: js.UndefOr[js.Function1[/* xhr */ js.Any, _]] = js.undefined
  var transformResponse: js.UndefOr[js.Function1[/* xhr */ js.Any, _]] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    constructor: /* options */ js.UndefOr[RequestOptions] => js.Any = null,
    method: String = null,
    onerror: /* error */ Error => _ = null,
    requestData: String = null,
    transformRequest: /* xhr */ js.Any => _ = null,
    transformResponse: /* xhr */ js.Any => _ = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (constructor != null) __obj.updateDynamic("constructor")(js.Any.fromFunction1(constructor))
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1(onerror))
    if (requestData != null) __obj.updateDynamic("requestData")(requestData.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction1(transformRequest))
    if (transformResponse != null) __obj.updateDynamic("transformResponse")(js.Any.fromFunction1(transformResponse))
    __obj.asInstanceOf[RequestOptions]
  }
}

