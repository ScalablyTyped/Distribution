package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeadersOverrideMimeType extends js.Object {
  var headers: js.UndefOr[js.Any] = js.undefined
  var overrideMimeType: js.UndefOr[java.lang.String] = js.undefined
  var responseType: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_HeadersOverrideMimeType {
  @scala.inline
  def apply(
    headers: js.Any = null,
    overrideMimeType: java.lang.String = null,
    responseType: java.lang.String = null
  ): Anon_HeadersOverrideMimeType = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (overrideMimeType != null) __obj.updateDynamic("overrideMimeType")(overrideMimeType)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    __obj.asInstanceOf[Anon_HeadersOverrideMimeType]
  }
}

