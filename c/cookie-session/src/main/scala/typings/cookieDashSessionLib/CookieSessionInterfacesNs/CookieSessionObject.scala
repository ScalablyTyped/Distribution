package typings
package cookieDashSessionLib.CookieSessionInterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CookieSessionObject
  extends /* propertyName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
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

