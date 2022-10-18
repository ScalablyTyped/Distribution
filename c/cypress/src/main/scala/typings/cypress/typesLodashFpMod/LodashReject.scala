package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.ValueIterateeCustom
import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashReject extends StObject {
  
  def apply[T](
    predicate: ValueIterateeCustom[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T, 
      Boolean
    ]
  ): js.Array[T] = js.native
  def apply[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], collection: typings.cypress.typesLodashMod.List[T]): js.Array[T] = js.native
  def apply[T /* <: js.Object */](predicate: __): LodashReject2x2[T] = js.native
  def apply[T /* <: js.Object */](predicate: __, collection: T): LodashReject2x2[T] = js.native
  def apply[T](predicate: __, collection: typings.cypress.typesLodashMod.List[T]): LodashReject1x2[T] = js.native
}
