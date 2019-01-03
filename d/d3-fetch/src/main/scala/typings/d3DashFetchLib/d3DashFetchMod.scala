package typings
package d3DashFetchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-fetch", JSImport.Namespace)
@js.native
object d3DashFetchMod extends js.Object {
  def blob(url: java.lang.String): js.Promise[stdLib.Blob] = js.native
  def blob(url: java.lang.String, init: stdLib.RequestInit): js.Promise[stdLib.Blob] = js.native
  def buffer(url: java.lang.String): js.Promise[stdLib.ArrayBuffer] = js.native
  def buffer(url: java.lang.String, init: stdLib.RequestInit): js.Promise[stdLib.ArrayBuffer] = js.native
  def csv[Columns /* <: java.lang.String */](url: java.lang.String): js.Promise[d3DashDsvLib.d3DashDsvMod.DSVRowArray[Columns]] = js.native
  def csv[Columns /* <: java.lang.String */](url: java.lang.String, init: stdLib.RequestInit): js.Promise[d3DashDsvLib.d3DashDsvMod.DSVRowArray[Columns]] = js.native
  def csv[ParsedRow /* <: js.Object */, Columns /* <: java.lang.String */](
    url: java.lang.String,
    init: stdLib.RequestInit,
    row: js.Function3[
      /* rawRow */ d3DashDsvLib.d3DashDsvMod.DSVRowString[Columns], 
      /* index */ scala.Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | scala.Null]
    ]
  ): js.Promise[d3DashDsvLib.d3DashDsvMod.DSVParsedArray[ParsedRow]] = js.native
  def csv[ParsedRow /* <: js.Object */, Columns /* <: java.lang.String */](
    url: java.lang.String,
    row: js.Function3[
      /* rawRow */ d3DashDsvLib.d3DashDsvMod.DSVRowString[Columns], 
      /* index */ scala.Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | scala.Null]
    ]
  ): js.Promise[d3DashDsvLib.d3DashDsvMod.DSVParsedArray[ParsedRow]] = js.native
  def dsv[Columns /* <: java.lang.String */](delimiter: java.lang.String, url: java.lang.String): js.Promise[d3DashDsvLib.d3DashDsvMod.DSVRowArray[Columns]] = js.native
  def dsv[Columns /* <: java.lang.String */](delimiter: java.lang.String, url: java.lang.String, init: stdLib.RequestInit): js.Promise[d3DashDsvLib.d3DashDsvMod.DSVRowArray[Columns]] = js.native
  def dsv[ParsedRow /* <: js.Object */, Columns /* <: java.lang.String */](
    delimiter: java.lang.String,
    url: java.lang.String,
    init: stdLib.RequestInit,
    row: js.Function3[
      /* rawRow */ d3DashDsvLib.d3DashDsvMod.DSVRowString[Columns], 
      /* index */ scala.Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | scala.Null]
    ]
  ): js.Promise[d3DashDsvLib.d3DashDsvMod.DSVParsedArray[ParsedRow]] = js.native
  def dsv[ParsedRow /* <: js.Object */, Columns /* <: java.lang.String */](
    delimiter: java.lang.String,
    url: java.lang.String,
    row: js.Function3[
      /* rawRow */ d3DashDsvLib.d3DashDsvMod.DSVRowString[Columns], 
      /* index */ scala.Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | scala.Null]
    ]
  ): js.Promise[d3DashDsvLib.d3DashDsvMod.DSVParsedArray[ParsedRow]] = js.native
  def html(url: java.lang.String): js.Promise[stdLib.Document] = js.native
  def html(url: java.lang.String, init: stdLib.RequestInit): js.Promise[stdLib.Document] = js.native
  def image(url: java.lang.String): js.Promise[stdLib.HTMLImageElement] = js.native
  def image(url: java.lang.String, init: stdLib.Partial[stdLib.HTMLImageElement]): js.Promise[stdLib.HTMLImageElement] = js.native
  def json[ParsedJSONObject /* <: js.Any */](url: java.lang.String): js.Promise[ParsedJSONObject] = js.native
  def json[ParsedJSONObject /* <: js.Any */](url: java.lang.String, init: stdLib.RequestInit): js.Promise[ParsedJSONObject] = js.native
  def svg(url: java.lang.String): js.Promise[stdLib.Document] = js.native
  def svg(url: java.lang.String, init: stdLib.RequestInit): js.Promise[stdLib.Document] = js.native
  def text(url: java.lang.String): js.Promise[java.lang.String] = js.native
  def text(url: java.lang.String, init: stdLib.RequestInit): js.Promise[java.lang.String] = js.native
  def tsv[Columns /* <: java.lang.String */](url: java.lang.String): js.Promise[d3DashDsvLib.d3DashDsvMod.DSVRowArray[Columns]] = js.native
  def tsv[Columns /* <: java.lang.String */](url: java.lang.String, init: stdLib.RequestInit): js.Promise[d3DashDsvLib.d3DashDsvMod.DSVRowArray[Columns]] = js.native
  def tsv[ParsedRow /* <: js.Object */, Columns /* <: java.lang.String */](
    url: java.lang.String,
    init: stdLib.RequestInit,
    row: js.Function3[
      /* rawRow */ d3DashDsvLib.d3DashDsvMod.DSVRowString[Columns], 
      /* index */ scala.Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | scala.Null]
    ]
  ): js.Promise[d3DashDsvLib.d3DashDsvMod.DSVParsedArray[ParsedRow]] = js.native
  def tsv[ParsedRow /* <: js.Object */, Columns /* <: java.lang.String */](
    url: java.lang.String,
    row: js.Function3[
      /* rawRow */ d3DashDsvLib.d3DashDsvMod.DSVRowString[Columns], 
      /* index */ scala.Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | scala.Null]
    ]
  ): js.Promise[d3DashDsvLib.d3DashDsvMod.DSVParsedArray[ParsedRow]] = js.native
  def xml(url: java.lang.String): js.Promise[stdLib.XMLDocument] = js.native
  def xml(url: java.lang.String, init: stdLib.RequestInit): js.Promise[stdLib.XMLDocument] = js.native
}

