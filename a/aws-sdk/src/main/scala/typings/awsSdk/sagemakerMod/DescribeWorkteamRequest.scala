package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeWorkteamRequest extends StObject {
  
  /**
    * The name of the work team to return a description of.
    */
  var WorkteamName: typings.awsSdk.sagemakerMod.WorkteamName = js.native
}
object DescribeWorkteamRequest {
  
  @scala.inline
  def apply(WorkteamName: WorkteamName): DescribeWorkteamRequest = {
    val __obj = js.Dynamic.literal(WorkteamName = WorkteamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkteamRequest]
  }
  
  @scala.inline
  implicit class DescribeWorkteamRequestMutableBuilder[Self <: DescribeWorkteamRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkteamName(value: WorkteamName): Self = StObject.set(x, "WorkteamName", value.asInstanceOf[js.Any])
  }
}
