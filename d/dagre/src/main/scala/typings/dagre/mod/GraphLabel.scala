package typings.dagre.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphLabel extends js.Object {
  var acyclicer: js.UndefOr[String] = js.native
  var align: js.UndefOr[String] = js.native
  var compound: js.UndefOr[Boolean] = js.native
  var edgesep: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var marginx: js.UndefOr[Double] = js.native
  var marginy: js.UndefOr[Double] = js.native
  var nodesep: js.UndefOr[Double] = js.native
  var rankdir: js.UndefOr[String] = js.native
  var ranker: js.UndefOr[String] = js.native
  var ranksep: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object GraphLabel {
  @scala.inline
  def apply(): GraphLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphLabel]
  }
  @scala.inline
  implicit class GraphLabelOps[Self <: GraphLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcyclicer(value: String): Self = this.set("acyclicer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcyclicer: Self = this.set("acyclicer", js.undefined)
    @scala.inline
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setCompound(value: Boolean): Self = this.set("compound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompound: Self = this.set("compound", js.undefined)
    @scala.inline
    def setEdgesep(value: Double): Self = this.set("edgesep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgesep: Self = this.set("edgesep", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMarginx(value: Double): Self = this.set("marginx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginx: Self = this.set("marginx", js.undefined)
    @scala.inline
    def setMarginy(value: Double): Self = this.set("marginy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginy: Self = this.set("marginy", js.undefined)
    @scala.inline
    def setNodesep(value: Double): Self = this.set("nodesep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodesep: Self = this.set("nodesep", js.undefined)
    @scala.inline
    def setRankdir(value: String): Self = this.set("rankdir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRankdir: Self = this.set("rankdir", js.undefined)
    @scala.inline
    def setRanker(value: String): Self = this.set("ranker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRanker: Self = this.set("ranker", js.undefined)
    @scala.inline
    def setRanksep(value: Double): Self = this.set("ranksep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRanksep: Self = this.set("ranksep", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

