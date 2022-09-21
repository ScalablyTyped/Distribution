package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
By default extensions are registered in the order they are found
in the flattened form of nested array that was provided.
Individual extension values can be assigned a precedence to
override this. Extensions that do not have a precedence set get
the precedence of the nearest parent with a precedence, or
[`default`](https://codemirror.net/6/docs/ref/#state.Prec.default) if there is no such parent. The
final ordering of extensions is determined by first sorting by
precedence and then by order within each precedence.
*/
object Prec {
  
  @JSImport("@codemirror/state", "Prec")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    The default precedence, which is also used for extensions
    without an explicit precedence.
    */
  inline def default(ext: Extension): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ext.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  /**
    A higher-than-default precedence, for extensions that should
    come before those with default precedence.
    */
  inline def high(ext: Extension): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("high")(ext.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  /**
    The highest precedence level, for extensions that should end up
    near the start of the precedence ordering.
    */
  inline def highest(ext: Extension): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("highest")(ext.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  /**
    A lower-than-default precedence.
    */
  inline def low(ext: Extension): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("low")(ext.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  /**
    The lowest precedence level. Meant for things that should end up
    near the end of the extension order.
    */
  inline def lowest(ext: Extension): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("lowest")(ext.asInstanceOf[js.Any]).asInstanceOf[Extension]
}
