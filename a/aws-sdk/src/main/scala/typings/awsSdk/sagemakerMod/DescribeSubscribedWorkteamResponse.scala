package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSubscribedWorkteamResponse extends StObject {
  
  /**
    * A Workteam instance that contains information about the work team.
    */
  var SubscribedWorkteam: typings.awsSdk.sagemakerMod.SubscribedWorkteam
}
object DescribeSubscribedWorkteamResponse {
  
  @scala.inline
  def apply(SubscribedWorkteam: SubscribedWorkteam): DescribeSubscribedWorkteamResponse = {
    val __obj = js.Dynamic.literal(SubscribedWorkteam = SubscribedWorkteam.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSubscribedWorkteamResponse]
  }
  
  @scala.inline
  implicit class DescribeSubscribedWorkteamResponseMutableBuilder[Self <: DescribeSubscribedWorkteamResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscribedWorkteam(value: SubscribedWorkteam): Self = StObject.set(x, "SubscribedWorkteam", value.asInstanceOf[js.Any])
  }
}
