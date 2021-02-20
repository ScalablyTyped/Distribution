package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateApplicationInput extends StObject {
  
  /**
    * The current name of the application you want to change.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.native
  
  /**
    * The new name to give the application.
    */
  var newApplicationName: js.UndefOr[ApplicationName] = js.native
}
object UpdateApplicationInput {
  
  @scala.inline
  def apply(): UpdateApplicationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateApplicationInput]
  }
  
  @scala.inline
  implicit class UpdateApplicationInputMutableBuilder[Self <: UpdateApplicationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    @scala.inline
    def setNewApplicationName(value: ApplicationName): Self = StObject.set(x, "newApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewApplicationNameUndefined: Self = StObject.set(x, "newApplicationName", js.undefined)
  }
}
