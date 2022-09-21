package typings.babelPluginReactHtmlAttrs

import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.backwards
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.forwards
import typings.babelPluginReactHtmlAttrs.mod.ExoticComponent
import typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor
import typings.babelPluginReactHtmlAttrs.mod.ReactElement
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalMod {
  
  /* augmented module */
  object babelPluginReactHtmlAttrsAugmentingMod {
    
    @JSImport("babel-plugin-react-html-attrs", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babel-plugin-react-html-attrs", "SuspenseList")
    @js.native
    val SuspenseList: ExoticComponent[SuspenseListProps] = js.native
    
    inline def unstableWithSuspenseConfig(scope: js.Function0[js.UndefOr[Unit]], config: js.UndefOr[SuspenseConfig | Null]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_withSuspenseConfig")(scope.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def useDeferredValue[T](value: T, config: js.UndefOr[TimeoutConfig | Null]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useDeferredValue")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def useTransition(config: js.UndefOr[SuspenseConfig | Null]): js.Tuple2[TransitionStartFunction, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(config.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TransitionStartFunction, Boolean]]
    
    trait DirectionalSuspenseListProps
      extends StObject
         with SuspenseListCommonProps
         with typings.babelPluginReactHtmlAttrs.mod.SuspenseListProps
         with SuspenseListProps {
      
      /**
        * Defines the order in which the `SuspenseList` children should be revealed.
        */
      var revealOrder: forwards | backwards
      
      /**
        * Dictates how unloaded items in a SuspenseList is shown.
        *
        * - By default, `SuspenseList` will show all fallbacks in the list.
        * - `collapsed` shows only the next fallback in the list.
        * - `hidden` doesn’t show any unloaded items.
        */
      var tail: js.UndefOr[SuspenseListTailMode] = js.undefined
    }
    object DirectionalSuspenseListProps {
      
      inline def apply(
        children: (ReactElement[Any, String | JSXElementConstructor[Any]]) | (js.Iterable[ReactElement[Any, String | JSXElementConstructor[Any]]]),
        revealOrder: forwards | backwards
      ): DirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
        __obj.asInstanceOf[DirectionalSuspenseListProps]
      }
      
      extension [Self <: DirectionalSuspenseListProps](x: Self) {
        
        inline def setRevealOrder(value: forwards | backwards): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
        
        inline def setTail(value: SuspenseListTailMode): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
        
        inline def setTailUndefined: Self = StObject.set(x, "tail", js.undefined)
      }
    }
    
    trait NonDirectionalSuspenseListProps
      extends StObject
         with SuspenseListCommonProps
         with typings.babelPluginReactHtmlAttrs.mod.SuspenseListProps
         with SuspenseListProps {
      
      /**
        * Defines the order in which the `SuspenseList` children should be revealed.
        */
      var revealOrder: js.UndefOr[Exclude[SuspenseListRevealOrder, forwards | backwards]] = js.undefined
      
      /**
        * The tail property is invalid when not using the `forwards` or `backwards` reveal orders.
        */
      var tail: js.UndefOr[scala.Nothing] = js.undefined
    }
    object NonDirectionalSuspenseListProps {
      
      inline def apply(
        children: (ReactElement[Any, String | JSXElementConstructor[Any]]) | (js.Iterable[ReactElement[Any, String | JSXElementConstructor[Any]]])
      ): NonDirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[NonDirectionalSuspenseListProps]
      }
      
      extension [Self <: NonDirectionalSuspenseListProps](x: Self) {
        
        inline def setRevealOrder(value: Exclude[SuspenseListRevealOrder, forwards | backwards]): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
        
        inline def setRevealOrderUndefined: Self = StObject.set(x, "revealOrder", js.undefined)
      }
    }
    
    trait SuspenseConfig
      extends StObject
         with TimeoutConfig {
      
      var busyDelayMs: js.UndefOr[Double] = js.undefined
      
      var busyMinDurationMs: js.UndefOr[Double] = js.undefined
    }
    object SuspenseConfig {
      
      inline def apply(timeoutMs: Double): SuspenseConfig = {
        val __obj = js.Dynamic.literal(timeoutMs = timeoutMs.asInstanceOf[js.Any])
        __obj.asInstanceOf[SuspenseConfig]
      }
      
      extension [Self <: SuspenseConfig](x: Self) {
        
        inline def setBusyDelayMs(value: Double): Self = StObject.set(x, "busyDelayMs", value.asInstanceOf[js.Any])
        
        inline def setBusyDelayMsUndefined: Self = StObject.set(x, "busyDelayMs", js.undefined)
        
        inline def setBusyMinDurationMs(value: Double): Self = StObject.set(x, "busyMinDurationMs", value.asInstanceOf[js.Any])
        
        inline def setBusyMinDurationMsUndefined: Self = StObject.set(x, "busyMinDurationMs", js.undefined)
      }
    }
    
    trait SuspenseListCommonProps extends StObject {
      
      /**
        * Note that SuspenseList require more than one child;
        * it is a runtime warning to provide only a single child.
        *
        * It does, however, allow those children to be wrapped inside a single
        * level of `<React.Fragment>`.
        */
      var children: (ReactElement[Any, String | JSXElementConstructor[Any]]) | (js.Iterable[ReactElement[Any, String | JSXElementConstructor[Any]]])
    }
    object SuspenseListCommonProps {
      
      inline def apply(
        children: (ReactElement[Any, String | JSXElementConstructor[Any]]) | (js.Iterable[ReactElement[Any, String | JSXElementConstructor[Any]]])
      ): SuspenseListCommonProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[SuspenseListCommonProps]
      }
      
      extension [Self <: SuspenseListCommonProps](x: Self) {
        
        inline def setChildren(
          value: (ReactElement[Any, String | JSXElementConstructor[Any]]) | (js.Iterable[ReactElement[Any, String | JSXElementConstructor[Any]]])
        ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.DirectionalSuspenseListProps
      - typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.NonDirectionalSuspenseListProps
    */
    trait SuspenseListProps extends StObject
    object SuspenseListProps {
      
      inline def DirectionalSuspenseListProps(
        children: (ReactElement[Any, String | JSXElementConstructor[Any]]) | (js.Iterable[ReactElement[Any, String | JSXElementConstructor[Any]]]),
        revealOrder: forwards | backwards
      ): typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.DirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.DirectionalSuspenseListProps]
      }
      
      inline def NonDirectionalSuspenseListProps(
        children: (ReactElement[Any, String | JSXElementConstructor[Any]]) | (js.Iterable[ReactElement[Any, String | JSXElementConstructor[Any]]])
      ): typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.NonDirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.NonDirectionalSuspenseListProps]
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.forwards
      - typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.backwards
      - typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.together
    */
    trait SuspenseListRevealOrder extends StObject
    object SuspenseListRevealOrder {
      
      inline def backwards: typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.backwards = "backwards".asInstanceOf[typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.backwards]
      
      inline def forwards: typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.forwards = "forwards".asInstanceOf[typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.forwards]
      
      inline def together: typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.together = "together".asInstanceOf[typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.together]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.collapsed
      - typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.hidden
    */
    trait SuspenseListTailMode extends StObject
    object SuspenseListTailMode {
      
      inline def collapsed: typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.collapsed = "collapsed".asInstanceOf[typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.collapsed]
      
      inline def hidden: typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.hidden = "hidden".asInstanceOf[typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.hidden]
    }
    
    trait TimeoutConfig extends StObject {
      
      /**
        * This timeout (in milliseconds) tells React how long to wait before showing the next state.
        *
        * React will always try to use a shorter lag when network and device allows it.
        *
        * **NOTE: We recommend that you share Suspense Config between different modules.**
        */
      var timeoutMs: Double
    }
    object TimeoutConfig {
      
      inline def apply(timeoutMs: Double): TimeoutConfig = {
        val __obj = js.Dynamic.literal(timeoutMs = timeoutMs.asInstanceOf[js.Any])
        __obj.asInstanceOf[TimeoutConfig]
      }
      
      extension [Self <: TimeoutConfig](x: Self) {
        
        inline def setTimeoutMs(value: Double): Self = StObject.set(x, "timeoutMs", value.asInstanceOf[js.Any])
      }
    }
    
    type TransitionFunction = js.Function0[js.UndefOr[Unit]]
    
    type TransitionStartFunction = js.Function1[/* callback */ TransitionFunction, Unit]
  }
}
