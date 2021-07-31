package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeToNodeEncryptionOptions extends StObject {
  
  /**
    * Specify true to enable node-to-node encryption.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object NodeToNodeEncryptionOptions {
  
  @scala.inline
  def apply(): NodeToNodeEncryptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeToNodeEncryptionOptions]
  }
  
  @scala.inline
  implicit class NodeToNodeEncryptionOptionsMutableBuilder[Self <: NodeToNodeEncryptionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
