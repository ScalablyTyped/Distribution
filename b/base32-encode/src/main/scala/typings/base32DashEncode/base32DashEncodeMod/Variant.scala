package typings.base32DashEncode.base32DashEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.base32DashEncode.base32DashEncodeStrings.RFC3548
  - typings.base32DashEncode.base32DashEncodeStrings.RFC4648
  - typings.base32DashEncode.base32DashEncodeStrings.`RFC4648-HEX`
  - typings.base32DashEncode.base32DashEncodeStrings.Crockford
*/
trait Variant extends js.Object

object Variant {
  @scala.inline
  def Crockford: typings.base32DashEncode.base32DashEncodeStrings.Crockford = this.cast("Crockford")
  @scala.inline
  def RFC3548: typings.base32DashEncode.base32DashEncodeStrings.RFC3548 = this.cast("RFC3548")
  @scala.inline
  def RFC4648: typings.base32DashEncode.base32DashEncodeStrings.RFC4648 = this.cast("RFC4648")
  @scala.inline
  def `RFC4648-HEX`: typings.base32DashEncode.base32DashEncodeStrings.`RFC4648-HEX` = this.cast("RFC4648-HEX")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

