package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRunRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the run to delete.
    */
  var arn: AmazonResourceName
}
object DeleteRunRequest {
  
  inline def apply(arn: AmazonResourceName): DeleteRunRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRunRequest]
  }
  
  extension [Self <: DeleteRunRequest](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
