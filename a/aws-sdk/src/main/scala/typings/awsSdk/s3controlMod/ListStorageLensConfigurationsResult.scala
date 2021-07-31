package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStorageLensConfigurationsResult extends StObject {
  
  /**
    * If the request produced more than the maximum number of S3 Storage Lens configuration results, you can pass this value into a subsequent request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[ContinuationToken] = js.undefined
  
  /**
    * A list of S3 Storage Lens configurations.
    */
  var StorageLensConfigurationList: js.UndefOr[typings.awsSdk.s3controlMod.StorageLensConfigurationList] = js.undefined
}
object ListStorageLensConfigurationsResult {
  
  @scala.inline
  def apply(): ListStorageLensConfigurationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStorageLensConfigurationsResult]
  }
  
  @scala.inline
  implicit class ListStorageLensConfigurationsResultMutableBuilder[Self <: ListStorageLensConfigurationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: ContinuationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStorageLensConfigurationList(value: StorageLensConfigurationList): Self = StObject.set(x, "StorageLensConfigurationList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageLensConfigurationListUndefined: Self = StObject.set(x, "StorageLensConfigurationList", js.undefined)
    
    @scala.inline
    def setStorageLensConfigurationListVarargs(value: ListStorageLensConfigurationEntry*): Self = StObject.set(x, "StorageLensConfigurationList", js.Array(value :_*))
  }
}
