package typings.cssWhat

import typings.cssWhat.libEsTypesMod.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsParseMod {
  
  @JSImport("css-what/lib/es/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isTraversal(selector: Selector): /* is css-what.css-what/lib/es/types.Traversal */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTraversal")(selector.asInstanceOf[js.Any]).asInstanceOf[/* is css-what.css-what/lib/es/types.Traversal */ Boolean]
  
  inline def parse(selector: String): js.Array[js.Array[Selector]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Selector]]]
}
