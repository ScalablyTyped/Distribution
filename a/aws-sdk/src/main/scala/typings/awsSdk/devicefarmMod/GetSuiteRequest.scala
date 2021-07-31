package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSuiteRequest extends StObject {
  
  /**
    * The suite's ARN.
    */
  var arn: AmazonResourceName
}
object GetSuiteRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): GetSuiteRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSuiteRequest]
  }
  
  @scala.inline
  implicit class GetSuiteRequestMutableBuilder[Self <: GetSuiteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
