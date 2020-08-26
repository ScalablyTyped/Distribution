package typings.beanstalkd.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YamlReader extends BasicReader

object YamlReader {
  @scala.inline
  def apply(
    handle: (BeanstalkdProtocol, js.Any, js.Function1[/* data */ js.UndefOr[js.Any], Unit], js.Function1[/* err */ js.UndefOr[js.Any], _]) => Buffer,
    parseData: String => js.Any
  ): YamlReader = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction4(handle), parseData = js.Any.fromFunction1(parseData))
    __obj.asInstanceOf[YamlReader]
  }
}

