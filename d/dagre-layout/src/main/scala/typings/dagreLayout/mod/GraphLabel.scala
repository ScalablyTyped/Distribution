package typings.dagreLayout.mod

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
    edgesep: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    marginx: js.UndefOr[Double] = js.undefined,
    marginy: js.UndefOr[Double] = js.undefined,
    nodesep: js.UndefOr[Double] = js.undefined,
    rankdir: String = null,
    ranker: String = null,
    ranksep: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): GraphLabel = {
    val __obj = js.Dynamic.literal()
    if (acyclicer != null) __obj.updateDynamic("acyclicer")(acyclicer.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(compound)) __obj.updateDynamic("compound")(compound.get.asInstanceOf[js.Any])
    if (!js.isUndefined(edgesep)) __obj.updateDynamic("edgesep")(edgesep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginx)) __obj.updateDynamic("marginx")(marginx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(marginy)) __obj.updateDynamic("marginy")(marginy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nodesep)) __obj.updateDynamic("nodesep")(nodesep.get.asInstanceOf[js.Any])
    if (rankdir != null) __obj.updateDynamic("rankdir")(rankdir.asInstanceOf[js.Any])
    if (ranker != null) __obj.updateDynamic("ranker")(ranker.asInstanceOf[js.Any])
    if (!js.isUndefined(ranksep)) __obj.updateDynamic("ranksep")(ranksep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphLabel]
  }
}

