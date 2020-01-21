package typings.childProcessPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object childProcessPromiseStrings {
  @js.native
  sealed trait buffer extends js.Object
  
  @js.native
  sealed trait stderr extends js.Object
  
  @js.native
  sealed trait stdout extends js.Object
  
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  @scala.inline
  def stderr: stderr = "stderr".asInstanceOf[stderr]
  @scala.inline
  def stdout: stdout = "stdout".asInstanceOf[stdout]
}

