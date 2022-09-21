package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Destination extends StObject {
  
  /**
    * The name of the bucket in which Evidently stores evaluation events.
    */
  var bucket: js.UndefOr[S3BucketSafeName] = js.undefined
  
  /**
    * The bucket prefix in which Evidently stores evaluation events.
    */
  var prefix: js.UndefOr[S3PrefixSafeName] = js.undefined
}
object S3Destination {
  
  inline def apply(): S3Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Destination]
  }
  
  extension [Self <: S3Destination](x: Self) {
    
    inline def setBucket(value: S3BucketSafeName): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setPrefix(value: S3PrefixSafeName): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
