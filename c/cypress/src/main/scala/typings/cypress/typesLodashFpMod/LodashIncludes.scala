package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.Dictionary
import typings.cypress.typesLodashMod.NumericDictionary
import typings.cypress.typesLodashMod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashIncludes extends StObject {
  
  def apply[T](target: T): LodashIncludes1x1[T] = js.native
  def apply[T](target: T, collection: Dictionary[T]): Boolean = js.native
  def apply[T](target: T, collection: NumericDictionary[T]): Boolean = js.native
  def apply[T](target: __): LodashIncludes1x2[T] = js.native
  def apply[T](target: __, collection: Dictionary[T]): LodashIncludes1x2[T] = js.native
  def apply[T](target: __, collection: NumericDictionary[T]): LodashIncludes1x2[T] = js.native
}
