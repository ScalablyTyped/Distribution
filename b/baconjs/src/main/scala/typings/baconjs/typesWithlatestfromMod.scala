package typings.baconjs

import typings.baconjs.typesObservableMod.EventStream
import typings.baconjs.typesObservableMod.Property
import typings.baconjs.typesObservableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWithlatestfromMod {
  
  @JSImport("baconjs/types/withlatestfrom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V, V2, R](
    sampler: typings.baconjs.typesObservableMod.default[V],
    samplee: typings.baconjs.typesObservableMod.default[V2],
    f: js.Function2[/* value */ V, /* otherValue */ V2, R]
  ): typings.baconjs.typesObservableMod.default[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sampler.asInstanceOf[js.Any], samplee.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typings.baconjs.typesObservableMod.default[R]]
  
  inline def withLatestFrom[V, V2, R](sampler: default[V], samplee: default[V2], f: js.Function2[/* value */ V, /* otherValue */ V2, R]): default[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(sampler.asInstanceOf[js.Any], samplee.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[default[R]]
  
  inline def withLatestFromE[V, V2, R](
    sampler: EventStream[V],
    samplee: default[V2],
    f: js.Function2[/* value */ V, /* otherValue */ V2, R]
  ): EventStream[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFromE")(sampler.asInstanceOf[js.Any], samplee.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[EventStream[R]]
  
  inline def withLatestFromP[V, V2, R](sampler: Property[V], samplee: default[V2], f: js.Function2[/* value */ V, /* otherValue */ V2, R]): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFromP")(sampler.asInstanceOf[js.Any], samplee.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
}
