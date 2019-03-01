package typings
package coteLib.coteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequesterAdvertisement extends Advertisement {
  /**
    * Request types that a Requester can send.
    */
  var requests: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object RequesterAdvertisement {
  @scala.inline
  def apply(
    name: java.lang.String,
    key: java.lang.String = null,
    namespace: java.lang.String = null,
    requests: js.Array[java.lang.String] = null
  ): RequesterAdvertisement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (key != null) __obj.updateDynamic("key")(key)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (requests != null) __obj.updateDynamic("requests")(requests)
    __obj.asInstanceOf[RequesterAdvertisement]
  }
}

