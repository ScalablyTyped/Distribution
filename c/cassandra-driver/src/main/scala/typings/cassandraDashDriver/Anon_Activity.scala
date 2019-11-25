package typings.cassandraDashDriver

import typings.cassandraDashDriver.libTypesMod.types.Uuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Activity extends js.Object {
  var activity: js.Any
  var elapsed: js.Any
  var id: Uuid
  var source: js.Any
  var thread: js.Any
}

object Anon_Activity {
  @scala.inline
  def apply(activity: js.Any, elapsed: js.Any, id: Uuid, source: js.Any, thread: js.Any): Anon_Activity = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], elapsed = elapsed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], thread = thread.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Activity]
  }
}

