package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParallelDataResponse extends StObject {
  
  /**
    * The name of the parallel data resource that is being deleted.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The status of the parallel data deletion.
    */
  var Status: js.UndefOr[ParallelDataStatus] = js.undefined
}
object DeleteParallelDataResponse {
  
  inline def apply(): DeleteParallelDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteParallelDataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParallelDataResponse] (val x: Self) extends AnyVal {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: ParallelDataStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
