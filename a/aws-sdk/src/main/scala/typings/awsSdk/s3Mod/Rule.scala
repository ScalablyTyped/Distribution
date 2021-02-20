package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rule extends StObject {
  
  var AbortIncompleteMultipartUpload: js.UndefOr[typings.awsSdk.s3Mod.AbortIncompleteMultipartUpload] = js.native
  
  /**
    * Specifies the expiration for the lifecycle of the object.
    */
  var Expiration: js.UndefOr[LifecycleExpiration] = js.native
  
  /**
    * Unique identifier for the rule. The value can't be longer than 255 characters.
    */
  var ID: js.UndefOr[typings.awsSdk.s3Mod.ID] = js.native
  
  var NoncurrentVersionExpiration: js.UndefOr[typings.awsSdk.s3Mod.NoncurrentVersionExpiration] = js.native
  
  var NoncurrentVersionTransition: js.UndefOr[typings.awsSdk.s3Mod.NoncurrentVersionTransition] = js.native
  
  /**
    * Object key prefix that identifies one or more objects to which this rule applies.
    */
  var Prefix: typings.awsSdk.s3Mod.Prefix = js.native
  
  /**
    * If Enabled, the rule is currently being applied. If Disabled, the rule is not currently being applied.
    */
  var Status: ExpirationStatus = js.native
  
  /**
    * Specifies when an object transitions to a specified storage class. For more information about Amazon S3 lifecycle configuration rules, see Transitioning Objects Using Amazon S3 Lifecycle in the Amazon Simple Storage Service Developer Guide.
    */
  var Transition: js.UndefOr[typings.awsSdk.s3Mod.Transition] = js.native
}
object Rule {
  
  @scala.inline
  def apply(Prefix: Prefix, Status: ExpirationStatus): Rule = {
    val __obj = js.Dynamic.literal(Prefix = Prefix.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbortIncompleteMultipartUpload(value: AbortIncompleteMultipartUpload): Self = StObject.set(x, "AbortIncompleteMultipartUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortIncompleteMultipartUploadUndefined: Self = StObject.set(x, "AbortIncompleteMultipartUpload", js.undefined)
    
    @scala.inline
    def setExpiration(value: LifecycleExpiration): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
    
    @scala.inline
    def setID(value: ID): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
    
    @scala.inline
    def setNoncurrentVersionExpiration(value: NoncurrentVersionExpiration): Self = StObject.set(x, "NoncurrentVersionExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoncurrentVersionExpirationUndefined: Self = StObject.set(x, "NoncurrentVersionExpiration", js.undefined)
    
    @scala.inline
    def setNoncurrentVersionTransition(value: NoncurrentVersionTransition): Self = StObject.set(x, "NoncurrentVersionTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoncurrentVersionTransitionUndefined: Self = StObject.set(x, "NoncurrentVersionTransition", js.undefined)
    
    @scala.inline
    def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ExpirationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransition(value: Transition): Self = StObject.set(x, "Transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "Transition", js.undefined)
  }
}
