package typings.chartJs.mod

import typings.chartJs.typesAdaptersMod.DateAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapters {
  
  @JSImport("chart.js", "_adapters")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chart.js", "_adapters._date")
  @js.native
  def date: DateAdapter = js.native
  
  inline def date_=(x: DateAdapter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_date")(x.asInstanceOf[js.Any])
}
