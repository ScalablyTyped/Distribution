package typings.cote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriberAdvertisement extends Advertisement {
  /**
    * Event types that a Subscriber can listen to.
    */
  var subscribesTo: js.UndefOr[js.Array[String]] = js.undefined
}

object SubscriberAdvertisement {
  @scala.inline
  def apply(name: String, key: String = null, namespace: String = null, subscribesTo: js.Array[String] = null): SubscriberAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (subscribesTo != null) __obj.updateDynamic("subscribesTo")(subscribesTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriberAdvertisement]
  }
}

