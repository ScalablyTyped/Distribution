package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProjectRequest extends StObject {
  
  /**
    * Sets the execution timeout value (in minutes) for a project. All test runs in this project use the specified execution timeout value unless overridden when scheduling a run.
    */
  var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.native
  
  /**
    * The project's name.
    */
  var name: Name = js.native
}
object CreateProjectRequest {
  
  @scala.inline
  def apply(name: Name): CreateProjectRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectRequest]
  }
  
  @scala.inline
  implicit class CreateProjectRequestMutableBuilder[Self <: CreateProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultJobTimeoutMinutes(value: JobTimeoutMinutes): Self = StObject.set(x, "defaultJobTimeoutMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultJobTimeoutMinutesUndefined: Self = StObject.set(x, "defaultJobTimeoutMinutes", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
