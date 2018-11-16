package typings
package c3Lib.c3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LegendOptions extends js.Object {
  /**
       * Hide legend
       * If true given, all legend will be hidden. If string or array given, only the legend that has the id will be hidden.
       */
  var hide: js.UndefOr[scala.Boolean | ArrayOrString] = js.undefined
  /**
       * Change inset legend attributes.
       * This option accepts object that has the keys anchor, x, y and step.
       * anchor decides the position of the legend. These anchors are available: top-left, top-right, bottom-left, bottom-right
       * x and y set the position of the legend based on the anchor.
       * step defines the max step the lagend has (e.g. If 2 set and legend has 3 legend item, the legend 2 columns).
       */
  var inset: js.UndefOr[c3Lib.Anon_Anchor] = js.undefined
  var item: js.UndefOr[c3Lib.Anon_Tile] = js.undefined
  /**
       * Padding between legend elements.
       */
  var padding: js.UndefOr[scala.Double] = js.undefined
  /**
       * Change the position of legend.
       * Currently bottom, right and inset are supported.
       */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Show or hide legend.
       */
  var show: js.UndefOr[scala.Boolean] = js.undefined
}

