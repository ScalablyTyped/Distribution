package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends babylonjs.BABYLON.Primitive ? T : T extends std.Array<infer U> ? babylonjs.BABYLON.DeepImmutableArray<U> : babylonjs.BABYLON.DeepImmutableObject<T>
  }}}
  */
@js.native
trait DeepImmutable[T] extends StObject
