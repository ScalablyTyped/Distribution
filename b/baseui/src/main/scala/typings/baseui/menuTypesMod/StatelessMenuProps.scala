package typings.baseui.menuTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatelessMenuProps
  extends StObject
     with SharedStatelessProps
     with MenuProps
object StatelessMenuProps {
  
  inline def apply(items: Items): StatelessMenuProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatelessMenuProps]
  }
}
