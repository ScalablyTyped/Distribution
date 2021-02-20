package typings.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityUsage extends StObject {
  
  /**
    * Total data storage for this identity.
    */
  var DataStorage: js.UndefOr[Long] = js.native
  
  /**
    * Number of datasets for the identity.
    */
  var DatasetCount: js.UndefOr[Integer] = js.native
  
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityId: js.UndefOr[typings.awsSdk.cognitosyncMod.IdentityId] = js.native
  
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: js.UndefOr[typings.awsSdk.cognitosyncMod.IdentityPoolId] = js.native
  
  /**
    * Date on which the identity was last modified.
    */
  var LastModifiedDate: js.UndefOr[Date] = js.native
}
object IdentityUsage {
  
  @scala.inline
  def apply(): IdentityUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityUsage]
  }
  
  @scala.inline
  implicit class IdentityUsageMutableBuilder[Self <: IdentityUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataStorage(value: Long): Self = StObject.set(x, "DataStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataStorageUndefined: Self = StObject.set(x, "DataStorage", js.undefined)
    
    @scala.inline
    def setDatasetCount(value: Integer): Self = StObject.set(x, "DatasetCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetCountUndefined: Self = StObject.set(x, "DatasetCount", js.undefined)
    
    @scala.inline
    def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
  }
}
