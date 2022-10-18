package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maybeGetPathMod {
  
  @JSImport("crocks/Maybe/getPath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(path: js.Array[String | Double]): js.Function1[/* val */ js.Object, typings.crocks.maybeMaybeMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ js.Object, typings.crocks.maybeMaybeMod.default]]
  /**
    * getPath :: [ (String | Integer) ] -> a -> Maybe b
    */
  inline def default(path: js.Array[String | Double], `val`: js.Object): typings.crocks.maybeMaybeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[typings.crocks.maybeMaybeMod.default]
}
