package typings.baconjs

import typings.baconjs.typesObservableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDescribeMod {
  
  @JSImport("baconjs/types/describe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(context: Any, method: String, args: Any*): Desc = (^.asInstanceOf[js.Dynamic].applyDynamic("default")((scala.List(context.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Desc]
  
  @JSImport("baconjs/types/describe", "Desc")
  @js.native
  open class Desc protected () extends StObject {
    def this(context: Any, method: String) = this()
    def this(context: Any, method: String, args: js.Array[Any]) = this()
    
    /** @hidden */
    var _isDesc: Boolean = js.native
    
    var args: js.Array[Any] = js.native
    
    /** @hidden */
    var cachedDeps: js.UndefOr[js.Array[default[Any]]] = js.native
    
    var context: Any = js.native
    
    def deps(): js.Array[default[Any]] = js.native
    
    var method: js.UndefOr[String] = js.native
  }
  
  inline def describe(context: Any, method: String, args: Any*): Desc = (^.asInstanceOf[js.Dynamic].applyDynamic("describe")((scala.List(context.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Desc]
  
  inline def findDeps(x: Any): js.Array[default[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findDeps")(x.asInstanceOf[js.Any]).asInstanceOf[js.Array[default[Any]]]
}
