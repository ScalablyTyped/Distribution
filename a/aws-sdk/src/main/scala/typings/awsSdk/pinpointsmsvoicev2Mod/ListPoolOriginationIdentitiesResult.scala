package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPoolOriginationIdentitiesResult extends StObject {
  
  /**
    * The token to be used for the next set of paginated results. If this field is empty then there are no more results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pinpointsmsvoicev2Mod.NextToken] = js.undefined
  
  /**
    * An array of any OriginationIdentityMetadata objects.
    */
  var OriginationIdentities: js.UndefOr[OriginationIdentityMetadataList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the pool.
    */
  var PoolArn: js.UndefOr[String] = js.undefined
  
  /**
    * The unique PoolId of the pool.
    */
  var PoolId: js.UndefOr[String] = js.undefined
}
object ListPoolOriginationIdentitiesResult {
  
  inline def apply(): ListPoolOriginationIdentitiesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPoolOriginationIdentitiesResult]
  }
  
  extension [Self <: ListPoolOriginationIdentitiesResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOriginationIdentities(value: OriginationIdentityMetadataList): Self = StObject.set(x, "OriginationIdentities", value.asInstanceOf[js.Any])
    
    inline def setOriginationIdentitiesUndefined: Self = StObject.set(x, "OriginationIdentities", js.undefined)
    
    inline def setOriginationIdentitiesVarargs(value: OriginationIdentityMetadata*): Self = StObject.set(x, "OriginationIdentities", js.Array(value*))
    
    inline def setPoolArn(value: String): Self = StObject.set(x, "PoolArn", value.asInstanceOf[js.Any])
    
    inline def setPoolArnUndefined: Self = StObject.set(x, "PoolArn", js.undefined)
    
    inline def setPoolId(value: String): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
    
    inline def setPoolIdUndefined: Self = StObject.set(x, "PoolId", js.undefined)
  }
}
