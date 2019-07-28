package typings.betterDashSqlite3.betterDashSqlite3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupMetadata extends js.Object {
  var remainingPages: Double
  var totalPages: Double
}

object BackupMetadata {
  @scala.inline
  def apply(remainingPages: Double, totalPages: Double): BackupMetadata = {
    val __obj = js.Dynamic.literal(remainingPages = remainingPages, totalPages = totalPages)
  
    __obj.asInstanceOf[BackupMetadata]
  }
}

