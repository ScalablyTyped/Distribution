package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.Dictionary
import typings.cypress.typesLodashMod.PropertyName
import typings.cypress.typesLodashMod.ValueIterateeCustom
import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashKeyBy extends StObject {
  
  def apply[T](iteratee: ValueIterateeCustom[T, PropertyName]): LodashKeyBy1x1[T] = js.native
  def apply[T /* <: js.Object */](
    iteratee: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      PropertyName
    ],
    collection: T
  ): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](iteratee: ValueIterateeCustom[T, PropertyName], collection: typings.cypress.typesLodashMod.List[T]): Dictionary[T] = js.native
  def apply[T](iteratee: __): LodashKeyBy1x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashKeyBy2x2[T] = js.native
  def apply[T](iteratee: __, collection: typings.cypress.typesLodashMod.List[T]): LodashKeyBy1x2[T] = js.native
}
