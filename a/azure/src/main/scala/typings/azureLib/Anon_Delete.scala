package typings
package azureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delete extends js.Object {
  var Delete: scala.Boolean
  var Read: scala.Boolean
  var RetentionPolicy: Anon_Days
  var Version: scala.Double
  var Write: scala.Boolean
}

object Anon_Delete {
  @scala.inline
  def apply(
    Delete: scala.Boolean,
    Read: scala.Boolean,
    RetentionPolicy: Anon_Days,
    Version: scala.Double,
    Write: scala.Boolean
  ): Anon_Delete = {
    val __obj = js.Dynamic.literal(Delete = Delete, Read = Read, RetentionPolicy = RetentionPolicy, Version = Version, Write = Write)
  
    __obj.asInstanceOf[Anon_Delete]
  }
}

