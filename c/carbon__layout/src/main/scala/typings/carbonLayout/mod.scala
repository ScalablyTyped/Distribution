package typings.carbonLayout

import typings.carbonLayout.anon.Columns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@carbon/layout", "baseFontSize")
  @js.native
  val baseFontSize: Double = js.native
  
  object breakpoint {
    
    @scala.inline
    def apply(args: js.Any*): String = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("@carbon/layout", "breakpoint")
    @js.native
    val ^ : js.Any = js.native
  }
  
  object breakpointDown {
    
    @scala.inline
    def apply(name: String): String = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("@carbon/layout", "breakpointDown")
    @js.native
    val ^ : js.Any = js.native
  }
  
  object breakpointUp {
    
    @scala.inline
    def apply(name: String): String = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("@carbon/layout", "breakpointUp")
    @js.native
    val ^ : js.Any = js.native
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
    
    @scala.inline
    def apply(px: Double): String = ^.asInstanceOf[js.Dynamic].apply(px.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("@carbon/layout", "em")
    @js.native
    val ^ : js.Any = js.native
  }
  
  @JSImport("@carbon/layout", "miniUnit")
  @js.native
  val miniUnit: Double = js.native
  
  object miniUnits {
    
    @scala.inline
    def apply(count: Double): String = ^.asInstanceOf[js.Dynamic].apply(count.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("@carbon/layout", "miniUnits")
    @js.native
    val ^ : js.Any = js.native
  }
  
  object px {
    
    @scala.inline
    def apply(value: Double): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("@carbon/layout", "px")
    @js.native
    val ^ : js.Any = js.native
  }
  
  object rem {
    
    @scala.inline
    def apply(px: Double): String = ^.asInstanceOf[js.Dynamic].apply(px.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("@carbon/layout", "rem")
    @js.native
    val ^ : js.Any = js.native
  }
  
  @JSImport("@carbon/layout", "spacing")
  @js.native
  val spacing: js.Array[Double] = js.native
}
