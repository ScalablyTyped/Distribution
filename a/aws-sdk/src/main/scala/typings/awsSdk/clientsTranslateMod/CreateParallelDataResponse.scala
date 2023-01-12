package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateParallelDataResponse extends StObject {
  
  /**
    * The custom name that you assigned to the parallel data resource.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The status of the parallel data resource. When the resource is ready for you to use, the status is ACTIVE.
    */
  var Status: js.UndefOr[ParallelDataStatus] = js.undefined
}
object CreateParallelDataResponse {
  
  inline def apply(): CreateParallelDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateParallelDataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateParallelDataResponse] (val x: Self) extends AnyVal {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: ParallelDataStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
