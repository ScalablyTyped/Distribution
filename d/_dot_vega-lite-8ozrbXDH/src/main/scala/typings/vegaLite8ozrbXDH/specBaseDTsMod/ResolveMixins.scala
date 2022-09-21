package typings.vegaLite8ozrbXDH.specBaseDTsMod

import typings.vegaLite8ozrbXDH.resolveDotDTsMod.Resolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveMixins extends StObject {
  
  /**
    * Scale, axis, and legend resolutions for view composition specifications.
    */
  var resolve: js.UndefOr[Resolve] = js.undefined
}
object ResolveMixins {
  
  inline def apply(): ResolveMixins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveMixins]
  }
  
  extension [Self <: ResolveMixins](x: Self) {
    
    inline def setResolve(value: Resolve): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
  }
}
