package typings.cote.coteMod

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
    val __obj = js.Dynamic.literal(name = name)
    if (key != null) __obj.updateDynamic("key")(key)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (subscribesTo != null) __obj.updateDynamic("subscribesTo")(subscribesTo)
    __obj.asInstanceOf[SubscriberAdvertisement]
  }
}

