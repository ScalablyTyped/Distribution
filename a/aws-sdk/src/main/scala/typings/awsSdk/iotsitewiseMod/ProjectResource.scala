package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectResource extends StObject {
  
  /**
    * The ID of the project.
    */
  var id: ID = js.native
}
object ProjectResource {
  
  @scala.inline
  def apply(id: ID): ProjectResource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectResource]
  }
  
  @scala.inline
  implicit class ProjectResourceMutableBuilder[Self <: ProjectResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
