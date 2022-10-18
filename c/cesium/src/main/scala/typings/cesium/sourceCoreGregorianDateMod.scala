package typings.cesium

import typings.cesium.mod.GregorianDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreGregorianDateMod {
  
  @JSImport("cesium/Source/Core/GregorianDate", JSImport.Default)
  @js.native
  open class default protected () extends GregorianDate {
    def this(
      year: js.UndefOr[Double],
      month: js.UndefOr[Double],
      day: js.UndefOr[Double],
      hour: js.UndefOr[Double],
      minute: js.UndefOr[Double],
      second: js.UndefOr[Double],
      millisecond: js.UndefOr[Double],
      isLeapSecond: js.UndefOr[Boolean]
    ) = this()
  }
}
