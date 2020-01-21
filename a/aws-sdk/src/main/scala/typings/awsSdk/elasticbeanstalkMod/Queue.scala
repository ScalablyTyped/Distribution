package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queue extends js.Object {
  /**
    * The name of the queue.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The URL of the queue.
    */
  var URL: js.UndefOr[String] = js.native
}

object Queue {
  @scala.inline
  def apply(Name: String = null, URL: String = null): Queue = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (URL != null) __obj.updateDynamic("URL")(URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Queue]
  }
}

