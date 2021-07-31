package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigurationRevisionRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies an MSK configuration and all of its revisions.
    
    */
  var Arn: string
  
  /**
    * 
    A string that uniquely identifies a revision of an MSK configuration.
    
    */
  var Revision: long
}
object DescribeConfigurationRevisionRequest {
  
  @scala.inline
  def apply(Arn: string, Revision: long): DescribeConfigurationRevisionRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Revision = Revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationRevisionRequest]
  }
  
  @scala.inline
  implicit class DescribeConfigurationRevisionRequestMutableBuilder[Self <: DescribeConfigurationRevisionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: long): Self = StObject.set(x, "Revision", value.asInstanceOf[js.Any])
  }
}
