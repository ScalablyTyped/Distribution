package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Destination extends StObject {
  
  /**
    * Name of the S3 bucket.
    */
  var bucketName: js.UndefOr[BucketName] = js.undefined
  
  /**
    * An Amazon S3 prefix that you can use to limit responses to those that begin with the specified prefix.
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
    def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    @scala.inline
    def setPrefix(value: Prefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
