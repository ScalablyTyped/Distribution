package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePartnerEventSourceResponse extends StObject {
  
  /**
    * The ARN of the event source.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the event source.
    */
  var Name: js.UndefOr[String] = js.undefined
}
object DescribePartnerEventSourceResponse {
  
  @scala.inline
  def apply(): DescribePartnerEventSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePartnerEventSourceResponse]
  }
  
  @scala.inline
  implicit class DescribePartnerEventSourceResponseMutableBuilder[Self <: DescribePartnerEventSourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
