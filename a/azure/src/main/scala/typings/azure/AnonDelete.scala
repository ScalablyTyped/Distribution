package typings.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelete extends js.Object {
  var Delete: Boolean
  var Read: Boolean
  var RetentionPolicy: AnonDays
  var Version: Double
  var Write: Boolean
}

object AnonDelete {
  @scala.inline
  def apply(Delete: Boolean, Read: Boolean, RetentionPolicy: AnonDays, Version: Double, Write: Boolean): AnonDelete = {
    val __obj = js.Dynamic.literal(Delete = Delete.asInstanceOf[js.Any], Read = Read.asInstanceOf[js.Any], RetentionPolicy = RetentionPolicy.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], Write = Write.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDelete]
  }
}

