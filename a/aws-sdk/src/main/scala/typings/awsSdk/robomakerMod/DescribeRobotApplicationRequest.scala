package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRobotApplicationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the robot application.
    */
  var application: Arn
  
  /**
    * The version of the robot application to describe.
    */
  var applicationVersion: js.UndefOr[Version] = js.undefined
}
object DescribeRobotApplicationRequest {
  
  @scala.inline
  def apply(application: Arn): DescribeRobotApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRobotApplicationRequest]
  }
  
  @scala.inline
  implicit class DescribeRobotApplicationRequestMutableBuilder[Self <: DescribeRobotApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Arn): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersion(value: Version): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersionUndefined: Self = StObject.set(x, "applicationVersion", js.undefined)
  }
}
