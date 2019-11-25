package typings.createDashHash.createDashHashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.createDashHash.createDashHashStrings.utf8
  - typings.createDashHash.createDashHashStrings.hex
  - typings.createDashHash.createDashHashStrings.base64
*/
trait encoding extends js.Object

object encoding {
  @scala.inline
  def base64: typings.createDashHash.createDashHashStrings.base64 = this.cast("base64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hex: typings.createDashHash.createDashHashStrings.hex = this.cast("hex")
  @scala.inline
  def utf8: typings.createDashHash.createDashHashStrings.utf8 = this.cast("utf8")
}

