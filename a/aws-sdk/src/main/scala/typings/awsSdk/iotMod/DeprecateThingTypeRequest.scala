package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeprecateThingTypeRequest extends StObject {
  
  /**
    * The name of the thing type to deprecate.
    */
  var thingTypeName: ThingTypeName = js.native
  
  /**
    * Whether to undeprecate a deprecated thing type. If true, the thing type will not be deprecated anymore and you can associate it with things.
    */
  var undoDeprecate: js.UndefOr[UndoDeprecate] = js.native
}
object DeprecateThingTypeRequest {
  
  @scala.inline
  def apply(thingTypeName: ThingTypeName): DeprecateThingTypeRequest = {
    val __obj = js.Dynamic.literal(thingTypeName = thingTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecateThingTypeRequest]
  }
  
  @scala.inline
  implicit class DeprecateThingTypeRequestMutableBuilder[Self <: DeprecateThingTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThingTypeName(value: ThingTypeName): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndoDeprecate(value: UndoDeprecate): Self = StObject.set(x, "undoDeprecate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndoDeprecateUndefined: Self = StObject.set(x, "undoDeprecate", js.undefined)
  }
}
