package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbClusterMember extends js.Object {
  
  /**
    * The status of the DB cluster parameter group for this member of the DB cluster.
    */
  var DbClusterParameterGroupStatus: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The instance identifier for this member of the DB cluster.
    */
  var DbInstanceIdentifier: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Whether the cluster member is the primary instance for the DB cluster.
    */
  var IsClusterWriter: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the order in which an Aurora replica is promoted to the primary instance when the existing primary instance fails.
    */
  var PromotionTier: js.UndefOr[Integer] = js.native
}
object AwsRdsDbClusterMember {
  
  @scala.inline
  def apply(): AwsRdsDbClusterMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbClusterMember]
  }
  
  @scala.inline
  implicit class AwsRdsDbClusterMemberOps[Self <: AwsRdsDbClusterMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDbClusterParameterGroupStatus(value: NonEmptyString): Self = this.set("DbClusterParameterGroupStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbClusterParameterGroupStatus: Self = this.set("DbClusterParameterGroupStatus", js.undefined)
    
    @scala.inline
    def setDbInstanceIdentifier(value: NonEmptyString): Self = this.set("DbInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbInstanceIdentifier: Self = this.set("DbInstanceIdentifier", js.undefined)
    
    @scala.inline
    def setIsClusterWriter(value: Boolean): Self = this.set("IsClusterWriter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsClusterWriter: Self = this.set("IsClusterWriter", js.undefined)
    
    @scala.inline
    def setPromotionTier(value: Integer): Self = this.set("PromotionTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotionTier: Self = this.set("PromotionTier", js.undefined)
  }
}
