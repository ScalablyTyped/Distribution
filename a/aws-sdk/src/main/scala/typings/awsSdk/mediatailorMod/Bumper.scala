package typings.awsSdk.mediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bumper extends js.Object {
  /**
    * The URL for the end bumper asset. 
    */
  var EndUrl: js.UndefOr[string] = js.native
  /**
    * The URL for the start bumper asset. 
    */
  var StartUrl: js.UndefOr[string] = js.native
}

object Bumper {
  @scala.inline
  def apply(EndUrl: string = null, StartUrl: string = null): Bumper = {
    val __obj = js.Dynamic.literal()
    if (EndUrl != null) __obj.updateDynamic("EndUrl")(EndUrl.asInstanceOf[js.Any])
    if (StartUrl != null) __obj.updateDynamic("StartUrl")(StartUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bumper]
  }
}

