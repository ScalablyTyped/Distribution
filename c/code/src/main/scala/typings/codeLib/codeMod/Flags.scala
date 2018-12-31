package typings
package codeLib.codeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flags[T] extends js.Object {
  /** Inverses the expected result of any assertion */
  var not: AssertionChain[T]
  /**
    * Requires that inclusion matches appear only once in the provided value.
    * Used by include().
    */
  var once: AssertionChain[T]
  /**
    * Requires that only the provided elements appear in the provided value.
    * Used by include().
    */
  var only: AssertionChain[T]
  /**
    * Allows a partial match when asserting inclusion
    * Used by include(). Defaults to false.
    */
  var part: AssertionChain[T]
  /**
    * Performs a comparison using strict equality (===).
    * Code defaults to deep comparison. Used by equal() and include().
    */
  var shallow: AssertionChain[T]
}

