package typings
package crossDashFetchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Body
  extends org.scalablytyped.runtime.Instantiable1[/* body */ stdLib.BodyInit, stdLib.Response]
     with org.scalablytyped.runtime.Instantiable0[stdLib.Response]
     with org.scalablytyped.runtime.Instantiable2[
      (/* body */ stdLib.BodyInit) | (/* body */ scala.Null), 
      /* init */ stdLib.ResponseInit, 
      stdLib.Response
    ] {
  def error(): stdLib.Response = js.native
  def redirect(url: java.lang.String): stdLib.Response = js.native
  def redirect(url: java.lang.String, status: scala.Double): stdLib.Response = js.native
}

