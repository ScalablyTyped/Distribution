package typings.betterSqlite3.mod

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
    val __obj = js.Dynamic.literal(remainingPages = remainingPages.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupMetadata]
  }
}

