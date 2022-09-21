package typings.uvu1yNNGH0U

import typings.std.Error
import typings.uvu1yNNGH0U.anon.Actual
import typings.uvu1yNNGH0U.uvu1yNNGH0UBooleans.`false`
import typings.uvu1yNNGH0U.uvu1yNNGH0UStrings.ERR_ASSERTION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexDTsMod {
  
  @JSImport(".uvu-1yNNGH0U/assert/index.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".uvu-1yNNGH0U/assert/index.d.ts", "Assertion")
  @js.native
  open class Assertion ()
    extends StObject
       with Error {
    def this(options: Actual) = this()
    
    var actual: Any = js.native
    
    var code: ERR_ASSERTION = js.native
    
    var details: `false` | String = js.native
    
    var expects: Any = js.native
    
    var generated: Boolean = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_Assertion: typings.uvu1yNNGH0U.uvu1yNNGH0UStrings.Assertion = js.native
    
    var operator: String = js.native
  }
  
  inline def equal(actual: Any, expects: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def equal(actual: Any, expects: Any, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fixture(actual: String, expects: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fixture")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fixture(actual: String, expects: String, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fixture")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def instance(actual: Any, expects: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def instance(actual: Any, expects: Any, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object is {
    
    inline def apply(actual: Any, expects: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(actual: Any, expects: Any, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].apply(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport(".uvu-1yNNGH0U/assert/index.d.ts", "is")
    @js.native
    val ^ : js.Any = js.native
    
    inline def not(actual: Any, expects: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("not")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def not(actual: Any, expects: Any, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("not")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def `match`(actual: String, expects: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def `match`(actual: String, expects: String, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def `match`(actual: String, expects: js.RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def `match`(actual: String, expects: js.RegExp, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object not {
    
    inline def apply(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def apply(actual: Any, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].apply(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport(".uvu-1yNNGH0U/assert/index.d.ts", "not")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equal(actual: Any, expects: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def equal(actual: Any, expects: Any, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def fixture(actual: String, expects: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fixture")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fixture(actual: String, expects: String, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fixture")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def instance(actual: Any, expects: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def instance(actual: Any, expects: Any, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def `match`(actual: String, expects: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def `match`(actual: String, expects: String, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def `match`(actual: String, expects: js.RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def `match`(actual: String, expects: js.RegExp, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def ok(actual: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ok")(actual.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def ok(actual: Any, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ok")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def snapshot(actual: String, expects: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshot")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def snapshot(actual: String, expects: String, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshot")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def throws(fn: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def throws(fn: js.Function, expects: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def throws(fn: js.Function, expects: js.Function, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def throws(fn: js.Function, expects: js.RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def throws(fn: js.Function, expects: js.RegExp, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def throws(fn: js.Function, expects: Unit, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def throws(fn: js.Function, expects: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def throws(fn: js.Function, expects: Message, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def `type`(actual: Any, expects: Types): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def `type`(actual: Any, expects: Types, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def ok(actual: Any): /* asserts actual */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ok")(actual.asInstanceOf[js.Any]).asInstanceOf[/* asserts actual */ Boolean]
  inline def ok(actual: Any, msg: Message): /* asserts actual */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ok")(actual.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[/* asserts actual */ Boolean]
  
  inline def snapshot(actual: String, expects: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshot")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def snapshot(actual: String, expects: String, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("snapshot")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def throws(fn: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def throws(fn: js.Function, expects: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def throws(fn: js.Function, expects: js.Function, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def throws(fn: js.Function, expects: js.RegExp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def throws(fn: js.Function, expects: js.RegExp, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def throws(fn: js.Function, expects: Unit, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def throws(fn: js.Function, expects: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def throws(fn: js.Function, expects: Message, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("throws")(fn.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def `type`(actual: Any, expects: Types): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def `type`(actual: Any, expects: Types, msg: Message): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("type")(actual.asInstanceOf[js.Any], expects.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unreachable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unreachable")().asInstanceOf[Unit]
  inline def unreachable(msg: Message): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unreachable")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type Message = String | js.Error
  
  /* Rewritten from type alias, can be one of: 
    - typings.uvu1yNNGH0U.uvu1yNNGH0UStrings.string
    - typings.uvu1yNNGH0U.uvu1yNNGH0UStrings.number
    - typings.uvu1yNNGH0U.uvu1yNNGH0UStrings.boolean
    - typings.uvu1yNNGH0U.uvu1yNNGH0UStrings.`object`
    - typings.uvu1yNNGH0U.uvu1yNNGH0UStrings.undefined
    - typings.uvu1yNNGH0U.uvu1yNNGH0UStrings.function
  */
  trait Types extends StObject
  object Types {
    
    inline def boolean: typings.uvu1yNNGH0U.uvu1yNNGH0UStrings.boolean = "boolean".asInstanceOf[typings.uvu1yNNGH0U.uvu1yNNGH0UStrings.boolean]
    
    inline def function: typings.uvu1yNNGH0U.uvu1yNNGH0UStrings.function = "function".asInstanceOf[typings.uvu1yNNGH0U.uvu1yNNGH0UStrings.function]
    
    inline def number: typings.uvu1yNNGH0U.uvu1yNNGH0UStrings.number = "number".asInstanceOf[typings.uvu1yNNGH0U.uvu1yNNGH0UStrings.number]
    
    inline def `object`: typings.uvu1yNNGH0U.uvu1yNNGH0UStrings.`object` = "object".asInstanceOf[typings.uvu1yNNGH0U.uvu1yNNGH0UStrings.`object`]
    
    inline def string: typings.uvu1yNNGH0U.uvu1yNNGH0UStrings.string = "string".asInstanceOf[typings.uvu1yNNGH0U.uvu1yNNGH0UStrings.string]
    
    inline def undefined: typings.uvu1yNNGH0U.uvu1yNNGH0UStrings.undefined = "undefined".asInstanceOf[typings.uvu1yNNGH0U.uvu1yNNGH0UStrings.undefined]
  }
}
