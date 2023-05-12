package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSolFunctionPackageContentMetadata extends StObject {
  
  var vnfd: js.UndefOr[FunctionArtifactMeta] = js.undefined
}
object PutSolFunctionPackageContentMetadata {
  
  inline def apply(): PutSolFunctionPackageContentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSolFunctionPackageContentMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutSolFunctionPackageContentMetadata] (val x: Self) extends AnyVal {
    
    inline def setVnfd(value: FunctionArtifactMeta): Self = StObject.set(x, "vnfd", value.asInstanceOf[js.Any])
    
    inline def setVnfdUndefined: Self = StObject.set(x, "vnfd", js.undefined)
  }
}
