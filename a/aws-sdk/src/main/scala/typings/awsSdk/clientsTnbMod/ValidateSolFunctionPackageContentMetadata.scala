package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateSolFunctionPackageContentMetadata extends StObject {
  
  var vnfd: js.UndefOr[FunctionArtifactMeta] = js.undefined
}
object ValidateSolFunctionPackageContentMetadata {
  
  inline def apply(): ValidateSolFunctionPackageContentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateSolFunctionPackageContentMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidateSolFunctionPackageContentMetadata] (val x: Self) extends AnyVal {
    
    inline def setVnfd(value: FunctionArtifactMeta): Self = StObject.set(x, "vnfd", value.asInstanceOf[js.Any])
    
    inline def setVnfdUndefined: Self = StObject.set(x, "vnfd", js.undefined)
  }
}
