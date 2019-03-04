package typings
package coteLib.coteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- coteLib.coteMod.PublisherAdvertisement because var conflicts: key, name, namespace. Inlined broadcasts */ trait SockendAdvertisement extends ResponderAdvertisement {
  /**
    * Event types that a Publisher can publish.
    */
  var broadcasts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object SockendAdvertisement {
  @scala.inline
  def apply(
    name: java.lang.String,
    broadcasts: js.Array[java.lang.String] = null,
    key: java.lang.String = null,
    namespace: java.lang.String = null,
    respondsTo: js.Array[java.lang.String] = null,
    subset: java.lang.String = null
  ): SockendAdvertisement = {
    val __obj = js.Dynamic.literal(name = name)
    if (broadcasts != null) __obj.updateDynamic("broadcasts")(broadcasts)
    if (key != null) __obj.updateDynamic("key")(key)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (respondsTo != null) __obj.updateDynamic("respondsTo")(respondsTo)
    if (subset != null) __obj.updateDynamic("subset")(subset)
    __obj.asInstanceOf[SockendAdvertisement]
  }
}

