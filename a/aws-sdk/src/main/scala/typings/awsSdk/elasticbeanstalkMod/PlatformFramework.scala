package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformFramework extends js.Object {
  /**
    * The name of the framework.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The version of the framework.
    */
  var Version: js.UndefOr[String] = js.native
}

object PlatformFramework {
  @scala.inline
  def apply(Name: String = null, Version: String = null): PlatformFramework = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformFramework]
  }
}

