package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.Event
import typings.typescriptNn5FuAjk.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Event")
@js.native
open class Event_ protected ()
  extends StObject
     with Event {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: EventInit) = this()
}
object Event_ {
  
  @JSGlobal("Event.AT_TARGET")
  @js.native
  val AT_TARGET: Double = js.native
  
  @JSGlobal("Event.BUBBLING_PHASE")
  @js.native
  val BUBBLING_PHASE: Double = js.native
  
  @JSGlobal("Event.CAPTURING_PHASE")
  @js.native
  val CAPTURING_PHASE: Double = js.native
  
  @JSGlobal("Event.NONE")
  @js.native
  val NONE: Double = js.native
}
