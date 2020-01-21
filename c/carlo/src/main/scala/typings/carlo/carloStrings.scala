package typings.carlo

import typings.carlo.mod.AppEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object carloStrings {
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait exit extends AppEvent
  
  @js.native
  sealed trait window extends AppEvent
  
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def exit: exit = "exit".asInstanceOf[exit]
  @scala.inline
  def window: window = "window".asInstanceOf[window]
}

