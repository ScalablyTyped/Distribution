package typings.cpFile.mod

import typings.cpFile.cpFileStrings.progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEmitter extends js.Object {
  /**
  		For empty files, the `progress` event is emitted only once.
  		*/
  @JSName("on")
  def on_progress(event: progress, handler: js.Function1[/* data */ ProgressData, Unit]): js.Promise[Unit]
}

object ProgressEmitter {
  @scala.inline
  def apply(on: (progress, js.Function1[/* data */ ProgressData, Unit]) => js.Promise[Unit]): ProgressEmitter = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
  
    __obj.asInstanceOf[ProgressEmitter]
  }
}

