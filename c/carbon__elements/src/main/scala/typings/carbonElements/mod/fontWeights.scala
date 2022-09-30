package typings.carbonElements.mod

import typings.carbonElements.carbonElementsInts.`300`
import typings.carbonElements.carbonElementsInts.`400`
import typings.carbonElements.carbonElementsInts.`600`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontWeights {
  
  @JSImport("@carbon/elements", "fontWeights")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@carbon/elements", "fontWeights.light")
  @js.native
  def light: `300` = js.native
  inline def light_=(x: `300`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("light")(x.asInstanceOf[js.Any])
  
  @JSImport("@carbon/elements", "fontWeights.regular")
  @js.native
  def regular: `400` = js.native
  inline def regular_=(x: `400`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regular")(x.asInstanceOf[js.Any])
  
  @JSImport("@carbon/elements", "fontWeights.semibold")
  @js.native
  def semibold: `600` = js.native
  inline def semibold_=(x: `600`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("semibold")(x.asInstanceOf[js.Any])
}
