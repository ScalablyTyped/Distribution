package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheAttributes extends StObject {
  
  /**
    * Refreshes a file share's cache by using Time To Live (TTL). TTL is the length of time since the last refresh after which access to the directory would cause the file gateway to first refresh that directory's contents from the Amazon S3 bucket. The TTL duration is in seconds. Valid Values: 300 to 2,592,000 seconds (5 minutes to 30 days)
    */
  var CacheStaleTimeoutInSeconds: js.UndefOr[typings.awsSdk.storagegatewayMod.CacheStaleTimeoutInSeconds] = js.undefined
}
object CacheAttributes {
  
  @scala.inline
  def apply(): CacheAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheAttributes]
  }
  
  @scala.inline
  implicit class CacheAttributesMutableBuilder[Self <: CacheAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheStaleTimeoutInSeconds(value: CacheStaleTimeoutInSeconds): Self = StObject.set(x, "CacheStaleTimeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheStaleTimeoutInSecondsUndefined: Self = StObject.set(x, "CacheStaleTimeoutInSeconds", js.undefined)
  }
}
