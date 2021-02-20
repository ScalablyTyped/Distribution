package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceDetails extends StObject {
  
  /**
    * The Amazon EC2 instances that AWS recommends that you purchase.
    */
  var EC2InstanceDetails: js.UndefOr[typings.awsSdk.costexplorerMod.EC2InstanceDetails] = js.native
  
  /**
    * The Amazon ES instances that AWS recommends that you purchase.
    */
  var ESInstanceDetails: js.UndefOr[typings.awsSdk.costexplorerMod.ESInstanceDetails] = js.native
  
  /**
    * The ElastiCache instances that AWS recommends that you purchase.
    */
  var ElastiCacheInstanceDetails: js.UndefOr[typings.awsSdk.costexplorerMod.ElastiCacheInstanceDetails] = js.native
  
  /**
    * The Amazon RDS instances that AWS recommends that you purchase.
    */
  var RDSInstanceDetails: js.UndefOr[typings.awsSdk.costexplorerMod.RDSInstanceDetails] = js.native
  
  /**
    * The Amazon Redshift instances that AWS recommends that you purchase.
    */
  var RedshiftInstanceDetails: js.UndefOr[typings.awsSdk.costexplorerMod.RedshiftInstanceDetails] = js.native
}
object InstanceDetails {
  
  @scala.inline
  def apply(): InstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceDetails]
  }
  
  @scala.inline
  implicit class InstanceDetailsMutableBuilder[Self <: InstanceDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEC2InstanceDetails(value: EC2InstanceDetails): Self = StObject.set(x, "EC2InstanceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEC2InstanceDetailsUndefined: Self = StObject.set(x, "EC2InstanceDetails", js.undefined)
    
    @scala.inline
    def setESInstanceDetails(value: ESInstanceDetails): Self = StObject.set(x, "ESInstanceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setESInstanceDetailsUndefined: Self = StObject.set(x, "ESInstanceDetails", js.undefined)
    
    @scala.inline
    def setElastiCacheInstanceDetails(value: ElastiCacheInstanceDetails): Self = StObject.set(x, "ElastiCacheInstanceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElastiCacheInstanceDetailsUndefined: Self = StObject.set(x, "ElastiCacheInstanceDetails", js.undefined)
    
    @scala.inline
    def setRDSInstanceDetails(value: RDSInstanceDetails): Self = StObject.set(x, "RDSInstanceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRDSInstanceDetailsUndefined: Self = StObject.set(x, "RDSInstanceDetails", js.undefined)
    
    @scala.inline
    def setRedshiftInstanceDetails(value: RedshiftInstanceDetails): Self = StObject.set(x, "RedshiftInstanceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedshiftInstanceDetailsUndefined: Self = StObject.set(x, "RedshiftInstanceDetails", js.undefined)
  }
}
