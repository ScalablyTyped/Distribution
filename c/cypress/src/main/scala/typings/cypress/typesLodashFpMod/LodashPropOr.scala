package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.NumericDictionary
import typings.cypress.typesLodashMod.PropertyPath
import typings.cypress.typesLodashMod.__
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPropOr extends js.Object {
  def apply(defaultValue: js.Any): LodashPropOr4x1 = js.native
  def apply(defaultValue: js.Any, path: PropertyPath): LodashPropOr4x3 = js.native
  def apply(defaultValue: js.Any, path: PropertyPath, `object`: js.Any): js.Any = js.native
  def apply(defaultValue: js.Any, path: __, `object`: js.Any): LodashPropOr4x5 = js.native
  def apply(defaultValue: __, path: Double): LodashPropOr2x2 = js.native
  def apply(defaultValue: __, path: PropertyPath): LodashPropOr3x6 = js.native
  def apply(defaultValue: __, path: PropertyPath, `object`: js.Any): LodashPropOr4x6 = js.native
  def apply(defaultValue: __, path: __): LodashPropOr3x4 = js.native
  def apply(defaultValue: __, path: __, `object`: js.Any): LodashPropOr4x4 = js.native
  def apply[TDefault](defaultValue: TDefault): LodashPropOr1x1[TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, path: Double): LodashPropOr2x3[TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, path: PropertyPath): TDefault = js.native
  def apply[TDefault](defaultValue: TDefault, path: __): LodashPropOr3x5[TDefault] = js.native
  def apply[T](defaultValue: __, path: Double, `object`: NumericDictionary[T]): LodashPropOr2x6[T] = js.native
  def apply[TObject /* <: js.Object */](defaultValue: __, path: __, `object`: TObject): LodashPropOr1x4[TObject] = js.native
  def apply[T](defaultValue: __, path: __, `object`: NumericDictionary[T]): LodashPropOr2x4[T] = js.native
  def apply[T, TDefault](defaultValue: TDefault, path: Double, `object`: NumericDictionary[T]): T | TDefault = js.native
  def apply[TObject /* <: js.Object */, TDefault](defaultValue: TDefault, path: __, `object`: TObject): LodashPropOr1x5[TObject, TDefault] = js.native
  def apply[T, TDefault](defaultValue: TDefault, path: __, `object`: NumericDictionary[T]): LodashPropOr2x5[T, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */](defaultValue: __, path: TKey): LodashPropOr1x2[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */](defaultValue: __, path: TKey, `object`: TObject): LodashPropOr1x6[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */](defaultValue: __, path: js.Array[TKey]): LodashPropOr1x2[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */](defaultValue: __, path: js.Array[TKey], `object`: TObject): LodashPropOr1x6[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */, TDefault](defaultValue: TDefault, path: TKey): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */, TDefault](defaultValue: TDefault, path: TKey, `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: String */, TDefault](defaultValue: TDefault, path: js.Array[TKey], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
}

