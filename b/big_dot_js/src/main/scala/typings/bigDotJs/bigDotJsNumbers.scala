package typings.bigDotJs

import typings.bigDotJs.bigDotJsMod.Comparison
import typings.bigDotJs.bigDotJsMod.RoundingMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object bigDotJsNumbers {
  @js.native
  sealed trait `-1`
    extends Comparison
       with typings.bigDotJs.bigDotJsMod._Global_.BigJs.Comparison
  
  @js.native
  sealed trait `0`
    extends Comparison
       with typings.bigDotJs.bigDotJsMod._Global_.BigJs.Comparison
       with RoundingMode
       with typings.bigDotJs.bigDotJsMod._Global_.BigJs.RoundingMode
  
  @js.native
  sealed trait `1`
    extends Comparison
       with typings.bigDotJs.bigDotJsMod._Global_.BigJs.Comparison
       with RoundingMode
       with typings.bigDotJs.bigDotJsMod._Global_.BigJs.RoundingMode
  
  @js.native
  sealed trait `2`
    extends RoundingMode
       with typings.bigDotJs.bigDotJsMod._Global_.BigJs.RoundingMode
  
  @js.native
  sealed trait `3`
    extends RoundingMode
       with typings.bigDotJs.bigDotJsMod._Global_.BigJs.RoundingMode
  
  @scala.inline
  def `-1`: `-1` = -1.asInstanceOf[`-1`]
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
  @scala.inline
  def `2`: `2` = 2.asInstanceOf[`2`]
  @scala.inline
  def `3`: `3` = 3.asInstanceOf[`3`]
}

