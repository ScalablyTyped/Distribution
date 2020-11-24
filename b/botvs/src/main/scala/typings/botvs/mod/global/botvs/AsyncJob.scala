package typings.botvs.mod.global.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncJob[T] extends js.Object {
  
  def wait(timeout: Double): js.UndefOr[T | Null] = js.native
}
