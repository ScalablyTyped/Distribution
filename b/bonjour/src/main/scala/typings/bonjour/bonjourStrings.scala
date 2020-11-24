package typings.bonjour

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bonjourStrings {
  
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  
  @scala.inline
  def tcp: tcp = "tcp".asInstanceOf[tcp]
  
  @scala.inline
  def udp: udp = "udp".asInstanceOf[udp]
  
  @scala.inline
  def udp4: udp4 = "udp4".asInstanceOf[udp4]
  
  @scala.inline
  def udp6: udp6 = "udp6".asInstanceOf[udp6]
  
  @scala.inline
  def up: up = "up".asInstanceOf[up]
  
  @js.native
  sealed trait down extends js.Object
  
  @js.native
  sealed trait tcp extends js.Object
  
  @js.native
  sealed trait udp extends js.Object
  
  @js.native
  sealed trait udp4 extends js.Object
  
  @js.native
  sealed trait udp6 extends js.Object
  
  @js.native
  sealed trait up extends js.Object
}
