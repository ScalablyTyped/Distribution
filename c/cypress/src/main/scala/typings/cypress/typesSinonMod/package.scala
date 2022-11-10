package typings.cypress.typesSinonMod

import typings.sinonjsFakeTimers.mod.TimerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Replaces a type with a Sinon stub if it's a function.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends (args : infer TArgs): infer TReturnValue ? cypress.cypress/types/sinon.SinonStub<TArgs, TReturnValue> : T
  }}}
  */
type SinonStubbedMember[T] = T

type SinonTimerId = TimerId

/**
  * Stubbed type of an object with members replaced by stubs.
  *
  * @template TType Type being stubbed.
  */
type StubbableType[TType] = js.Function
