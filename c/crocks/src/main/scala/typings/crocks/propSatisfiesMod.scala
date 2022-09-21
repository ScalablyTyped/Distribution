package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propSatisfiesMod {
  
  @JSImport("crocks/predicates/propSatisfies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(prop: String): js.Function1[
    /* pred */ js.Function1[/* val */ Any, Boolean | typings.crocks.predMod.default], 
    js.Function1[/* obj */ js.Object, Boolean]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* pred */ js.Function1[/* val */ Any, Boolean | typings.crocks.predMod.default], 
    js.Function1[/* obj */ js.Object, Boolean]
  ]]
  inline def default(prop: String, pred: js.Function1[/* val */ Any, Boolean | typings.crocks.predMod.default]): js.Function1[/* obj */ js.Object, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prop.asInstanceOf[js.Any], pred.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, Boolean]]
  /**
    * propSatisfies :: (String | Integer) -> ((a -> Boolean) | Pred) -> Object -> Boolean
    */
  inline def default(
    prop: String,
    pred: js.Function1[/* val */ Any, Boolean | typings.crocks.predMod.default],
    obj: js.Object
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prop.asInstanceOf[js.Any], pred.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(prop: Double): js.Function1[
    /* pred */ js.Function1[/* val */ Any, Boolean | typings.crocks.predMod.default], 
    js.Function1[/* obj */ js.Object, Boolean]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* pred */ js.Function1[/* val */ Any, Boolean | typings.crocks.predMod.default], 
    js.Function1[/* obj */ js.Object, Boolean]
  ]]
  inline def default(prop: Double, pred: js.Function1[/* val */ Any, Boolean | typings.crocks.predMod.default]): js.Function1[/* obj */ js.Object, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prop.asInstanceOf[js.Any], pred.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, Boolean]]
  inline def default(
    prop: Double,
    pred: js.Function1[/* val */ Any, Boolean | typings.crocks.predMod.default],
    obj: js.Object
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prop.asInstanceOf[js.Any], pred.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
