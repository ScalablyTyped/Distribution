package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateProjectResult extends StObject {
  
  /**
    * The project to update.
    */
  var project: js.UndefOr[Project] = js.native
}
object UpdateProjectResult {
  
  @scala.inline
  def apply(): UpdateProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProjectResult]
  }
  
  @scala.inline
  implicit class UpdateProjectResultMutableBuilder[Self <: UpdateProjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProject(value: Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
