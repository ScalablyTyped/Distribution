package typings.cypress.typesLodashMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends {  __trapAny :any} ? cypress.cypress/types/lodash.CollectionChain<any> & cypress.cypress/types/lodash.FunctionChain<any> & cypress.cypress/types/lodash.ObjectChain<any> & cypress.cypress/types/lodash.PrimitiveChain<any> & cypress.cypress/types/lodash.StringChain : T extends null | undefined ? never : T extends string ? cypress.cypress/types/lodash.StringChain : T extends string | null | undefined ? cypress.cypress/types/lodash.StringNullableChain : T extends (args : any): any ? cypress.cypress/types/lodash.FunctionChain<T> : T extends cypress.cypress/types/lodash.List<infer U> | null | undefined ? cypress.cypress/types/lodash.CollectionChain<U> : T extends object | null | undefined ? cypress.cypress/types/lodash.ObjectChain<T> : cypress.cypress/types/lodash.PrimitiveChain<T>
  }}}
  */
@js.native
trait ExpChain[T] extends StObject
