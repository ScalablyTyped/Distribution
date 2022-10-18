package typings.csstoolsPostcssCascadeLayers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAdjustSelectorSpecificityMod {
  
  @JSImport("@csstools/postcss-cascade-layers/dist/adjust-selector-specificity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adjustSelectorSpecificity(selector: String, amount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("adjustSelectorSpecificity")(selector.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[String]
}
