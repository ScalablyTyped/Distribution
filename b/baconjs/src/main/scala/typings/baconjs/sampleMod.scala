package typings.baconjs

import typings.baconjs.observableMod.EventStream
import typings.baconjs.observableMod.Property
import typings.baconjs.observableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sampleMod {
  
  @JSImport("baconjs/types/sample", "sampleP")
  @js.native
  def sampleP[V](samplee: Property[V], samplingInterval: Double): EventStream[V] = js.native
  
  @JSImport("baconjs/types/sample", "sampledBy")
  @js.native
  def sampledBy[V, V2, R](samplee: default[V], sampler: default[V2], f: Combinator[V, V2, R]): default[R] = js.native
  
  @JSImport("baconjs/types/sample", "sampledByE")
  @js.native
  def sampledByE[V, V2, R](samplee: EventStream[V], sampler: default[V2], f: Combinator[V, V2, R]): default[R] = js.native
  
  @JSImport("baconjs/types/sample", "sampledByP")
  @js.native
  def sampledByP[V, V2, R](samplee: Property[V], sampler: default[V2], f: Combinator[V, V2, R]): default[R] = js.native
  
  type Combinator[V, V2, R] = js.Function2[/* x */ V, /* y */ V2, R]
}
