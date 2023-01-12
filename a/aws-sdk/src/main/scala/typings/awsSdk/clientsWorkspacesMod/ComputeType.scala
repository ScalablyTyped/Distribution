package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeType extends StObject {
  
  /**
    * The compute type.
    */
  var Name: js.UndefOr[Compute] = js.undefined
}
object ComputeType {
  
  inline def apply(): ComputeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputeType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComputeType] (val x: Self) extends AnyVal {
    
    inline def setName(value: Compute): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
