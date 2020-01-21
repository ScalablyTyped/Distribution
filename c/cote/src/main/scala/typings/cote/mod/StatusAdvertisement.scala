package typings.cote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.cote.mod.Advertisement because Already inherited
- typings.cote.mod.SubscriberAdvertisement because var conflicts: key, name, namespace. Inlined subscribesTo
- typings.cote.mod.PublisherAdvertisement because var conflicts: key, name, namespace. Inlined broadcasts
- typings.cote.mod.ResponderAdvertisement because var conflicts: key, name, namespace. Inlined respondsTo, subset */ trait StatusAdvertisement extends RequesterAdvertisement {
  /**
    * Event types that a Publisher can publish.
    */
  var broadcasts: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Request types that a Responder can listen to.
    */
  var respondsTo: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Event types that a Subscriber can listen to.
    */
  var subscribesTo: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Advertisement attribute that lets you target a subgroup of responders using the __subset property of a request.
    */
  var subset: js.UndefOr[String] = js.undefined
}

object StatusAdvertisement {
  @scala.inline
  def apply(
    name: String,
    broadcasts: js.Array[String] = null,
    key: String = null,
    namespace: String = null,
    requests: js.Array[String] = null,
    respondsTo: js.Array[String] = null,
    subscribesTo: js.Array[String] = null,
    subset: String = null
  ): StatusAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (broadcasts != null) __obj.updateDynamic("broadcasts")(broadcasts.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (requests != null) __obj.updateDynamic("requests")(requests.asInstanceOf[js.Any])
    if (respondsTo != null) __obj.updateDynamic("respondsTo")(respondsTo.asInstanceOf[js.Any])
    if (subscribesTo != null) __obj.updateDynamic("subscribesTo")(subscribesTo.asInstanceOf[js.Any])
    if (subset != null) __obj.updateDynamic("subset")(subset.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusAdvertisement]
  }
}

