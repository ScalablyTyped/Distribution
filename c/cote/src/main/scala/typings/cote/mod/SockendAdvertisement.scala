package typings.cote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cote.mod.Advertisement because Already inherited
- typings.cote.mod.PublisherAdvertisement because var conflicts: key, name, namespace. Inlined broadcasts */ trait SockendAdvertisement extends ResponderAdvertisement {
  /**
    * Event types that a Publisher can publish.
    */
  var broadcasts: js.UndefOr[js.Array[String]] = js.undefined
}

object SockendAdvertisement {
  @scala.inline
  def apply(
    name: String,
    broadcasts: js.Array[String] = null,
    key: String = null,
    namespace: String = null,
    respondsTo: js.Array[String] = null,
    subset: String = null
  ): SockendAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (broadcasts != null) __obj.updateDynamic("broadcasts")(broadcasts.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (respondsTo != null) __obj.updateDynamic("respondsTo")(respondsTo.asInstanceOf[js.Any])
    if (subset != null) __obj.updateDynamic("subset")(subset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SockendAdvertisement]
  }
}

