package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.CanvasDirection
import typings.typescriptNn5FuAjk.CanvasTextAlign
import typings.typescriptNn5FuAjk.CanvasTextBaseline
import typings.typescriptNn5FuAjk.GlobalCompositeOperation
import typings.typescriptNn5FuAjk.ImageSmoothingQuality
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("CanvasRenderingContext2D")
@js.native
open class CanvasRenderingContext2D ()
  extends StObject
     with typings.typescriptNn5FuAjk.CanvasRenderingContext2D {
  
  /* CompleteClass */
  override def clearRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  /* CompleteClass */
  var direction: CanvasDirection = js.native
  
  /* CompleteClass */
  override def fillRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  /* CompleteClass */
  var filter: java.lang.String = js.native
  
  /* CompleteClass */
  var font: java.lang.String = js.native
  
  /* CompleteClass */
  var globalAlpha: Double = js.native
  
  /* CompleteClass */
  var globalCompositeOperation: GlobalCompositeOperation = js.native
  
  /* CompleteClass */
  var imageSmoothingEnabled: scala.Boolean = js.native
  
  /* CompleteClass */
  var imageSmoothingQuality: ImageSmoothingQuality = js.native
  
  /* CompleteClass */
  override def restore(): Unit = js.native
  
  /* CompleteClass */
  override def save(): Unit = js.native
  
  /* CompleteClass */
  var shadowBlur: Double = js.native
  
  /* CompleteClass */
  var shadowColor: java.lang.String = js.native
  
  /* CompleteClass */
  var shadowOffsetX: Double = js.native
  
  /* CompleteClass */
  var shadowOffsetY: Double = js.native
  
  /* CompleteClass */
  override def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
  
  /* CompleteClass */
  var textAlign: CanvasTextAlign = js.native
  
  /* CompleteClass */
  var textBaseline: CanvasTextBaseline = js.native
}
