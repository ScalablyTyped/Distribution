package typings.contentstackUtils

import typings.contentstackUtils.anon.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gqlMod {
  
  object GQL {
    
    @JSImport("@contentstack/utils/dist/types/gql", "GQL")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@contentstack/utils/dist/types/gql", "GQL.jsonToHTML")
    @js.native
    def jsonToHTML: js.Function1[/* option */ Entry, Unit] = js.native
    inline def jsonToHTML(option: Entry): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonToHTML")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def jsonToHTML_=(x: js.Function1[/* option */ Entry, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jsonToHTML")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.contentstackUtils.textNodeMod.default
    - typings.contentstackUtils.nodeMod.default
  */
  trait AnyNode extends StObject
}
