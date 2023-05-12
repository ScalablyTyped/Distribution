package typings.csstoolsCssParserAlgorithms

import typings.csstoolsCssParserAlgorithms.anon.Parent
import typings.csstoolsCssParserAlgorithms.csstoolsCssParserAlgorithmsBooleans.`false`
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilNodeAncestryMod {
  
  @JSImport("@csstools/css-parser-algorithms/dist/util/node-ancestry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gatherNodeAncestry(node: walkable): Map[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("gatherNodeAncestry")(node.asInstanceOf[js.Any]).asInstanceOf[Map[Any, Any]]
  
  trait walkable extends StObject {
    
    def walk(cb: js.Function2[/* entry */ Parent, /* index */ Double | String, Boolean | Unit]): js.UndefOr[`false`]
  }
  object walkable {
    
    inline def apply(
      walk: js.Function2[/* entry */ Parent, /* index */ Double | String, Boolean | Unit] => js.UndefOr[`false`]
    ): walkable = {
      val __obj = js.Dynamic.literal(walk = js.Any.fromFunction1(walk))
      __obj.asInstanceOf[walkable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: walkable] (val x: Self) extends AnyVal {
      
      inline def setWalk(
        value: js.Function2[/* entry */ Parent, /* index */ Double | String, Boolean | Unit] => js.UndefOr[`false`]
      ): Self = StObject.set(x, "walk", js.Any.fromFunction1(value))
    }
  }
}
