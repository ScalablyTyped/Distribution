package typings.bizcharts

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gComponentsBaseMod {
  
  @JSImport("bizcharts/lib/g-components/Base", JSImport.Default)
  @js.native
  open class default[T] () extends Base[T]
  
  @js.native
  trait Base[T]
    extends Component[T, js.Object, Any] {
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MBase(): Unit = js.native
    
    def getInstance(): Any = js.native
    
    var helper: typings.bizcharts.helperMod.default = js.native
  }
}
