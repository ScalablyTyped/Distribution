package typings.dagreDashLayout.dagreDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphLabel extends js.Object {
  var acyclicer: js.UndefOr[String] = js.undefined
  var align: js.UndefOr[String] = js.undefined
  var compound: js.UndefOr[Boolean] = js.undefined
  var edgesep: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var marginx: js.UndefOr[Double] = js.undefined
  var marginy: js.UndefOr[Double] = js.undefined
  var nodesep: js.UndefOr[Double] = js.undefined
  var rankdir: js.UndefOr[String] = js.undefined
  var ranker: js.UndefOr[String] = js.undefined
  var ranksep: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object GraphLabel {
  @scala.inline
  def apply(
    acyclicer: String = null,
    align: String = null,
    compound: js.UndefOr[Boolean] = js.undefined,
    edgesep: Int | Double = null,
    height: Int | Double = null,
    marginx: Int | Double = null,
    marginy: Int | Double = null,
    nodesep: Int | Double = null,
    rankdir: String = null,
    ranker: String = null,
    ranksep: Int | Double = null,
    width: Int | Double = null
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

