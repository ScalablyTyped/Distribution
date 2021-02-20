package typings.callstackReactThemeProvider

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.callstackReactThemeProvider.callstackReactThemeProviderBooleans.`true`
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hoistNonReactStaticsMod {
  
  @JSImport("@callstack/react-theme-provider/typings/hoist-non-react-statics", JSImport.Namespace)
  @js.native
  def apply[T /* <: ComponentType[_] */, S /* <: ComponentType[_] */, C /* <: StringDictionary[`true`] */](TargetComponent: T, SourceComponent: S): T with (NonReactStatics[S, C]) = js.native
  @JSImport("@callstack/react-theme-provider/typings/hoist-non-react-statics", JSImport.Namespace)
  @js.native
  def apply[T /* <: ComponentType[_] */, S /* <: ComponentType[_] */, C /* <: StringDictionary[`true`] */](TargetComponent: T, SourceComponent: S, customStatic: C): T with (NonReactStatics[S, C]) = js.native
  
  @js.native
  trait FORWARD_REF_STATICS extends StObject {
    
    @JSName("$$typeof")
    var DollarDollartypeof: `true` = js.native
    
    var defaultProps: `true` = js.native
    
    var displayName: `true` = js.native
    
    var propTypes: `true` = js.native
    
    var render: `true` = js.native
  }
  object FORWARD_REF_STATICS {
    
    @scala.inline
    def apply(
      DollarDollartypeof: `true`,
      defaultProps: `true`,
      displayName: `true`,
      propTypes: `true`,
      render: `true`
    ): FORWARD_REF_STATICS = {
      val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], propTypes = propTypes.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
      __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
      __obj.asInstanceOf[FORWARD_REF_STATICS]
    }
    
    @scala.inline
    implicit class FORWARD_REF_STATICSMutableBuilder[Self <: FORWARD_REF_STATICS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultProps(value: `true`): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: `true`): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDollarDollartypeof(value: `true`): Self = StObject.set(x, "$$typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropTypes(value: `true`): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender(value: `true`): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KNOWN_STATICS extends StObject {
    
    var arguments: `true` = js.native
    
    var arity: `true` = js.native
    
    var callee: `true` = js.native
    
    var caller: `true` = js.native
    
    var length: `true` = js.native
    
    var name: `true` = js.native
  }
  object KNOWN_STATICS {
    
    @scala.inline
    def apply(arguments: `true`, arity: `true`, callee: `true`, caller: `true`, length: `true`, name: `true`): KNOWN_STATICS = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], arity = arity.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], caller = caller.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[KNOWN_STATICS]
    }
    
    @scala.inline
    implicit class KNOWN_STATICSMutableBuilder[Self <: KNOWN_STATICS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: `true`): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArity(value: `true`): Self = StObject.set(x, "arity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallee(value: `true`): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaller(value: `true`): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: `true`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: `true`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MEMO_STATICS extends StObject {
    
    @JSName("$$typeof")
    var DollarDollartypeof: `true` = js.native
    
    var compare: `true` = js.native
    
    var defaultProps: `true` = js.native
    
    var displayName: `true` = js.native
    
    var propTypes: `true` = js.native
    
    var `type`: `true` = js.native
  }
  object MEMO_STATICS {
    
    @scala.inline
    def apply(
      DollarDollartypeof: `true`,
      compare: `true`,
      defaultProps: `true`,
      displayName: `true`,
      propTypes: `true`,
      `type`: `true`
    ): MEMO_STATICS = {
      val __obj = js.Dynamic.literal(compare = compare.asInstanceOf[js.Any], defaultProps = defaultProps.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], propTypes = propTypes.asInstanceOf[js.Any])
      __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MEMO_STATICS]
    }
    
    @scala.inline
    implicit class MEMO_STATICSMutableBuilder[Self <: MEMO_STATICS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompare(value: `true`): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultProps(value: `true`): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: `true`): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDollarDollartypeof(value: `true`): Self = StObject.set(x, "$$typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropTypes(value: `true`): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: `true`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type NonReactStatics[S /* <: ComponentType[_] */, C /* <: StringDictionary[`true`] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in std.Exclude<keyof S, S extends react.react.MemoExoticComponent<any>? '$$typeof' | 'compare' | 'defaultProps' | 'displayName' | 'propTypes' | 'type' | keyof C : S extends react.react.ForwardRefExoticComponent<any>? '$$typeof' | 'render' | 'defaultProps' | 'displayName' | 'propTypes' | keyof C : 'childContextTypes' | 'contextType' | 'contextTypes' | 'defaultProps' | 'displayName' | 'getDefaultProps' | 'getDerivedStateFromError' | 'getDerivedStateFromProps' | 'mixins' | 'propTypes' | 'type' | 'name' | 'length' | 'prototype' | 'caller' | 'callee' | 'arguments' | 'arity' | keyof C> ]: S[key]}
    */ typings.callstackReactThemeProvider.callstackReactThemeProviderStrings.NonReactStatics with TopLevel[S]
  
  @js.native
  trait REACT_STATICS extends StObject {
    
    var childContextTypes: `true` = js.native
    
    var contextType: `true` = js.native
    
    var contextTypes: `true` = js.native
    
    var defaultProps: `true` = js.native
    
    var displayName: `true` = js.native
    
    var getDefaultProps: `true` = js.native
    
    var getDerivedStateFromError: `true` = js.native
    
    var getDerivedStateFromProps: `true` = js.native
    
    var mixins: `true` = js.native
    
    var propTypes: `true` = js.native
    
    var `type`: `true` = js.native
  }
  object REACT_STATICS {
    
    @scala.inline
    def apply(
      childContextTypes: `true`,
      contextType: `true`,
      contextTypes: `true`,
      defaultProps: `true`,
      displayName: `true`,
      getDefaultProps: `true`,
      getDerivedStateFromError: `true`,
      getDerivedStateFromProps: `true`,
      mixins: `true`,
      propTypes: `true`,
      `type`: `true`
    ): REACT_STATICS = {
      val __obj = js.Dynamic.literal(childContextTypes = childContextTypes.asInstanceOf[js.Any], contextType = contextType.asInstanceOf[js.Any], contextTypes = contextTypes.asInstanceOf[js.Any], defaultProps = defaultProps.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], getDefaultProps = getDefaultProps.asInstanceOf[js.Any], getDerivedStateFromError = getDerivedStateFromError.asInstanceOf[js.Any], getDerivedStateFromProps = getDerivedStateFromProps.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], propTypes = propTypes.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[REACT_STATICS]
    }
    
    @scala.inline
    implicit class REACT_STATICSMutableBuilder[Self <: REACT_STATICS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildContextTypes(value: `true`): Self = StObject.set(x, "childContextTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextType(value: `true`): Self = StObject.set(x, "contextType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextTypes(value: `true`): Self = StObject.set(x, "contextTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultProps(value: `true`): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: `true`): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetDefaultProps(value: `true`): Self = StObject.set(x, "getDefaultProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetDerivedStateFromError(value: `true`): Self = StObject.set(x, "getDerivedStateFromError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetDerivedStateFromProps(value: `true`): Self = StObject.set(x, "getDerivedStateFromProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixins(value: `true`): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropTypes(value: `true`): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: `true`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
