package typings.callsite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallSite extends js.Object {
  
  def getColumnNumber(): Double = js.native
  
  def getEvalOrigin(): String = js.native
  
  def getFileName(): String = js.native
  
  def getFunction(): js.Function = js.native
  
  def getFunctionName(): String = js.native
  
  def getLineNumber(): Double = js.native
  
  def getMethodName(): String = js.native
  
  def getThis(): js.Any = js.native
  
  def getTypeName(): String = js.native
  
  def isConstructor(): Boolean = js.native
  
  def isEval(): Boolean = js.native
  
  def isNative(): Boolean = js.native
  
  def isToplevel(): Boolean = js.native
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
    def setGetColumnNumber(value: () => Double): Self = this.set("getColumnNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEvalOrigin(value: () => String): Self = this.set("getEvalOrigin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFileName(value: () => String): Self = this.set("getFileName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFunction(value: () => js.Function): Self = this.set("getFunction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFunctionName(value: () => String): Self = this.set("getFunctionName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLineNumber(value: () => Double): Self = this.set("getLineNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMethodName(value: () => String): Self = this.set("getMethodName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetThis(value: () => js.Any): Self = this.set("getThis", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTypeName(value: () => String): Self = this.set("getTypeName", js.Any.fromFunction0(value))
    
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
