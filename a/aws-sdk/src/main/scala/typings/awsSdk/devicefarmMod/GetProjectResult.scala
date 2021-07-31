package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProjectResult extends StObject {
  
  /**
    * The project to get information about.
    */
  var project: js.UndefOr[Project] = js.undefined
}
object GetProjectResult {
  
  @scala.inline
  def apply(): GetProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProjectResult]
  }
  
  @scala.inline
  implicit class GetProjectResultMutableBuilder[Self <: GetProjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProject(value: Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
