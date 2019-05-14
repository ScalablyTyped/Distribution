package typings
package betterDashSqlite3Lib.betterDashSqlite3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupMetadata extends js.Object {
  var remainingPages: scala.Double
  var totalPages: scala.Double
}

object BackupMetadata {
  @scala.inline
  def apply(remainingPages: scala.Double, totalPages: scala.Double): BackupMetadata = {
    val __obj = js.Dynamic.literal(remainingPages = remainingPages, totalPages = totalPages)
  
    __obj.asInstanceOf[BackupMetadata]
  }
}

