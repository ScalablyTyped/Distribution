package typings.baseui.menuTypesMod

import typings.baseui.anon.Body
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatelessMenuProfileProps
  extends StObject
     with SharedStatelessProps
     with MenuProfileProps
object StatelessMenuProfileProps {
  
  inline def apply(
    getProfileItemImg: /* item */ Item => String | ComponentType[Any],
    getProfileItemImgText: /* item */ Item => String,
    getProfileItemLabels: /* item */ Item => Body,
    items: Items
  ): StatelessMenuProfileProps = {
    val __obj = js.Dynamic.literal(getProfileItemImg = js.Any.fromFunction1(getProfileItemImg), getProfileItemImgText = js.Any.fromFunction1(getProfileItemImgText), getProfileItemLabels = js.Any.fromFunction1(getProfileItemLabels), items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatelessMenuProfileProps]
  }
}
