package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.NumericDictionary
import typings.cypress.typesLodashMod.PropertyPath
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashGet extends js.Object {
  def apply(path: Double): LodashGet3x1 = js.native
  def apply(path: PropertyPath): js.UndefOr[scala.Nothing] = js.native
  def apply(path: PropertyPath, `object`: js.Any): js.Any = js.native
  def apply(path: __): LodashGet5x2 = js.native
  def apply(path: __, `object`: js.Any): LodashGet6x2 = js.native
  def apply[T](path: Double, `object`: NumericDictionary[T]): js.UndefOr[T] = js.native
  def apply[TObject /* <: js.Object */](path: __, `object`: TObject): LodashGet2x2[TObject] = js.native
  def apply[T](path: __, `object`: NumericDictionary[T]): LodashGet4x2[T] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */](path: TKey): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */](path: TKey, `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */](path: js.Array[TKey]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */](path: js.Array[TKey], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
}

