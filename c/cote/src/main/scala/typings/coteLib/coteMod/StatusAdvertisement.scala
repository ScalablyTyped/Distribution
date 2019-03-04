package typings
package coteLib.coteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- coteLib.coteMod.SubscriberAdvertisement because var conflicts: key, name, namespace. Inlined subscribesTo- coteLib.coteMod.PublisherAdvertisement because var conflicts: key, name, namespace. Inlined broadcasts- coteLib.coteMod.ResponderAdvertisement because var conflicts: key, name, namespace. Inlined respondsTo, subset */ trait StatusAdvertisement extends RequesterAdvertisement {
  /**
    * Event types that a Publisher can publish.
    */
  var broadcasts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Request types that a Responder can listen to.
    */
  var respondsTo: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Event types that a Subscriber can listen to.
    */
  var subscribesTo: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Advertisement attribute that lets you target a subgroup of responders using the __subset property of a request.
    */
  var subset: js.UndefOr[java.lang.String] = js.undefined
}

object StatusAdvertisement {
  @scala.inline
  def apply(
    name: java.lang.String,
    broadcasts: js.Array[java.lang.String] = null,
    key: java.lang.String = null,
    namespace: java.lang.String = null,
    requests: js.Array[java.lang.String] = null,
    respondsTo: js.Array[java.lang.String] = null,
    subscribesTo: js.Array[java.lang.String] = null,
    subset: java.lang.String = null
  ): StatusAdvertisement = {
    val __obj = js.Dynamic.literal(name = name)
    if (broadcasts != null) __obj.updateDynamic("broadcasts")(broadcasts)
    if (key != null) __obj.updateDynamic("key")(key)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (requests != null) __obj.updateDynamic("requests")(requests)
    if (respondsTo != null) __obj.updateDynamic("respondsTo")(respondsTo)
    if (subscribesTo != null) __obj.updateDynamic("subscribesTo")(subscribesTo)
    if (subset != null) __obj.updateDynamic("subset")(subset)
    __obj.asInstanceOf[StatusAdvertisement]
  }
}

