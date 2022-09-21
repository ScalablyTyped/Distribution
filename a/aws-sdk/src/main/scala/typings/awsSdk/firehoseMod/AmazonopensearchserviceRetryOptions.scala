package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmazonopensearchserviceRetryOptions extends StObject {
  
  var DurationInSeconds: js.UndefOr[AmazonopensearchserviceRetryDurationInSeconds] = js.undefined
}
object AmazonopensearchserviceRetryOptions {
  
  inline def apply(): AmazonopensearchserviceRetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmazonopensearchserviceRetryOptions]
  }
  
  extension [Self <: AmazonopensearchserviceRetryOptions](x: Self) {
    
    inline def setDurationInSeconds(value: AmazonopensearchserviceRetryDurationInSeconds): Self = StObject.set(x, "DurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationInSecondsUndefined: Self = StObject.set(x, "DurationInSeconds", js.undefined)
  }
}
