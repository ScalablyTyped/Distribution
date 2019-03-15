package typings
package carloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object carloLibStrings {
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait exit
    extends carloLib.carloMod.AppEvent
  
  @js.native
  sealed trait window
    extends carloLib.carloMod.AppEvent
  
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def exit: exit = "exit".asInstanceOf[exit]
  @scala.inline
  def window: window = "window".asInstanceOf[window]
}

