package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAutoMLJobResponse extends StObject {
  
  /**
    * When a job is created, it is assigned a unique ARN.
    */
  var AutoMLJobArn: typings.awsSdk.sagemakerMod.AutoMLJobArn
}
object CreateAutoMLJobResponse {
  
  inline def apply(AutoMLJobArn: AutoMLJobArn): CreateAutoMLJobResponse = {
    val __obj = js.Dynamic.literal(AutoMLJobArn = AutoMLJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAutoMLJobResponse]
  }
  
  extension [Self <: CreateAutoMLJobResponse](x: Self) {
    
    inline def setAutoMLJobArn(value: AutoMLJobArn): Self = StObject.set(x, "AutoMLJobArn", value.asInstanceOf[js.Any])
  }
}
