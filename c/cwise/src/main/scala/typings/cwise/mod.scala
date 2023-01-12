package typings.cwise

import typings.cwiseCompiler.mod.ArgType
import typings.ndarray.mod.Data
import typings.ndarray.mod.NdArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(a: String): Return = ^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any]).asInstanceOf[Return]
  inline def apply(a: UserArgs): Return = ^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any]).asInstanceOf[Return]
  
  @JSImport("cwise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Arg = NdArray[Data[Double]] | (js.Function2[/* row */ Double, /* col */ Double, Double]) | js.Array[Double] | Any
  
  @js.native
  trait Return extends StObject {
    
    def apply(a: NdArray[Data[Double]], b: Arg*): Unit = js.native
  }
  
  trait UserArgs extends StObject {
    
    var args: js.Array[ArgType]
    
    var blockSize: js.UndefOr[Double] = js.undefined
    
    def body(a: Double, args: Any*): Unit
    
    var funcName: js.UndefOr[String] = js.undefined
    
    var post: js.UndefOr[js.Function2[/* a */ Double, /* repeated */ Any, Unit]] = js.undefined
    
    var pre: js.UndefOr[js.Function2[/* a */ Double, /* repeated */ Any, Unit]] = js.undefined
    
    var printCode: js.UndefOr[Boolean] = js.undefined
  }
  object UserArgs {
    
    inline def apply(args: js.Array[ArgType], body: (Double, /* repeated */ Any) => Unit): UserArgs = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], body = js.Any.fromFunction2(body))
      __obj.asInstanceOf[UserArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserArgs] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[ArgType]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: ArgType*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
      
      inline def setBody(value: (Double, /* repeated */ Any) => Unit): Self = StObject.set(x, "body", js.Any.fromFunction2(value))
      
      inline def setFuncName(value: String): Self = StObject.set(x, "funcName", value.asInstanceOf[js.Any])
      
      inline def setFuncNameUndefined: Self = StObject.set(x, "funcName", js.undefined)
      
      inline def setPost(value: (/* a */ Double, /* repeated */ Any) => Unit): Self = StObject.set(x, "post", js.Any.fromFunction2(value))
      
      inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      inline def setPre(value: (/* a */ Double, /* repeated */ Any) => Unit): Self = StObject.set(x, "pre", js.Any.fromFunction2(value))
      
      inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
      
      inline def setPrintCode(value: Boolean): Self = StObject.set(x, "printCode", value.asInstanceOf[js.Any])
      
      inline def setPrintCodeUndefined: Self = StObject.set(x, "printCode", js.undefined)
    }
  }
}
