package typings.chartjsPluginAnnotation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Note: classes and enums need to be outside the namespace,
// otherwise the merge with the constant ChartJsAnnotation fails
@js.native
trait AnnotationElement extends js.Object {
  
  var _model: js.Any = js.native
  
  def configure(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def draw(): Unit = js.native
  
  def getArea(): Unit = js.native
  
  def getCenterPoint(): Unit = js.native
  
  def getHeight(): Unit = js.native
  
  def getWidth(): Unit = js.native
  
  // TODO: this should extend Chart.Element, but that typing is not defined in chart.js
  var hidden: Boolean = js.native
  
  var hovering: Boolean = js.native
  
  def inRange(): Unit = js.native
  
  def initialize(): Unit = js.native
  
  def setDataLimits(): Unit = js.native
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
  
  @scala.inline
  implicit class AnnotationElementOps[Self <: AnnotationElement] (val x: Self) extends AnyVal {
    
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
    def set_model(value: js.Any): Self = this.set("_model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigure(value: () => Unit): Self = this.set("configure", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDraw(value: () => Unit): Self = this.set("draw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetArea(value: () => Unit): Self = this.set("getArea", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCenterPoint(value: () => Unit): Self = this.set("getCenterPoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeight(value: () => Unit): Self = this.set("getHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWidth(value: () => Unit): Self = this.set("getWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHovering(value: Boolean): Self = this.set("hovering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInRange(value: () => Unit): Self = this.set("inRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitialize(value: () => Unit): Self = this.set("initialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDataLimits(value: () => Unit): Self = this.set("setDataLimits", js.Any.fromFunction0(value))
  }
}
