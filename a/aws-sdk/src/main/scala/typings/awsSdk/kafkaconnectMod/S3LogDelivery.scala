package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3LogDelivery extends StObject {
  
  /**
    * The name of the S3 bucket that is the destination for log delivery.
    */
  var bucket: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies whether connector logs get sent to the specified Amazon S3 destination.
    */
  var enabled: boolean
  
  /**
    * The S3 prefix that is the destination for log delivery.
    */
  var prefix: js.UndefOr[string] = js.undefined
}
object S3LogDelivery {
  
  inline def apply(enabled: boolean): S3LogDelivery = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3LogDelivery]
  }
  
  extension [Self <: S3LogDelivery](x: Self) {
    
    inline def setBucket(value: string): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: string): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
