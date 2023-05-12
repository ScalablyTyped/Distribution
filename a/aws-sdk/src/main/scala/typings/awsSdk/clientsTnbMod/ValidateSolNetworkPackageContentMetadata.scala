package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateSolNetworkPackageContentMetadata extends StObject {
  
  var nsd: js.UndefOr[NetworkArtifactMeta] = js.undefined
}
object ValidateSolNetworkPackageContentMetadata {
  
  inline def apply(): ValidateSolNetworkPackageContentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateSolNetworkPackageContentMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidateSolNetworkPackageContentMetadata] (val x: Self) extends AnyVal {
    
    inline def setNsd(value: NetworkArtifactMeta): Self = StObject.set(x, "nsd", value.asInstanceOf[js.Any])
    
    inline def setNsdUndefined: Self = StObject.set(x, "nsd", js.undefined)
  }
}
