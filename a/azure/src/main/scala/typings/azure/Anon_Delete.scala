package typings.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delete extends js.Object {
  var Delete: Boolean
  var Read: Boolean
  var RetentionPolicy: Anon_Days
  var Version: Double
  var Write: Boolean
}

object Anon_Delete {
  @scala.inline
  def apply(Delete: Boolean, Read: Boolean, RetentionPolicy: Anon_Days, Version: Double, Write: Boolean): Anon_Delete = {
    val __obj = js.Dynamic.literal(Delete = Delete, Read = Read, RetentionPolicy = RetentionPolicy, Version = Version, Write = Write)
  
    __obj.asInstanceOf[Anon_Delete]
  }
}

