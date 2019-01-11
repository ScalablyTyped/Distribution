package typings
package d3DashRequestLib.d3DashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-request", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def csv(url: java.lang.String): d3DashRequestLib.d3DashRequestMod.DsvRequest = js.native
  def csv(
    url: java.lang.String,
    callback: js.ThisFunction2[
      /* this */ d3DashRequestLib.d3DashRequestMod.DsvRequest, 
      /* error */ js.Any, 
      /* d */ d3DashDsvLib.d3DashDsvMod.DSVParsedArray[d3DashDsvLib.d3DashDsvMod.DSVRowString[java.lang.String]], 
      scala.Unit
    ]
  ): d3DashRequestLib.d3DashRequestMod.DsvRequest = js.native
  def csv[ParsedRow /* <: js.Object */](
    url: java.lang.String,
    row: js.Function3[
      /* rawRow */ d3DashDsvLib.d3DashDsvMod.DSVRowString[java.lang.String], 
      /* index */ scala.Double, 
      /* columns */ js.Array[java.lang.String], 
      ParsedRow
    ],
    callback: js.ThisFunction2[
      /* this */ d3DashRequestLib.d3DashRequestMod.DsvRequest, 
      /* error */ js.Any, 
      /* d */ d3DashDsvLib.d3DashDsvMod.DSVParsedArray[ParsedRow], 
      scala.Unit
    ]
  ): d3DashRequestLib.d3DashRequestMod.DsvRequest = js.native
  def html(url: java.lang.String): d3DashRequestLib.d3DashRequestMod.Request = js.native
  def html(
    url: java.lang.String,
    callback: js.ThisFunction2[
      /* this */ d3DashRequestLib.d3DashRequestMod.Request, 
      /* error */ js.Any, 
      /* d */ stdLib.DocumentFragment, 
      scala.Unit
    ]
  ): d3DashRequestLib.d3DashRequestMod.Request = js.native
  def json(url: java.lang.String): d3DashRequestLib.d3DashRequestMod.Request = js.native
  def json[ParsedObject /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    url: java.lang.String,
    callback: js.ThisFunction2[
      /* this */ d3DashRequestLib.d3DashRequestMod.Request, 
      /* error */ js.Any, 
      /* d */ ParsedObject, 
      scala.Unit
    ]
  ): d3DashRequestLib.d3DashRequestMod.Request = js.native
  def request(url: java.lang.String): d3DashRequestLib.d3DashRequestMod.Request = js.native
  def request(
    url: java.lang.String,
    callback: js.ThisFunction2[
      /* this */ d3DashRequestLib.d3DashRequestMod.Request, 
      /* error */ js.Any, 
      /* d */ stdLib.XMLHttpRequest, 
      scala.Unit
    ]
  ): d3DashRequestLib.d3DashRequestMod.Request = js.native
  def text(url: java.lang.String): d3DashRequestLib.d3DashRequestMod.Request = js.native
  def text(
    url: java.lang.String,
    callback: js.ThisFunction2[
      /* this */ d3DashRequestLib.d3DashRequestMod.Request, 
      /* error */ js.Any, 
      /* d */ java.lang.String, 
      scala.Unit
    ]
  ): d3DashRequestLib.d3DashRequestMod.Request = js.native
  def tsv(url: java.lang.String): d3DashRequestLib.d3DashRequestMod.DsvRequest = js.native
  def tsv(
    url: java.lang.String,
    callback: js.ThisFunction2[
      /* this */ d3DashRequestLib.d3DashRequestMod.DsvRequest, 
      /* error */ js.Any, 
      /* d */ d3DashDsvLib.d3DashDsvMod.DSVParsedArray[d3DashDsvLib.d3DashDsvMod.DSVRowString[java.lang.String]], 
      scala.Unit
    ]
  ): d3DashRequestLib.d3DashRequestMod.DsvRequest = js.native
  def tsv[ParsedRow /* <: js.Object */](
    url: java.lang.String,
    row: js.Function3[
      /* rawRow */ d3DashDsvLib.d3DashDsvMod.DSVRowString[java.lang.String], 
      /* index */ scala.Double, 
      /* columns */ js.Array[java.lang.String], 
      ParsedRow
    ],
    callback: js.ThisFunction2[
      /* this */ d3DashRequestLib.d3DashRequestMod.DsvRequest, 
      /* error */ js.Any, 
      /* d */ d3DashDsvLib.d3DashDsvMod.DSVParsedArray[ParsedRow], 
      scala.Unit
    ]
  ): d3DashRequestLib.d3DashRequestMod.DsvRequest = js.native
  def xml(url: java.lang.String): d3DashRequestLib.d3DashRequestMod.Request = js.native
  def xml(
    url: java.lang.String,
    callback: js.ThisFunction2[
      /* this */ d3DashRequestLib.d3DashRequestMod.Request, 
      /* error */ js.Any, 
      /* d */ js.Any, 
      scala.Unit
    ]
  ): d3DashRequestLib.d3DashRequestMod.Request = js.native
}

