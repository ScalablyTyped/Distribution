package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.__
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPropOr1x2[TObject, TKey /* <: String */] extends js.Object {
  def apply(defaultValue: __): LodashPropOr1x6[TObject, TKey] = js.native
  def apply(defaultValue: __, `object`: TObject): LodashPropOr1x6[TObject, TKey] = js.native
  def apply[TDefault](defaultValue: TDefault): LodashPropOr1x3[TObject, TKey, TDefault] = js.native
  def apply[TDefault](defaultValue: TDefault, `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
}

