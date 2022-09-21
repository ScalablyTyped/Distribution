package typings.cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isLeapYearMod {
  
  @JSImport("cesium/Source/Core/isLeapYear", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(year: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(year.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
