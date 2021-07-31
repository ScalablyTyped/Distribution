package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbClusterMember extends StObject {
  
  /**
    * The status of the DB cluster parameter group for this member of the DB cluster.
    */
  var DbClusterParameterGroupStatus: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The instance identifier for this member of the DB cluster.
    */
  var DbInstanceIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether the cluster member is the primary instance for the DB cluster.
    */
  var IsClusterWriter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the order in which an Aurora replica is promoted to the primary instance when the existing primary instance fails.
    */
  var PromotionTier: js.UndefOr[Integer] = js.undefined
}
object AwsRdsDbClusterMember {
  
  @scala.inline
  def apply(): AwsRdsDbClusterMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbClusterMember]
  }
  
  @scala.inline
  implicit class AwsRdsDbClusterMemberMutableBuilder[Self <: AwsRdsDbClusterMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDbClusterParameterGroupStatus(value: NonEmptyString): Self = StObject.set(x, "DbClusterParameterGroupStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbClusterParameterGroupStatusUndefined: Self = StObject.set(x, "DbClusterParameterGroupStatus", js.undefined)
    
    @scala.inline
    def setDbInstanceIdentifier(value: NonEmptyString): Self = StObject.set(x, "DbInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbInstanceIdentifierUndefined: Self = StObject.set(x, "DbInstanceIdentifier", js.undefined)
    
    @scala.inline
    def setIsClusterWriter(value: Boolean): Self = StObject.set(x, "IsClusterWriter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsClusterWriterUndefined: Self = StObject.set(x, "IsClusterWriter", js.undefined)
    
    @scala.inline
    def setPromotionTier(value: Integer): Self = StObject.set(x, "PromotionTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotionTierUndefined: Self = StObject.set(x, "PromotionTier", js.undefined)
  }
}
