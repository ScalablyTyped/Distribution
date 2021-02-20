package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3DestinationConfig extends StObject {
  
  /**
    * The name of the Amazon S3 bucket to use as the destination for an export job.
    */
  var bucket: js.UndefOr[DestinationBucket] = js.native
  
  /**
    * The Amazon S3 bucket prefix for an export job.
    */
  var keyPrefix: js.UndefOr[DestinationKeyPrefix] = js.native
}
object S3DestinationConfig {
  
  @scala.inline
  def apply(): S3DestinationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3DestinationConfig]
  }
  
  @scala.inline
  implicit class S3DestinationConfigMutableBuilder[Self <: S3DestinationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: DestinationBucket): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    @scala.inline
    def setKeyPrefix(value: DestinationKeyPrefix): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
  }
}
