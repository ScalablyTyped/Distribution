package typings.captureConsole.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stderr extends js.Object {
  var stderr: String
  var stdout: String
}

object Stderr {
  @scala.inline
  def apply(stderr: String, stdout: String): Stderr = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stderr]
  }
}

