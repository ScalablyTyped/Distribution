package typings.carbonElements.mod

import typings.carbonElements.anon.Expressive
import typings.carbonElements.anon.ExpressiveProductive
import typings.carbonElements.anon.Productive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object easings {
  
  @JSImport("@carbon/elements", "easings")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@carbon/elements", "easings.entrance")
  @js.native
  def entrance: Productive = js.native
  inline def entrance_=(x: Productive): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("entrance")(x.asInstanceOf[js.Any])
  
  @JSImport("@carbon/elements", "easings.exit")
  @js.native
  def exit: ExpressiveProductive = js.native
  inline def exit_=(x: ExpressiveProductive): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exit")(x.asInstanceOf[js.Any])
  
  @JSImport("@carbon/elements", "easings.standard")
  @js.native
  def standard: Expressive = js.native
  inline def standard_=(x: Expressive): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("standard")(x.asInstanceOf[js.Any])
}
