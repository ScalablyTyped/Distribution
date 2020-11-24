package typings.awsSdkClientS3Browser.typesLifecycleRuleMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Disabled
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Enabled
import typings.awsSdkClientS3Browser.typesAbortIncompleteMultipartUploadMod.AbortIncompleteMultipartUpload
import typings.awsSdkClientS3Browser.typesLifecycleExpirationMod.LifecycleExpiration
import typings.awsSdkClientS3Browser.typesLifecycleRuleFilterMod.LifecycleRuleFilter
import typings.awsSdkClientS3Browser.typesNoncurrentVersionExpirationMod.NoncurrentVersionExpiration
import typings.awsSdkClientS3Browser.typesNoncurrentVersionTransitionMod.NoncurrentVersionTransition
import typings.awsSdkClientS3Browser.typesTransitionMod.Transition
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecycleRule extends js.Object {
  
  /**
    * <p>Specifies the days since the initiation of an Incomplete Multipart Upload that Lifecycle will wait before permanently removing all parts of the upload.</p>
    */
  var AbortIncompleteMultipartUpload: js.UndefOr[
    typings.awsSdkClientS3Browser.typesAbortIncompleteMultipartUploadMod.AbortIncompleteMultipartUpload
  ] = js.native
  
  /**
    * _LifecycleExpiration shape
    */
  var Expiration: js.UndefOr[LifecycleExpiration] = js.native
  
  /**
    * <p>The Filter is used to identify objects that a Lifecycle Rule applies to. A Filter must have exactly one of Prefix, Tag, or And specified.</p>
    */
  var Filter: js.UndefOr[LifecycleRuleFilter] = js.native
  
  /**
    * <p>Unique identifier for the rule. The value cannot be longer than 255 characters.</p>
    */
  var ID: js.UndefOr[String] = js.native
  
  /**
    * <p>Specifies when noncurrent object versions expire. Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.</p>
    */
  var NoncurrentVersionExpiration: js.UndefOr[
    typings.awsSdkClientS3Browser.typesNoncurrentVersionExpirationMod.NoncurrentVersionExpiration
  ] = js.native
  
  /**
    * _NoncurrentVersionTransitionList shape
    */
  var NoncurrentVersionTransitions: js.UndefOr[js.Array[NoncurrentVersionTransition] | Iterable[NoncurrentVersionTransition]] = js.native
  
  /**
    * <p>Prefix identifying one or more objects to which the rule applies. This is deprecated; use Filter instead.</p>
    */
  var Prefix: js.UndefOr[String] = js.native
  
  /**
    * <p>If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.</p>
    */
  var Status: Enabled | Disabled | String = js.native
  
  /**
    * _TransitionList shape
    */
  var Transitions: js.UndefOr[js.Array[Transition] | Iterable[Transition]] = js.native
}
object LifecycleRule {
  
  @scala.inline
  def apply(Status: Enabled | Disabled | String): LifecycleRule = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleRule]
  }
  
  @scala.inline
  implicit class LifecycleRuleOps[Self <: LifecycleRule] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: Enabled | Disabled | String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortIncompleteMultipartUpload(value: AbortIncompleteMultipartUpload): Self = this.set("AbortIncompleteMultipartUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortIncompleteMultipartUpload: Self = this.set("AbortIncompleteMultipartUpload", js.undefined)
    
    @scala.inline
    def setExpiration(value: LifecycleExpiration): Self = this.set("Expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiration: Self = this.set("Expiration", js.undefined)
    
    @scala.inline
    def setFilter(value: LifecycleRuleFilter): Self = this.set("Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
    
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteID: Self = this.set("ID", js.undefined)
    
    @scala.inline
    def setNoncurrentVersionExpiration(value: NoncurrentVersionExpiration): Self = this.set("NoncurrentVersionExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoncurrentVersionExpiration: Self = this.set("NoncurrentVersionExpiration", js.undefined)
    
    @scala.inline
    def setNoncurrentVersionTransitionsVarargs(value: NoncurrentVersionTransition*): Self = this.set("NoncurrentVersionTransitions", js.Array(value :_*))
    
    @scala.inline
    def setNoncurrentVersionTransitions(value: js.Array[NoncurrentVersionTransition] | Iterable[NoncurrentVersionTransition]): Self = this.set("NoncurrentVersionTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoncurrentVersionTransitions: Self = this.set("NoncurrentVersionTransitions", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    
    @scala.inline
    def setTransitionsVarargs(value: Transition*): Self = this.set("Transitions", js.Array(value :_*))
    
    @scala.inline
    def setTransitions(value: js.Array[Transition] | Iterable[Transition]): Self = this.set("Transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitions: Self = this.set("Transitions", js.undefined)
  }
}
