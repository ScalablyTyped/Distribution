package typings.csstoolsColorHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCalculationsContrastMod {
  
  @JSImport("@csstools/color-helpers/dist/calculations/contrast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def contrast(
    RGB1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any,
    RGB2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("contrast")(RGB1.asInstanceOf[js.Any], RGB2.asInstanceOf[js.Any])).asInstanceOf[Double]
}
