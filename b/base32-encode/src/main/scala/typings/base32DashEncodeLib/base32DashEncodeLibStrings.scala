package typings
package base32DashEncodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object base32DashEncodeLibStrings {
  @js.native
  sealed trait Crockford
    extends base32DashEncodeLib.base32DashEncodeMod.Variant
  
  @js.native
  sealed trait RFC3548
    extends base32DashEncodeLib.base32DashEncodeMod.Variant
  
  @js.native
  sealed trait RFC4648
    extends base32DashEncodeLib.base32DashEncodeMod.Variant
  
  @js.native
  sealed trait `RFC4648-HEX`
    extends base32DashEncodeLib.base32DashEncodeMod.Variant
  
  @scala.inline
  def Crockford: Crockford = "Crockford".asInstanceOf[Crockford]
  @scala.inline
  def RFC3548: RFC3548 = "RFC3548".asInstanceOf[RFC3548]
  @scala.inline
  def RFC4648: RFC4648 = "RFC4648".asInstanceOf[RFC4648]
  @scala.inline
  def `RFC4648-HEX`: `RFC4648-HEX` = "RFC4648-HEX".asInstanceOf[`RFC4648-HEX`]
}

