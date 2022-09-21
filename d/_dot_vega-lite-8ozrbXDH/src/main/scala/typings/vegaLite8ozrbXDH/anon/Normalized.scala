package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.specBaseDTsMod.LayoutSizeMixins
import typings.vegaLite8ozrbXDH.specIndexDTsMod.NormalizedSpec
import typings.vegaLite8ozrbXDH.toplevelDTsMod.TopLevel
import typings.vegaTypings.specMod.Spec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Normalized extends StObject {
  
  var normalized: TopLevel[NormalizedSpec] & LayoutSizeMixins
  
  var spec: Spec
}
object Normalized {
  
  inline def apply(normalized: TopLevel[NormalizedSpec] & LayoutSizeMixins, spec: Spec): Normalized = {
    val __obj = js.Dynamic.literal(normalized = normalized.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[Normalized]
  }
  
  extension [Self <: Normalized](x: Self) {
    
    inline def setNormalized(value: TopLevel[NormalizedSpec] & LayoutSizeMixins): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: Spec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
  }
}
