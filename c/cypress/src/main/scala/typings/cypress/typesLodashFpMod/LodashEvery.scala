package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.ValueIterateeCustom
import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashEvery extends StObject {
  
  def apply[T](predicate: ValueIterateeCustom[T, Boolean]): LodashEvery1x1[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): Boolean = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], collection: typings.cypress.typesLodashMod.List[T]): Boolean = js.native
  def apply[T](predicate: __): LodashEvery1x2[T] = js.native
  def apply[T /* <: js.Object */](predicate: __, collection: T): LodashEvery2x2[T] = js.native
  def apply[T](predicate: __, collection: typings.cypress.typesLodashMod.List[T]): LodashEvery1x2[T] = js.native
}
