package typings.bounceJs

import typings.jquery.JQuery
import typings.jquery.JQueryPromise
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bounce.js", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Bounce
  object default {
    
    @JSImport("bounce.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("bounce.js", "default.FPS")
    @js.native
    def FPS: Double = js.native
    @scala.inline
    def FPS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FPS")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("bounce.js", "default.counter")
    @js.native
    def counter: Double = js.native
    @scala.inline
    def counter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("counter")(x.asInstanceOf[js.Any])
    
    /* static member */
    @scala.inline
    def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  }
  
  trait AnimationOptions extends StObject {
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var onComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var remove: js.UndefOr[Boolean] = js.undefined
  }
  object AnimationOptions {
    
    @scala.inline
    def apply(): AnimationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimationOptions]
    }
    
    @scala.inline
    implicit class AnimationOptionsMutableBuilder[Self <: AnimationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      @scala.inline
      def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    }
  }
  
  @js.native
  trait Bounce extends StObject {
    
    def applyTo(elements: js.Array[Element]): Unit = js.native
    def applyTo(elements: js.Array[Element], options: AnimationOptions): Unit = js.native
    def applyTo(elements: JQuery[HTMLElement]): JQueryPromise[Unit] = js.native
    def applyTo(elements: JQuery[HTMLElement], options: AnimationOptions): JQueryPromise[Unit] = js.native
    def applyTo(element: Element): Unit = js.native
    def applyTo(element: Element, options: AnimationOptions): Unit = js.native
    
    def define(name: String): Bounce = js.native
    
    def deserialize(serailized: js.Array[SerailizedComponent[Double | Point2D]]): Bounce = js.native
    
    def remove(): Unit = js.native
    
    def rotate(options: BounceOptions[Double]): Bounce = js.native
    
    def scale(options: BounceOptions[Point2D]): Bounce = js.native
    
    def serialize(): js.Array[SerailizedComponent[Double | Point2D]] = js.native
    
    def skew(options: BounceOptions[Point2D]): Bounce = js.native
    
    def translate(options: BounceOptions[Point2D]): Bounce = js.native
  }
  
  trait BounceOptions[T] extends StObject {
    
    var bounces: js.UndefOr[Double] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[String] = js.undefined
    
    var from: T
    
    var stiffness: js.UndefOr[Double] = js.undefined
    
    var to: T
  }
  object BounceOptions {
    
    @scala.inline
    def apply[T](from: T, to: T): BounceOptions[T] = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[BounceOptions[T]]
    }
    
    @scala.inline
    implicit class BounceOptionsMutableBuilder[Self <: BounceOptions[?], T] (val x: Self & BounceOptions[T]) extends AnyVal {
      
      @scala.inline
      def setBounces(value: Double): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBouncesUndefined: Self = StObject.set(x, "bounces", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setFrom(value: T): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
      
      @scala.inline
      def setTo(value: T): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point2D extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point2D {
    
    @scala.inline
    def apply(x: Double, y: Double): Point2D = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point2D]
    }
    
    @scala.inline
    implicit class Point2DMutableBuilder[Self <: Point2D] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait SerailizedComponent[T] extends StObject {
    
    var bounces: Double
    
    var delay: Double
    
    var duration: Double
    
    var easing: String
    
    var from: T
    
    var stiffness: Double
    
    var to: T
    
    var `type`: String
  }
  object SerailizedComponent {
    
    @scala.inline
    def apply[T](
      bounces: Double,
      delay: Double,
      duration: Double,
      easing: String,
      from: T,
      stiffness: Double,
      to: T,
      `type`: String
    ): SerailizedComponent[T] = {
      val __obj = js.Dynamic.literal(bounces = bounces.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerailizedComponent[T]]
    }
    
    @scala.inline
    implicit class SerailizedComponentMutableBuilder[Self <: SerailizedComponent[?], T] (val x: Self & SerailizedComponent[T]) extends AnyVal {
      
      @scala.inline
      def setBounces(value: Double): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrom(value: T): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: T): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
