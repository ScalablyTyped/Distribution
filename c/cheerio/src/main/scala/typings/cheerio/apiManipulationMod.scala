package typings.cheerio

import typings.cheerio.esmCheerioMod.Cheerio
import typings.cheerio.typesMod.AcceptedElems
import typings.cheerio.typesMod.BasicAcceptedElems
import typings.domhandler.libNodeMod.AnyNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiManipulationMod {
  
  @JSImport("cheerio/lib/esm/api/manipulation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def after[T /* <: AnyNode */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param elems because its type [(this : AnyNode, i : number, html : string): BasicAcceptedElems<AnyNode>] | Array<BasicAcceptedElems<AnyNode>> is not an array type */ elems: js.Array[
      BasicAcceptedElems[AnyNode] | (js.ThisFunction2[/* this */ AnyNode, /* i */ Double, /* html */ String, BasicAcceptedElems[AnyNode]])
    ]
  ): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("after")(elems.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def append[T /* <: AnyNode */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param elems because its type [(this : AnyNode, i : number, html : string): BasicAcceptedElems<AnyNode>] | Array<BasicAcceptedElems<AnyNode>> is not an array type */ elems: js.Array[
      BasicAcceptedElems[AnyNode] | (js.ThisFunction2[/* this */ AnyNode, /* i */ Double, /* html */ String, BasicAcceptedElems[AnyNode]])
    ]
  ): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("append")(elems.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def appendTo[T /* <: AnyNode */](target: BasicAcceptedElems[AnyNode]): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("appendTo")(target.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def before[T /* <: AnyNode */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param elems because its type [(this : AnyNode, i : number, html : string): BasicAcceptedElems<AnyNode>] | Array<BasicAcceptedElems<AnyNode>> is not an array type */ elems: js.Array[
      BasicAcceptedElems[AnyNode] | (js.ThisFunction2[/* this */ AnyNode, /* i */ Double, /* html */ String, BasicAcceptedElems[AnyNode]])
    ]
  ): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("before")(elems.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def clone_[T /* <: AnyNode */](): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")().asInstanceOf[Cheerio[T]]
  
  inline def empty[T /* <: AnyNode */](): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Cheerio[T]]
  
  inline def html[T /* <: AnyNode */](): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("html")().asInstanceOf[String | Null]
  inline def html[T /* <: AnyNode */](str: String): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(str.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  inline def html[T /* <: AnyNode */](str: Cheerio[T]): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(str.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def insertAfter[T /* <: AnyNode */](target: BasicAcceptedElems[AnyNode]): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertAfter")(target.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def insertBefore[T /* <: AnyNode */](target: BasicAcceptedElems[AnyNode]): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertBefore")(target.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def makeDomArray[T /* <: AnyNode */](): js.Array[AnyNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("_makeDomArray")().asInstanceOf[js.Array[AnyNode]]
  inline def makeDomArray[T /* <: AnyNode */](elem: Unit, clone: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("_makeDomArray")(elem.asInstanceOf[js.Any], clone.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def makeDomArray[T /* <: AnyNode */](elem: BasicAcceptedElems[AnyNode]): js.Array[AnyNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("_makeDomArray")(elem.asInstanceOf[js.Any]).asInstanceOf[js.Array[AnyNode]]
  inline def makeDomArray[T /* <: AnyNode */](elem: BasicAcceptedElems[AnyNode], clone: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("_makeDomArray")(elem.asInstanceOf[js.Any], clone.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  
  inline def prepend[T /* <: AnyNode */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param elems because its type [(this : AnyNode, i : number, html : string): BasicAcceptedElems<AnyNode>] | Array<BasicAcceptedElems<AnyNode>> is not an array type */ elems: js.Array[
      BasicAcceptedElems[AnyNode] | (js.ThisFunction2[/* this */ AnyNode, /* i */ Double, /* html */ String, BasicAcceptedElems[AnyNode]])
    ]
  ): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("prepend")(elems.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def prependTo[T /* <: AnyNode */](target: BasicAcceptedElems[AnyNode]): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("prependTo")(target.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def remove[T /* <: AnyNode */](): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")().asInstanceOf[Cheerio[T]]
  inline def remove[T /* <: AnyNode */](selector: String): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(selector.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def replaceWith[T /* <: AnyNode */](content: AcceptedElems[AnyNode]): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceWith")(content.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def text[T /* <: AnyNode */](): String = ^.asInstanceOf[js.Dynamic].applyDynamic("text")().asInstanceOf[String]
  inline def text[T /* <: AnyNode */](str: String): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(str.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  inline def text[T /* <: AnyNode */](str: js.ThisFunction2[/* this */ AnyNode, /* i */ Double, /* text */ String, String]): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(str.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def toString_[T /* <: AnyNode */](): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
  
  inline def unwrap[T /* <: AnyNode */](): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrap")().asInstanceOf[Cheerio[T]]
  inline def unwrap[T /* <: AnyNode */](selector: String): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrap")(selector.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def wrap[T /* <: AnyNode */](wrapper: AcceptedElems[AnyNode]): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(wrapper.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def wrapAll[T /* <: AnyNode */](wrapper: AcceptedElems[T]): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapAll")(wrapper.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  
  inline def wrapInner[T /* <: AnyNode */](wrapper: AcceptedElems[AnyNode]): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapInner")(wrapper.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
}
