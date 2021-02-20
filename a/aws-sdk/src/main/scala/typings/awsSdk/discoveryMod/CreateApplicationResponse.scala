package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApplicationResponse extends StObject {
  
  /**
    * Configuration ID of an application to be created.
    */
  var configurationId: js.UndefOr[String] = js.native
}
object CreateApplicationResponse {
  
  @scala.inline
  def apply(): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApplicationResponse]
  }
  
  @scala.inline
  implicit class CreateApplicationResponseMutableBuilder[Self <: CreateApplicationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationId(value: String): Self = StObject.set(x, "configurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationIdUndefined: Self = StObject.set(x, "configurationId", js.undefined)
  }
}
