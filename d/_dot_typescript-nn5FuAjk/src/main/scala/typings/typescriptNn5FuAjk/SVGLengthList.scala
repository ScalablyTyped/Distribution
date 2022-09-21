package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The SVGLengthList defines a list of SVGLength objects. */
@js.native
trait SVGLengthList
  extends StObject
     with /* index */ NumberDictionary[SVGLength] {
  
  def appendItem(newItem: SVGLength): SVGLength = js.native
  
  def clear(): Unit = js.native
  
  def getItem(index: Double): SVGLength = js.native
  
  def initialize(newItem: SVGLength): SVGLength = js.native
  
  def insertItemBefore(newItem: SVGLength, index: Double): SVGLength = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SVGLength]] = js.native
  
  val length: Double = js.native
  
  val numberOfItems: Double = js.native
  
  def removeItem(index: Double): SVGLength = js.native
  
  def replaceItem(newItem: SVGLength, index: Double): SVGLength = js.native
}
