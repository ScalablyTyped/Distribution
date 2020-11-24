package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityPoolUsage extends js.Object {
  
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
  implicit class IdentityPoolUsageOps[Self <: IdentityPoolUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataStorage(value: Long): Self = this.set("DataStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataStorage: Self = this.set("DataStorage", js.undefined)
    
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = this.set("IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityPoolId: Self = this.set("IdentityPoolId", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    
    @scala.inline
    def setSyncSessionsCount(value: Long): Self = this.set("SyncSessionsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncSessionsCount: Self = this.set("SyncSessionsCount", js.undefined)
  }
}
