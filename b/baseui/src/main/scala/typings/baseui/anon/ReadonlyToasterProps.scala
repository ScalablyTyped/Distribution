package typings.baseui.anon

import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.bottomLeft
import typings.baseui.baseuiStrings.bottomRight
import typings.baseui.baseuiStrings.top
import typings.baseui.baseuiStrings.topLeft
import typings.baseui.baseuiStrings.topRight
import typings.baseui.toastMod.ToasterOverrides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<baseui.baseui/toast.ToasterProps> */
@js.native
trait ReadonlyToasterProps extends StObject {
  
  val autoHideDuration: js.UndefOr[Double] = js.native
  
  val overrides: js.UndefOr[ToasterOverrides] = js.native
  
  val placement: js.UndefOr[topLeft | topRight | bottomLeft | bottomRight | bottom | top] = js.native
  
  val usePortal: js.UndefOr[Boolean] = js.native
}
object ReadonlyToasterProps {
  
  @scala.inline
  def apply(): ReadonlyToasterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyToasterProps]
  }
  
  @scala.inline
  implicit class ReadonlyToasterPropsMutableBuilder[Self <: ReadonlyToasterProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoHideDuration(value: Double): Self = StObject.set(x, "autoHideDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoHideDurationUndefined: Self = StObject.set(x, "autoHideDuration", js.undefined)
    
    @scala.inline
    def setOverrides(value: ToasterOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setPlacement(value: topLeft | topRight | bottomLeft | bottomRight | bottom | top): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
  }
}
