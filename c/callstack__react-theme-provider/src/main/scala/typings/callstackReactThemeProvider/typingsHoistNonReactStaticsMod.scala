package typings.callstackReactThemeProvider

import org.scalablytyped.runtime.StringDictionary
import typings.callstackReactThemeProvider.callstackReactThemeProviderBooleans.`true`
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsHoistNonReactStaticsMod {
  
  inline def apply[T /* <: ComponentType[Any] */, S /* <: ComponentType[Any] */, C /* <: StringDictionary[`true`] */](TargetComponent: T, SourceComponent: S): T & (NonReactStatics[S, C]) = (^.asInstanceOf[js.Dynamic].apply(TargetComponent.asInstanceOf[js.Any], SourceComponent.asInstanceOf[js.Any])).asInstanceOf[T & (NonReactStatics[S, C])]
  inline def apply[T /* <: ComponentType[Any] */, S /* <: ComponentType[Any] */, C /* <: StringDictionary[`true`] */](TargetComponent: T, SourceComponent: S, customStatic: C): T & (NonReactStatics[S, C]) = (^.asInstanceOf[js.Dynamic].apply(TargetComponent.asInstanceOf[js.Any], SourceComponent.asInstanceOf[js.Any], customStatic.asInstanceOf[js.Any])).asInstanceOf[T & (NonReactStatics[S, C])]
  
  @JSImport("@callstack/react-theme-provider/typings/hoist-non-react-statics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FORWARD_REF_STATICS extends StObject {
    
    @JSName("$$typeof")
    var DollarDollartypeof: `true`
    
    var defaultProps: `true`
    
    var displayName: `true`
    
    var propTypes: `true`
    
    var render: `true`
  }
  object FORWARD_REF_STATICS {
    
    inline def apply(): FORWARD_REF_STATICS = {
      val __obj = js.Dynamic.literal(defaultProps = true, displayName = true, propTypes = true, render = true)
      __obj.updateDynamic("$$typeof")(true)
      __obj.asInstanceOf[FORWARD_REF_STATICS]
    }
    
    extension [Self <: FORWARD_REF_STATICS](x: Self) {
      
      inline def setDefaultProps(value: `true`): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: `true`): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDollarDollartypeof(value: `true`): Self = StObject.set(x, "$$typeof", value.asInstanceOf[js.Any])
      
      inline def setPropTypes(value: `true`): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
      
      inline def setRender(value: `true`): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    }
  }
  
  trait KNOWN_STATICS extends StObject {
    
    var arguments: `true`
    
    var arity: `true`
    
    var callee: `true`
    
    var caller: `true`
    
    var length: `true`
    
    var name: `true`
  }
  object KNOWN_STATICS {
    
    inline def apply(): KNOWN_STATICS = {
      val __obj = js.Dynamic.literal(arguments = true, arity = true, callee = true, caller = true, length = true, name = true)
      __obj.asInstanceOf[KNOWN_STATICS]
    }
    
    extension [Self <: KNOWN_STATICS](x: Self) {
      
      inline def setArguments(value: `true`): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArity(value: `true`): Self = StObject.set(x, "arity", value.asInstanceOf[js.Any])
      
      inline def setCallee(value: `true`): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
      
      inline def setCaller(value: `true`): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
      
      inline def setLength(value: `true`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setName(value: `true`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MEMO_STATICS extends StObject {
    
    @JSName("$$typeof")
    var DollarDollartypeof: `true`
    
    var compare: `true`
    
    var defaultProps: `true`
    
    var displayName: `true`
    
    var propTypes: `true`
    
    var `type`: `true`
  }
  object MEMO_STATICS {
    
    inline def apply(): MEMO_STATICS = {
      val __obj = js.Dynamic.literal(compare = true, defaultProps = true, displayName = true, propTypes = true)
      __obj.updateDynamic("$$typeof")(true)
      __obj.updateDynamic("type")(true)
      __obj.asInstanceOf[MEMO_STATICS]
    }
    
    extension [Self <: MEMO_STATICS](x: Self) {
      
      inline def setCompare(value: `true`): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
      
      inline def setDefaultProps(value: `true`): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: `true`): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDollarDollartypeof(value: `true`): Self = StObject.set(x, "$$typeof", value.asInstanceOf[js.Any])
      
      inline def setPropTypes(value: `true`): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
      
      inline def setType(value: `true`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {[ key in std.Exclude<keyof S, S extends react.react.MemoExoticComponent<any>? '$$typeof' | 'compare' | 'defaultProps' | 'displayName' | 'propTypes' | 'type' | keyof C : S extends react.react.ForwardRefExoticComponent<any>? '$$typeof' | 'render' | 'defaultProps' | 'displayName' | 'propTypes' | keyof C : 'childContextTypes' | 'contextType' | 'contextTypes' | 'defaultProps' | 'displayName' | 'getDefaultProps' | 'getDerivedStateFromError' | 'getDerivedStateFromProps' | 'mixins' | 'propTypes' | 'type' | 'name' | 'length' | 'prototype' | 'caller' | 'callee' | 'arguments' | 'arity' | keyof C> ]: S[key]}
    }}}
    */
  type NonReactStatics[S /* <: ComponentType[Any] */, C /* <: StringDictionary[`true`] */] = S
  
  trait REACT_STATICS extends StObject {
    
    var childContextTypes: `true`
    
    var contextType: `true`
    
    var contextTypes: `true`
    
    var defaultProps: `true`
    
    var displayName: `true`
    
    var getDefaultProps: `true`
    
    var getDerivedStateFromError: `true`
    
    var getDerivedStateFromProps: `true`
    
    var mixins: `true`
    
    var propTypes: `true`
    
    var `type`: `true`
  }
  object REACT_STATICS {
    
    inline def apply(): REACT_STATICS = {
      val __obj = js.Dynamic.literal(childContextTypes = true, contextType = true, contextTypes = true, defaultProps = true, displayName = true, getDefaultProps = true, getDerivedStateFromError = true, getDerivedStateFromProps = true, mixins = true, propTypes = true)
      __obj.updateDynamic("type")(true)
      __obj.asInstanceOf[REACT_STATICS]
    }
    
    extension [Self <: REACT_STATICS](x: Self) {
      
      inline def setChildContextTypes(value: `true`): Self = StObject.set(x, "childContextTypes", value.asInstanceOf[js.Any])
      
      inline def setContextType(value: `true`): Self = StObject.set(x, "contextType", value.asInstanceOf[js.Any])
      
      inline def setContextTypes(value: `true`): Self = StObject.set(x, "contextTypes", value.asInstanceOf[js.Any])
      
      inline def setDefaultProps(value: `true`): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: `true`): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setGetDefaultProps(value: `true`): Self = StObject.set(x, "getDefaultProps", value.asInstanceOf[js.Any])
      
      inline def setGetDerivedStateFromError(value: `true`): Self = StObject.set(x, "getDerivedStateFromError", value.asInstanceOf[js.Any])
      
      inline def setGetDerivedStateFromProps(value: `true`): Self = StObject.set(x, "getDerivedStateFromProps", value.asInstanceOf[js.Any])
      
      inline def setMixins(value: `true`): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      inline def setPropTypes(value: `true`): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
      
      inline def setType(value: `true`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
