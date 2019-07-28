package typings.bigDotJs.bigDotJsMod.Global

import typings.bigDotJs.bigDotJsMod.BigConstructor_
import typings.bigDotJs.bigDotJsMod.BigSource_
import typings.bigDotJs.bigDotJsMod.Big_
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
    - typings.bigDotJs.bigDotJsNumbers.`1`
    - typings.bigDotJs.bigDotJsNumbers.`0`
    - typings.bigDotJs.bigDotJsNumbers.`-1`
  */
  trait Comparison extends js.Object
  
  /* Inlined `const enum`. Members: 
  - RoundDown: 0
  - RoundHalfUp: 1
  - RoundHalfEven: 2
  - RoundUp: 3
    */
  /* Rewritten from type alias, can be one of: 
    - typings.bigDotJs.bigDotJsNumbers.`0`
    - typings.bigDotJs.bigDotJsNumbers.`1`
    - typings.bigDotJs.bigDotJsNumbers.`2`
    - typings.bigDotJs.bigDotJsNumbers.`3`
  */
  trait RoundingMode extends js.Object
  
  type Big = Big_
  type BigConstructor = BigConstructor_
  type BigSource = BigSource_
}

