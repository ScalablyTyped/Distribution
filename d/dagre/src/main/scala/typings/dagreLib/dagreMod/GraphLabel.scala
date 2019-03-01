package typings
package dagreLib.dagreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphLabel extends js.Object {
  var acyclicer: js.UndefOr[java.lang.String] = js.undefined
  var align: js.UndefOr[java.lang.String] = js.undefined
  var compound: js.UndefOr[scala.Boolean] = js.undefined
  var edgesep: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var marginx: js.UndefOr[scala.Double] = js.undefined
  var marginy: js.UndefOr[scala.Double] = js.undefined
  var nodesep: js.UndefOr[scala.Double] = js.undefined
  var rankdir: js.UndefOr[java.lang.String] = js.undefined
  var ranker: js.UndefOr[java.lang.String] = js.undefined
  var ranksep: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object GraphLabel {
  @scala.inline
  def apply(
    acyclicer: java.lang.String = null,
    align: java.lang.String = null,
    compound: js.UndefOr[scala.Boolean] = js.undefined,
    edgesep: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    marginx: scala.Int | scala.Double = null,
    marginy: scala.Int | scala.Double = null,
    nodesep: scala.Int | scala.Double = null,
    rankdir: java.lang.String = null,
    ranker: java.lang.String = null,
    ranksep: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): GraphLabel = {
    val __obj = js.Dynamic.literal()
    if (acyclicer != null) __obj.updateDynamic("acyclicer")(acyclicer)
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(compound)) __obj.updateDynamic("compound")(compound)
    if (edgesep != null) __obj.updateDynamic("edgesep")(edgesep.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (marginx != null) __obj.updateDynamic("marginx")(marginx.asInstanceOf[js.Any])
    if (marginy != null) __obj.updateDynamic("marginy")(marginy.asInstanceOf[js.Any])
    if (nodesep != null) __obj.updateDynamic("nodesep")(nodesep.asInstanceOf[js.Any])
    if (rankdir != null) __obj.updateDynamic("rankdir")(rankdir)
    if (ranker != null) __obj.updateDynamic("ranker")(ranker)
    if (ranksep != null) __obj.updateDynamic("ranksep")(ranksep.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphLabel]
  }
}

