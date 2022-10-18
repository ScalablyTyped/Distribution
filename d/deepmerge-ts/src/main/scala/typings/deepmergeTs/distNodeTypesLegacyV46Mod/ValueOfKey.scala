package typings.deepmergeTs.distNodeTypesLegacyV46Mod

import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Get the value of the given key in the given object.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  K extends keyof T ? T[K] : never
  }}}
  */
@js.native
trait ValueOfKey[T /* <: Record[PropertyKey, Any] */, K /* <: PropertyKey */] extends StObject
