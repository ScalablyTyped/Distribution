package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemControl extends StObject {
  
  /**
    * The namespaced kernel parameter for which to set a value.
    */
  var namespace: js.UndefOr[String] = js.native
  
  /**
    * The value for the namespaced kernel parameter specified in namespace.
    */
  var value: js.UndefOr[String] = js.native
}
object SystemControl {
  
  @scala.inline
  def apply(): SystemControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemControl]
  }
  
  @scala.inline
  implicit class SystemControlMutableBuilder[Self <: SystemControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
