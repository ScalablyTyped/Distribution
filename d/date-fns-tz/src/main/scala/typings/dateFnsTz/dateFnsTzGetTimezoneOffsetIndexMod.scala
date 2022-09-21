package typings.dateFnsTz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateFnsTzGetTimezoneOffsetIndexMod {
  
  inline def apply(timeZone: String): Double = ^.asInstanceOf[js.Dynamic].apply(timeZone.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(timeZone: String, date: js.Date): Double = (^.asInstanceOf[js.Dynamic].apply(timeZone.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(timeZone: String, date: Double): Double = (^.asInstanceOf[js.Dynamic].apply(timeZone.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("date-fns-tz/getTimezoneOffset/index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
