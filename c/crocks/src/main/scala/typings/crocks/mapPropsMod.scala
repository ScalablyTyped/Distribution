package typings.crocks

import org.scalablytyped.runtime.StringDictionary
import typings.crocks.typesMod.VariadicFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapPropsMod {
  
  @JSImport("crocks/helpers/mapProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(m: StringDictionary[VariadicFunction]): js.Function1[/* o */ js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(m.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* o */ js.Object, js.Object]]
  /**
    * mapProps :: { (* -> *) } -> Object -> Object
    */
  inline def default(m: StringDictionary[VariadicFunction], o: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(m.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.Object]
}
