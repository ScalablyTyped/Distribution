package typings.carbonLayout

import typings.carbonLayout.anon.Columns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@carbon/layout", "baseFontSize")
  @js.native
  val baseFontSize: Double = js.native
  
  object breakpoint {
    
    @JSImport("@carbon/layout", "breakpoint")
    @js.native
    def apply(args: js.Any*): String = js.native
  }
  
  object breakpointDown {
    
    @JSImport("@carbon/layout", "breakpointDown")
    @js.native
    def apply(name: String): String = js.native
  }
  
  object breakpointUp {
    
    @JSImport("@carbon/layout", "breakpointUp")
    @js.native
    def apply(name: String): String = js.native
  }
  
  object breakpoints {
    
    @JSImport("@carbon/layout", "breakpoints")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@carbon/layout", "breakpoints.lg")
    @js.native
    def lg: Columns = js.native
    @scala.inline
    def lg_=(x: Columns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lg")(x.asInstanceOf[js.Any])
    
    @JSImport("@carbon/layout", "breakpoints.max")
    @js.native
    def max: Columns = js.native
    @scala.inline
    def max_=(x: Columns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max")(x.asInstanceOf[js.Any])
    
    @JSImport("@carbon/layout", "breakpoints.md")
    @js.native
    def md: Columns = js.native
    @scala.inline
    def md_=(x: Columns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("md")(x.asInstanceOf[js.Any])
    
    @JSImport("@carbon/layout", "breakpoints.sm")
    @js.native
    def sm: Columns = js.native
    @scala.inline
    def sm_=(x: Columns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sm")(x.asInstanceOf[js.Any])
    
    @JSImport("@carbon/layout", "breakpoints.xlg")
    @js.native
    def xlg: Columns = js.native
    @scala.inline
    def xlg_=(x: Columns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xlg")(x.asInstanceOf[js.Any])
  }
  
  object em {
    
    @JSImport("@carbon/layout", "em")
    @js.native
    def apply(px: Double): String = js.native
  }
  
  @JSImport("@carbon/layout", "miniUnit")
  @js.native
  val miniUnit: Double = js.native
  
  object miniUnits {
    
    @JSImport("@carbon/layout", "miniUnits")
    @js.native
    def apply(count: Double): String = js.native
  }
  
  object px {
    
    @JSImport("@carbon/layout", "px")
    @js.native
    def apply(value: Double): String = js.native
  }
  
  object rem {
    
    @JSImport("@carbon/layout", "rem")
    @js.native
    def apply(px: Double): String = js.native
  }
  
  @JSImport("@carbon/layout", "spacing")
  @js.native
  val spacing: js.Array[Double] = js.native
}
