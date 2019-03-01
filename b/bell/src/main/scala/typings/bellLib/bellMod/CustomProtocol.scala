package typings
package bellLib.bellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomProtocol extends js.Object {
  /**
    * the authorization endpoint URI.
    */
  var auth: java.lang.String
  /**
    * a headers object with additional headers required by the provider
    * (e.g. GitHub required the 'User-Agent' header which is set by default).
    */
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * The name of the protocol.
    * @default custom
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * the access token endpoint URI.
    */
  var token: java.lang.String
}

object CustomProtocol {
  @scala.inline
  def apply(
    auth: java.lang.String,
    token: java.lang.String,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    name: java.lang.String = null
  ): CustomProtocol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("auth")(auth)
    __obj.updateDynamic("token")(token)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[CustomProtocol]
  }
}

