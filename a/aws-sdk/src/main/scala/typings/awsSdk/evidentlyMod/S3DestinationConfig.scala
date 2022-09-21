package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3DestinationConfig extends StObject {
  
  /**
    * The name of the bucket in which Evidently stores evaluation events.
    */
  var bucket: js.UndefOr[S3BucketSafeName] = js.undefined
  
  /**
    * The bucket prefix in which Evidently stores evaluation events.
    */
  var prefix: js.UndefOr[S3PrefixSafeName] = js.undefined
}
object S3DestinationConfig {
  
  inline def apply(): S3DestinationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3DestinationConfig]
  }
  
  extension [Self <: S3DestinationConfig](x: Self) {
    
    inline def setBucket(value: S3BucketSafeName): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setPrefix(value: S3PrefixSafeName): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
