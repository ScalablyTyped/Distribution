package typings.coffeeify.mod

import typings.through.mod.ThroughStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coffeeify extends js.Object {
  
  def apply(file: String): ThroughStream = js.native
  
  def compile(file: String, data: String, callback: Callback): Unit = js.native
  
  def isCoffee(file: String): Boolean = js.native
  
  def isLiterate(file: String): Boolean = js.native
  
  var sourceMap: Boolean = js.native
}
