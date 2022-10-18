package typings.baconjs

import typings.baconjs.typesObservableMod.EventStream
import typings.baconjs.typesObservableMod.Property
import typings.baconjs.typesObservableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSampleMod {
  
  @JSImport("baconjs/types/sample", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sampleP[V](samplee: Property[V], samplingInterval: Double): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("sampleP")(samplee.asInstanceOf[js.Any], samplingInterval.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
  
  inline def sampledBy[V, V2, R](samplee: default[V], sampler: default[V2], f: Combinator[V, V2, R]): default[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sampledBy")(samplee.asInstanceOf[js.Any], sampler.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[default[R]]
  
  inline def sampledByE[V, V2, R](samplee: EventStream[V], sampler: default[V2], f: Combinator[V, V2, R]): default[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sampledByE")(samplee.asInstanceOf[js.Any], sampler.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[default[R]]
  
  inline def sampledByP[V, V2, R](samplee: Property[V], sampler: default[V2], f: Combinator[V, V2, R]): default[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sampledByP")(samplee.asInstanceOf[js.Any], sampler.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[default[R]]
  
  type Combinator[V, V2, R] = js.Function2[/* x */ V, /* y */ V2, R]
}
