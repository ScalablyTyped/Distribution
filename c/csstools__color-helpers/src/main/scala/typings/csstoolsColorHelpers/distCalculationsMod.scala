package typings.csstoolsColorHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCalculationsMod {
  
  @JSImport("@csstools/color-helpers/dist/calculations", JSImport.Namespace)
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
  
  inline def contrast(
    RGB1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any,
    RGB2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("contrast")(RGB1.asInstanceOf[js.Any], RGB2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def deltaEOK(
    reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any,
    sample: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Color */ Any
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("deltaEOK")(reference.asInstanceOf[js.Any], sample.asInstanceOf[js.Any])).asInstanceOf[Double]
  
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
  
  inline def multiplyMatrices(a: js.Array[js.Array[Double] | Double], b: js.Array[js.Array[Double] | Double]): js.Array[js.Array[Double] | Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyMatrices")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double] | Double]]
}
