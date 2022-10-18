package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashForEach extends StObject {
  
  def apply[T](iteratee: js.Function1[/* value */ T, Any]): LodashForEach1x1[T] = js.native
  def apply[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Any
    ],
    collection: T
  ): js.UndefOr[T | Null] = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, Any], collection: js.Array[T]): js.Array[T] = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, Any], collection: typings.cypress.typesLodashMod.List[T]): typings.cypress.typesLodashMod.List[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __): LodashForEach6x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashForEach3x2[T] = js.native
  def apply[T](iteratee: __, collection: js.Array[T]): LodashForEach1x2[T] = js.native
  def apply[T](iteratee: __, collection: typings.cypress.typesLodashMod.List[T]): LodashForEach2x2[T] = js.native
  def apply[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: Null & TArray): TArray = js.native
  def apply[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: js.Function1[/* value */ T, Any], collection: Unit & TArray): TArray = js.native
  def apply[T, TList /* <: js.UndefOr[typings.cypress.typesLodashMod.List[T] | Null] */](iteratee: __, collection: Unit & TList): LodashForEach5x2[T, TList] = js.native
  def apply[T, TList /* <: js.UndefOr[typings.cypress.typesLodashMod.List[T] | Null] */](iteratee: __, collection: Null & TList): LodashForEach5x2[T, TList] = js.native
}
