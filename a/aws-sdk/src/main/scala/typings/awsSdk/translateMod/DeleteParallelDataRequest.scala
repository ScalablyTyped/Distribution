package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParallelDataRequest extends StObject {
  
  /**
    * The name of the parallel data resource that is being deleted.
    */
  var Name: ResourceName
}
object DeleteParallelDataRequest {
  
  inline def apply(Name: ResourceName): DeleteParallelDataRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParallelDataRequest]
  }
  
  extension [Self <: DeleteParallelDataRequest](x: Self) {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
