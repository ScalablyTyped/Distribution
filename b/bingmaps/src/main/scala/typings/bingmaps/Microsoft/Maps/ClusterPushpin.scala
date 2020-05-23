package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterPushpin extends Pushpin {
  /** An array of all the pushpins that are in the cluster. */
  var containedPushpins: js.Array[Pushpin]
  /**
    * The grid cell key that can be used retrieve the clustered pushpin(s) from the clustering layer. This is useful when creating a clickable list that
    * link items in the list to clusters or pushpins on the map. Your list just needs to store the gridKey value.
    */
  var gridKey: Double
}

object ClusterPushpin {
  @scala.inline
  def apply(
    containedPushpins: js.Array[Pushpin],
    getAnchor: () => Point,
    getClickedStyleEnabled: () => Boolean,
    getColor: () => String | Color,
    getCursor: () => String,
    getDraggable: () => Boolean,
    getHoverStyleEnabled: () => Boolean,
    getIcon: () => String,
    getLocation: () => Location,
    getRoundClickableArea: () => Boolean,
    getSubTitle: () => String,
    getText: () => String,
    getTextOffset: () => Point,
    getTitle: () => String,
    getVisible: () => Boolean,
    gridKey: Double,
    setLocation: Location => Unit,
    setOptions: IPushpinOptions => Unit,
    metadata: js.Any = null
  ): ClusterPushpin = {
    val __obj = js.Dynamic.literal(containedPushpins = containedPushpins.asInstanceOf[js.Any], getAnchor = js.Any.fromFunction0(getAnchor), getClickedStyleEnabled = js.Any.fromFunction0(getClickedStyleEnabled), getColor = js.Any.fromFunction0(getColor), getCursor = js.Any.fromFunction0(getCursor), getDraggable = js.Any.fromFunction0(getDraggable), getHoverStyleEnabled = js.Any.fromFunction0(getHoverStyleEnabled), getIcon = js.Any.fromFunction0(getIcon), getLocation = js.Any.fromFunction0(getLocation), getRoundClickableArea = js.Any.fromFunction0(getRoundClickableArea), getSubTitle = js.Any.fromFunction0(getSubTitle), getText = js.Any.fromFunction0(getText), getTextOffset = js.Any.fromFunction0(getTextOffset), getTitle = js.Any.fromFunction0(getTitle), getVisible = js.Any.fromFunction0(getVisible), gridKey = gridKey.asInstanceOf[js.Any], setLocation = js.Any.fromFunction1(setLocation), setOptions = js.Any.fromFunction1(setOptions))
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterPushpin]
  }
}

