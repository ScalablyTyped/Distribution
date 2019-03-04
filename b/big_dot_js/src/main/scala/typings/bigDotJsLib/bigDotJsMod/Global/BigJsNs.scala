package typings
package bigDotJsLib.bigDotJsMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BigJs")
@js.native
object BigJsNs extends js.Object {
  @js.native
  sealed trait Comparison extends js.Object
  
  @js.native
  sealed trait RoundingMode extends js.Object
  
  @js.native
  object Comparison extends js.Object {
    @js.native
    sealed trait EQ
      extends bigDotJsLib.bigDotJsMod.Global.BigJsNs.Comparison
    
    @js.native
    sealed trait GT
      extends bigDotJsLib.bigDotJsMod.Global.BigJsNs.Comparison
    
    @js.native
    sealed trait LT
      extends bigDotJsLib.bigDotJsMod.Global.BigJsNs.Comparison
    
    /* 0 */ val EQ: EQ with scala.Double = js.native
    /* 1 */ val GT: GT with scala.Double = js.native
    /* -1 */ val LT: LT with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[bigDotJsLib.bigDotJsMod.Global.BigJsNs.Comparison with scala.Double] = js.native
  }
  
  @js.native
  object RoundingMode extends js.Object {
    /**
      * Rounds towards zero.
      * I.e. truncate, no rounding.
      */
    @js.native
    sealed trait RoundDown
      extends bigDotJsLib.bigDotJsMod.Global.BigJsNs.RoundingMode
    
    /**
      * Rounds towards nearest neighbour.
      * If equidistant, rounds towards even neighbour.
      */
    @js.native
    sealed trait RoundHalfEven
      extends bigDotJsLib.bigDotJsMod.Global.BigJsNs.RoundingMode
    
    /**
      * Rounds towards nearest neighbour.
      * If equidistant, rounds away from zero.
      */
    @js.native
    sealed trait RoundHalfUp
      extends bigDotJsLib.bigDotJsMod.Global.BigJsNs.RoundingMode
    
    /**
      * Rounds away from zero.
      */
    @js.native
    sealed trait RoundUp
      extends bigDotJsLib.bigDotJsMod.Global.BigJsNs.RoundingMode
    
    /* 0 */ val RoundDown: RoundDown with scala.Double = js.native
    /* 2 */ val RoundHalfEven: RoundHalfEven with scala.Double = js.native
    /* 1 */ val RoundHalfUp: RoundHalfUp with scala.Double = js.native
    /* 3 */ val RoundUp: RoundUp with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[bigDotJsLib.bigDotJsMod.Global.BigJsNs.RoundingMode with scala.Double] = js.native
  }
  
  type Big = bigDotJsLib.bigDotJsMod.Big_
  type BigConstructor = bigDotJsLib.bigDotJsMod.BigConstructor_
  type BigSource = bigDotJsLib.bigDotJsMod.BigSource_
}

