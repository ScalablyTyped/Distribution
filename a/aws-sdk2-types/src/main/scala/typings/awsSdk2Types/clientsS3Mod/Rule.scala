package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule extends StObject {
  
  var AbortIncompleteMultipartUpload: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.AbortIncompleteMultipartUpload] = js.undefined
  
  /**
    * Specifies the expiration for the lifecycle of the object.
    */
  var Expiration: js.UndefOr[LifecycleExpiration] = js.undefined
  
  /**
    * Unique identifier for the rule. The value can't be longer than 255 characters.
    */
  var ID: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.ID] = js.undefined
  
  var NoncurrentVersionExpiration: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.NoncurrentVersionExpiration] = js.undefined
  
  var NoncurrentVersionTransition: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.NoncurrentVersionTransition] = js.undefined
  
  /**
    * Object key prefix that identifies one or more objects to which this rule applies.  Replacement must be made for object keys containing special characters (such as carriage returns) when using XML requests. For more information, see  XML related object key constraints. 
    */
  var Prefix: typings.awsSdk2Types.clientsS3Mod.Prefix
  
  /**
    * If Enabled, the rule is currently being applied. If Disabled, the rule is not currently being applied.
    */
  var Status: ExpirationStatus
  
  /**
    * Specifies when an object transitions to a specified storage class. For more information about Amazon S3 lifecycle configuration rules, see Transitioning Objects Using Amazon S3 Lifecycle in the Amazon S3 User Guide.
    */
  var Transition: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.Transition] = js.undefined
}
object Rule {
  
  inline def apply(Prefix: Prefix, Status: ExpirationStatus): Rule = {
    val __obj = js.Dynamic.literal(Prefix = Prefix.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    inline def setAbortIncompleteMultipartUpload(value: AbortIncompleteMultipartUpload): Self = StObject.set(x, "AbortIncompleteMultipartUpload", value.asInstanceOf[js.Any])
    
    inline def setAbortIncompleteMultipartUploadUndefined: Self = StObject.set(x, "AbortIncompleteMultipartUpload", js.undefined)
    
    inline def setExpiration(value: LifecycleExpiration): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
    
    inline def setID(value: ID): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
    
    inline def setNoncurrentVersionExpiration(value: NoncurrentVersionExpiration): Self = StObject.set(x, "NoncurrentVersionExpiration", value.asInstanceOf[js.Any])
    
    inline def setNoncurrentVersionExpirationUndefined: Self = StObject.set(x, "NoncurrentVersionExpiration", js.undefined)
    
    inline def setNoncurrentVersionTransition(value: NoncurrentVersionTransition): Self = StObject.set(x, "NoncurrentVersionTransition", value.asInstanceOf[js.Any])
    
    inline def setNoncurrentVersionTransitionUndefined: Self = StObject.set(x, "NoncurrentVersionTransition", js.undefined)
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ExpirationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTransition(value: Transition): Self = StObject.set(x, "Transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "Transition", js.undefined)
  }
}
