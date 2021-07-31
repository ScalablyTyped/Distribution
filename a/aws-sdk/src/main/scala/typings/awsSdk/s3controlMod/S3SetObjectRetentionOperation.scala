package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3SetObjectRetentionOperation extends StObject {
  
  /**
    * Indicates if the action should be applied to objects in the Batch Operations job even if they have Object Lock  GOVERNANCE type in place.
    */
  var BypassGovernanceRetention: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Contains the Object Lock retention mode to be applied to all objects in the Batch Operations job. For more information, see Using S3 Object Lock retention with S3 Batch Operations in the Amazon Simple Storage Service Developer Guide.
    */
  var Retention: S3Retention
}
object S3SetObjectRetentionOperation {
  
  @scala.inline
  def apply(Retention: S3Retention): S3SetObjectRetentionOperation = {
    val __obj = js.Dynamic.literal(Retention = Retention.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3SetObjectRetentionOperation]
  }
  
  @scala.inline
  implicit class S3SetObjectRetentionOperationMutableBuilder[Self <: S3SetObjectRetentionOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBypassGovernanceRetention(value: Boolean): Self = StObject.set(x, "BypassGovernanceRetention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassGovernanceRetentionUndefined: Self = StObject.set(x, "BypassGovernanceRetention", js.undefined)
    
    @scala.inline
    def setRetention(value: S3Retention): Self = StObject.set(x, "Retention", value.asInstanceOf[js.Any])
  }
}
