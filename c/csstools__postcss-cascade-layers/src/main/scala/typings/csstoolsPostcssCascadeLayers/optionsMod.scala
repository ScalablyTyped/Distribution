package typings.csstoolsPostcssCascadeLayers

import typings.csstoolsPostcssCascadeLayers.csstoolsPostcssCascadeLayersBooleans.`false`
import typings.csstoolsPostcssCascadeLayers.csstoolsPostcssCascadeLayersStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  trait pluginOptions extends StObject {
    
    var onConditionalRulesChangingLayerOrder: warn | `false`
    
    var onImportLayerRule: warn | `false`
    
    var onRevertLayerKeyword: warn | `false`
  }
  object pluginOptions {
    
    inline def apply(
      onConditionalRulesChangingLayerOrder: warn | `false`,
      onImportLayerRule: warn | `false`,
      onRevertLayerKeyword: warn | `false`
    ): pluginOptions = {
      val __obj = js.Dynamic.literal(onConditionalRulesChangingLayerOrder = onConditionalRulesChangingLayerOrder.asInstanceOf[js.Any], onImportLayerRule = onImportLayerRule.asInstanceOf[js.Any], onRevertLayerKeyword = onRevertLayerKeyword.asInstanceOf[js.Any])
      __obj.asInstanceOf[pluginOptions]
    }
    
    extension [Self <: pluginOptions](x: Self) {
      
      inline def setOnConditionalRulesChangingLayerOrder(value: warn | `false`): Self = StObject.set(x, "onConditionalRulesChangingLayerOrder", value.asInstanceOf[js.Any])
      
      inline def setOnImportLayerRule(value: warn | `false`): Self = StObject.set(x, "onImportLayerRule", value.asInstanceOf[js.Any])
      
      inline def setOnRevertLayerKeyword(value: warn | `false`): Self = StObject.set(x, "onRevertLayerKeyword", value.asInstanceOf[js.Any])
    }
  }
}
