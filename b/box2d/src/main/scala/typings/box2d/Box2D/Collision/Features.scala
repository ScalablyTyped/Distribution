package typings.box2d.Box2D.Collision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Features extends js.Object {
  /**
    * A value of 1 indicates that the reference edge is on shape2.
    **/
  var flip: Double = js.native
  /**
    * The edge most anti-parallel to the reference edge.
    **/
  var incidentEdge: Double = js.native
  /**
    * The vertex (0 or 1) on the incident edge that was clipped.
    **/
  var incidentVertex: Double = js.native
  /**
    * The edge that defines the outward contact normal.
    **/
  var referenceEdge: Double = js.native
}

object Features {
  @scala.inline
  def apply(flip: Double, incidentEdge: Double, incidentVertex: Double, referenceEdge: Double): Features = {
    val __obj = js.Dynamic.literal(flip = flip.asInstanceOf[js.Any], incidentEdge = incidentEdge.asInstanceOf[js.Any], incidentVertex = incidentVertex.asInstanceOf[js.Any], referenceEdge = referenceEdge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
  @scala.inline
  implicit class FeaturesOps[Self <: Features] (val x: Self) extends AnyVal {
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
    def setFlip(value: Double): Self = this.set("flip", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncidentEdge(value: Double): Self = this.set("incidentEdge", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncidentVertex(value: Double): Self = this.set("incidentVertex", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferenceEdge(value: Double): Self = this.set("referenceEdge", value.asInstanceOf[js.Any])
  }
  
}

