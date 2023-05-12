package typings.csstoolsPostcssCascadeLayers

import typings.csstoolsPostcssCascadeLayers.csstoolsPostcssCascadeLayersBooleans.`false`
import typings.csstoolsPostcssCascadeLayers.csstoolsPostcssCascadeLayersStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOptionsMod {
  
  trait pluginOptions extends StObject {
    
    /** Emit a warning when conditional rules could change the layer order. default: "warn" */
    var onConditionalRulesChangingLayerOrder: js.UndefOr[warn | `false`] = js.undefined
    
    /** Emit a warning when "layer" is used in "@import". default: "warn" */
    var onImportLayerRule: js.UndefOr[warn | `false`] = js.undefined
    
    /** Emit a warning when the "revert" keyword is found in your CSS. default: "warn" */
    var onRevertLayerKeyword: js.UndefOr[warn | `false`] = js.undefined
  }
  object pluginOptions {
    
    inline def apply(): pluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[pluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: pluginOptions] (val x: Self) extends AnyVal {
      
      inline def setOnConditionalRulesChangingLayerOrder(value: warn | `false`): Self = StObject.set(x, "onConditionalRulesChangingLayerOrder", value.asInstanceOf[js.Any])
      
      inline def setOnConditionalRulesChangingLayerOrderUndefined: Self = StObject.set(x, "onConditionalRulesChangingLayerOrder", js.undefined)
      
      inline def setOnImportLayerRule(value: warn | `false`): Self = StObject.set(x, "onImportLayerRule", value.asInstanceOf[js.Any])
      
      inline def setOnImportLayerRuleUndefined: Self = StObject.set(x, "onImportLayerRule", js.undefined)
      
      inline def setOnRevertLayerKeyword(value: warn | `false`): Self = StObject.set(x, "onRevertLayerKeyword", value.asInstanceOf[js.Any])
      
      inline def setOnRevertLayerKeywordUndefined: Self = StObject.set(x, "onRevertLayerKeyword", js.undefined)
    }
  }
}
