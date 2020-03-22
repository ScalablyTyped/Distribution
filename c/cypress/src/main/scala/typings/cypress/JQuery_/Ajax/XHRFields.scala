package typings.cypress.JQuery_.Ajax

import typings.std.Event_
import typings.std.XMLHttpRequestResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// Writable properties on XMLHttpRequest
/* Inlined parent std.Partial<std.Pick<std.XMLHttpRequest, 'onreadystatechange' | 'responseType' | 'timeout' | 'withCredentials'>> */
trait XHRFields extends js.Object {
  var msCaching: js.UndefOr[String] = js.undefined
  var onreadystatechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  var responseType: js.UndefOr[XMLHttpRequestResponseType] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object XHRFields {
  @scala.inline
  def apply(
    msCaching: String = null,
    onreadystatechange: js.ThisFunction1[XHRFields, /* ev */ Event_, _] = null,
    responseType: XMLHttpRequestResponseType = null,
    timeout: Int | Double = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): XHRFields = {
    val __obj = js.Dynamic.literal()
    if (msCaching != null) __obj.updateDynamic("msCaching")(msCaching.asInstanceOf[js.Any])
    if (onreadystatechange != null) __obj.updateDynamic("onreadystatechange")(onreadystatechange.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[XHRFields]
  }
}

