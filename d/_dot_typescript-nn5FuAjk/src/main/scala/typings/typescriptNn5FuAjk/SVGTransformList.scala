package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The SVGTransformList defines a list of SVGTransform objects. */
@js.native
trait SVGTransformList
  extends StObject
     with /* index */ NumberDictionary[SVGTransform] {
  
  def appendItem(newItem: SVGTransform): SVGTransform = js.native
  
  def clear(): Unit = js.native
  
  def consolidate(): SVGTransform | Null = js.native
  
  def createSVGTransformFromMatrix(): SVGTransform = js.native
  def createSVGTransformFromMatrix(matrix: DOMMatrix2DInit): SVGTransform = js.native
  
  def getItem(index: Double): SVGTransform = js.native
  
  def initialize(newItem: SVGTransform): SVGTransform = js.native
  
  def insertItemBefore(newItem: SVGTransform, index: Double): SVGTransform = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SVGTransform]] = js.native
  
  val length: Double = js.native
  
  val numberOfItems: Double = js.native
  
  def removeItem(index: Double): SVGTransform = js.native
  
  def replaceItem(newItem: SVGTransform, index: Double): SVGTransform = js.native
}
