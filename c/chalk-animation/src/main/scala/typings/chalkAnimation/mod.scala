package typings.chalkAnimation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chalk-animation", "glitch")
  @js.native
  val glitch: AnimationFn = js.native
  
  @JSImport("chalk-animation", "karaoke")
  @js.native
  val karaoke: AnimationFn = js.native
  
  @JSImport("chalk-animation", "neon")
  @js.native
  val neon: AnimationFn = js.native
  
  @JSImport("chalk-animation", "pulse")
  @js.native
  val pulse: AnimationFn = js.native
  
  @JSImport("chalk-animation", "radar")
  @js.native
  val radar: AnimationFn = js.native
  
  @JSImport("chalk-animation", "rainbow")
  @js.native
  val rainbow: AnimationFn = js.native
  
  trait Animation extends StObject {
    
    def frame(): String
    
    def render(): Unit
    
    def replace(text: String): Unit
    
    def start(): Unit
    
    def stop(): Unit
  }
  object Animation {
    
    @scala.inline
    def apply(
      frame: () => String,
      render: () => Unit,
      replace: String => Unit,
      start: () => Unit,
      stop: () => Unit
    ): Animation = {
      val __obj = js.Dynamic.literal(frame = js.Any.fromFunction0(frame), render = js.Any.fromFunction0(render), replace = js.Any.fromFunction1(replace), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[Animation]
    }
    
    @scala.inline
    implicit class AnimationMutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrame(value: () => String): Self = StObject.set(x, "frame", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRender(value: () => Unit): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReplace(value: String => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  type AnimationFn = js.Function2[/* text */ String, /* speed */ js.UndefOr[Double], Animation]
}
