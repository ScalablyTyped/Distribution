package typings
package connectDashSequenceLib.connectDashSequenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-sequence", JSImport.Namespace)
@js.native
class ^ protected () extends ConnectSequence {
  def this(req: expressLib.expressMod.Request, res: expressLib.expressMod.Response, next: expressLib.expressMod.NextFunction) = this()
  /* CompleteClass */
  override def append(middleware: expressLib.expressMod.RequestHandler*): this.type = js.native
  /* CompleteClass */
  override def appendIf(condition: scala.Boolean, middleware: expressLib.expressMod.RequestHandler): this.type = js.native
  /* CompleteClass */
  override def appendList(middleware: js.Array[expressLib.expressMod.RequestHandler]): this.type = js.native
  /* CompleteClass */
  override def appendListIf(condition: scala.Boolean, middleware: js.Array[expressLib.expressMod.RequestHandler]): this.type = js.native
  /* CompleteClass */
  override def run(): scala.Unit = js.native
}

