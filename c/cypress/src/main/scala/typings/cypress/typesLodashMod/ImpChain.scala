package typings.cypress.typesLodashMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends {  __trapAny :any} ? cypress.cypress/types/lodash.Collection<any> & cypress.cypress/types/lodash.Function<any> & cypress.cypress/types/lodash.Object<any> & cypress.cypress/types/lodash.Primitive<any> & cypress.cypress/types/lodash.String : T extends null | undefined ? never : T extends string | null | undefined ? cypress.cypress/types/lodash.String : T extends (args : any): any ? cypress.cypress/types/lodash.Function<T> : T extends cypress.cypress/types/lodash.List<infer U> | null | undefined ? cypress.cypress/types/lodash.Collection<U> : T extends object | null | undefined ? cypress.cypress/types/lodash.Object<T> : cypress.cypress/types/lodash.Primitive<T>
  }}}
  */
@js.native
trait ImpChain[T] extends StObject
