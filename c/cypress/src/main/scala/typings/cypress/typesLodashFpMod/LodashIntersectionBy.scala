package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.ValueIteratee
import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashIntersectionBy extends StObject {
  
  def apply[T1](iteratee: __): LodashIntersectionBy1x2[T1] = js.native
  def apply[T1](iteratee: __, array: typings.cypress.typesLodashMod.List[T1]): LodashIntersectionBy1x2[T1] = js.native
  def apply[T2](iteratee: __, array: __, values: typings.cypress.typesLodashMod.List[T2]): LodashIntersectionBy1x4[T2] = js.native
  def apply[T1, T2](iteratee: ValueIteratee[T1 | T2]): LodashIntersectionBy1x1[T1, T2] = js.native
  def apply[T1, T2](iteratee: ValueIteratee[T1 | T2], array: Null, values: typings.cypress.typesLodashMod.List[T2]): js.Array[T1] = js.native
  def apply[T1, T2](iteratee: ValueIteratee[T1 | T2], array: typings.cypress.typesLodashMod.List[T1]): LodashIntersectionBy1x3[T1, T2] = js.native
  def apply[T1, T2](
    iteratee: ValueIteratee[T1 | T2],
    array: typings.cypress.typesLodashMod.List[T1],
    values: typings.cypress.typesLodashMod.List[T2]
  ): js.Array[T1] = js.native
  def apply[T1, T2](iteratee: ValueIteratee[T1 | T2], array: __, values: typings.cypress.typesLodashMod.List[T2]): LodashIntersectionBy1x5[T1] = js.native
  def apply[T1, T2](iteratee: __, array: Null, values: typings.cypress.typesLodashMod.List[T2]): LodashIntersectionBy1x6[T1, T2] = js.native
  def apply[T1, T2](
    iteratee: __,
    array: typings.cypress.typesLodashMod.List[T1],
    values: typings.cypress.typesLodashMod.List[T2]
  ): LodashIntersectionBy1x6[T1, T2] = js.native
}
