package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParallelDataRequest extends StObject {
  
  /**
    * The name of the parallel data resource that is being retrieved.
    */
  var Name: ResourceName
}
object GetParallelDataRequest {
  
  inline def apply(Name: ResourceName): GetParallelDataRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParallelDataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParallelDataRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
