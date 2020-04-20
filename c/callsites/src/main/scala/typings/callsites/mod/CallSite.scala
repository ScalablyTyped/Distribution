package typings.callsites.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallSite extends js.Object {
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
  def getFunction(): js.UndefOr[js.Function]
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
  def getThis(): js.UndefOr[js.Any]
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
}

