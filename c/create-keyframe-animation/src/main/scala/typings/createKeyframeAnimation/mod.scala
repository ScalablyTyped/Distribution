package typings.createKeyframeAnimation

import org.scalablytyped.runtime.StringDictionary
import typings.createKeyframeAnimation.anon.FnCall
import typings.createKeyframeAnimation.anon.Name
import typings.createKeyframeAnimation.anon.PartialPresetsConfig
import typings.std.Element
import typings.std.FillMode
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("create-keyframe-animation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAnimationCSS(name: String, positions: AnimationType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAnimationCSS")(name.asInstanceOf[js.Any], positions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hasAnimation(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAnimation")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def registerAnimation(opts: RegisterAnimationConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAnimation")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def runAnimation[U](
    els: js.Array[Element],
    opts: OptsType,
    cb: js.Function2[
      /* err */ js.Error | Null, 
      /* result */ js.UndefOr[InferParams[js.Array[Element]]], 
      U
    ]
  ): js.Promise[U] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runAnimation")(els.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U] | Unit]
  inline def runAnimation[T /* <: OptsType */](els: ElsType, opts: T): js.Promise[T] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runAnimation")(els.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T] | Unit]
  inline def runAnimation[U](
    els: Element,
    opts: OptsType,
    cb: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[InferParams[Element]], U]
  ): js.Promise[U] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runAnimation")(els.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U] | Unit]
  inline def runAnimation[T /* <: Any */, U](
    els: T,
    opts: OptsType,
    cb: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[InferParams[T]], U]
  ): js.Promise[U] | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runAnimation")(els.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U] | Unit]
  
  inline def unregisterAnimation(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterAnimation")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type AnimationConfigIndex = StringDictionary[js.Array[Double] | (Record[String, String])]
  
  trait AnimationConfigStartAndEnd extends StObject {
    
    var end: js.Array[Double]
    
    var start: js.Array[Double]
  }
  object AnimationConfigStartAndEnd {
    
    inline def apply(end: js.Array[Double], start: js.Array[Double]): AnimationConfigStartAndEnd = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationConfigStartAndEnd]
    }
    
    extension [Self <: AnimationConfigStartAndEnd](x: Self) {
      
      inline def setEnd(value: js.Array[Double]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndVarargs(value: Double*): Self = StObject.set(x, "end", js.Array(value*))
      
      inline def setStart(value: js.Array[Double]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartVarargs(value: Double*): Self = StObject.set(x, "start", js.Array(value*))
    }
  }
  
  type AnimationType = AnimationConfigStartAndEnd | AnimationConfigIndex | (js.Array[js.Array[Double] | (Record[String, Any])])
  
  /* Rewritten from type alias, can be one of: 
    - typings.createKeyframeAnimation.createKeyframeAnimationStrings.normal
    - typings.createKeyframeAnimation.createKeyframeAnimationStrings.alternate
    - typings.createKeyframeAnimation.createKeyframeAnimationStrings.reverse
    - typings.createKeyframeAnimation.createKeyframeAnimationStrings.`alternate-reverse`
  */
  trait Direction extends StObject
  object Direction {
    
    inline def alternate: typings.createKeyframeAnimation.createKeyframeAnimationStrings.alternate = "alternate".asInstanceOf[typings.createKeyframeAnimation.createKeyframeAnimationStrings.alternate]
    
    inline def `alternate-reverse`: typings.createKeyframeAnimation.createKeyframeAnimationStrings.`alternate-reverse` = "alternate-reverse".asInstanceOf[typings.createKeyframeAnimation.createKeyframeAnimationStrings.`alternate-reverse`]
    
    inline def normal: typings.createKeyframeAnimation.createKeyframeAnimationStrings.normal = "normal".asInstanceOf[typings.createKeyframeAnimation.createKeyframeAnimationStrings.normal]
    
    inline def reverse: typings.createKeyframeAnimation.createKeyframeAnimationStrings.reverse = "reverse".asInstanceOf[typings.createKeyframeAnimation.createKeyframeAnimationStrings.reverse]
  }
  
  type ElsType = Element | js.Array[Element] | ReturnType[FnCall]
  
  type InferParams[T /* <: ElsType */] = T | js.Array[T]
  
  type OptsType = String | ((Record[String, Any]) & Name & PartialPresetsConfig)
  
  trait PresetsConfig extends StObject {
    
    var clearTransformsBeforeStart: Boolean
    
    var delay: Double
    
    var direction: Direction
    
    var duration: Double
    
    var easing: String
    
    var fillMode: FillMode
    
    var iterations: Double
    
    var resetWhenDone: Boolean
  }
  object PresetsConfig {
    
    inline def apply(
      clearTransformsBeforeStart: Boolean,
      delay: Double,
      direction: Direction,
      duration: Double,
      easing: String,
      fillMode: FillMode,
      iterations: Double,
      resetWhenDone: Boolean
    ): PresetsConfig = {
      val __obj = js.Dynamic.literal(clearTransformsBeforeStart = clearTransformsBeforeStart.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], fillMode = fillMode.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], resetWhenDone = resetWhenDone.asInstanceOf[js.Any])
      __obj.asInstanceOf[PresetsConfig]
    }
    
    extension [Self <: PresetsConfig](x: Self) {
      
      inline def setClearTransformsBeforeStart(value: Boolean): Self = StObject.set(x, "clearTransformsBeforeStart", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setFillMode(value: FillMode): Self = StObject.set(x, "fillMode", value.asInstanceOf[js.Any])
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setResetWhenDone(value: Boolean): Self = StObject.set(x, "resetWhenDone", value.asInstanceOf[js.Any])
    }
  }
  
  trait RegisterAnimationConfig extends StObject {
    
    var animation: AnimationType
    
    var name: String
    
    var presets: js.UndefOr[PartialPresetsConfig] = js.undefined
  }
  object RegisterAnimationConfig {
    
    inline def apply(animation: AnimationType, name: String): RegisterAnimationConfig = {
      val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisterAnimationConfig]
    }
    
    extension [Self <: RegisterAnimationConfig](x: Self) {
      
      inline def setAnimation(value: AnimationType): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationVarargs(value: (js.Array[Double] | (Record[String, Any]))*): Self = StObject.set(x, "animation", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPresets(value: PartialPresetsConfig): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      inline def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
    }
  }
}
