package typings.ckeditor.CKEDITOR.htmlParser

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait node extends js.Object {
  
  def getAscendant(condition: String): element = js.native
  def getAscendant(condition: js.Function1[/* node */ element, Boolean]): element = js.native
  def getAscendant(condition: StringDictionary[String]): element = js.native
  
  def getIndex(): Double = js.native
  
  def insertAfter(node: node): Unit = js.native
  
  def insertBefore(node: node): Unit = js.native
  
  def remove(): node = js.native
  
  def replaceWith(node: node): Unit = js.native
  
  def wrapWith(wrapper: element): element = js.native
}
