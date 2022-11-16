package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.ListOfRecursiveArraysOrValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type LodashFlattenDepth1x1 = <T>(array : cypress.cypress/types/lodash.ListOfRecursiveArraysOrValues<T> | null | undefined): std.Array<T>
}}}
to avoid circular code involving: 
- cypress.cypress/types/lodash.ListOfRecursiveArraysOrValues
- cypress.cypress/types/lodash.RecursiveArray
- cypress.cypress/types/lodash/fp.LodashFlattenDepth1x1
*/
@js.native
trait LodashFlattenDepth1x1 extends StObject {
  
  def apply[T](): js.Array[T] = js.native
  def apply[T](array: ListOfRecursiveArraysOrValues[T]): js.Array[T] = js.native
}
