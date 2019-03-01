package typings
package coteLib.coteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublisherAdvertisement extends Advertisement {
  /**
    * Event types that a Publisher can publish.
    */
  var broadcasts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object PublisherAdvertisement {
  @scala.inline
  def apply(
    name: java.lang.String,
    broadcasts: js.Array[java.lang.String] = null,
    key: java.lang.String = null,
    namespace: java.lang.String = null
  ): PublisherAdvertisement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (broadcasts != null) __obj.updateDynamic("broadcasts")(broadcasts)
    if (key != null) __obj.updateDynamic("key")(key)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    __obj.asInstanceOf[PublisherAdvertisement]
  }
}

