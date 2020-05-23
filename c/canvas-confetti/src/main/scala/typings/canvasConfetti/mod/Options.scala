package typings.canvasConfetti.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The angle in which to launch the confetti, in degrees. 90 is straight up.
    * @default 90
    */
  var angle: js.UndefOr[Double] = js.undefined
  /**
    * An array of color strings, in the HEX format... you know, like #bada55.
    */
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * How quickly the confetti will lose speed. Keep this number between 0 and 1, otherwise the confetti will gain speed. Better yet, just never change it.
    * @default 0.9
    */
  var decay: js.UndefOr[Double] = js.undefined
  /**
    * Where to start firing confetti from. Feel free to launch off-screen if you'd like.
    */
  var origin: js.UndefOr[Origin] = js.undefined
  /**
    * The number of confetti to launch. More is always fun... but be cool, there's a lot of math involved.
    * @default 50
    */
  var particleCount: js.UndefOr[Double] = js.undefined
  /**
    * The possible values are square and circle. The default is to use both shapes in an even mix.
    * @default ['square','circle']
    */
  var shapes: js.UndefOr[js.Array[shape]] = js.undefined
  /**
    * How far off center the confetti can go, in degrees. 45 means the confetti will launch at the defined angle plus or minus 22.5 degrees.
    * @default 45
    */
  var spread: js.UndefOr[Double] = js.undefined
  /**
    * How fast the confetti will start going, in pixels.
    * @default 45
    */
  var startVelocity: js.UndefOr[Double] = js.undefined
  /**
    * How many times the confetti will move. This is abstract... but play with it if the confetti disappear too quickly for you.
    * @default 200
    */
  var ticks: js.UndefOr[Double] = js.undefined
  /**
    * The confetti should be on top, after all. But if you have a crazy high page, you can set it even higher.
    * @default 100
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    angle: js.UndefOr[Double] = js.undefined,
    colors: js.Array[String] = null,
    decay: js.UndefOr[Double] = js.undefined,
    origin: Origin = null,
    particleCount: js.UndefOr[Double] = js.undefined,
    shapes: js.Array[shape] = null,
    spread: js.UndefOr[Double] = js.undefined,
    startVelocity: js.UndefOr[Double] = js.undefined,
    ticks: js.UndefOr[Double] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(decay)) __obj.updateDynamic("decay")(decay.get.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(particleCount)) __obj.updateDynamic("particleCount")(particleCount.get.asInstanceOf[js.Any])
    if (shapes != null) __obj.updateDynamic("shapes")(shapes.asInstanceOf[js.Any])
    if (!js.isUndefined(spread)) __obj.updateDynamic("spread")(spread.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startVelocity)) __obj.updateDynamic("startVelocity")(startVelocity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ticks)) __obj.updateDynamic("ticks")(ticks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

