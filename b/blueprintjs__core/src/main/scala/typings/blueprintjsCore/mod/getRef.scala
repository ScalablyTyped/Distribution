package typings.blueprintjsCore.mod

import typings.blueprintjsCore.refsMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "getRef")
@js.native
object getRef extends js.Object {
  
  def apply[T](): T | Null = js.native
  def apply[T](ref: T): T | Null = js.native
  def apply[T](ref: IRefObject[T]): T | Null = js.native
}
