package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hasPropsMod {
  
  @JSImport("crocks/predicates/hasProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: js.Array[String | Double]): js.Function1[/* val */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ Any, Boolean]]
  inline def default(props: js.Array[String | Double], `val`: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
