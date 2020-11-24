package typings.callsites.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallSite extends js.Object {
  
  /**
  		Returns the current column number if this function was defined in a script.
  		*/
  def getColumnNumber(): Double | Null = js.native
  
  /**
  		Returns a string representing the location where `eval` was called if this function was created using a call to `eval`.
  		*/
  def getEvalOrigin(): js.UndefOr[String] = js.native
  
  /**
  		Returns the name of the script if this function was defined in a script.
  		*/
  def getFileName(): String | Null = js.native
  
  /**
  		Returns the current function.
  		*/
  def getFunction(): js.UndefOr[js.Function] = js.native
  
  /**
  		Returns the name of the current function, typically its `name` property. If a name property is not available an attempt will be made to try to infer a name from the function's context.
  		*/
  def getFunctionName(): String | Null = js.native
  
  /**
  		Returns the current line number if this function was defined in a script.
  		*/
  def getLineNumber(): Double | Null = js.native
  
  /**
  		Returns the name of the property of `this` or one of its prototypes that holds the current function.
  		*/
  def getMethodName(): js.UndefOr[String] = js.native
  
  /**
  		Returns the value of `this`.
  		*/
  def getThis(): js.UndefOr[js.Any] = js.native
  
  /**
  		Returns the type of `this` as a string. This is the name of the function stored in the constructor field of `this`, if available, otherwise the object's `[[Class]]` internal property.
  		*/
  def getTypeName(): String | Null = js.native
  
  /**
  		Returns `true` if this is a constructor call.
  		*/
  def isConstructor(): Boolean = js.native
  
  /**
  		Returns `true` if this call takes place in code defined by a call to `eval`.
  		*/
  def isEval(): Boolean = js.native
  
  /**
  		Returns `true` if this call is in native V8 code.
  		*/
  def isNative(): Boolean = js.native
  
  /**
  		Returns `true` if this is a top-level invocation, that is, if it's a global object.
  		*/
  def isToplevel(): Boolean = js.native
}
object CallSite {
  
  @scala.inline
  def apply(
    getColumnNumber: () => Double | Null,
    getEvalOrigin: () => js.UndefOr[String],
    getFileName: () => String | Null,
    getFunction: () => js.UndefOr[js.Function],
    getFunctionName: () => String | Null,
    getLineNumber: () => Double | Null,
    getMethodName: () => js.UndefOr[String],
    getThis: () => js.UndefOr[js.Any],
    getTypeName: () => String | Null,
    isConstructor: () => Boolean,
    isEval: () => Boolean,
    isNative: () => Boolean,
    isToplevel: () => Boolean
  ): CallSite = {
    val __obj = js.Dynamic.literal(getColumnNumber = js.Any.fromFunction0(getColumnNumber), getEvalOrigin = js.Any.fromFunction0(getEvalOrigin), getFileName = js.Any.fromFunction0(getFileName), getFunction = js.Any.fromFunction0(getFunction), getFunctionName = js.Any.fromFunction0(getFunctionName), getLineNumber = js.Any.fromFunction0(getLineNumber), getMethodName = js.Any.fromFunction0(getMethodName), getThis = js.Any.fromFunction0(getThis), getTypeName = js.Any.fromFunction0(getTypeName), isConstructor = js.Any.fromFunction0(isConstructor), isEval = js.Any.fromFunction0(isEval), isNative = js.Any.fromFunction0(isNative), isToplevel = js.Any.fromFunction0(isToplevel))
    __obj.asInstanceOf[CallSite]
  }
  
  @scala.inline
  implicit class CallSiteOps[Self <: CallSite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetColumnNumber(value: () => Double | Null): Self = this.set("getColumnNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEvalOrigin(value: () => js.UndefOr[String]): Self = this.set("getEvalOrigin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFileName(value: () => String | Null): Self = this.set("getFileName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFunction(value: () => js.UndefOr[js.Function]): Self = this.set("getFunction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFunctionName(value: () => String | Null): Self = this.set("getFunctionName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLineNumber(value: () => Double | Null): Self = this.set("getLineNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMethodName(value: () => js.UndefOr[String]): Self = this.set("getMethodName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetThis(value: () => js.UndefOr[js.Any]): Self = this.set("getThis", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTypeName(value: () => String | Null): Self = this.set("getTypeName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsConstructor(value: () => Boolean): Self = this.set("isConstructor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEval(value: () => Boolean): Self = this.set("isEval", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNative(value: () => Boolean): Self = this.set("isNative", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsToplevel(value: () => Boolean): Self = this.set("isToplevel", js.Any.fromFunction0(value))
  }
}
