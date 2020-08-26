package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.circle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/circle
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cytoscape.mod.LayoutOptions because Already inherited */ @js.native
trait CircleLayoutOptions extends ShapedLayoutOptions {
  // whether the layout should go clockwise (true) or counterclockwise/anticlockwise (false)
  var clockwise: js.UndefOr[Boolean] = js.native
  @JSName("name")
  var name_CircleLayoutOptions: circle = js.native
  // the radius of the circle
  var radius: js.UndefOr[Double] = js.native
  // where nodes start in radians, e.g. 3 / 2 * Math.PI,
  var startAngle: Double = js.native
  // how many radians should be between the first and last node (defaults to full circle)
  var sweep: js.UndefOr[Double] = js.native
}

object CircleLayoutOptions {
  @scala.inline
  def apply(fit: Boolean, name: circle, nodeDimensionsIncludeLabels: Boolean, startAngle: Double): CircleLayoutOptions = {
    val __obj = js.Dynamic.literal(fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleLayoutOptions]
  }
  @scala.inline
  implicit class CircleLayoutOptionsOps[Self <: CircleLayoutOptions] (val x: Self) extends AnyVal {
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
    def setName(value: circle): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setClockwise(value: Boolean): Self = this.set("clockwise", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClockwise: Self = this.set("clockwise", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setSweep(value: Double): Self = this.set("sweep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSweep: Self = this.set("sweep", js.undefined)
  }
  
}

