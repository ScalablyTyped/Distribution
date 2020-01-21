package typings.cote.mod

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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (broadcasts != null) __obj.updateDynamic("broadcasts")(broadcasts.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublisherAdvertisement]
  }
}

