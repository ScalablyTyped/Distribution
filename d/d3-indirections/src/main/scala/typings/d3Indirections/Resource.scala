package typings.d3Indirections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource used by d3, such as a video or audio clip.
  */
@js.native
trait Resource[T /* <: ResourceType */] extends StObject {
  
  /** The name of the resource displayed in d3. */
  var name: String = js.native
  
  /** THe underlying d3 system filepath of the resource. */
  var path: String = js.native
  
  /** The type of resource. */
  var `type`: T = js.native
  
  /** Unique identifier for the resource. */
  var uid: String = js.native
}
object Resource {
  
  @scala.inline
  def apply[T /* <: ResourceType */](name: String, path: String, `type`: T, uid: String): Resource[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource[T]]
  }
  
  @scala.inline
  implicit class ResourceMutableBuilder[Self <: Resource[_], T /* <: ResourceType */] (val x: Self with Resource[T]) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
