package typings.crocks

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersObjOfMod {
  
  @JSImport("crocks/helpers/objOf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[A](k: String): js.Function1[/* a */ A, StringDictionary[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(k.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, StringDictionary[A]]]
  inline def default[A](k: String, a: A): StringDictionary[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(k.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[A]]
}
