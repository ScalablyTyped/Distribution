package typings.d3Indirections

import typings.d3Indirections.anon.ResourceUid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An indirection that can have a resource.
  */
@js.native
trait ManualIndirection
  extends IndirectionBase
     with Indirection {
  
  var manualIndirection: ResourceUid = js.native
}
object ManualIndirection {
  
  @scala.inline
  def apply(manualIndirection: ResourceUid, name: String, resourceType: ResourceType, uid: String): ManualIndirection = {
    val __obj = js.Dynamic.literal(manualIndirection = manualIndirection.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualIndirection]
  }
  
  @scala.inline
  implicit class ManualIndirectionMutableBuilder[Self <: ManualIndirection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManualIndirection(value: ResourceUid): Self = StObject.set(x, "manualIndirection", value.asInstanceOf[js.Any])
  }
}
