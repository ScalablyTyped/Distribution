package typings.baconjs

import typings.baconjs.observableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeMod {
  
  @JSImport("baconjs/types/describe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(context: js.Any, method: String, args: js.Any*): Desc = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(context.asInstanceOf[js.Any], method.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Desc]
  
  @JSImport("baconjs/types/describe", "Desc")
  @js.native
  class Desc protected () extends StObject {
    def this(context: js.Any, method: String) = this()
    def this(context: js.Any, method: String, args: js.Array[js.Any]) = this()
    
    /** @hidden */
    var _isDesc: Boolean = js.native
    
    var args: js.Array[js.Any] = js.native
    
    /** @hidden */
    var cachedDeps: js.UndefOr[js.Array[default[js.Any]]] = js.native
    
    var context: js.Any = js.native
    
    def deps(): js.Array[default[js.Any]] = js.native
    
    var method: js.UndefOr[String] = js.native
  }
  
  inline def describe(context: js.Any, method: String, args: js.Any*): Desc = (^.asInstanceOf[js.Dynamic].applyDynamic("describe")(context.asInstanceOf[js.Any], method.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Desc]
  
  inline def findDeps(x: js.Any): js.Array[default[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findDeps")(x.asInstanceOf[js.Any]).asInstanceOf[js.Array[default[js.Any]]]
}
