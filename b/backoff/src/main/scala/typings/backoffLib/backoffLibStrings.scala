package typings
package backoffLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object backoffLibStrings {
  @js.native
  sealed trait abort extends js.Object
  
  @js.native
  sealed trait backoff extends js.Object
  
  @js.native
  sealed trait call extends js.Object
  
  @js.native
  sealed trait callback extends js.Object
  
  @js.native
  sealed trait fail extends js.Object
  
  @js.native
  sealed trait ready extends js.Object
  
  def abort: abort = "abort".asInstanceOf[abort]
  def backoff: backoff = "backoff".asInstanceOf[backoff]
  def call: call = "call".asInstanceOf[call]
  def callback: callback = "callback".asInstanceOf[callback]
  def fail: fail = "fail".asInstanceOf[fail]
  def ready: ready = "ready".asInstanceOf[ready]
}

