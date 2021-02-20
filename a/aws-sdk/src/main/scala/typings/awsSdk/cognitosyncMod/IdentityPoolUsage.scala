package typings.awsSdk.cognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityPoolUsage extends StObject {
  
  /**
    * Data storage information for the identity pool.
    */
  var DataStorage: js.UndefOr[Long] = js.native
  
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: js.UndefOr[typings.awsSdk.cognitosyncMod.IdentityPoolId] = js.native
  
  /**
    * Date on which the identity pool was last modified.
    */
  var LastModifiedDate: js.UndefOr[Date] = js.native
  
  /**
    * Number of sync sessions for the identity pool.
    */
  var SyncSessionsCount: js.UndefOr[Long] = js.native
}
object IdentityPoolUsage {
  
  @scala.inline
  def apply(): IdentityPoolUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityPoolUsage]
  }
  
  @scala.inline
  implicit class IdentityPoolUsageMutableBuilder[Self <: IdentityPoolUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataStorage(value: Long): Self = StObject.set(x, "DataStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataStorageUndefined: Self = StObject.set(x, "DataStorage", js.undefined)
    
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setSyncSessionsCount(value: Long): Self = StObject.set(x, "SyncSessionsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncSessionsCountUndefined: Self = StObject.set(x, "SyncSessionsCount", js.undefined)
  }
}
