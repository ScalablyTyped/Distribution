package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOpsMetadataResult extends StObject {
  
  /**
    * OpsMetadata for an Application Manager application.
    */
  var Metadata: js.UndefOr[MetadataMap] = js.undefined
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.NextToken] = js.undefined
  
  /**
    * The resource ID of the Application Manager application.
    */
  var ResourceId: js.UndefOr[OpsMetadataResourceId] = js.undefined
}
object GetOpsMetadataResult {
  
  inline def apply(): GetOpsMetadataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpsMetadataResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetOpsMetadataResult] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: MetadataMap): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceId(value: OpsMetadataResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
  }
}
