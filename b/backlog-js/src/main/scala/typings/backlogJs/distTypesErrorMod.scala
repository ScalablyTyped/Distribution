package typings.backlogJs

import typings.backlogJs.anon.Errors
import typings.std.Error
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesErrorMod {
  
  @JSImport("backlog-js/dist/types/error", "BacklogApiError")
  @js.native
  open class BacklogApiError protected () extends BacklogError {
    def this(response: Response) = this()
    def this(response: Response, body: Errors) = this()
  }
  
  @JSImport("backlog-js/dist/types/error", "BacklogAuthError")
  @js.native
  open class BacklogAuthError protected () extends BacklogError {
    def this(response: Response) = this()
    def this(response: Response, body: Errors) = this()
  }
  
  @JSImport("backlog-js/dist/types/error", "BacklogError")
  @js.native
  open class BacklogError protected ()
    extends StObject
       with Error {
    def this(name: BacklogErrorNameType, response: Response) = this()
    def this(name: BacklogErrorNameType, response: Response, body: Errors) = this()
    
    /* private */ var _body: Any = js.native
    
    /* private */ var _name: Any = js.native
    
    /* private */ var _response: Any = js.native
    
    /* private */ var _status: Any = js.native
    
    /* private */ var _url: Any = js.native
    
    def body: Errors = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    def name_MBacklogError: BacklogErrorNameType = js.native
    
    def response: Response = js.native
    
    def status: Double = js.native
    
    def url: String = js.native
  }
  
  @JSImport("backlog-js/dist/types/error", "UnexpectedError")
  @js.native
  open class UnexpectedError protected () extends BacklogError {
    def this(response: Response) = this()
  }
  
  trait BacklogErrorMessage extends StObject {
    
    var code: Double
    
    var errorInfo: String
    
    var message: String
    
    var moreInfo: String
  }
  object BacklogErrorMessage {
    
    inline def apply(code: Double, errorInfo: String, message: String, moreInfo: String): BacklogErrorMessage = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errorInfo = errorInfo.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], moreInfo = moreInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[BacklogErrorMessage]
    }
    
    extension [Self <: BacklogErrorMessage](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setErrorInfo(value: String): Self = StObject.set(x, "errorInfo", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMoreInfo(value: String): Self = StObject.set(x, "moreInfo", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.backlogJs.backlogJsStrings.BacklogApiError
    - typings.backlogJs.backlogJsStrings.BacklogAuthError
    - typings.backlogJs.backlogJsStrings.UnexpectedError
  */
  trait BacklogErrorNameType extends StObject
  object BacklogErrorNameType {
    
    inline def BacklogApiError: typings.backlogJs.backlogJsStrings.BacklogApiError = "BacklogApiError".asInstanceOf[typings.backlogJs.backlogJsStrings.BacklogApiError]
    
    inline def BacklogAuthError: typings.backlogJs.backlogJsStrings.BacklogAuthError = "BacklogAuthError".asInstanceOf[typings.backlogJs.backlogJsStrings.BacklogAuthError]
    
    inline def UnexpectedError: typings.backlogJs.backlogJsStrings.UnexpectedError = "UnexpectedError".asInstanceOf[typings.backlogJs.backlogJsStrings.UnexpectedError]
  }
}
