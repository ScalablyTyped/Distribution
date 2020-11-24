package typings.canvasConfetti.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * The angle in which to launch the confetti, in degrees. 90 is straight up.
    * @default 90
    */
  var angle: js.UndefOr[Double] = js.native
  
  /**
    * An array of color strings, in the HEX format... you know, like #bada55.
    */
  var colors: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * How quickly the confetti will lose speed. Keep this number between 0 and 1, otherwise the confetti will gain speed. Better yet, just never change it.
    * @default 0.9
    */
  var decay: js.UndefOr[Double] = js.native
  
  /**
    * Disables confetti entirely for users that prefer reduced motion. The confetti() promise will resolve immediately in this case.
    * @default false
    */
  var disableForReducedMotion: js.UndefOr[Boolean] = js.native
  
  /**
    * How quickly the particles are pulled down. 1 is full gravity, 0.5 is half gravity, etc., but there are no limits.
    * @default 1
    */
  var gravity: js.UndefOr[Double] = js.native
  
  /**
    * Where to start firing confetti from. Feel free to launch off-screen if you'd like.
    */
  var origin: js.UndefOr[Origin] = js.native
  
  /**
    * The number of confetti to launch. More is always fun... but be cool, there's a lot of math involved.
    * @default 50
    */
  var particleCount: js.UndefOr[Double] = js.native
  
  /**
    * Scale factor for each confetti particle. Use decimals to make the confetti smaller.
    * @default 1
    */
  var scalar: js.UndefOr[Double] = js.native
  
  /**
    * The possible values are square and circle. The default is to use both shapes in an even mix.
    * @default ['square','circle']
    */
  var shapes: js.UndefOr[js.Array[shape]] = js.native
  
  /**
    * How far off center the confetti can go, in degrees. 45 means the confetti will launch at the defined angle plus or minus 22.5 degrees.
    * @default 45
    */
  var spread: js.UndefOr[Double] = js.native
  
  /**
    * How fast the confetti will start going, in pixels.
    * @default 45
    */
  var startVelocity: js.UndefOr[Double] = js.native
  
  /**
    * How many times the confetti will move. This is abstract... but play with it if the confetti disappear too quickly for you.
    * @default 200
    */
  var ticks: js.UndefOr[Double] = js.native
  
  /**
    * The confetti should be on top, after all. But if you have a crazy high page, you can set it even higher.
    * @default 100
    */
  var zIndex: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setDecay(value: Double): Self = this.set("decay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecay: Self = this.set("decay", js.undefined)
    
    @scala.inline
    def setDisableForReducedMotion(value: Boolean): Self = this.set("disableForReducedMotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableForReducedMotion: Self = this.set("disableForReducedMotion", js.undefined)
    
    @scala.inline
    def setGravity(value: Double): Self = this.set("gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGravity: Self = this.set("gravity", js.undefined)
    
    @scala.inline
    def setOrigin(value: Origin): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setParticleCount(value: Double): Self = this.set("particleCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParticleCount: Self = this.set("particleCount", js.undefined)
    
    @scala.inline
    def setScalar(value: Double): Self = this.set("scalar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalar: Self = this.set("scalar", js.undefined)
    
    @scala.inline
    def setShapesVarargs(value: shape*): Self = this.set("shapes", js.Array(value :_*))
    
    @scala.inline
    def setShapes(value: js.Array[shape]): Self = this.set("shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapes: Self = this.set("shapes", js.undefined)
    
    @scala.inline
    def setSpread(value: Double): Self = this.set("spread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpread: Self = this.set("spread", js.undefined)
    
    @scala.inline
    def setStartVelocity(value: Double): Self = this.set("startVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartVelocity: Self = this.set("startVelocity", js.undefined)
    
    @scala.inline
    def setTicks(value: Double): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
