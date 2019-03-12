package typings
package backlogDashJsLib.backlogDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backlog-js", "Error")
@js.native
object ErrorNs extends js.Object {
  @js.native
  class BacklogApiError protected () extends BacklogError {
    def this(response: stdLib.Response) = this()
    def this(response: stdLib.Response, body: backlogDashJsLib.Anon_Errors) = this()
  }
  
  @js.native
  class BacklogAuthError protected () extends BacklogError {
    def this(response: stdLib.Response) = this()
    def this(response: stdLib.Response, body: backlogDashJsLib.Anon_Errors) = this()
  }
  
  @js.native
  class BacklogError protected ()
    extends stdLib.ErrorConstructor {
    def this(name: BacklogErrorNameType, response: stdLib.Response) = this()
    def this(name: BacklogErrorNameType, response: stdLib.Response, body: backlogDashJsLib.Anon_Errors) = this()
    var _body: js.Any = js.native
    var _name: js.Any = js.native
    var _response: js.Any = js.native
    var _status: js.Any = js.native
    var _url: js.Any = js.native
    var body: backlogDashJsLib.Anon_Errors = js.native
    var name: BacklogErrorNameType = js.native
    var response: stdLib.Response = js.native
    var status: scala.Double = js.native
    var url: java.lang.String = js.native
  }
  
  trait BacklogErrorMessage extends js.Object {
    var code: scala.Double
    var errorInfo: java.lang.String
    var message: java.lang.String
    var moreInfo: java.lang.String
  }
  
  trait BacklogErrorNameType extends js.Object
  
  @js.native
  class UnexpectedError protected () extends BacklogError {
    def this(response: stdLib.Response) = this()
  }
  
}

