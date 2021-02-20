package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3BucketOwner extends StObject {
  
  /**
    * The display name of the user who owns the bucket.
    */
  var displayName: js.UndefOr[string] = js.native
  
  /**
    * The AWS account ID for the user who owns the bucket.
    */
  var id: js.UndefOr[string] = js.native
}
object S3BucketOwner {
  
  @scala.inline
  def apply(): S3BucketOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3BucketOwner]
  }
  
  @scala.inline
  implicit class S3BucketOwnerMutableBuilder[Self <: S3BucketOwner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: string): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
