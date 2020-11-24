package typings.commonErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("common-errors", "log")
@js.native
object log extends js.Object {
  
  def apply(err: Error): Error = js.native
  def apply(err: Error, message: String): Error = js.native
}
