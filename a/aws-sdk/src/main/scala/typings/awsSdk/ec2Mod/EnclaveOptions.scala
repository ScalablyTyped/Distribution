package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnclaveOptions extends StObject {
  
  /**
    * If this parameter is set to true, the instance is enabled for AWS Nitro Enclaves; otherwise, it is not enabled for AWS Nitro Enclaves.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}
object EnclaveOptions {
  
  @scala.inline
  def apply(): EnclaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnclaveOptions]
  }
  
  @scala.inline
  implicit class EnclaveOptionsMutableBuilder[Self <: EnclaveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
