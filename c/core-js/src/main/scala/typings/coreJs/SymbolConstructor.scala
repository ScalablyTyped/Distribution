package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymbolConstructor extends StObject {
  
  /**
    * Non-standard. Use simple mode for core-js symbols. See https://github.com/zloirock/core-js/#caveats-when-using-symbol-polyfill
    */
  def useSimple(): Unit = js.native
  
  /**
    * Non-standard. Use setter mode for core-js symbols. See https://github.com/zloirock/core-js/#caveats-when-using-symbol-polyfill
    */
  def userSetter(): Unit = js.native
}
object SymbolConstructor {
  
  @scala.inline
  def apply(useSimple: () => Unit, userSetter: () => Unit): SymbolConstructor = {
    val __obj = js.Dynamic.literal(useSimple = js.Any.fromFunction0(useSimple), userSetter = js.Any.fromFunction0(userSetter))
    __obj.asInstanceOf[SymbolConstructor]
  }
  
  @scala.inline
  implicit class SymbolConstructorMutableBuilder[Self <: SymbolConstructor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUseSimple(value: () => Unit): Self = StObject.set(x, "useSimple", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUserSetter(value: () => Unit): Self = StObject.set(x, "userSetter", js.Any.fromFunction0(value))
  }
}
