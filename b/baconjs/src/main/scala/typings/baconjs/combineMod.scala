package typings.baconjs

import typings.baconjs.observableMod.Property
import typings.baconjs.observableMod.default
import typings.baconjs.typesMod.Function0
import typings.baconjs.typesMod.Function1
import typings.baconjs.typesMod.Function2
import typings.baconjs.typesMod.Function3
import typings.baconjs.typesMod.Function4
import typings.baconjs.typesMod.Function5
import typings.baconjs.typesMod.Function6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object combineMod {
  
  @JSImport("baconjs/types/combine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combine[R](fn: js.Function, observables: js.Array[default[js.Any]]): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(fn.asInstanceOf[js.Any], observables.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combine[R](fn: Function0[R]): Property[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(fn.asInstanceOf[js.Any]).asInstanceOf[Property[R]]
  inline def combine[R](observables: js.Array[default[js.Any]], fn: js.Function): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(observables.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combine[V, R](a: default[V], fn: Function1[V, R]): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(a.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combine[V, R](fn: Function1[V, R], a: default[V]): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combine[V, V2, R](a: default[V], b: default[V2], fn: Function2[V, V2, R]): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combine[V, V2, R](fn: Function2[V, V2, R], a: default[V], b: default[V2]): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combine[V, V2, V3, R](a: default[V], b: default[V2], c: default[V3], fn: Function3[V, V2, V3, R]): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combine[V, V2, V3, R](fn: Function3[V, V2, V3, R], a: default[V], b: default[V2], c: default[V3]): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combine[V, V2, V3, V4, R](a: default[V], b: default[V2], c: default[V3], d: default[V4], fn: Function4[V, V2, V3, V4, R]): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combine[V, V2, V3, V4, R](fn: Function4[V, V2, V3, V4, R], a: default[V], b: default[V2], c: default[V3], d: default[V4]): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combine[V, V2, V3, V4, V5, R](
    a: default[V],
    b: default[V2],
    c: default[V3],
    d: default[V4],
    e: default[V5],
    fn: Function5[V, V2, V3, V4, V5, R]
  ): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combine[V, V2, V3, V4, V5, R](
    fn: Function5[V, V2, V3, V4, V5, R],
    a: default[V],
    b: default[V2],
    c: default[V3],
    d: default[V4],
    e: default[V5]
  ): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combine[V, V2, V3, V4, V5, V6, R](
    a: default[V],
    b: default[V2],
    c: default[V3],
    d: default[V4],
    e: default[V5],
    f: default[V6],
    fn: Function6[V, V2, V3, V4, V5, V6, R]
  ): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combine[V, V2, V3, V4, V5, V6, R](
    fn: Function6[V, V2, V3, V4, V5, V6, R],
    a: default[V],
    b: default[V2],
    c: default[V3],
    d: default[V4],
    e: default[V5],
    f: default[V6]
  ): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  
  inline def combineAsArray[V](streams: (default[V] | js.Array[default[V]])*): Property[js.Array[V]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineAsArray")(streams.asInstanceOf[js.Any]).asInstanceOf[Property[js.Array[V]]]
  
  inline def combineTwo[V, V2, R](left: default[V], right: default[V2], f: Function2[V, V2, R]): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineTwo")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  
  inline def combineWith[R](fn: js.Function, observables: js.Array[default[js.Any]]): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(fn.asInstanceOf[js.Any], observables.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combineWith[R](fn: Function0[R]): Property[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(fn.asInstanceOf[js.Any]).asInstanceOf[Property[R]]
  inline def combineWith[R](observables: js.Array[default[js.Any]], fn: js.Function): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(observables.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combineWith[V, R](a: default[V], fn: Function1[V, R]): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(a.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combineWith[V, R](fn: Function1[V, R], a: default[V]): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combineWith[V, V2, R](a: default[V], b: default[V2], fn: Function2[V, V2, R]): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combineWith[V, V2, R](fn: Function2[V, V2, R], a: default[V], b: default[V2]): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combineWith[V, V2, V3, R](a: default[V], b: default[V2], c: default[V3], fn: Function3[V, V2, V3, R]): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combineWith[V, V2, V3, R](fn: Function3[V, V2, V3, R], a: default[V], b: default[V2], c: default[V3]): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combineWith[V, V2, V3, V4, R](a: default[V], b: default[V2], c: default[V3], d: default[V4], fn: Function4[V, V2, V3, V4, R]): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combineWith[V, V2, V3, V4, R](fn: Function4[V, V2, V3, V4, R], a: default[V], b: default[V2], c: default[V3], d: default[V4]): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combineWith[V, V2, V3, V4, V5, R](
    a: default[V],
    b: default[V2],
    c: default[V3],
    d: default[V4],
    e: default[V5],
    fn: Function5[V, V2, V3, V4, V5, R]
  ): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combineWith[V, V2, V3, V4, V5, R](
    fn: Function5[V, V2, V3, V4, V5, R],
    a: default[V],
    b: default[V2],
    c: default[V3],
    d: default[V4],
    e: default[V5]
  ): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combineWith[V, V2, V3, V4, V5, V6, R](
    a: default[V],
    b: default[V2],
    c: default[V3],
    d: default[V4],
    e: default[V5],
    f: default[V6],
    fn: Function6[V, V2, V3, V4, V5, V6, R]
  ): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
  inline def combineWith[V, V2, V3, V4, V5, V6, R](
    fn: Function6[V, V2, V3, V4, V5, V6, R],
    a: default[V],
    b: default[V2],
    c: default[V3],
    d: default[V4],
    e: default[V5],
    f: default[V6]
  ): Property[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineWith")(fn.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Property[R]]
}
