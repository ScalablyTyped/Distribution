package typings.depd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deprecate extends js.Object {
  
  def apply(message: String): Unit = js.native
  
  // tslint:disable-next-line ban-types
  def function[T /* <: js.Function */](fn: T): T = js.native
  def function[T /* <: js.Function */](fn: T, message: String): T = js.native
  
  def property[T /* <: js.Object */](obj: T, prop: /* keyof T */ String, message: String): Unit = js.native
}
