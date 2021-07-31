package typings.callsite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): js.Array[CallSite] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Array[CallSite]]
  
  @JSImport("callsite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CallSite extends StObject {
    
    def getColumnNumber(): Double
    
    def getEvalOrigin(): String
    
    def getFileName(): String
    
    def getFunction(): js.Function
    
    def getFunctionName(): String
    
    def getLineNumber(): Double
    
    def getMethodName(): String
    
    def getThis(): js.Any
    
    def getTypeName(): String
    
    def isConstructor(): Boolean
    
    def isEval(): Boolean
    
    def isNative(): Boolean
    
    def isToplevel(): Boolean
  }
  object CallSite {
    
    @scala.inline
    def apply(
      getColumnNumber: () => Double,
      getEvalOrigin: () => String,
      getFileName: () => String,
      getFunction: () => js.Function,
      getFunctionName: () => String,
      getLineNumber: () => Double,
      getMethodName: () => String,
      getThis: () => js.Any,
      getTypeName: () => String,
      isConstructor: () => Boolean,
      isEval: () => Boolean,
      isNative: () => Boolean,
      isToplevel: () => Boolean
    ): CallSite = {
      val __obj = js.Dynamic.literal(getColumnNumber = js.Any.fromFunction0(getColumnNumber), getEvalOrigin = js.Any.fromFunction0(getEvalOrigin), getFileName = js.Any.fromFunction0(getFileName), getFunction = js.Any.fromFunction0(getFunction), getFunctionName = js.Any.fromFunction0(getFunctionName), getLineNumber = js.Any.fromFunction0(getLineNumber), getMethodName = js.Any.fromFunction0(getMethodName), getThis = js.Any.fromFunction0(getThis), getTypeName = js.Any.fromFunction0(getTypeName), isConstructor = js.Any.fromFunction0(isConstructor), isEval = js.Any.fromFunction0(isEval), isNative = js.Any.fromFunction0(isNative), isToplevel = js.Any.fromFunction0(isToplevel))
      __obj.asInstanceOf[CallSite]
    }
    
    @scala.inline
    implicit class CallSiteMutableBuilder[Self <: CallSite] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetColumnNumber(value: () => Double): Self = StObject.set(x, "getColumnNumber", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEvalOrigin(value: () => String): Self = StObject.set(x, "getEvalOrigin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFileName(value: () => String): Self = StObject.set(x, "getFileName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFunction(value: () => js.Function): Self = StObject.set(x, "getFunction", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFunctionName(value: () => String): Self = StObject.set(x, "getFunctionName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLineNumber(value: () => Double): Self = StObject.set(x, "getLineNumber", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMethodName(value: () => String): Self = StObject.set(x, "getMethodName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetThis(value: () => js.Any): Self = StObject.set(x, "getThis", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTypeName(value: () => String): Self = StObject.set(x, "getTypeName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsConstructor(value: () => Boolean): Self = StObject.set(x, "isConstructor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsEval(value: () => Boolean): Self = StObject.set(x, "isEval", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsNative(value: () => Boolean): Self = StObject.set(x, "isNative", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsToplevel(value: () => Boolean): Self = StObject.set(x, "isToplevel", js.Any.fromFunction0(value))
    }
  }
}
