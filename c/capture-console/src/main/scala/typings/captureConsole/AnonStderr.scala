package typings.captureConsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStderr extends js.Object {
  var stderr: String
  var stdout: String
}

object AnonStderr {
  @scala.inline
  def apply(stderr: String, stdout: String): AnonStderr = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStderr]
  }
}

