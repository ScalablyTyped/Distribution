package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsUishellSideNavDividerMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/UIShell/SideNavDivider", JSImport.Default)
  @js.native
  val default: FC[SideNavDividerProps] = js.native
  
  trait SideNavDividerProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
  }
  object SideNavDividerProps {
    
    inline def apply(): SideNavDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SideNavDividerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SideNavDividerProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  type _To = FC[SideNavDividerProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsUishellSideNavDividerMod.foo` */
  override def _to: FC[SideNavDividerProps] = default
}
