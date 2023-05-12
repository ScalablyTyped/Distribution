package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSolNetworkPackageMetadata extends StObject {
  
  /**
    * The date that the resource was created.
    */
  var createdAt: js.Date
  
  /**
    * The date that the resource was last modified.
    */
  var lastModified: js.Date
  
  /**
    * Metadata related to the onboarded network service descriptor in the network package.
    */
  var nsd: js.UndefOr[NetworkArtifactMeta] = js.undefined
}
object GetSolNetworkPackageMetadata {
  
  inline def apply(createdAt: js.Date, lastModified: js.Date): GetSolNetworkPackageMetadata = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSolNetworkPackageMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSolNetworkPackageMetadata] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setNsd(value: NetworkArtifactMeta): Self = StObject.set(x, "nsd", value.asInstanceOf[js.Any])
    
    inline def setNsdUndefined: Self = StObject.set(x, "nsd", js.undefined)
  }
}
