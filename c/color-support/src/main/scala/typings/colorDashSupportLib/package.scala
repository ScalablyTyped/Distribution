package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object colorDashSupportLib {
  type ColorSupport = js.Function2[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ColorSupportOptions */ /* options */ js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ColorSupportOptions */ js.Any
    ], 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ColorSupportResult */ /* obj */ js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ColorSupportResult */ js.Any
    ], 
    colorDashSupportLib.colorDashSupportLibNumbers.`false` | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ColorSupportResult */ js.Any)
  ]
  type ColorSupportLevel = colorDashSupportLib.colorDashSupportLibNumbers.`0` | colorDashSupportLib.colorDashSupportLibNumbers.`1` | colorDashSupportLib.colorDashSupportLibNumbers.`2` | colorDashSupportLib.colorDashSupportLibNumbers.`3`
}
