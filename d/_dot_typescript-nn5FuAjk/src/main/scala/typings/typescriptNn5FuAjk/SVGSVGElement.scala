package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the properties of <svg> elements, as well as methods to manipulate them. This interface contains also various miscellaneous commonly-used utility methods, such as matrix operations and the ability to control the time of redraw on visual rendering devices. */
@js.native
trait SVGSVGElement
  extends StObject
     with SVGGraphicsElement
     with SVGFitToViewBox
     with WindowEventHandlers {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  def animationsPaused(): scala.Boolean = js.native
  
  def checkEnclosure(element: SVGElement, rect: DOMRectReadOnly): scala.Boolean = js.native
  
  def checkIntersection(element: SVGElement, rect: DOMRectReadOnly): scala.Boolean = js.native
  
  def createSVGAngle(): SVGAngle = js.native
  
  def createSVGLength(): SVGLength = js.native
  
  def createSVGMatrix(): DOMMatrix = js.native
  
  def createSVGNumber(): SVGNumber = js.native
  
  def createSVGPoint(): DOMPoint = js.native
  
  def createSVGRect(): DOMRect = js.native
  
  def createSVGTransform(): SVGTransform = js.native
  
  def createSVGTransformFromMatrix(): SVGTransform = js.native
  def createSVGTransformFromMatrix(matrix: DOMMatrix2DInit): SVGTransform = js.native
  
  var currentScale: Double = js.native
  
  val currentTranslate: DOMPointReadOnly = js.native
  
  def deselectAll(): Unit = js.native
  
  /** @deprecated */
  def forceRedraw(): Unit = js.native
  
  def getCurrentTime(): Double = js.native
  
  def getElementById(elementId: java.lang.String): Element = js.native
  
  def getEnclosureList(rect: DOMRectReadOnly): NodeListOf[
    SVGCircleElement | SVGEllipseElement | SVGImageElement | SVGLineElement | SVGPathElement | SVGPolygonElement | SVGPolylineElement | SVGRectElement | SVGTextElement | SVGUseElement
  ] = js.native
  def getEnclosureList(rect: DOMRectReadOnly, referenceElement: SVGElement): NodeListOf[
    SVGCircleElement | SVGEllipseElement | SVGImageElement | SVGLineElement | SVGPathElement | SVGPolygonElement | SVGPolylineElement | SVGRectElement | SVGTextElement | SVGUseElement
  ] = js.native
  
  def getIntersectionList(rect: DOMRectReadOnly): NodeListOf[
    SVGCircleElement | SVGEllipseElement | SVGImageElement | SVGLineElement | SVGPathElement | SVGPolygonElement | SVGPolylineElement | SVGRectElement | SVGTextElement | SVGUseElement
  ] = js.native
  def getIntersectionList(rect: DOMRectReadOnly, referenceElement: SVGElement): NodeListOf[
    SVGCircleElement | SVGEllipseElement | SVGImageElement | SVGLineElement | SVGPathElement | SVGPolygonElement | SVGPolylineElement | SVGRectElement | SVGTextElement | SVGUseElement
  ] = js.native
  
  val height: SVGAnimatedLength = js.native
  
  def pauseAnimations(): Unit = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  
  def setCurrentTime(seconds: Double): Unit = js.native
  
  /** @deprecated */
  def suspendRedraw(maxWaitMilliseconds: Double): Double = js.native
  
  def unpauseAnimations(): Unit = js.native
  
  /** @deprecated */
  def unsuspendRedraw(suspendHandleID: Double): Unit = js.native
  
  /** @deprecated */
  def unsuspendRedrawAll(): Unit = js.native
  
  val width: SVGAnimatedLength = js.native
  
  val x: SVGAnimatedLength = js.native
  
  val y: SVGAnimatedLength = js.native
}
