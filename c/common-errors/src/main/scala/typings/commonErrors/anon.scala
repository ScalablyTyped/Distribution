package typings.commonErrors

import typings.commonErrors.mod.Error
import typings.commonErrors.mod.GenerateMessageMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Args extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.native
    
    var `extends`: js.UndefOr[Error] = js.native
    
    var generateMessage: js.UndefOr[GenerateMessageMethod] = js.native
    
    var globalize: js.UndefOr[Boolean] = js.native
  }
  object Args {
    
    @scala.inline
    def apply(): Args = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Args]
    }
    
    @scala.inline
    implicit class ArgsMutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setExtends(value: Error): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      @scala.inline
      def setGenerateMessage(value: () => String): Self = StObject.set(x, "generateMessage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGenerateMessageUndefined: Self = StObject.set(x, "generateMessage", js.undefined)
      
      @scala.inline
      def setGlobalize(value: Boolean): Self = StObject.set(x, "globalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalizeUndefined: Self = StObject.set(x, "globalize", js.undefined)
    }
  }
}
