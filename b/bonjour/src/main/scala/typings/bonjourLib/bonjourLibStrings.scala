package typings
package bonjourLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object bonjourLibStrings {
  @js.native
  sealed trait down extends js.Object
  
  @js.native
  sealed trait tcp extends js.Object
  
  @js.native
  sealed trait udp extends js.Object
  
  @js.native
  sealed trait up extends js.Object
  
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  @scala.inline
  def tcp: tcp = "tcp".asInstanceOf[tcp]
  @scala.inline
  def udp: udp = "udp".asInstanceOf[udp]
  @scala.inline
  def up: up = "up".asInstanceOf[up]
}

