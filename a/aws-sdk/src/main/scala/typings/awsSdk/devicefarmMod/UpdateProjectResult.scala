package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProjectResult extends StObject {
  
  /**
    * The project to update.
    */
  var project: js.UndefOr[Project] = js.undefined
}
object UpdateProjectResult {
  
  inline def apply(): UpdateProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProjectResult]
  }
  
  extension [Self <: UpdateProjectResult](x: Self) {
    
    inline def setProject(value: Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
