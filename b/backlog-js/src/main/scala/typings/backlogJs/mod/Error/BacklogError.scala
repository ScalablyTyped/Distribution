package typings.backlogJs.mod.Error

import typings.backlogJs.anon.Errors
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("backlog-js", "Error.BacklogError")
@js.native
class BacklogError protected () extends js.Object {
  def this(name: BacklogErrorNameType, response: Response) = this()
  def this(name: BacklogErrorNameType, response: Response, body: Errors) = this()
  var _body: js.Any = js.native
  var _name: js.Any = js.native
  var _response: js.Any = js.native
  var _status: js.Any = js.native
  var _url: js.Any = js.native
  var body: Errors = js.native
  var name: BacklogErrorNameType = js.native
  var response: Response = js.native
  var status: Double = js.native
  var url: String = js.native
}

