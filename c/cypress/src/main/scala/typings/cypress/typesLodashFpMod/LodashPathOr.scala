package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.NumericDictionary
import typings.cypress.typesLodashMod.PropertyPath
import typings.cypress.typesLodashMod.__
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPathOr extends js.Object {
  def apply(defaultValue: js.Any): LodashPathOr4x1 = js.native
  def apply(defaultValue: js.Any, path: PropertyPath): LodashPathOr4x3 = js.native
  def apply(defaultValue: js.Any, path: PropertyPath, `object`: js.Any): js.Any = js.native
  def apply(defaultValue: js.Any, path: __, `object`: js.Any): LodashPathOr4x5 = js.native
  def apply(defaultValue: __, path: Double): LodashPathOr2x2 = js.native
  def apply(defaultValue: __, path: PropertyPath): LodashPathOr3x2 = js.native
  def apply(defaultValue: __, path: PropertyPath, `object`: js.Any): LodashPathOr4x6 = js.native
  def apply(defaultValue: __, path: __): LodashPathOr3x4 = js.native
  def apply(defaultValue: __, path: __, `object`: js.Any): LodashPathOr4x4 = js.native
  def apply[TDefault](defaultValue: TDefault): LodashPathOr1x1[TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, path: Double): LodashPathOr2x3[TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, path: PropertyPath): TDefault = js.native
  def apply[TDefault](defaultValue: TDefault, path: __): LodashPathOr3x5[TDefault] = js.native
  def apply[T](defaultValue: __, path: Double, `object`: NumericDictionary[T]): LodashPathOr2x6[T] = js.native
  def apply[TObject /* <: js.Object */](defaultValue: __, path: __, `object`: TObject): LodashPathOr1x4[TObject] = js.native
  def apply[T](defaultValue: __, path: __, `object`: NumericDictionary[T]): LodashPathOr2x4[T] = js.native
  def apply[T, TDefault](defaultValue: TDefault, path: Double, `object`: NumericDictionary[T]): T | TDefault = js.native
  def apply[TObject /* <: js.Object */, TDefault](defaultValue: TDefault, path: __, `object`: TObject): LodashPathOr1x5[TObject, TDefault] = js.native
  def apply[T, TDefault](defaultValue: TDefault, path: __, `object`: NumericDictionary[T]): LodashPathOr2x5[T, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */](defaultValue: __, path: TKey): LodashPathOr1x2[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */](defaultValue: __, path: TKey, `object`: TObject): LodashPathOr1x6[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */](defaultValue: __, path: js.Array[TKey]): LodashPathOr1x2[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */](defaultValue: __, path: js.Array[TKey], `object`: TObject): LodashPathOr1x6[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */, TDefault](defaultValue: TDefault, path: TKey): LodashPathOr1x3[TObject, TKey, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */, TDefault](defaultValue: TDefault, path: TKey, `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): LodashPathOr1x3[TObject, TKey, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */, TDefault](defaultValue: TDefault, path: js.Array[TKey], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
}

