package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartProjectSessionRequest extends StObject {
  
  /**
    * A value that, if true, enables you to take control of a session, even if a different client is currently accessing the project.
    */
  var AssumeControl: js.UndefOr[typings.awsSdk.databrewMod.AssumeControl] = js.native
  
  /**
    * The name of the project to act upon.
    */
  var Name: ProjectName = js.native
}
object StartProjectSessionRequest {
  
  @scala.inline
  def apply(Name: ProjectName): StartProjectSessionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartProjectSessionRequest]
  }
  
  @scala.inline
  implicit class StartProjectSessionRequestMutableBuilder[Self <: StartProjectSessionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssumeControl(value: AssumeControl): Self = StObject.set(x, "AssumeControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssumeControlUndefined: Self = StObject.set(x, "AssumeControl", js.undefined)
    
    @scala.inline
    def setName(value: ProjectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
