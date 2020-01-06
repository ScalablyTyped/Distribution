package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.Dictionary
import typings.cypress.typesLodashMod.NumericDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMapValues3x1 extends js.Object {
  def apply[T](): Dictionary[Boolean] = js.native
  def apply[T /* <: js.Object */](obj: T): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: boolean}
    */ typings.cypress.cypressStrings.LodashMapValues3x1 with js.Any = js.native
  def apply[T](obj: Dictionary[T]): Dictionary[Boolean] = js.native
  def apply[T](obj: NumericDictionary[T]): Dictionary[Boolean] = js.native
}

