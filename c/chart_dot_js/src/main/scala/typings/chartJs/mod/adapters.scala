package typings.chartJs.mod

import org.scalablytyped.runtime.Instantiable1
import typings.chartJs.anon.TypeofDateAdapterBase
import typings.chartJs.distCoreCoreDotadaptersMod.DateAdapterBase
import typings.chartJs.distTypesBasicMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapters {
  
  @JSImport("chart.js", "_adapters")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("chart.js", "_adapters._date")
  @js.native
  open class date protected ()
    extends StObject
       with DateAdapterBase {
    def this(options: AnyObject) = this()
  }
  
  @JSImport("chart.js", "_adapters._date")
  @js.native
  def date: TypeofDateAdapterBase & (Instantiable1[/* options */ AnyObject, DateAdapterBase]) = js.native
  
  inline def date_=(x: TypeofDateAdapterBase & (Instantiable1[/* options */ AnyObject, DateAdapterBase])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_date")(x.asInstanceOf[js.Any])
}
