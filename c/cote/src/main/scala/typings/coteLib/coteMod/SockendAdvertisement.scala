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

