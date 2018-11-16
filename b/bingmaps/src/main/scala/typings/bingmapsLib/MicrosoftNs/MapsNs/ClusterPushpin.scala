package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.ClusterPushpin")
@js.native
class ClusterPushpin () extends Pushpin {
  /** An array of all the pushpins that are in the cluster. */
  var containedPushpins: js.Array[Pushpin] = js.native
  /**
          * The grid cell key that can be used retrieve the clustered pushpin(s) from the clustering layer. This is useful when creating a clickable list that
          * link items in the list to clusters or pushpins on the map. Your list just needs to store the gridKey value.
          */
  var gridKey: scala.Double = js.native
}

