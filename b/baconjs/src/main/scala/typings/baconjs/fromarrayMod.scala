package typings.baconjs

import typings.baconjs.eventMod.Event
import typings.baconjs.observableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromarrayMod {
  
  @JSImport("baconjs/types/fromarray", JSImport.Default)
  @js.native
  def default[T](values: js.Array[T | Event[T]]): EventStream[T] = js.native
}
