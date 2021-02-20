package typings.backlogJs.mod.Option.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchCustomFieldItemParams extends StObject {
  
  var name: String = js.native
}
object PatchCustomFieldItemParams {
  
  @scala.inline
  def apply(name: String): PatchCustomFieldItemParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchCustomFieldItemParams]
  }
  
  @scala.inline
  implicit class PatchCustomFieldItemParamsMutableBuilder[Self <: PatchCustomFieldItemParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
