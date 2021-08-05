package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadJobRequest extends StObject {
  
  /**
    * The identifier of the job for which you want to get detailed information.
    */
  var Id: typings.awsSdk.elastictranscoderMod.Id
}
object ReadJobRequest {
  
  inline def apply(Id: Id): ReadJobRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadJobRequest]
  }
  
  extension [Self <: ReadJobRequest](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
