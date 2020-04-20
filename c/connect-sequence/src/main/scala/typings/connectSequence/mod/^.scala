package typings.connectSequence.mod

import typings.express.mod.NextFunction
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-sequence", JSImport.Namespace)
@js.native
class ^ protected () extends ConnectSequence {
  def this(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_], next: NextFunction) = this()
  /* CompleteClass */
  override def append(middleware: (RequestHandler[ParamsDictionary, _, _, Query])*): this.type = js.native
  /* CompleteClass */
  override def appendIf(condition: Boolean, middleware: RequestHandler[ParamsDictionary, _, _, Query]): this.type = js.native
  /* CompleteClass */
  override def appendList(middleware: js.Array[RequestHandler[ParamsDictionary, _, _, Query]]): this.type = js.native
  /* CompleteClass */
  override def appendListIf(condition: Boolean, middleware: js.Array[RequestHandler[ParamsDictionary, _, _, Query]]): this.type = js.native
  /* CompleteClass */
  override def run(): Unit = js.native
}

