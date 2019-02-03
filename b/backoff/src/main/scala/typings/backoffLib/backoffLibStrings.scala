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
  
  @scala.inline
  def abort: abort = "abort".asInstanceOf[abort]
  @scala.inline
  def backoff: backoff = "backoff".asInstanceOf[backoff]
  @scala.inline
  def call: call = "call".asInstanceOf[call]
  @scala.inline
  def callback: callback = "callback".asInstanceOf[callback]
  @scala.inline
  def fail: fail = "fail".asInstanceOf[fail]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
}

