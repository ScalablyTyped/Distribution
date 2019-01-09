package typings
package coteLib.coteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- coteLib.coteMod.SubscriberAdvertisement because var conflicts: key, name, namespace. Inlined subscribesTo- coteLib.coteMod.PublisherAdvertisement because var conflicts: key, name, namespace. Inlined broadcasts- coteLib.coteMod.ResponderAdvertisement because var conflicts: key, name, namespace. Inlined respondsTo */ trait StatusAdvertisement extends RequesterAdvertisement {
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
}

