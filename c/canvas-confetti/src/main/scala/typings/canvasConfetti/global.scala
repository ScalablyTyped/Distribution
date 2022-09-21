package typings.canvasConfetti

import typings.canvasConfetti.mod.CreateTypes
import typings.canvasConfetti.mod.GlobalOptions
import typings.canvasConfetti.mod.Options
import typings.canvasConfetti.mod.Reset_
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object confetti {
    
    inline def apply(): js.Promise[Unit] | Null = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[Unit] | Null]
    inline def apply(options: Options): js.Promise[Unit] | Null = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit] | Null]
    
    @JSGlobal("confetti")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * You can polyfill promises using any of the popular polyfills. You can also provide a promise implementation to `confetti` through this property.
      */
    @JSGlobal("confetti.Promise")
    @js.native
    def Promise: Any = js.native
    inline def Promise_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])
    
    /**
      * This method creates an instance of the confetti function that uses a custom canvas.
      */
    inline def create(): CreateTypes = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CreateTypes]
    inline def create(canvas: Unit, options: GlobalOptions): CreateTypes = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(canvas.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CreateTypes]
    inline def create(canvas: HTMLCanvasElement): CreateTypes = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(canvas.asInstanceOf[js.Any]).asInstanceOf[CreateTypes]
    inline def create(canvas: HTMLCanvasElement, options: GlobalOptions): CreateTypes = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(canvas.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CreateTypes]
    
    inline def reset(): Reset_ = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Reset_]
  }
}
