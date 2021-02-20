package typings.carbonMotion

import typings.carbonMotion.anon.Expressive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object easings {
    
    @JSImport("@carbon/motion", "easings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@carbon/motion", "easings.entrance")
    @js.native
    def entrance: Expressive = js.native
    @scala.inline
    def entrance_=(x: Expressive): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("entrance")(x.asInstanceOf[js.Any])
    
    @JSImport("@carbon/motion", "easings.exit")
    @js.native
    def exit: Expressive = js.native
    @scala.inline
    def exit_=(x: Expressive): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exit")(x.asInstanceOf[js.Any])
    
    @JSImport("@carbon/motion", "easings.standard")
    @js.native
    def standard: Expressive = js.native
    @scala.inline
    def standard_=(x: Expressive): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("standard")(x.asInstanceOf[js.Any])
  }
  
  object motion {
    
    @JSImport("@carbon/motion", "motion")
    @js.native
    def apply(name: String, mode: String): String = js.native
  }
}
