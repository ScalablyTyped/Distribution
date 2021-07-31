package typings.baseui.menuMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulMenuProps
  extends StObject
     with StatefulContainerProps
     with MenuProps
object StatefulMenuProps {
  
  @scala.inline
  def apply(items: ItemsT): StatefulMenuProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulMenuProps]
  }
}
