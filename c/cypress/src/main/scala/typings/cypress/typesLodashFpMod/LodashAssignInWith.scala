package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.AssignCustomizer
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashAssignInWith extends js.Object {
  def apply(customizer: AssignCustomizer): LodashAssignInWith1x1 = js.native
  def apply[TObject](customizer: AssignCustomizer, `object`: TObject): LodashAssignInWith1x3[TObject] = js.native
  def apply[TSource](customizer: AssignCustomizer, `object`: __, source: TSource): LodashAssignInWith1x5[TSource] = js.native
  def apply[TObject](customizer: __, `object`: TObject): LodashAssignInWith1x2[TObject] = js.native
  def apply[TSource](customizer: __, `object`: __, source: TSource): LodashAssignInWith1x4[TSource] = js.native
  def apply[TObject, TSource](customizer: AssignCustomizer, `object`: TObject, source: TSource): TObject with TSource = js.native
  def apply[TObject, TSource](customizer: __, `object`: TObject, source: TSource): LodashAssignInWith1x6[TObject, TSource] = js.native
}

