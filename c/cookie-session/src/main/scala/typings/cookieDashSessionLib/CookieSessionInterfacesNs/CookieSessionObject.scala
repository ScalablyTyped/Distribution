package typings
package cookieDashSessionLib.CookieSessionInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieSessionObject
  extends /* propertyName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Is true if the session has been changed during the request.
    */
  var isChanged: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Is true if the session is new.
    */
  var isNew: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Determine if the session has been populated with data or is empty.
    */
  var isPopulated: js.UndefOr[scala.Boolean] = js.undefined
}

object CookieSessionObject {
  @scala.inline
  def apply(
    StringDictionary: /* propertyName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    isChanged: js.UndefOr[scala.Boolean] = js.undefined,
    isNew: js.UndefOr[scala.Boolean] = js.undefined,
    isPopulated: js.UndefOr[scala.Boolean] = js.undefined
  ): CookieSessionObject = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(isChanged)) __obj.updateDynamic("isChanged")(isChanged)
    if (!js.isUndefined(isNew)) __obj.updateDynamic("isNew")(isNew)
    if (!js.isUndefined(isPopulated)) __obj.updateDynamic("isPopulated")(isPopulated)
    __obj.asInstanceOf[CookieSessionObject]
  }
}

