package typings
package betterDashSqlite3Lib.betterDashSqlite3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupOptions extends js.Object {
  def progress(info: BackupMetadata): scala.Double
}

object BackupOptions {
  @scala.inline
  def apply(progress: BackupMetadata => scala.Double): BackupOptions = {
    val __obj = js.Dynamic.literal(progress = js.Any.fromFunction1(progress))
  
    __obj.asInstanceOf[BackupOptions]
  }
}

