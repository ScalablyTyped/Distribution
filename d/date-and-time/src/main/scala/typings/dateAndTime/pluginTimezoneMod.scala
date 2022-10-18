package typings.dateAndTime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginTimezoneMod {
  
  @JSImport("date-and-time/plugin/timezone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(date: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(date: Any, localized_date: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(date.asInstanceOf[js.Any], localized_date.asInstanceOf[js.Any])).asInstanceOf[String]
}
