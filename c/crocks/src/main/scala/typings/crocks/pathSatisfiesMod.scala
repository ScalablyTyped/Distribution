package typings.crocks

import typings.crocks.predMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathSatisfiesMod {
  
  @JSImport("crocks/predicates/pathSatisfies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(path: js.Array[String | Double]): js.Function1[
    /* pred */ js.Function1[/* val */ Any, Boolean | typings.crocks.predMod.default], 
    js.Function1[/* obj */ js.Object, Boolean]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* pred */ js.Function1[/* val */ Any, Boolean | typings.crocks.predMod.default], 
    js.Function1[/* obj */ js.Object, Boolean]
  ]]
  inline def default(
    path: js.Array[String | Double],
    pred: js.Function1[/* val */ Any, Boolean | typings.crocks.predMod.default]
  ): js.Function1[/* obj */ js.Object, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], pred.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, Boolean]]
  inline def default(
    path: js.Array[String | Double],
    pred: js.Function1[/* val */ Any, Boolean | typings.crocks.predMod.default],
    obj: js.Object
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], pred.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def pathSatisfies(path: js.Array[String | Double]): js.Function1[
    /* pred */ js.Function1[/* val */ Any, Boolean | default], 
    js.Function1[/* obj */ js.Object, Boolean]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathSatisfies")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* pred */ js.Function1[/* val */ Any, Boolean | default], 
    js.Function1[/* obj */ js.Object, Boolean]
  ]]
  inline def pathSatisfies(path: js.Array[String | Double], pred: js.Function1[/* val */ Any, Boolean | default]): js.Function1[/* obj */ js.Object, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("pathSatisfies")(path.asInstanceOf[js.Any], pred.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, Boolean]]
  inline def pathSatisfies(
    path: js.Array[String | Double],
    pred: js.Function1[/* val */ Any, Boolean | default],
    obj: js.Object
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pathSatisfies")(path.asInstanceOf[js.Any], pred.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
