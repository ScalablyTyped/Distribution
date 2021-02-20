package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputConfig extends StObject {
  
  /**
    * The name of the bucket your output will go to.
    */
  var S3Bucket: typings.awsSdk.textractMod.S3Bucket = js.native
  
  /**
    * The prefix of the object key that the output will be saved to. When not enabled, the prefix will be “textract_output".
    */
  var S3Prefix: js.UndefOr[S3ObjectName] = js.native
}
object OutputConfig {
  
  @scala.inline
  def apply(S3Bucket: S3Bucket): OutputConfig = {
    val __obj = js.Dynamic.literal(S3Bucket = S3Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputConfig]
  }
  
  @scala.inline
  implicit class OutputConfigMutableBuilder[Self <: OutputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Prefix(value: S3ObjectName): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
  }
}
