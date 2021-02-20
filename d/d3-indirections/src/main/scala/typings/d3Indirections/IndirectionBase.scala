package typings.d3Indirections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base class for all indirections. Should not be used directly.
  *
  * Indirections are controlled by an Indirection Controller. When
  * an indirection is changed, all indirections controlled by the
  * same indirection controller will also be affected.
  */
@js.native
trait IndirectionBase extends StObject {
  
  /** The display name of this indirection. */
  var name: String = js.native
  
  /** The type of resource the indirection controller is associated with. */
  var resourceType: ResourceType = js.native
  
  /** Unique identifier for this indirection. */
  var uid: String = js.native
}
object IndirectionBase {
  
  @scala.inline
  def apply(name: String, resourceType: ResourceType, uid: String): IndirectionBase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndirectionBase]
  }
  
  @scala.inline
  implicit class IndirectionBaseMutableBuilder[Self <: IndirectionBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
