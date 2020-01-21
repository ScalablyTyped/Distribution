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
    angle: Int | Double = null,
    colors: js.Array[String] = null,
    decay: Int | Double = null,
    origin: Origin = null,
    particleCount: Int | Double = null,
    spread: Int | Double = null,
    startVelocity: Int | Double = null,
    ticks: Int | Double = null,
    zIndex: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (decay != null) __obj.updateDynamic("decay")(decay.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (particleCount != null) __obj.updateDynamic("particleCount")(particleCount.asInstanceOf[js.Any])
    if (spread != null) __obj.updateDynamic("spread")(spread.asInstanceOf[js.Any])
    if (startVelocity != null) __obj.updateDynamic("startVelocity")(startVelocity.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

