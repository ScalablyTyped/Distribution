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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object combineMod {
  
  @JSImport("baconjs/types/combine", "combine")
  @js.native
  def combine[R](fn: js.Function, observables: js.Array[default[_]]): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combine")
  @js.native
  def combine[R](fn: Function0[R]): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combine")
  @js.native
  def combine[R](observables: js.Array[default[_]], fn: js.Function): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combine")
  @js.native
  def combine[V, R](a: default[V], fn: Function1[V, R]): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combine")
  @js.native
  def combine[V, R](fn: Function1[V, R], a: default[V]): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combine")
  @js.native
  def combine[V, V2, R](a: default[V], b: default[V2], fn: Function2[V, V2, R]): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combine")
  @js.native
  def combine[V, V2, R](fn: Function2[V, V2, R], a: default[V], b: default[V2]): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combine")
  @js.native
  def combine[V, V2, V3, R](a: default[V], b: default[V2], c: default[V3], fn: Function3[V, V2, V3, R]): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combine")
  @js.native
  def combine[V, V2, V3, R](fn: Function3[V, V2, V3, R], a: default[V], b: default[V2], c: default[V3]): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combine")
  @js.native
  def combine[V, V2, V3, V4, R](a: default[V], b: default[V2], c: default[V3], d: default[V4], fn: Function4[V, V2, V3, V4, R]): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combine")
  @js.native
  def combine[V, V2, V3, V4, R](fn: Function4[V, V2, V3, V4, R], a: default[V], b: default[V2], c: default[V3], d: default[V4]): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combine")
  @js.native
  def combine[V, V2, V3, V4, V5, R](
    a: default[V],
    b: default[V2],
    c: default[V3],
    d: default[V4],
    e: default[V5],
    fn: Function5[V, V2, V3, V4, V5, R]
  ): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combine")
  @js.native
  def combine[V, V2, V3, V4, V5, R](
    fn: Function5[V, V2, V3, V4, V5, R],
    a: default[V],
    b: default[V2],
    c: default[V3],
    d: default[V4],
    e: default[V5]
  ): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combine")
  @js.native
  def combine[V, V2, V3, V4, V5, V6, R](
    a: default[V],
    b: default[V2],
    c: default[V3],
    d: default[V4],
    e: default[V5],
    f: default[V6],
    fn: Function6[V, V2, V3, V4, V5, V6, R]
  ): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combine")
  @js.native
  def combine[V, V2, V3, V4, V5, V6, R](
    fn: Function6[V, V2, V3, V4, V5, V6, R],
    a: default[V],
    b: default[V2],
    c: default[V3],
    d: default[V4],
    e: default[V5],
    f: default[V6]
  ): Property[R] = js.native
  
  @JSImport("baconjs/types/combine", "combineAsArray")
  @js.native
  def combineAsArray[V](streams: (default[V] | js.Array[default[V]])*): Property[js.Array[V]] = js.native
  
  @JSImport("baconjs/types/combine", "combineTwo")
  @js.native
  def combineTwo[V, V2, R](left: default[V], right: default[V2], f: Function2[V, V2, R]): Property[R] = js.native
  
  @JSImport("baconjs/types/combine", "combineWith")
  @js.native
  def combineWith[R](fn: js.Function, observables: js.Array[default[_]]): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combineWith")
  @js.native
  def combineWith[R](fn: Function0[R]): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combineWith")
  @js.native
  def combineWith[R](observables: js.Array[default[_]], fn: js.Function): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combineWith")
  @js.native
  def combineWith[V, R](a: default[V], fn: Function1[V, R]): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combineWith")
  @js.native
  def combineWith[V, R](fn: Function1[V, R], a: default[V]): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combineWith")
  @js.native
  def combineWith[V, V2, R](a: default[V], b: default[V2], fn: Function2[V, V2, R]): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combineWith")
  @js.native
  def combineWith[V, V2, R](fn: Function2[V, V2, R], a: default[V], b: default[V2]): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combineWith")
  @js.native
  def combineWith[V, V2, V3, R](a: default[V], b: default[V2], c: default[V3], fn: Function3[V, V2, V3, R]): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combineWith")
  @js.native
  def combineWith[V, V2, V3, R](fn: Function3[V, V2, V3, R], a: default[V], b: default[V2], c: default[V3]): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combineWith")
  @js.native
  def combineWith[V, V2, V3, V4, R](a: default[V], b: default[V2], c: default[V3], d: default[V4], fn: Function4[V, V2, V3, V4, R]): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combineWith")
  @js.native
  def combineWith[V, V2, V3, V4, R](fn: Function4[V, V2, V3, V4, R], a: default[V], b: default[V2], c: default[V3], d: default[V4]): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combineWith")
  @js.native
  def combineWith[V, V2, V3, V4, V5, R](
    a: default[V],
    b: default[V2],
    c: default[V3],
    d: default[V4],
    e: default[V5],
    fn: Function5[V, V2, V3, V4, V5, R]
  ): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combineWith")
  @js.native
  def combineWith[V, V2, V3, V4, V5, R](
    fn: Function5[V, V2, V3, V4, V5, R],
    a: default[V],
    b: default[V2],
    c: default[V3],
    d: default[V4],
    e: default[V5]
  ): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combineWith")
  @js.native
  def combineWith[V, V2, V3, V4, V5, V6, R](
    a: default[V],
    b: default[V2],
    c: default[V3],
    d: default[V4],
    e: default[V5],
    f: default[V6],
    fn: Function6[V, V2, V3, V4, V5, V6, R]
  ): Property[R] = js.native
  @JSImport("baconjs/types/combine", "combineWith")
  @js.native
  def combineWith[V, V2, V3, V4, V5, V6, R](
    fn: Function6[V, V2, V3, V4, V5, V6, R],
    a: default[V],
    b: default[V2],
    c: default[V3],
    d: default[V4],
    e: default[V5],
    f: default[V6]
  ): Property[R] = js.native
}
