package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SVGTransform is the interface for one of the component transformations within an SVGTransformList; thus, an SVGTransform object corresponds to a single component (e.g., scale(…) or matrix(…)) within a transform attribute. */
@js.native
trait SVGTransform extends StObject {
  
  val SVG_TRANSFORM_MATRIX: Double = js.native
  
  val SVG_TRANSFORM_ROTATE: Double = js.native
  
  val SVG_TRANSFORM_SCALE: Double = js.native
  
  val SVG_TRANSFORM_SKEWX: Double = js.native
  
  val SVG_TRANSFORM_SKEWY: Double = js.native
  
  val SVG_TRANSFORM_TRANSLATE: Double = js.native
  
  val SVG_TRANSFORM_UNKNOWN: Double = js.native
  
  val angle: Double = js.native
  
  val matrix: DOMMatrix = js.native
  
  def setMatrix(): Unit = js.native
  def setMatrix(matrix: DOMMatrix2DInit): Unit = js.native
  
  def setRotate(angle: Double, cx: Double, cy: Double): Unit = js.native
  
  def setScale(sx: Double, sy: Double): Unit = js.native
  
  def setSkewX(angle: Double): Unit = js.native
  
  def setSkewY(angle: Double): Unit = js.native
  
  def setTranslate(tx: Double, ty: Double): Unit = js.native
  
  val `type`: Double = js.native
}
