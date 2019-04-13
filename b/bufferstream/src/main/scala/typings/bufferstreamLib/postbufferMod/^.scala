package typings
package bufferstreamLib.postbufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bufferstream/postbuffer", JSImport.Namespace)
@js.native
class ^ protected () extends PostBuffer {
  /** for if you want to get all the post data from a http server request and do some db request before. */
  def this(req: nodeLib.httpMod.IncomingMessage) = this()
}

