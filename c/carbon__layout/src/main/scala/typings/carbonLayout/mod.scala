package typings.carbonLayout

import typings.carbonLayout.anon.Columns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@carbon/layout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@carbon/layout", "baseFontSize")
  @js.native
  val baseFontSize: Double = js.native
  
  inline def breakpoint(args: js.Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("breakpoint")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def breakpointDown(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("breakpointDown")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def breakpointUp(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("breakpointUp")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object breakpoints {
    
    @JSImport("@carbon/layout", "breakpoints")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@carbon/layout", "breakpoints.lg")
    @js.native
    def lg: Columns = js.native
    inline def lg_=(x: Columns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lg")(x.asInstanceOf[js.Any])
    
    @JSImport("@carbon/layout", "breakpoints.max")
    @js.native
    def max: Columns = js.native
    inline def max_=(x: Columns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max")(x.asInstanceOf[js.Any])
    
    @JSImport("@carbon/layout", "breakpoints.md")
    @js.native
    def md: Columns = js.native
    inline def md_=(x: Columns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("md")(x.asInstanceOf[js.Any])
    
    @JSImport("@carbon/layout", "breakpoints.sm")
    @js.native
    def sm: Columns = js.native
    inline def sm_=(x: Columns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sm")(x.asInstanceOf[js.Any])
    
    @JSImport("@carbon/layout", "breakpoints.xlg")
    @js.native
    def xlg: Columns = js.native
    inline def xlg_=(x: Columns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xlg")(x.asInstanceOf[js.Any])
  }
  
  inline def em(px: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("em")(px.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@carbon/layout", "miniUnit")
  @js.native
  val miniUnit: Double = js.native
  
  inline def miniUnits(count: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("miniUnits")(count.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def px(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("px")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def rem(px: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rem")(px.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@carbon/layout", "spacing")
  @js.native
  val spacing: js.Array[Double] = js.native
}
