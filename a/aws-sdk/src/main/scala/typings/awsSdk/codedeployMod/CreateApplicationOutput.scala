package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApplicationOutput extends StObject {
  
  /**
    * A unique application ID.
    */
  var applicationId: js.UndefOr[ApplicationId] = js.native
}
object CreateApplicationOutput {
  
  @scala.inline
  def apply(): CreateApplicationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApplicationOutput]
  }
  
  @scala.inline
  implicit class CreateApplicationOutputMutableBuilder[Self <: CreateApplicationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: ApplicationId): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
  }
}
