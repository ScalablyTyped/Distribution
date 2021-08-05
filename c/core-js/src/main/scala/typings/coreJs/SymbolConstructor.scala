package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolConstructor extends StObject {
  
  /**
    * Non-standard. Use simple mode for core-js symbols. See https://github.com/zloirock/core-js/#caveats-when-using-symbol-polyfill
    */
  def useSimple(): Unit
  
  /**
    * Non-standard. Use setter mode for core-js symbols. See https://github.com/zloirock/core-js/#caveats-when-using-symbol-polyfill
    */
  def userSetter(): Unit
}
object SymbolConstructor {
  
  inline def apply(useSimple: () => Unit, userSetter: () => Unit): SymbolConstructor = {
    val __obj = js.Dynamic.literal(useSimple = js.Any.fromFunction0(useSimple), userSetter = js.Any.fromFunction0(userSetter))
    __obj.asInstanceOf[SymbolConstructor]
  }
  
  extension [Self <: SymbolConstructor](x: Self) {
    
    inline def setUseSimple(value: () => Unit): Self = StObject.set(x, "useSimple", js.Any.fromFunction0(value))
    
    inline def setUserSetter(value: () => Unit): Self = StObject.set(x, "userSetter", js.Any.fromFunction0(value))
  }
}
