package typings.beanstalkd.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicReader extends js.Object {
  
  def handle(
    protocol: BeanstalkdProtocol,
    data: js.Any,
    resolve: js.Function1[/* data */ js.UndefOr[js.Any], Unit],
    reject: js.Function1[/* err */ js.UndefOr[js.Any], _]
  ): Buffer = js.native
  
  def parseData(data: String): js.Any = js.native
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
  
  @scala.inline
  implicit class BasicReaderOps[Self <: BasicReader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHandle(
      value: (BeanstalkdProtocol, js.Any, js.Function1[/* data */ js.UndefOr[js.Any], Unit], js.Function1[/* err */ js.UndefOr[js.Any], _]) => Buffer
    ): Self = this.set("handle", js.Any.fromFunction4(value))
    
    @scala.inline
    def setParseData(value: String => js.Any): Self = this.set("parseData", js.Any.fromFunction1(value))
  }
}
