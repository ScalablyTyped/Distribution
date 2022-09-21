package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.BinaryData
import typings.typescriptNn5FuAjk.FontFaceDescriptors
import typings.typescriptNn5FuAjk.FontFaceLoadStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("FontFace")
@js.native
open class FontFace protected ()
  extends StObject
     with typings.typescriptNn5FuAjk.FontFace {
  def this(family: java.lang.String, source: java.lang.String) = this()
  def this(family: java.lang.String, source: BinaryData) = this()
  def this(family: java.lang.String, source: java.lang.String, descriptors: FontFaceDescriptors) = this()
  def this(family: java.lang.String, source: BinaryData, descriptors: FontFaceDescriptors) = this()
  
  /* CompleteClass */
  var ascentOverride: java.lang.String = js.native
  
  /* CompleteClass */
  var descentOverride: java.lang.String = js.native
  
  /* CompleteClass */
  var display: java.lang.String = js.native
  
  /* CompleteClass */
  var family: java.lang.String = js.native
  
  /* CompleteClass */
  var featureSettings: java.lang.String = js.native
  
  /* CompleteClass */
  var lineGapOverride: java.lang.String = js.native
  
  /* CompleteClass */
  override def load(): typings.typescriptNn5FuAjk.Promise[typings.typescriptNn5FuAjk.FontFace] = js.native
  
  /* CompleteClass */
  override val loaded: typings.typescriptNn5FuAjk.Promise[typings.typescriptNn5FuAjk.FontFace] = js.native
  
  /* CompleteClass */
  override val status: FontFaceLoadStatus = js.native
  
  /* CompleteClass */
  var stretch: java.lang.String = js.native
  
  /* CompleteClass */
  var style: java.lang.String = js.native
  
  /* CompleteClass */
  var unicodeRange: java.lang.String = js.native
  
  /* CompleteClass */
  var variant: java.lang.String = js.native
  
  /* CompleteClass */
  var variationSettings: java.lang.String = js.native
  
  /* CompleteClass */
  var weight: java.lang.String = js.native
}
