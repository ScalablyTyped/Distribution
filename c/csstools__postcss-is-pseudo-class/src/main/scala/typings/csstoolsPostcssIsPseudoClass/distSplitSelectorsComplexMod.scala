package typings.csstoolsPostcssIsPseudoClass

import typings.csstoolsPostcssIsPseudoClass.anon.OnComplexSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSplitSelectorsComplexMod {
  
  @JSImport("@csstools/postcss-is-pseudo-class/dist/split-selectors/complex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    selectors: js.Array[String],
    pluginOptions: OnComplexSelector,
    warnOnComplexSelector: js.Function0[Unit],
    warnOnPseudoElements: js.Function0[Unit]
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selectors.asInstanceOf[js.Any], pluginOptions.asInstanceOf[js.Any], warnOnComplexSelector.asInstanceOf[js.Any], warnOnPseudoElements.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
