package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkteamResponse extends StObject {
  
  /**
    * A Workteam instance that contains information about the work team. 
    */
  var Workteam: typings.awsSdk.sagemakerMod.Workteam
}
object DescribeWorkteamResponse {
  
  @scala.inline
  def apply(Workteam: Workteam): DescribeWorkteamResponse = {
    val __obj = js.Dynamic.literal(Workteam = Workteam.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkteamResponse]
  }
  
  @scala.inline
  implicit class DescribeWorkteamResponseMutableBuilder[Self <: DescribeWorkteamResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkteam(value: Workteam): Self = StObject.set(x, "Workteam", value.asInstanceOf[js.Any])
  }
}
