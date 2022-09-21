package typings.cssSelect

import typings.cssSelect.typesMod.InternalOptions
import typings.cssWhat.typesMod.DataType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pseudosMod {
  
  @JSImport("css-select/lib/esm/pseudo-selectors/pseudos", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("css-select/lib/esm/pseudo-selectors/pseudos", "pseudos")
  @js.native
  val pseudos: Record[String, Pseudo] = js.native
  
  inline def verifyPseudoArgs[T /* <: js.Array[Any] */](func: js.Function1[/* args */ T, Boolean], name: String, subselect: DataType, argIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyPseudoArgs")(func.asInstanceOf[js.Any], name.asInstanceOf[js.Any], subselect.asInstanceOf[js.Any], argIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Pseudo = js.Function3[
    /* elem */ Any, 
    /* options */ InternalOptions[Any, Any], 
    /* subselect */ js.UndefOr[String | Null], 
    Boolean
  ]
}
