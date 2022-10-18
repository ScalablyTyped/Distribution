package typings.cheerio

import typings.domhandler.libNodeMod.AnyNode
import typings.domhandler.libNodeMod.Node
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmUtilsMod {
  
  @JSImport("cheerio/lib/esm/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def camelCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def cloneDom[T /* <: AnyNode */](dom: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneDom")(dom.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def cloneDom[T /* <: AnyNode */](dom: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneDom")(dom.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def cssCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cssCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def domEach[T /* <: AnyNode */, Arr /* <: ArrayLike[T] */](array: Arr, fn: js.Function2[/* elem */ T, /* index */ Double, Unit]): Arr = (^.asInstanceOf[js.Dynamic].applyDynamic("domEach")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Arr]
  
  inline def isCheerio[T](maybeCheerio: Any): /* is cheerio.cheerio/lib/esm/cheerio.Cheerio<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCheerio")(maybeCheerio.asInstanceOf[js.Any]).asInstanceOf[/* is cheerio.cheerio/lib/esm/cheerio.Cheerio<T> */ Boolean]
  
  inline def isHtml(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHtml")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTag(node: Node): /* is domhandler.domhandler/lib/node.Element */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is domhandler.domhandler/lib/node.Element */ Boolean]
}
