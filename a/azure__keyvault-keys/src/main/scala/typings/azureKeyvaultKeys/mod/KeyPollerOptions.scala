package typings.azureKeyvaultKeys.mod

import typings.azureCoreClient.mod.OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyPollerOptions
  extends StObject
     with OperationOptions {
  
  /**
    * Time between each polling
    */
  var intervalInMs: js.UndefOr[Double] = js.undefined
  
  /**
    * A serialized poller, used to resume an existing operation
    */
  var resumeFrom: js.UndefOr[String] = js.undefined
}
object KeyPollerOptions {
  
  inline def apply(): KeyPollerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyPollerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyPollerOptions] (val x: Self) extends AnyVal {
    
    inline def setIntervalInMs(value: Double): Self = StObject.set(x, "intervalInMs", value.asInstanceOf[js.Any])
    
    inline def setIntervalInMsUndefined: Self = StObject.set(x, "intervalInMs", js.undefined)
    
    inline def setResumeFrom(value: String): Self = StObject.set(x, "resumeFrom", value.asInstanceOf[js.Any])
    
    inline def setResumeFromUndefined: Self = StObject.set(x, "resumeFrom", js.undefined)
  }
}
