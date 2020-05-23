package typings.chartjsPluginAnnotation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Note: classes and enums need to be outside the namespace,
// otherwise the merge with the constant ChartJsAnnotation fails
trait AnnotationElement extends js.Object {
  var _model: js.Any
  // TODO: this should extend Chart.Element, but that typing is not defined in chart.js
  var hidden: Boolean
  var hovering: Boolean
  def configure(): Unit
  def destroy(): Unit
  def draw(): Unit
  def getArea(): Unit
  def getCenterPoint(): Unit
  def getHeight(): Unit
  def getWidth(): Unit
  def inRange(): Unit
  def initialize(): Unit
  def setDataLimits(): Unit
}

object AnnotationElement {
  @scala.inline
  def apply(
    _model: js.Any,
    configure: () => Unit,
    destroy: () => Unit,
    draw: () => Unit,
    getArea: () => Unit,
    getCenterPoint: () => Unit,
    getHeight: () => Unit,
    getWidth: () => Unit,
    hidden: Boolean,
    hovering: Boolean,
    inRange: () => Unit,
    initialize: () => Unit,
    setDataLimits: () => Unit
  ): AnnotationElement = {
    val __obj = js.Dynamic.literal(_model = _model.asInstanceOf[js.Any], configure = js.Any.fromFunction0(configure), destroy = js.Any.fromFunction0(destroy), draw = js.Any.fromFunction0(draw), getArea = js.Any.fromFunction0(getArea), getCenterPoint = js.Any.fromFunction0(getCenterPoint), getHeight = js.Any.fromFunction0(getHeight), getWidth = js.Any.fromFunction0(getWidth), hidden = hidden.asInstanceOf[js.Any], hovering = hovering.asInstanceOf[js.Any], inRange = js.Any.fromFunction0(inRange), initialize = js.Any.fromFunction0(initialize), setDataLimits = js.Any.fromFunction0(setDataLimits))
    __obj.asInstanceOf[AnnotationElement]
  }
}

