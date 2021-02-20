package typings.cwise

import typings.cwiseCompiler.mod.ArgType
import typings.ndarray.mod.ndarray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cwise", JSImport.Namespace)
  @js.native
  def apply(a: String): Return = js.native
  @JSImport("cwise", JSImport.Namespace)
  @js.native
  def apply(a: UserArgs): Return = js.native
  
  type Arg = ndarray[Double] | (js.Function2[/* row */ Double, /* col */ Double, Double]) | js.Array[Double] | js.Any
  
  type Return = js.Function2[/* a */ ndarray[Double], /* repeated */ Arg, Unit]
  
  @js.native
  trait UserArgs extends StObject {
    
    var args: js.Array[ArgType] = js.native
    
    var blockSize: js.UndefOr[Double] = js.native
    
    def body(a: Double, args: js.Any*): Unit = js.native
    
    var funcName: js.UndefOr[String] = js.native
    
    var post: js.UndefOr[js.Function2[/* a */ Double, /* repeated */ js.Any, Unit]] = js.native
    
    var pre: js.UndefOr[js.Function2[/* a */ Double, /* repeated */ js.Any, Unit]] = js.native
    
    var printCode: js.UndefOr[Boolean] = js.native
  }
  object UserArgs {
    
    @scala.inline
    def apply(args: js.Array[ArgType], body: (Double, /* repeated */ js.Any) => Unit): UserArgs = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], body = js.Any.fromFunction2(body))
      __obj.asInstanceOf[UserArgs]
    }
    
    @scala.inline
    implicit class UserArgsMutableBuilder[Self <: UserArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[ArgType]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: ArgType*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
      
      @scala.inline
      def setBody(value: (Double, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "body", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFuncName(value: String): Self = StObject.set(x, "funcName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFuncNameUndefined: Self = StObject.set(x, "funcName", js.undefined)
      
      @scala.inline
      def setPost(value: (/* a */ Double, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "post", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      @scala.inline
      def setPre(value: (/* a */ Double, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "pre", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
      
      @scala.inline
      def setPrintCode(value: Boolean): Self = StObject.set(x, "printCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintCodeUndefined: Self = StObject.set(x, "printCode", js.undefined)
    }
  }
}
