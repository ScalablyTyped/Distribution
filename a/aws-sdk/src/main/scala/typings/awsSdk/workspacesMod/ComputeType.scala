package typings.awsSdk.workspacesMod

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
  
  extension [Self <: ComputeType](x: Self) {
    
    inline def setName(value: Compute): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
