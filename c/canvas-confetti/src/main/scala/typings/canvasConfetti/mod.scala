package typings.canvasConfetti

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): js.Promise[Null] | Null = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[Null] | Null]
  @scala.inline
  def apply(options: Options): js.Promise[Null] | Null = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null] | Null]
  
  @JSImport("canvas-confetti", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * You can polyfill promises using any of the popular polyfills. You can also provide a promise implementation to `confetti` through this property.
    */
  @JSImport("canvas-confetti", "Promise")
  @js.native
  def Promise: js.Any = js.native
  @scala.inline
  def Promise_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])
  
  /**
    * This method creates an instance of the confetti function that uses a custom canvas.
    */
  @scala.inline
  def create(canvas: HTMLCanvasElement): CreateTypes = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(canvas.asInstanceOf[js.Any]).asInstanceOf[CreateTypes]
  @scala.inline
  def create(canvas: HTMLCanvasElement, options: GlobalOptions): CreateTypes = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(canvas.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CreateTypes]
  
  @scala.inline
  def reset(): Reset_ = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Reset_]
  
  @js.native
  trait CreateTypes extends StObject {
    
    def apply(): js.Function0[js.Promise[Null] | Null] = js.native
    def apply(options: Options): js.Function0[js.Promise[Null] | Null] = js.native
    
    def reset(): Unit = js.native
    @JSName("reset")
    var reset_Original: Reset_ = js.native
  }
  
  trait GlobalOptions extends StObject {
    
    /**
      * Whether to allow setting the canvas image size, as well as keep it correctly sized if the window changes size
      * @default false
      */
    var resize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to use an asynchronous web worker to render the confetti animation, whenever possible
      * @default false
      */
    var useWorker: js.UndefOr[Boolean] = js.undefined
  }
  object GlobalOptions {
    
    @scala.inline
    def apply(): GlobalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalOptions]
    }
    
    @scala.inline
    implicit class GlobalOptionsMutableBuilder[Self <: GlobalOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setUseWorker(value: Boolean): Self = StObject.set(x, "useWorker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseWorkerUndefined: Self = StObject.set(x, "useWorker", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
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
      * Disables confetti entirely for users that prefer reduced motion. The confetti() promise will resolve immediately in this case.
      * @default false
      */
    var disableForReducedMotion: js.UndefOr[Boolean] = js.undefined
    
    /**
      * How quickly the particles are pulled down. 1 is full gravity, 0.5 is half gravity, etc., but there are no limits.
      * @default 1
      */
    var gravity: js.UndefOr[Double] = js.undefined
    
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
      * Scale factor for each confetti particle. Use decimals to make the confetti smaller.
      * @default 1
      */
    var scalar: js.UndefOr[Double] = js.undefined
    
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
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setDecay(value: Double): Self = StObject.set(x, "decay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecayUndefined: Self = StObject.set(x, "decay", js.undefined)
      
      @scala.inline
      def setDisableForReducedMotion(value: Boolean): Self = StObject.set(x, "disableForReducedMotion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableForReducedMotionUndefined: Self = StObject.set(x, "disableForReducedMotion", js.undefined)
      
      @scala.inline
      def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      @scala.inline
      def setOrigin(value: Origin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setParticleCount(value: Double): Self = StObject.set(x, "particleCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParticleCountUndefined: Self = StObject.set(x, "particleCount", js.undefined)
      
      @scala.inline
      def setScalar(value: Double): Self = StObject.set(x, "scalar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalarUndefined: Self = StObject.set(x, "scalar", js.undefined)
      
      @scala.inline
      def setShapes(value: js.Array[shape]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
      
      @scala.inline
      def setShapesVarargs(value: shape*): Self = StObject.set(x, "shapes", js.Array(value :_*))
      
      @scala.inline
      def setSpread(value: Double): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
      
      @scala.inline
      def setStartVelocity(value: Double): Self = StObject.set(x, "startVelocity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartVelocityUndefined: Self = StObject.set(x, "startVelocity", js.undefined)
      
      @scala.inline
      def setTicks(value: Double): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait Origin extends StObject {
    
    /**
      * The x position on the page, with 0 being the left edge and 1 being the right edge.
      * @default 0.5
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /**
      * The y position on the page, with 0 being the left edge and 1 being the right edge.
      * @default 0.5
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object Origin {
    
    @scala.inline
    def apply(): Origin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Origin]
    }
    
    @scala.inline
    implicit class OriginMutableBuilder[Self <: Origin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /**
    * Stops the animation and clears all confetti, as well as immediately resolves any outstanding promises.
    */
  type Reset_ = js.Function0[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.canvasConfetti.canvasConfettiStrings.square
    - typings.canvasConfetti.canvasConfettiStrings.circle
  */
  trait shape extends StObject
  object shape {
    
    @scala.inline
    def circle: typings.canvasConfetti.canvasConfettiStrings.circle = "circle".asInstanceOf[typings.canvasConfetti.canvasConfettiStrings.circle]
    
    @scala.inline
    def square: typings.canvasConfetti.canvasConfettiStrings.square = "square".asInstanceOf[typings.canvasConfetti.canvasConfettiStrings.square]
  }
}
