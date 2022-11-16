package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.ListOfRecursiveArraysOrValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type LodashFlatMapDepth2x6 = <TResult>(iteratee : (value : T[keyof T]): cypress.cypress/types/lodash.ListOfRecursiveArraysOrValues<TResult> | TResult): std.Array<TResult>
}}}
to avoid circular code involving: 
- cypress.cypress/types/lodash.ListOfRecursiveArraysOrValues
- cypress.cypress/types/lodash.RecursiveArray
- cypress.cypress/types/lodash/fp.LodashFlatMapDepth2x6
*/
@js.native
trait LodashFlatMapDepth2x6[T] extends StObject {
  
  def apply[TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): js.Array[TResult] = js.native
}
