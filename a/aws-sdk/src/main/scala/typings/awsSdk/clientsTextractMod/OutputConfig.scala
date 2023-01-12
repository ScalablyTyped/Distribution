package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputConfig extends StObject {
  
  /**
    * The name of the bucket your output will go to.
    */
  var S3Bucket: typings.awsSdk.clientsTextractMod.S3Bucket
  
  /**
    * The prefix of the object key that the output will be saved to. When not enabled, the prefix will be “textract_output".
    */
  var S3Prefix: js.UndefOr[S3ObjectName] = js.undefined
}
object OutputConfig {
  
  inline def apply(S3Bucket: S3Bucket): OutputConfig = {
    val __obj = js.Dynamic.literal(S3Bucket = S3Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputConfig] (val x: Self) extends AnyVal {
    
    inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3Prefix(value: S3ObjectName): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
    
    inline def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
  }
}
