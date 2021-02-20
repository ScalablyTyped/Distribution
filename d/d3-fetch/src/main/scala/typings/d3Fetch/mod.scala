package typings.d3Fetch

import typings.d3Dsv.mod.DSVParsedArray
import typings.d3Dsv.mod.DSVRowArray
import typings.d3Dsv.mod.DSVRowString
import typings.d3Fetch.anon.PartialHTMLImageElement
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Document
import typings.std.HTMLImageElement
import typings.std.RequestInit
import typings.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-fetch", "blob")
  @js.native
  def blob(url: String): js.Promise[Blob] = js.native
  @JSImport("d3-fetch", "blob")
  @js.native
  def blob(url: String, init: RequestInit): js.Promise[Blob] = js.native
  
  @JSImport("d3-fetch", "buffer")
  @js.native
  def buffer(url: String): js.Promise[ArrayBuffer] = js.native
  @JSImport("d3-fetch", "buffer")
  @js.native
  def buffer(url: String, init: RequestInit): js.Promise[ArrayBuffer] = js.native
  
  @JSImport("d3-fetch", "csv")
  @js.native
  def csv[Columns /* <: String */](url: String): js.Promise[DSVRowArray[Columns]] = js.native
  @JSImport("d3-fetch", "csv")
  @js.native
  def csv[Columns /* <: String */](url: String, init: RequestInit): js.Promise[DSVRowArray[Columns]] = js.native
  @JSImport("d3-fetch", "csv")
  @js.native
  def csv[ParsedRow /* <: js.Object */, Columns /* <: String */](
    url: String,
    init: RequestInit,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): js.Promise[DSVParsedArray[ParsedRow]] = js.native
  @JSImport("d3-fetch", "csv")
  @js.native
  def csv[ParsedRow /* <: js.Object */, Columns /* <: String */](
    url: String,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): js.Promise[DSVParsedArray[ParsedRow]] = js.native
  
  @JSImport("d3-fetch", "dsv")
  @js.native
  def dsv[Columns /* <: String */](delimiter: String, url: String): js.Promise[DSVRowArray[Columns]] = js.native
  @JSImport("d3-fetch", "dsv")
  @js.native
  def dsv[Columns /* <: String */](delimiter: String, url: String, init: RequestInit): js.Promise[DSVRowArray[Columns]] = js.native
  @JSImport("d3-fetch", "dsv")
  @js.native
  def dsv[ParsedRow /* <: js.Object */, Columns /* <: String */](
    delimiter: String,
    url: String,
    init: RequestInit,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): js.Promise[DSVParsedArray[ParsedRow]] = js.native
  @JSImport("d3-fetch", "dsv")
  @js.native
  def dsv[ParsedRow /* <: js.Object */, Columns /* <: String */](
    delimiter: String,
    url: String,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): js.Promise[DSVParsedArray[ParsedRow]] = js.native
  
  @JSImport("d3-fetch", "html")
  @js.native
  def html(url: String): js.Promise[Document] = js.native
  @JSImport("d3-fetch", "html")
  @js.native
  def html(url: String, init: RequestInit): js.Promise[Document] = js.native
  
  @JSImport("d3-fetch", "image")
  @js.native
  def image(url: String): js.Promise[HTMLImageElement] = js.native
  @JSImport("d3-fetch", "image")
  @js.native
  def image(url: String, init: PartialHTMLImageElement): js.Promise[HTMLImageElement] = js.native
  
  @JSImport("d3-fetch", "json")
  @js.native
  def json[ParsedJSONObject /* <: js.Any */](url: String): js.Promise[js.UndefOr[ParsedJSONObject]] = js.native
  @JSImport("d3-fetch", "json")
  @js.native
  def json[ParsedJSONObject /* <: js.Any */](url: String, init: RequestInit): js.Promise[js.UndefOr[ParsedJSONObject]] = js.native
  
  @JSImport("d3-fetch", "svg")
  @js.native
  def svg(url: String): js.Promise[Document] = js.native
  @JSImport("d3-fetch", "svg")
  @js.native
  def svg(url: String, init: RequestInit): js.Promise[Document] = js.native
  
  @JSImport("d3-fetch", "text")
  @js.native
  def text(url: String): js.Promise[String] = js.native
  @JSImport("d3-fetch", "text")
  @js.native
  def text(url: String, init: RequestInit): js.Promise[String] = js.native
  
  @JSImport("d3-fetch", "tsv")
  @js.native
  def tsv[Columns /* <: String */](url: String): js.Promise[DSVRowArray[Columns]] = js.native
  @JSImport("d3-fetch", "tsv")
  @js.native
  def tsv[Columns /* <: String */](url: String, init: RequestInit): js.Promise[DSVRowArray[Columns]] = js.native
  @JSImport("d3-fetch", "tsv")
  @js.native
  def tsv[ParsedRow /* <: js.Object */, Columns /* <: String */](
    url: String,
    init: RequestInit,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): js.Promise[DSVParsedArray[ParsedRow]] = js.native
  @JSImport("d3-fetch", "tsv")
  @js.native
  def tsv[ParsedRow /* <: js.Object */, Columns /* <: String */](
    url: String,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): js.Promise[DSVParsedArray[ParsedRow]] = js.native
  
  @JSImport("d3-fetch", "xml")
  @js.native
  def xml(url: String): js.Promise[XMLDocument] = js.native
  @JSImport("d3-fetch", "xml")
  @js.native
  def xml(url: String, init: RequestInit): js.Promise[XMLDocument] = js.native
}
