package typings.backlogJs.mod

import typings.backlogJs.anon.Errors
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Error {
  
  @JSImport("backlog-js", "Error.BacklogApiError")
  @js.native
  class BacklogApiError protected () extends BacklogError {
    def this(response: Response) = this()
    def this(response: Response, body: Errors) = this()
  }
  
  @JSImport("backlog-js", "Error.BacklogAuthError")
  @js.native
  class BacklogAuthError protected () extends BacklogError {
    def this(response: Response) = this()
    def this(response: Response, body: Errors) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("backlog-js", "Error.BacklogError")
  @js.native
  class BacklogError protected () extends StObject {
    def this(name: BacklogErrorNameType, response: Response) = this()
    def this(name: BacklogErrorNameType, response: Response, body: Errors) = this()
    
    /* private */ var _body: js.Any = js.native
    
    /* private */ var _name: js.Any = js.native
    
    /* private */ var _response: js.Any = js.native
    
    /* private */ var _status: js.Any = js.native
    
    /* private */ var _url: js.Any = js.native
    
    var body: Errors = js.native
    
    var name: BacklogErrorNameType = js.native
    
    var response: Response = js.native
    
    var status: Double = js.native
    
    var url: String = js.native
  }
  
  @JSImport("backlog-js", "Error.UnexpectedError")
  @js.native
  class UnexpectedError protected () extends BacklogError {
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
