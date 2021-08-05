package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectResource extends StObject {
  
  /**
    * The ID of the project.
    */
  var id: ID
}
object ProjectResource {
  
  inline def apply(id: ID): ProjectResource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectResource]
  }
  
  extension [Self <: ProjectResource](x: Self) {
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
