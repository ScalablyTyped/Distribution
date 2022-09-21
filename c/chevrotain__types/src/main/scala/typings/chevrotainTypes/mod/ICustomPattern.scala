package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  API #2 for [Custom Token Patterns](http://chevrotain.io/docs/guide/custom_token_patterns.html).
  */
trait ICustomPattern extends StObject {
  
  def exec(
    /**
    * The full input string.
    */
  text: String,
    /**
    * The offset at which to attempt a match
    */
  offset: Double,
    /**
    * Previously scanned Tokens
    */
  tokens: js.Array[IToken],
    /**
    * Token Groups
    */
  groups: StringDictionary[js.Array[IToken]]
  ): CustomPatternMatcherReturn | RegExpExecArray | Null
  @JSName("exec")
  var exec_Original: CustomPatternMatcherFunc
}
object ICustomPattern {
  
  inline def apply(
    exec: (/* text */ String, /* offset */ Double, /* tokens */ js.Array[IToken], /* groups */ StringDictionary[js.Array[IToken]]) => CustomPatternMatcherReturn | RegExpExecArray | Null
  ): ICustomPattern = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction4(exec))
    __obj.asInstanceOf[ICustomPattern]
  }
  
  extension [Self <: ICustomPattern](x: Self) {
    
    inline def setExec(
      value: (/* text */ String, /* offset */ Double, /* tokens */ js.Array[IToken], /* groups */ StringDictionary[js.Array[IToken]]) => CustomPatternMatcherReturn | RegExpExecArray | Null
    ): Self = StObject.set(x, "exec", js.Any.fromFunction4(value))
  }
}
