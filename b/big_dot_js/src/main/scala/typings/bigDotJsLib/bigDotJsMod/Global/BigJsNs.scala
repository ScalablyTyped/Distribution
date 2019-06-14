package typings
package bigDotJsLib.bigDotJsMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BigJs")
@js.native
object BigJsNs extends js.Object {
  /* Inlined `const enum`. Members: 
  - GT: 1
  - EQ: 0
  - LT: -1
    */
  /* Rewritten from type alias, can be one of: 
    - bigDotJsLib.bigDotJsLibNumbers.`1`
    - bigDotJsLib.bigDotJsLibNumbers.`0`
    - bigDotJsLib.bigDotJsLibNumbers.`-1`
  */
  trait Comparison extends js.Object
  
  /* Inlined `const enum`. Members: 
  - RoundDown: 0
  - RoundHalfUp: 1
  - RoundHalfEven: 2
  - RoundUp: 3
    */
  /* Rewritten from type alias, can be one of: 
    - bigDotJsLib.bigDotJsLibNumbers.`0`
    - bigDotJsLib.bigDotJsLibNumbers.`1`
    - bigDotJsLib.bigDotJsLibNumbers.`2`
    - bigDotJsLib.bigDotJsLibNumbers.`3`
  */
  trait RoundingMode extends js.Object
  
  type Big = bigDotJsLib.bigDotJsMod.Big_
  type BigConstructor = bigDotJsLib.bigDotJsMod.BigConstructor_
  type BigSource = bigDotJsLib.bigDotJsMod.BigSource_
}

