package typings.carlo

import typings.carlo.mod.AppEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carloStrings {
  
  @js.native
  sealed trait close extends StObject
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait exit
    extends StObject
       with AppEvent
  @scala.inline
  def exit: exit = "exit".asInstanceOf[exit]
  
  @js.native
  sealed trait window
    extends StObject
       with AppEvent
  @scala.inline
  def window: window = "window".asInstanceOf[window]
}
