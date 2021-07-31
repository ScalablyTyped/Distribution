package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Destination extends StObject {
  
  /**
    * The S3 bucket that contains the updated firmware.
    */
  var bucket: js.UndefOr[S3Bucket] = js.undefined
  
  /**
    * The S3 prefix.
    */
  var prefix: js.UndefOr[Prefix] = js.undefined
}
object S3Destination {
  
  @scala.inline
  def apply(): S3Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Destination]
  }
  
  @scala.inline
  implicit class S3DestinationMutableBuilder[Self <: S3Destination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: S3Bucket): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    @scala.inline
    def setPrefix(value: Prefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
