package typings.blueprintjsCore

import typings.blueprintjsCore.propsMod.IActionProps
import typings.blueprintjsCore.propsMod.ILinkProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/breadcrumbs/breadcrumb", "Breadcrumb")
  @js.native
  val Breadcrumb: FunctionComponent[IBreadcrumbProps] = js.native
  
  @js.native
  trait IBreadcrumbProps
    extends IActionProps
       with ILinkProps {
    
    /** Whether this breadcrumb is the current breadcrumb. */
    var current: js.UndefOr[Boolean] = js.native
  }
  object IBreadcrumbProps {
    
    @scala.inline
    def apply(): IBreadcrumbProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBreadcrumbProps]
    }
    
    @scala.inline
    implicit class IBreadcrumbPropsMutableBuilder[Self <: IBreadcrumbProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    }
  }
}
