package typings.azure.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delete extends js.Object {
  var Delete: Boolean
  var Read: Boolean
  var RetentionPolicy: Days
  var Version: Double
  var Write: Boolean
}

object Delete {
  @scala.inline
  def apply(Delete: Boolean, Read: Boolean, RetentionPolicy: Days, Version: Double, Write: Boolean): Delete = {
    val __obj = js.Dynamic.literal(Delete = Delete.asInstanceOf[js.Any], Read = Read.asInstanceOf[js.Any], RetentionPolicy = RetentionPolicy.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], Write = Write.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
}

