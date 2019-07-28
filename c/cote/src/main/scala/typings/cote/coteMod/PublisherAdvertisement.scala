package typings.cote.coteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublisherAdvertisement extends Advertisement {
  /**
    * Event types that a Publisher can publish.
    */
  var broadcasts: js.UndefOr[js.Array[String]] = js.undefined
}

object PublisherAdvertisement {
  @scala.inline
  def apply(name: String, broadcasts: js.Array[String] = null, key: String = null, namespace: String = null): PublisherAdvertisement = {
    val __obj = js.Dynamic.literal(name = name)
    if (broadcasts != null) __obj.updateDynamic("broadcasts")(broadcasts)
    if (key != null) __obj.updateDynamic("key")(key)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    __obj.asInstanceOf[PublisherAdvertisement]
  }
}

