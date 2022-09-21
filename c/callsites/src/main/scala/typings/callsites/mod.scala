package typings.callsites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("callsites", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Array[CallSite] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[CallSite]]
  
  @js.native
  trait AnyFunction extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  trait CallSite extends StObject {
    
    /**
    	Returns the current column number if this function was defined in a script.
    	*/
    def getColumnNumber(): Double | Null
    
    /**
    	Returns a string representing the location where `eval` was called if this function was created using a call to `eval`.
    	*/
    def getEvalOrigin(): js.UndefOr[String]
    
    /**
    	Returns the name of the script if this function was defined in a script.
    	*/
    def getFileName(): String | Null
    
    /**
    	Returns the current function.
    	*/
    def getFunction(): js.UndefOr[AnyFunction]
    
    /**
    	Returns the name of the current function, typically its `name` property. If a name property is not available an attempt will be made to try to infer a name from the function's context.
    	*/
    def getFunctionName(): String | Null
    
    /**
    	Returns the current line number if this function was defined in a script.
    	*/
    def getLineNumber(): Double | Null
    
    /**
    	Returns the name of the property of `this` or one of its prototypes that holds the current function.
    	*/
    def getMethodName(): js.UndefOr[String]
    
    /**
    	Returns the value of `this`.
    	*/
    def getThis(): js.UndefOr[Any]
    
    /**
    	Returns the type of `this` as a string. This is the name of the function stored in the constructor field of `this`, if available, otherwise the object's `[[Class]]` internal property.
    	*/
    def getTypeName(): String | Null
    
    /**
    	Returns `true` if this is a constructor call.
    	*/
    def isConstructor(): Boolean
    
    /**
    	Returns `true` if this call takes place in code defined by a call to `eval`.
    	*/
    def isEval(): Boolean
    
    /**
    	Returns `true` if this call is in native V8 code.
    	*/
    def isNative(): Boolean
    
    /**
    	Returns `true` if this is a top-level invocation, that is, if it's a global object.
    	*/
    def isToplevel(): Boolean
  }
  object CallSite {
    
    inline def apply(
      getColumnNumber: () => Double | Null,
      getEvalOrigin: () => js.UndefOr[String],
      getFileName: () => String | Null,
      getFunction: () => js.UndefOr[AnyFunction],
      getFunctionName: () => String | Null,
      getLineNumber: () => Double | Null,
      getMethodName: () => js.UndefOr[String],
      getThis: () => js.UndefOr[Any],
      getTypeName: () => String | Null,
      isConstructor: () => Boolean,
      isEval: () => Boolean,
      isNative: () => Boolean,
      isToplevel: () => Boolean
    ): CallSite = {
      val __obj = js.Dynamic.literal(getColumnNumber = js.Any.fromFunction0(getColumnNumber), getEvalOrigin = js.Any.fromFunction0(getEvalOrigin), getFileName = js.Any.fromFunction0(getFileName), getFunction = js.Any.fromFunction0(getFunction), getFunctionName = js.Any.fromFunction0(getFunctionName), getLineNumber = js.Any.fromFunction0(getLineNumber), getMethodName = js.Any.fromFunction0(getMethodName), getThis = js.Any.fromFunction0(getThis), getTypeName = js.Any.fromFunction0(getTypeName), isConstructor = js.Any.fromFunction0(isConstructor), isEval = js.Any.fromFunction0(isEval), isNative = js.Any.fromFunction0(isNative), isToplevel = js.Any.fromFunction0(isToplevel))
      __obj.asInstanceOf[CallSite]
    }
    
    extension [Self <: CallSite](x: Self) {
      
      inline def setGetColumnNumber(value: () => Double | Null): Self = StObject.set(x, "getColumnNumber", js.Any.fromFunction0(value))
      
      inline def setGetEvalOrigin(value: () => js.UndefOr[String]): Self = StObject.set(x, "getEvalOrigin", js.Any.fromFunction0(value))
      
      inline def setGetFileName(value: () => String | Null): Self = StObject.set(x, "getFileName", js.Any.fromFunction0(value))
      
      inline def setGetFunction(value: () => js.UndefOr[AnyFunction]): Self = StObject.set(x, "getFunction", js.Any.fromFunction0(value))
      
      inline def setGetFunctionName(value: () => String | Null): Self = StObject.set(x, "getFunctionName", js.Any.fromFunction0(value))
      
      inline def setGetLineNumber(value: () => Double | Null): Self = StObject.set(x, "getLineNumber", js.Any.fromFunction0(value))
      
      inline def setGetMethodName(value: () => js.UndefOr[String]): Self = StObject.set(x, "getMethodName", js.Any.fromFunction0(value))
      
      inline def setGetThis(value: () => js.UndefOr[Any]): Self = StObject.set(x, "getThis", js.Any.fromFunction0(value))
      
      inline def setGetTypeName(value: () => String | Null): Self = StObject.set(x, "getTypeName", js.Any.fromFunction0(value))
      
      inline def setIsConstructor(value: () => Boolean): Self = StObject.set(x, "isConstructor", js.Any.fromFunction0(value))
      
      inline def setIsEval(value: () => Boolean): Self = StObject.set(x, "isEval", js.Any.fromFunction0(value))
      
      inline def setIsNative(value: () => Boolean): Self = StObject.set(x, "isNative", js.Any.fromFunction0(value))
      
      inline def setIsToplevel(value: () => Boolean): Self = StObject.set(x, "isToplevel", js.Any.fromFunction0(value))
    }
  }
}
