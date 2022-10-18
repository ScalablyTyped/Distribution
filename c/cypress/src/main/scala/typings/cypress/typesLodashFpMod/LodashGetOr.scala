package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.NumericDictionary
import typings.cypress.typesLodashMod.PropertyPath
import typings.cypress.typesLodashMod.__
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashGetOr extends StObject {
  
  def apply(defaultValue: Any): LodashGetOr7x1 = js.native
  def apply(defaultValue: Any, path: PropertyPath): LodashGetOr7x3 = js.native
  def apply(defaultValue: Any, path: PropertyPath, `object`: Any): Any = js.native
  def apply(defaultValue: Any, path: __, `object`: Any): LodashGetOr7x5 = js.native
  def apply(defaultValue: __, path: Double): LodashGetOr5x2 = js.native
  def apply(defaultValue: __, path: PropertyPath): LodashGetOr6x6 = js.native
  def apply(defaultValue: __, path: PropertyPath, `object`: Any): LodashGetOr7x6 = js.native
  def apply(defaultValue: __, path: __): LodashGetOr6x4 = js.native
  def apply(defaultValue: __, path: __, `object`: Any): LodashGetOr7x4 = js.native
  def apply[TDefault](defaultValue: TDefault, path: Double): LodashGetOr5x3[TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, path: __): LodashGetOr6x5[TDefault] = js.native
  def apply[T](defaultValue: __, path: Double, `object`: NumericDictionary[T]): LodashGetOr5x6[T] = js.native
  def apply[T](defaultValue: __, path: __, `object`: NumericDictionary[T]): LodashGetOr5x4[T] = js.native
  def apply[T, TDefault](defaultValue: TDefault, path: Double, `object`: NumericDictionary[T]): T | TDefault = js.native
  def apply[T, TDefault](defaultValue: TDefault, path: __, `object`: NumericDictionary[T]): LodashGetOr5x5[T, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */](defaultValue: __, path: js.Array[TKey]): LodashGetOr1x2[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */](defaultValue: __, path: js.Array[TKey], `object`: TObject): LodashGetOr1x6[TObject, TKey] = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    Unit
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */, TDefault](defaultValue: TDefault, path: js.Array[TKey], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    Unit
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: __, path: js.Tuple2[TKey1, TKey2]): LodashGetOr2x2[TObject, TKey1, TKey2] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: __, path: js.Tuple2[TKey1, TKey2], `object`: TObject): LodashGetOr2x6[TObject, TKey1, TKey2] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    Unit
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    Unit
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: __, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashGetOr3x2[TObject, TKey1, TKey2, TKey3] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: __, path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): LodashGetOr3x6[TObject, TKey1, TKey2, TKey3] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashGetOr3x3[TObject, TKey1, TKey2, TKey3, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    Unit
  ]) | TDefault = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: __, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashGetOr4x2[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: __, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): LodashGetOr4x6[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashGetOr4x3[TObject, TKey1, TKey2, TKey3, TKey4, TDefault] = js.native
  def apply[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    Unit
  ]) | TDefault = js.native
}
