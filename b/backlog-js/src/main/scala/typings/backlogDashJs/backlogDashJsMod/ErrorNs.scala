package typings.backlogDashJs.backlogDashJsMod

import typings.backlogDashJs.Anon_Errors
import typings.backlogDashJs.backlogDashJsMod.ErrorNs.BacklogError
import typings.backlogDashJs.backlogDashJsMod.ErrorNs.BacklogErrorNameType
import typings.std.ErrorConstructor
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backlog-js", "Error")
@js.native
object ErrorNs extends js.Object {
  @js.native
  class BacklogApiError protected () extends BacklogError {
    def this(response: Response) = this()
    def this(response: Response, body: Anon_Errors) = this()
  }
  
  @js.native
  class BacklogAuthError protected () extends BacklogError {
    def this(response: Response) = this()
    def this(response: Response, body: Anon_Errors) = this()
  }
  
  @js.native
  class BacklogError protected () extends ErrorConstructor {
    def this(name: BacklogErrorNameType, response: Response) = this()
    def this(name: BacklogErrorNameType, response: Response, body: Anon_Errors) = this()
    var _body: js.Any = js.native
    var _name: js.Any = js.native
    var _response: js.Any = js.native
    var _status: js.Any = js.native
    var _url: js.Any = js.native
    var body: Anon_Errors = js.native
    var name: BacklogErrorNameType = js.native
    var response: Response = js.native
    var status: Double = js.native
    var url: String = js.native
  }
  
  trait BacklogErrorMessage extends js.Object {
    var code: Double
    var errorInfo: String
    var message: String
    var moreInfo: String
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.backlogDashJs.backlogDashJsStrings.BacklogApiError
    - typings.backlogDashJs.backlogDashJsStrings.BacklogAuthError
    - typings.backlogDashJs.backlogDashJsStrings.UnexpectedError
  */
  trait BacklogErrorNameType extends js.Object
  
  @js.native
  class UnexpectedError protected () extends BacklogError {
    def this(response: Response) = this()
  }
  
}

