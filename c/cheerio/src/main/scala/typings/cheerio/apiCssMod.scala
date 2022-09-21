package typings.cheerio

import typings.cheerio.esmCheerioMod.Cheerio
import typings.domhandler.libNodeMod.AnyNode
import typings.domhandler.mod.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiCssMod {
  
  @JSImport("cheerio/lib/esm/api/css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def css[T /* <: AnyNode */](): js.UndefOr[Record[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("css")().asInstanceOf[js.UndefOr[Record[String, String]]]
  inline def css[T /* <: AnyNode */](map: Record[String, String]): Cheerio[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(map.asInstanceOf[js.Any]).asInstanceOf[Cheerio[T]]
  inline def css[T /* <: AnyNode */](name: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def css[T /* <: AnyNode */](names: js.Array[String]): js.UndefOr[Record[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(names.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Record[String, String]]]
  inline def css[T /* <: AnyNode */](prop: String, `val`: String): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("css")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
  inline def css[T /* <: AnyNode */](
    prop: String,
    `val`: js.ThisFunction2[/* this */ Element, /* i */ Double, /* style */ String, js.UndefOr[String]]
  ): Cheerio[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("css")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Cheerio[T]]
}
