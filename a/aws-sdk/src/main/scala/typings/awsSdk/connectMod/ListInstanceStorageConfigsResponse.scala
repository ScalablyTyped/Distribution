package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstanceStorageConfigsResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.undefined
  
  /**
    * A valid storage type.
    */
  var StorageConfigs: js.UndefOr[InstanceStorageConfigs] = js.undefined
}
object ListInstanceStorageConfigsResponse {
  
  @scala.inline
  def apply(): ListInstanceStorageConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstanceStorageConfigsResponse]
  }
  
  @scala.inline
  implicit class ListInstanceStorageConfigsResponseMutableBuilder[Self <: ListInstanceStorageConfigsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStorageConfigs(value: InstanceStorageConfigs): Self = StObject.set(x, "StorageConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageConfigsUndefined: Self = StObject.set(x, "StorageConfigs", js.undefined)
    
    @scala.inline
    def setStorageConfigsVarargs(value: InstanceStorageConfig*): Self = StObject.set(x, "StorageConfigs", js.Array(value :_*))
  }
}
