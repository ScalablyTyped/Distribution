package typings.carbonElements.mod

import typings.carbonElements.anon.Columns
import typings.carbonElements.anon.ColumnsMargin
import typings.carbonElements.anon.Margin
import typings.carbonElements.anon.MarginWidth
import typings.carbonElements.anon.Width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breakpoints {
  
  @JSImport("@carbon/elements", "breakpoints")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@carbon/elements", "breakpoints.lg")
  @js.native
  def lg: Width = js.native
  inline def lg_=(x: Width): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lg")(x.asInstanceOf[js.Any])
  
  @JSImport("@carbon/elements", "breakpoints.max")
  @js.native
  def max: MarginWidth = js.native
  inline def max_=(x: MarginWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max")(x.asInstanceOf[js.Any])
  
  @JSImport("@carbon/elements", "breakpoints.md")
  @js.native
  def md: Margin = js.native
  inline def md_=(x: Margin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("md")(x.asInstanceOf[js.Any])
  
  @JSImport("@carbon/elements", "breakpoints.sm")
  @js.native
  def sm: Columns = js.native
  inline def sm_=(x: Columns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sm")(x.asInstanceOf[js.Any])
  
  @JSImport("@carbon/elements", "breakpoints.xlg")
  @js.native
  def xlg: ColumnsMargin = js.native
  inline def xlg_=(x: ColumnsMargin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xlg")(x.asInstanceOf[js.Any])
}
