package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopAutoMLJobRequest extends StObject {
  
  /**
    * The name of the object you are requesting.
    */
  var AutoMLJobName: typings.awsSdk.sagemakerMod.AutoMLJobName
}
object StopAutoMLJobRequest {
  
  inline def apply(AutoMLJobName: AutoMLJobName): StopAutoMLJobRequest = {
    val __obj = js.Dynamic.literal(AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopAutoMLJobRequest]
  }
  
  extension [Self <: StopAutoMLJobRequest](x: Self) {
    
    inline def setAutoMLJobName(value: AutoMLJobName): Self = StObject.set(x, "AutoMLJobName", value.asInstanceOf[js.Any])
  }
}
