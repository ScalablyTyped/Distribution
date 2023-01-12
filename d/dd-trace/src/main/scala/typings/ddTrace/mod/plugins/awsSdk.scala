package typings.ddTrace.mod.plugins

import org.scalablytyped.runtime.StringDictionary
import typings.ddTrace.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [aws-sdk](https://github.com/aws/aws-sdk-js) module.
  */
trait awsSdk
  extends StObject
     with Instrumentation
     with /**
  * Configuration for individual services to enable/disable them. Message
  * queue services can also configure the producer and consumer individually
  * by passing an object with a `producer` and `consumer` properties. The
  * list of valid service keys is in the service-specific section of
  * https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/AWS/Config.html
  */
/* key */ StringDictionary[js.UndefOr[Boolean | js.Object]] {
  
  /**
    * Hooks to run before spans are finished.
    */
  var hooks: js.UndefOr[`1`] = js.undefined
  
  /**
    * Whether to add a suffix to the service name so that each AWS service has its own service name.
    * @default true
    */
  var splitByAwsService: js.UndefOr[Boolean] = js.undefined
}
object awsSdk {
  
  inline def apply(): awsSdk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[awsSdk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: awsSdk] (val x: Self) extends AnyVal {
    
    inline def setHooks(value: `1`): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setSplitByAwsService(value: Boolean): Self = StObject.set(x, "splitByAwsService", value.asInstanceOf[js.Any])
    
    inline def setSplitByAwsServiceUndefined: Self = StObject.set(x, "splitByAwsService", js.undefined)
  }
}
