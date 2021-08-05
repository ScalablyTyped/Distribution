package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mixin[P, S]
  extends StObject
     with ComponentLifecycle[P, S, js.Any] {
  
  var childContextTypes: js.UndefOr[ValidationMap[js.Any]] = js.undefined
  
  var contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var getDefaultProps: js.UndefOr[js.Function0[P]] = js.undefined
  
  var getInitialState: js.UndefOr[js.Function0[S]] = js.undefined
  
  var mixins: js.UndefOr[js.Array[Mixin[P, S]]] = js.undefined
  
  var propTypes: js.UndefOr[ValidationMap[js.Any]] = js.undefined
  
  var statics: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}
object Mixin {
  
  inline def apply[P, S](): Mixin[P, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mixin[P, S]]
  }
  
  extension [Self <: Mixin[?, ?], P, S](x: Self & (Mixin[P, S])) {
    
    inline def setChildContextTypes(value: ValidationMap[js.Any]): Self = StObject.set(x, "childContextTypes", value.asInstanceOf[js.Any])
    
    inline def setChildContextTypesUndefined: Self = StObject.set(x, "childContextTypes", js.undefined)
    
    inline def setContextTypes(value: ValidationMap[js.Any]): Self = StObject.set(x, "contextTypes", value.asInstanceOf[js.Any])
    
    inline def setContextTypesUndefined: Self = StObject.set(x, "contextTypes", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGetDefaultProps(value: () => P): Self = StObject.set(x, "getDefaultProps", js.Any.fromFunction0(value))
    
    inline def setGetDefaultPropsUndefined: Self = StObject.set(x, "getDefaultProps", js.undefined)
    
    inline def setGetInitialState(value: () => S): Self = StObject.set(x, "getInitialState", js.Any.fromFunction0(value))
    
    inline def setGetInitialStateUndefined: Self = StObject.set(x, "getInitialState", js.undefined)
    
    inline def setMixins(value: js.Array[Mixin[P, S]]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
    
    inline def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
    
    inline def setMixinsVarargs(value: (Mixin[P, S])*): Self = StObject.set(x, "mixins", js.Array(value :_*))
    
    inline def setPropTypes(value: ValidationMap[js.Any]): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
    
    inline def setPropTypesUndefined: Self = StObject.set(x, "propTypes", js.undefined)
    
    inline def setStatics(value: StringDictionary[js.Any]): Self = StObject.set(x, "statics", value.asInstanceOf[js.Any])
    
    inline def setStaticsUndefined: Self = StObject.set(x, "statics", js.undefined)
  }
}
