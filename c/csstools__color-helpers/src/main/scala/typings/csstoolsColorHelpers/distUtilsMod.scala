package typings.csstoolsColorHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("@csstools/color-helpers/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clip(
    color: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("clip")(color.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def inGamut(
    x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inGamut")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
