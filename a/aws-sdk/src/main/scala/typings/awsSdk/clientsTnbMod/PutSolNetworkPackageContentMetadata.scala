package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSolNetworkPackageContentMetadata extends StObject {
  
  var nsd: js.UndefOr[NetworkArtifactMeta] = js.undefined
}
object PutSolNetworkPackageContentMetadata {
  
  inline def apply(): PutSolNetworkPackageContentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSolNetworkPackageContentMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutSolNetworkPackageContentMetadata] (val x: Self) extends AnyVal {
    
    inline def setNsd(value: NetworkArtifactMeta): Self = StObject.set(x, "nsd", value.asInstanceOf[js.Any])
    
    inline def setNsdUndefined: Self = StObject.set(x, "nsd", js.undefined)
  }
}
