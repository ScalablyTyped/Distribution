package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketLifecycleConfiguration extends StObject {
  
  /**
    * A lifecycle rule for individual objects in an Amazon S3 bucket.
    */
  var Rules: LifecycleRules
}
object BucketLifecycleConfiguration {
  
  inline def apply(Rules: LifecycleRules): BucketLifecycleConfiguration = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleConfiguration]
  }
  
  extension [Self <: BucketLifecycleConfiguration](x: Self) {
    
    inline def setRules(value: LifecycleRules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: LifecycleRule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
