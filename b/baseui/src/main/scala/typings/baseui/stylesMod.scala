package typings.baseui

import typings.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesMod {
  
  @JSImport("baseui/styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expandBorderStyles(
    borderStyles: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Border */ js.Any
  ): StyleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("expandBorderStyles")(borderStyles.asInstanceOf[js.Any]).asInstanceOf[StyleObject]
}
