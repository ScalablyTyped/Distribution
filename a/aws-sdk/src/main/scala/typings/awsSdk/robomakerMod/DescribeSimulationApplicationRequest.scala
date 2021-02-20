package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSimulationApplicationRequest extends StObject {
  
  /**
    * The application information for the simulation application.
    */
  var application: Arn = js.native
  
  /**
    * The version of the simulation application to describe.
    */
  var applicationVersion: js.UndefOr[Version] = js.native
}
object DescribeSimulationApplicationRequest {
  
  @scala.inline
  def apply(application: Arn): DescribeSimulationApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSimulationApplicationRequest]
  }
  
  @scala.inline
  implicit class DescribeSimulationApplicationRequestMutableBuilder[Self <: DescribeSimulationApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Arn): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersion(value: Version): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersionUndefined: Self = StObject.set(x, "applicationVersion", js.undefined)
  }
}
