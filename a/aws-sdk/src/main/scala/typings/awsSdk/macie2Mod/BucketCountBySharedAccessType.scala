package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketCountBySharedAccessType extends StObject {
  
  /**
    * The total number of buckets that are shared with an AWS account that isn't part of the same Amazon Macie organization.
    */
  var external: js.UndefOr[long] = js.native
  
  /**
    * The total number of buckets that are shared with an AWS account that's part of the same Amazon Macie organization.
    */
  var internal: js.UndefOr[long] = js.native
  
  /**
    * The total number of buckets that aren't shared with other AWS accounts.
    */
  var notShared: js.UndefOr[long] = js.native
  
  /**
    * The total number of buckets that Amazon Macie wasn't able to evaluate shared access settings for. Macie can't determine whether these buckets are shared with other AWS accounts.
    */
  var unknown: js.UndefOr[long] = js.native
}
object BucketCountBySharedAccessType {
  
  @scala.inline
  def apply(): BucketCountBySharedAccessType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketCountBySharedAccessType]
  }
  
  @scala.inline
  implicit class BucketCountBySharedAccessTypeMutableBuilder[Self <: BucketCountBySharedAccessType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternal(value: long): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
    
    @scala.inline
    def setInternal(value: long): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
    
    @scala.inline
    def setNotShared(value: long): Self = StObject.set(x, "notShared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotSharedUndefined: Self = StObject.set(x, "notShared", js.undefined)
    
    @scala.inline
    def setUnknown(value: long): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
  }
}
