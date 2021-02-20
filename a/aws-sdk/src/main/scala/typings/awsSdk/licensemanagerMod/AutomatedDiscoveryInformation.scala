package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomatedDiscoveryInformation extends StObject {
  
  /**
    * Time that automated discovery last ran.
    */
  var LastRunTime: js.UndefOr[DateTime] = js.native
}
object AutomatedDiscoveryInformation {
  
  @scala.inline
  def apply(): AutomatedDiscoveryInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomatedDiscoveryInformation]
  }
  
  @scala.inline
  implicit class AutomatedDiscoveryInformationMutableBuilder[Self <: AutomatedDiscoveryInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastRunTime(value: DateTime): Self = StObject.set(x, "LastRunTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRunTimeUndefined: Self = StObject.set(x, "LastRunTime", js.undefined)
  }
}
