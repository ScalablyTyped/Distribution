package typings.csstoolsColorHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCalculationsMapGamutMod {
  
  @JSImport("@csstools/color-helpers/dist/calculations/map-gamut", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mapGamut(
    startOKLCH: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any,
    toDestination: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ /* x */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ],
    fromDestination: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ /* x */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mapGamut")(startOKLCH.asInstanceOf[js.Any], toDestination.asInstanceOf[js.Any], fromDestination.asInstanceOf[js.Any])).asInstanceOf[Any]
}
