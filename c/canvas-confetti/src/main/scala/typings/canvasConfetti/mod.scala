package typings.canvasConfetti

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Promise[Null] | Null = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[Null] | Null]
  inline def apply(options: Options): js.Promise[Null] | Null = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Null] | Null]
  
  @JSImport("canvas-confetti", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * You can polyfill promises using any of the popular polyfills. You can also provide a promise implementation to `confetti` through this property.
    */
  @JSImport("canvas-confetti", "Promise")
  @js.native
  def Promise: js.Any = js.native
  inline def Promise_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])
  
  /**
    * This method creates an instance of the confetti function that uses a custom canvas.
    */
  inline def create(canvas: HTMLCanvasElement): CreateTypes = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(canvas.asInstanceOf[js.Any]).asInstanceOf[CreateTypes]
  inline def create(canvas: HTMLCanvasElement, options: GlobalOptions): CreateTypes = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(canvas.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CreateTypes]
  
  inline def reset(): Reset_ = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Reset_]
  
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
    
    inline def apply(): GlobalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalOptions]
    }
    
    extension [Self <: GlobalOptions](x: Self) {
      
      inline def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setUseWorker(value: Boolean): Self = StObject.set(x, "useWorker", value.asInstanceOf[js.Any])
      
      inline def setUseWorkerUndefined: Self = StObject.set(x, "useWorker", js.undefined)
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      inline def setDecay(value: Double): Self = StObject.set(x, "decay", value.asInstanceOf[js.Any])
      
      inline def setDecayUndefined: Self = StObject.set(x, "decay", js.undefined)
      
      inline def setDisableForReducedMotion(value: Boolean): Self = StObject.set(x, "disableForReducedMotion", value.asInstanceOf[js.Any])
      
      inline def setDisableForReducedMotionUndefined: Self = StObject.set(x, "disableForReducedMotion", js.undefined)
      
      inline def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      inline def setOrigin(value: Origin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setParticleCount(value: Double): Self = StObject.set(x, "particleCount", value.asInstanceOf[js.Any])
      
      inline def setParticleCountUndefined: Self = StObject.set(x, "particleCount", js.undefined)
      
      inline def setScalar(value: Double): Self = StObject.set(x, "scalar", value.asInstanceOf[js.Any])
      
      inline def setScalarUndefined: Self = StObject.set(x, "scalar", js.undefined)
      
      inline def setShapes(value: js.Array[shape]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
      
      inline def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
      
      inline def setShapesVarargs(value: shape*): Self = StObject.set(x, "shapes", js.Array(value :_*))
      
      inline def setSpread(value: Double): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
      
      inline def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
      
      inline def setStartVelocity(value: Double): Self = StObject.set(x, "startVelocity", value.asInstanceOf[js.Any])
      
      inline def setStartVelocityUndefined: Self = StObject.set(x, "startVelocity", js.undefined)
      
      inline def setTicks(value: Double): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
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
    
    inline def apply(): Origin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Origin]
    }
    
    extension [Self <: Origin](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
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
    
    inline def circle: typings.canvasConfetti.canvasConfettiStrings.circle = "circle".asInstanceOf[typings.canvasConfetti.canvasConfettiStrings.circle]
    
    inline def square: typings.canvasConfetti.canvasConfettiStrings.square = "square".asInstanceOf[typings.canvasConfetti.canvasConfettiStrings.square]
  }
}
