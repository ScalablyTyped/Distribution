package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.Dictionary
import typings.cypress.typesLodashMod.NumericDictionary
import typings.cypress.typesLodashMod.ValueIteratee
import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashInvertBy extends StObject {
  
  def apply[T](
    interatee: ValueIteratee[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T
    ]
  ): Dictionary[js.Array[String]] = js.native
  def apply[T /* <: js.Object */](
    interatee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    `object`: T
  ): Dictionary[js.Array[String]] = js.native
  def apply[T](interatee: ValueIteratee[T], `object`: Dictionary[T]): Dictionary[js.Array[String]] = js.native
  def apply[T](interatee: ValueIteratee[T], `object`: NumericDictionary[T]): Dictionary[js.Array[String]] = js.native
  def apply[T /* <: js.Object */](interatee: __): LodashInvertBy2x2[T] = js.native
  def apply[T /* <: js.Object */](interatee: __, `object`: T): LodashInvertBy2x2[T] = js.native
  def apply[T](interatee: __, `object`: Dictionary[T]): LodashInvertBy1x2[T] = js.native
  def apply[T](interatee: __, `object`: NumericDictionary[T]): LodashInvertBy1x2[T] = js.native
}
