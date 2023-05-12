package typings.bson

import typings.bson.anon.Scope
import typings.bson.libBsonMod.Document
import typings.bson.libBsonValueMod.BSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCodeMod {
  
  @JSImport("bson/lib/code", "Code")
  @js.native
  open class Code protected () extends BSONValue {
    /**
      * @param code - a string or function.
      * @param scope - an optional scope for the function.
      */
    def this(code: String) = this()
    def this(code: js.Function) = this()
    def this(code: String, scope: Document) = this()
    def this(code: js.Function, scope: Document) = this()
    
    var code: String = js.native
    
    var scope: Document | Null = js.native
    
    def toJSON(): Scope = js.native
  }
  /* static members */
  object Code {
    
    @JSImport("bson/lib/code", "Code")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromExtendedJSON(doc: CodeExtended): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[Code]
  }
  
  trait CodeExtended extends StObject {
    
    @JSName("$code")
    var $code: String
    
    @JSName("$scope")
    var $scope: js.UndefOr[Document] = js.undefined
  }
  object CodeExtended {
    
    inline def apply($code: String): CodeExtended = {
      val __obj = js.Dynamic.literal($code = $code.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeExtended]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodeExtended] (val x: Self) extends AnyVal {
      
      inline def set$code(value: String): Self = StObject.set(x, "$code", value.asInstanceOf[js.Any])
      
      inline def set$scope(value: Document): Self = StObject.set(x, "$scope", value.asInstanceOf[js.Any])
      
      inline def set$scopeUndefined: Self = StObject.set(x, "$scope", js.undefined)
    }
  }
}
