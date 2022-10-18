package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashRangeStep extends StObject {
  
  def apply(start: Double): LodashRangeStep1x1 = js.native
  def apply(start: Double, end: Double): LodashRangeStep1x3 = js.native
  def apply(start: Double, end: Double, step: Double): js.Array[Double] = js.native
  def apply(start: Double, end: __, step: Double): LodashRangeStep1x5 = js.native
  def apply(start: __, end: Double): LodashRangeStep1x2 = js.native
  def apply(start: __, end: Double, step: Double): LodashRangeStep1x6 = js.native
  def apply(start: __, end: __, step: Double): LodashRangeStep1x4 = js.native
}
