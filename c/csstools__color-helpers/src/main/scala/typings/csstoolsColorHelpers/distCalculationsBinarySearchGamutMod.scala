package typings.csstoolsColorHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCalculationsBinarySearchGamutMod {
  
  @JSImport("@csstools/color-helpers/dist/calculations/binary-search-gamut", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def binarySearchGamut(
    startOKLCH: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any,
    toDestination: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ /* x */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ],
    fromDestination: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ /* x */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearchGamut")(startOKLCH.asInstanceOf[js.Any], toDestination.asInstanceOf[js.Any], fromDestination.asInstanceOf[js.Any])).asInstanceOf[Any]
}
