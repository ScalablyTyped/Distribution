package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceResult extends StObject {
  
  /**
    * An array of key-value pairs containing information about the specified instance.
    */
  var instance: js.UndefOr[Instance] = js.undefined
}
object GetInstanceResult {
  
  @scala.inline
  def apply(): GetInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceResult]
  }
  
  @scala.inline
  implicit class GetInstanceResultMutableBuilder[Self <: GetInstanceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
  }
}
