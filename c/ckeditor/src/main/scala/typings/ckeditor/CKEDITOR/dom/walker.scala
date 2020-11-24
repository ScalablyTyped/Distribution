package typings.ckeditor.CKEDITOR.dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait walker extends js.Object {
  
  def checkBackward(): Boolean = js.native
  
  def checkForward(): Boolean = js.native
  
  def end(): Unit = js.native
  
  def evaluator(node: node): Boolean = js.native
  
  def guard(node: node): Boolean = js.native
  def guard(node: node, movingOut: Boolean): Boolean = js.native
  
  def lastBackward(): node = js.native
  
  def lastForward(): node = js.native
  
  def next(): node = js.native
  
  def previous(): node = js.native
  
  def reset(): Unit = js.native
}
