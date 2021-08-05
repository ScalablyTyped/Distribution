package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectResult extends StObject {
  
  /**
    * The newly created project.
    */
  var project: js.UndefOr[Project] = js.undefined
}
object CreateProjectResult {
  
  inline def apply(): CreateProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProjectResult]
  }
  
  extension [Self <: CreateProjectResult](x: Self) {
    
    inline def setProject(value: Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
