package typings.cypress.typesLodashMod

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type RecursiveArray = std.Array<T | cypress.cypress/types/lodash.RecursiveArray<T>>
}}}
to avoid circular code involving: 
- cypress.cypress/types/lodash.ListOfRecursiveArraysOrValues
- cypress.cypress/types/lodash.RecursiveArray
*/
@js.native
trait RecursiveArray[T]
  extends StObject
     with Array[T | RecursiveArray[T]]
