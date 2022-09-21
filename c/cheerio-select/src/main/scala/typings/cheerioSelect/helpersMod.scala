package typings.cheerioSelect

import typings.cssWhat.typesMod.Selector
import typings.domhandler.libNodeMod.AnyNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("cheerio-select/lib/esm/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDocumentRoot(node: AnyNode): AnyNode = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentRoot")(node.asInstanceOf[js.Any]).asInstanceOf[AnyNode]
  
  inline def groupSelectors(selectors: js.Array[js.Array[Selector]]): js.Tuple2[
    /* plain */ js.Array[js.Array[Selector]], 
    /* filtered */ js.Array[js.Array[Selector]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupSelectors")(selectors.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    /* plain */ js.Array[js.Array[Selector]], 
    /* filtered */ js.Array[js.Array[Selector]]
  ]]
}
