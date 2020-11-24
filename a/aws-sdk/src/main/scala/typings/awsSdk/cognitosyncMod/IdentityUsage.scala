package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityUsage extends js.Object {
  
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
  implicit class IdentityUsageOps[Self <: IdentityUsage] (val x: Self) extends AnyVal {
    
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
    def setDatasetCount(value: Integer): Self = this.set("DatasetCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetCount: Self = this.set("DatasetCount", js.undefined)
    
    @scala.inline
    def setIdentityId(value: IdentityId): Self = this.set("IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityId: Self = this.set("IdentityId", js.undefined)
    
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = this.set("IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityPoolId: Self = this.set("IdentityPoolId", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: Date): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
  }
}
