package typings.d3DashRequest.d3DashRequestMod

import org.scalablytyped.runtime.StringDictionary
import typings.d3DashDsv.d3DashDsvMod.DSVParsedArray
import typings.d3DashDsv.d3DashDsvMod.DSVRowString
import typings.std.DocumentFragment
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-request", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def csv(url: String): DsvRequest = js.native
  def csv(
    url: String,
    callback: js.ThisFunction2[
      /* this */ DsvRequest, 
      /* error */ js.Any, 
      /* d */ DSVParsedArray[DSVRowString[String]], 
      Unit
    ]
  ): DsvRequest = js.native
  def csv[ParsedRow /* <: js.Object */](
    url: String,
    row: js.Function3[
      /* rawRow */ DSVRowString[String], 
      /* index */ Double, 
      /* columns */ js.Array[String], 
      ParsedRow
    ],
    callback: js.ThisFunction2[/* this */ DsvRequest, /* error */ js.Any, /* d */ DSVParsedArray[ParsedRow], Unit]
  ): DsvRequest = js.native
  def html(url: String): Request = js.native
  def html(
    url: String,
    callback: js.ThisFunction2[/* this */ Request, /* error */ js.Any, /* d */ DocumentFragment, Unit]
  ): Request = js.native
  def json(url: String): Request = js.native
  def json[ParsedObject /* <: StringDictionary[js.Any] */](
    url: String,
    callback: js.ThisFunction2[/* this */ Request, /* error */ js.Any, /* d */ ParsedObject, Unit]
  ): Request = js.native
  def request(url: String): Request = js.native
  def request(
    url: String,
    callback: js.ThisFunction2[/* this */ Request, /* error */ js.Any, /* d */ XMLHttpRequest, Unit]
  ): Request = js.native
  def text(url: String): Request = js.native
  def text(
    url: String,
    callback: js.ThisFunction2[/* this */ Request, /* error */ js.Any, /* d */ String, Unit]
  ): Request = js.native
  def tsv(url: String): DsvRequest = js.native
  def tsv(
    url: String,
    callback: js.ThisFunction2[
      /* this */ DsvRequest, 
      /* error */ js.Any, 
      /* d */ DSVParsedArray[DSVRowString[String]], 
      Unit
    ]
  ): DsvRequest = js.native
  def tsv[ParsedRow /* <: js.Object */](
    url: String,
    row: js.Function3[
      /* rawRow */ DSVRowString[String], 
      /* index */ Double, 
      /* columns */ js.Array[String], 
      ParsedRow
    ],
    callback: js.ThisFunction2[/* this */ DsvRequest, /* error */ js.Any, /* d */ DSVParsedArray[ParsedRow], Unit]
  ): DsvRequest = js.native
  def xml(url: String): Request = js.native
  def xml(
    url: String,
    callback: js.ThisFunction2[/* this */ Request, /* error */ js.Any, /* d */ js.Any, Unit]
  ): Request = js.native
}

