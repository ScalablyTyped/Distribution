package typings.d3Indirections

import typings.d3Indirections.anon.ResourceIndex
import typings.d3Indirections.anon.ResourceUid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Any type of indirection, received from a GET request.
  */
/* Rewritten from type alias, can be one of: 
  - typings.d3Indirections.ManualIndirection
  - typings.d3Indirections.ListIndirection
*/
trait Indirection extends js.Object
object Indirection {
  
  @scala.inline
  def ManualIndirection(manualIndirection: ResourceUid, name: String, resourceType: ResourceType, uid: String): Indirection = {
    val __obj = js.Dynamic.literal(manualIndirection = manualIndirection.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indirection]
  }
  
  @scala.inline
  def ListIndirection(listIndirection: ResourceIndex, name: String, resourceType: ResourceType, uid: String): Indirection = {
    val __obj = js.Dynamic.literal(listIndirection = listIndirection.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indirection]
  }
}
