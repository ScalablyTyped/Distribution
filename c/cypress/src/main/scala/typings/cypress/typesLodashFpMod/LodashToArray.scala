package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.Dictionary
import typings.cypress.typesLodashMod.NumericDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashToArray extends StObject {
  
  def apply(): js.Array[Any] = js.native
  def apply[T](value: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](value: Dictionary[T]): js.Array[T] = js.native
  def apply[T](value: NumericDictionary[T]): js.Array[T] = js.native
}
