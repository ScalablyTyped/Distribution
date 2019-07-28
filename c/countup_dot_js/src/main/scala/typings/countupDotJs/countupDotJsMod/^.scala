package typings.countupDotJs.countupDotJsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("countup.js", JSImport.Namespace)
@js.native
class ^ protected () extends CountUp {
  /**
    * @param target Id of html element or var of previously selected html element where counting occurs
    * @param startVal The value you want to begin at
    * @param endVal The value you want to arrive at
    * @param decimals Number of decimal places, default 0
    * @param duration Duration of animation in seconds, default 2
    * @param options Object of options
    */
  def this(target: String | HTMLElement, startVal: Double | String, endVal: Double | String) = this()
  def this(
    target: String | HTMLElement,
    startVal: Double | String,
    endVal: Double | String,
    decimals: Double | String
  ) = this()
  def this(
    target: String | HTMLElement,
    startVal: Double | String,
    endVal: Double | String,
    decimals: Double | String,
    duration: Double | String
  ) = this()
  def this(
    target: String | HTMLElement,
    startVal: Double | String,
    endVal: Double | String,
    decimals: Double | String,
    duration: Double | String,
    options: CountUpOptions
  ) = this()
}

