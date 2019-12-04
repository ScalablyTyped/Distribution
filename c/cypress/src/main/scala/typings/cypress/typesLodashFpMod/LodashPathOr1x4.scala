package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.__
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPathOr1x4[TObject] extends js.Object {
  def apply[TDefault](defaultValue: TDefault): LodashPathOr1x5[TObject, TDefault] = js.native
  def apply[TKey /* <: String */](defaultValue: __, path: TKey): LodashPathOr1x6[TObject, TKey] = js.native
  def apply[TKey /* <: String */](defaultValue: __, path: js.Array[TKey]): LodashPathOr1x6[TObject, TKey] = js.native
  def apply[TKey /* <: String */, TDefault](defaultValue: TDefault, path: TKey): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TKey /* <: String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
}

