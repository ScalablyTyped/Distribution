package typings
package d3DashFetchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-fetch", JSImport.Namespace)
@js.native
object d3DashFetchMod extends js.Object {
  def blob(url: java.lang.String): stdLib.Promise[stdLib.Blob] = js.native
  def blob(url: java.lang.String, init: stdLib.RequestInit): stdLib.Promise[stdLib.Blob] = js.native
  def buffer(url: java.lang.String): stdLib.Promise[stdLib.ArrayBuffer] = js.native
  def buffer(url: java.lang.String, init: stdLib.RequestInit): stdLib.Promise[stdLib.ArrayBuffer] = js.native
  def csv(url: java.lang.String): stdLib.Promise[d3DashDsvLib.d3DashDsvMod.DSVParsedArray[d3DashDsvLib.d3DashDsvMod.DSVRowString]] = js.native
  def csv(url: java.lang.String, init: stdLib.RequestInit): stdLib.Promise[d3DashDsvLib.d3DashDsvMod.DSVParsedArray[d3DashDsvLib.d3DashDsvMod.DSVRowString]] = js.native
  def csv[ParsedRow /* <: d3DashDsvLib.d3DashDsvMod.DSVRowAny */](
    url: java.lang.String,
    init: stdLib.RequestInit,
    row: js.Function3[
      /* rawRow */ d3DashDsvLib.d3DashDsvMod.DSVRowString, 
      /* index */ scala.Double, 
      /* columns */ js.Array[java.lang.String], 
      js.UndefOr[ParsedRow | scala.Null]
    ]
  ): stdLib.Promise[d3DashDsvLib.d3DashDsvMod.DSVParsedArray[ParsedRow]] = js.native
  def csv[ParsedRow /* <: d3DashDsvLib.d3DashDsvMod.DSVRowAny */](
    url: java.lang.String,
    row: js.Function3[
      /* rawRow */ d3DashDsvLib.d3DashDsvMod.DSVRowString, 
      /* index */ scala.Double, 
      /* columns */ js.Array[java.lang.String], 
      js.UndefOr[ParsedRow | scala.Null]
    ]
  ): stdLib.Promise[d3DashDsvLib.d3DashDsvMod.DSVParsedArray[ParsedRow]] = js.native
  def dsv(delimiter: java.lang.String, url: java.lang.String): stdLib.Promise[d3DashDsvLib.d3DashDsvMod.DSVParsedArray[d3DashDsvLib.d3DashDsvMod.DSVRowString]] = js.native
  def dsv(delimiter: java.lang.String, url: java.lang.String, init: stdLib.RequestInit): stdLib.Promise[d3DashDsvLib.d3DashDsvMod.DSVParsedArray[d3DashDsvLib.d3DashDsvMod.DSVRowString]] = js.native
  def dsv[ParsedRow /* <: d3DashDsvLib.d3DashDsvMod.DSVRowAny */](
    delimiter: java.lang.String,
    url: java.lang.String,
    init: stdLib.RequestInit,
    row: js.Function3[
      /* rawRow */ d3DashDsvLib.d3DashDsvMod.DSVRowString, 
      /* index */ scala.Double, 
      /* columns */ js.Array[java.lang.String], 
      js.UndefOr[ParsedRow | scala.Null]
    ]
  ): stdLib.Promise[d3DashDsvLib.d3DashDsvMod.DSVParsedArray[ParsedRow]] = js.native
  def dsv[ParsedRow /* <: d3DashDsvLib.d3DashDsvMod.DSVRowAny */](
    delimiter: java.lang.String,
    url: java.lang.String,
    row: js.Function3[
      /* rawRow */ d3DashDsvLib.d3DashDsvMod.DSVRowString, 
      /* index */ scala.Double, 
      /* columns */ js.Array[java.lang.String], 
      js.UndefOr[ParsedRow | scala.Null]
    ]
  ): stdLib.Promise[d3DashDsvLib.d3DashDsvMod.DSVParsedArray[ParsedRow]] = js.native
  def html(url: java.lang.String): stdLib.Promise[stdLib.Document] = js.native
  def html(url: java.lang.String, init: stdLib.RequestInit): stdLib.Promise[stdLib.Document] = js.native
  def image(url: java.lang.String): stdLib.Promise[stdLib.HTMLImageElement] = js.native
  def image(url: java.lang.String, init: ScalablyTyped.runtime.StringDictionary[js.Any]): stdLib.Promise[stdLib.HTMLImageElement] = js.native
  def json[ParsedJSONObject /* <: js.Any */](url: java.lang.String): stdLib.Promise[ParsedJSONObject] = js.native
  def json[ParsedJSONObject /* <: js.Any */](url: java.lang.String, init: stdLib.RequestInit): stdLib.Promise[ParsedJSONObject] = js.native
  def svg(url: java.lang.String): stdLib.Promise[stdLib.Document] = js.native
  def svg(url: java.lang.String, init: stdLib.RequestInit): stdLib.Promise[stdLib.Document] = js.native
  def text(url: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def text(url: java.lang.String, init: stdLib.RequestInit): stdLib.Promise[java.lang.String] = js.native
  def tsv(url: java.lang.String): stdLib.Promise[d3DashDsvLib.d3DashDsvMod.DSVParsedArray[d3DashDsvLib.d3DashDsvMod.DSVRowString]] = js.native
  def tsv(url: java.lang.String, init: stdLib.RequestInit): stdLib.Promise[d3DashDsvLib.d3DashDsvMod.DSVParsedArray[d3DashDsvLib.d3DashDsvMod.DSVRowString]] = js.native
  def tsv[ParsedRow /* <: d3DashDsvLib.d3DashDsvMod.DSVRowAny */](
    url: java.lang.String,
    init: stdLib.RequestInit,
    row: js.Function3[
      /* rawRow */ d3DashDsvLib.d3DashDsvMod.DSVRowString, 
      /* index */ scala.Double, 
      /* columns */ js.Array[java.lang.String], 
      js.UndefOr[ParsedRow | scala.Null]
    ]
  ): stdLib.Promise[d3DashDsvLib.d3DashDsvMod.DSVParsedArray[ParsedRow]] = js.native
  def tsv[ParsedRow /* <: d3DashDsvLib.d3DashDsvMod.DSVRowAny */](
    url: java.lang.String,
    row: js.Function3[
      /* rawRow */ d3DashDsvLib.d3DashDsvMod.DSVRowString, 
      /* index */ scala.Double, 
      /* columns */ js.Array[java.lang.String], 
      js.UndefOr[ParsedRow | scala.Null]
    ]
  ): stdLib.Promise[d3DashDsvLib.d3DashDsvMod.DSVParsedArray[ParsedRow]] = js.native
  def xml(url: java.lang.String): stdLib.Promise[stdLib.XMLDocument] = js.native
  def xml(url: java.lang.String, init: stdLib.RequestInit): stdLib.Promise[stdLib.XMLDocument] = js.native
}

