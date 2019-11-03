package typings.connectDashSequence.connectDashSequenceMod

import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.RequestHandler
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-sequence", JSImport.Namespace)
@js.native
class ^ protected () extends ConnectSequence {
  def this(req: Request[ParamsDictionary], res: Response, next: NextFunction) = this()
  /* CompleteClass */
  override def append(middleware: RequestHandler[ParamsDictionary]*): this.type = js.native
  /* CompleteClass */
  override def appendIf(condition: Boolean, middleware: RequestHandler[ParamsDictionary]): this.type = js.native
  /* CompleteClass */
  override def appendList(middleware: js.Array[RequestHandler[ParamsDictionary]]): this.type = js.native
  /* CompleteClass */
  override def appendListIf(condition: Boolean, middleware: js.Array[RequestHandler[ParamsDictionary]]): this.type = js.native
  /* CompleteClass */
  override def run(): Unit = js.native
}

