package typings.degit.mod

import typings.degit.degitStrings.info
import typings.degit.degitStrings.warn
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("degit", "Degit")
@js.native
class Degit protected () extends EventEmitter {
  def this(src: String) = this()
  def this(src: String, opts: Options) = this()
  
  /**
    * @async
    */
  def clone(dest: String): js.Promise[Unit] = js.native
  
  @JSName("on")
  def on_info(event: info, callback: js.Function1[/* info */ Info, Unit]): this.type = js.native
  @JSName("on")
  def on_warn(event: warn, callback: js.Function1[/* info */ Info, Unit]): this.type = js.native
  
  /**
    * @async
    */
  def remove(dir: String, dest: String, action: RemoveAction): js.Promise[Unit] = js.native
}
