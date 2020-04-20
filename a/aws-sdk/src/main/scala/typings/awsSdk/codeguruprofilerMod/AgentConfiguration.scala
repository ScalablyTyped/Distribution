package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentConfiguration extends js.Object {
  /**
    * 
    */
  var periodInSeconds: Integer = js.native
  /**
    * 
    */
  var shouldProfile: Boolean = js.native
}

object AgentConfiguration {
  @scala.inline
  def apply(periodInSeconds: Integer, shouldProfile: Boolean): AgentConfiguration = {
    val __obj = js.Dynamic.literal(periodInSeconds = periodInSeconds.asInstanceOf[js.Any], shouldProfile = shouldProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentConfiguration]
  }
}

