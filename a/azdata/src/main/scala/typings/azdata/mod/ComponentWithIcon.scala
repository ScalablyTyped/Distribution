package typings.azdata.mod

import typings.azdata.anon.Dark
import typings.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentWithIcon extends StObject {
  
  /**
    * @deprecated This will be moved to `ComponentWithIconProperties`
    */
  var iconHeight: js.UndefOr[Double | String] = js.undefined
  
  /**
    * @deprecated This will be moved to `ComponentWithIconProperties`
    */
  var iconPath: js.UndefOr[String | Uri | Dark] = js.undefined
  
  /**
    * @deprecated This will be moved to `ComponentWithIconProperties`
    */
  var iconWidth: js.UndefOr[Double | String] = js.undefined
}
object ComponentWithIcon {
  
  @scala.inline
  def apply(): ComponentWithIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentWithIcon]
  }
  
  @scala.inline
  implicit class ComponentWithIconMutableBuilder[Self <: ComponentWithIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconHeight(value: Double | String): Self = StObject.set(x, "iconHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconHeightUndefined: Self = StObject.set(x, "iconHeight", js.undefined)
    
    @scala.inline
    def setIconPath(value: String | Uri | Dark): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPathUndefined: Self = StObject.set(x, "iconPath", js.undefined)
    
    @scala.inline
    def setIconWidth(value: Double | String): Self = StObject.set(x, "iconWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconWidthUndefined: Self = StObject.set(x, "iconWidth", js.undefined)
  }
}
