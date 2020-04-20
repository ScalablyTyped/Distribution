package typings.beanstalkd.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicReader extends js.Object {
  def handle(
    protocol: BeanstalkdProtocol,
    data: js.Any,
    resolve: js.Function1[/* data */ js.UndefOr[js.Any], Unit],
    reject: js.Function1[/* err */ js.UndefOr[js.Any], _]
  ): Buffer
  def parseData(data: String): js.Any
}

object BasicReader {
  @scala.inline
  def apply(
    handle: (BeanstalkdProtocol, js.Any, js.Function1[/* data */ js.UndefOr[js.Any], Unit], js.Function1[/* err */ js.UndefOr[js.Any], _]) => Buffer,
    parseData: String => js.Any
  ): BasicReader = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction4(handle), parseData = js.Any.fromFunction1(parseData))
    __obj.asInstanceOf[BasicReader]
  }
}

