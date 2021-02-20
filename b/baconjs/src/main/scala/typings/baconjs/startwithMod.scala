package typings.baconjs

import typings.baconjs.observableMod.EventStream
import typings.baconjs.observableMod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object startwithMod {
  
  @JSImport("baconjs/types/startwith", "startWithE")
  @js.native
  def startWithE[V](src: EventStream[V], seed: V): EventStream[V] = js.native
  
  @JSImport("baconjs/types/startwith", "startWithP")
  @js.native
  def startWithP[V](src: Property[V], seed: V): Property[V] = js.native
}
