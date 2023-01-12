package typings.baseui.menuTypesMod

import typings.baseui.anon.Body
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuProfileProps extends StObject {
  
  /** Returns either an image source url, or a full React component to render as the image. */
  var getProfileItemImg: GetProfileItemImgFn
  
  /** Returns the alt text for the image */
  var getProfileItemImgText: GetProfileItemImgTextFn
  
  /** Returns an object consisting of title, subtitle, and body to render menu item */
  var getProfileItemLabels: GetProfileItemLabelsFn
  
  var overrides: js.UndefOr[ProfileOverrides] = js.undefined
}
object MenuProfileProps {
  
  inline def apply(
    getProfileItemImg: /* item */ Item => String | ComponentType[Any],
    getProfileItemImgText: /* item */ Item => String,
    getProfileItemLabels: /* item */ Item => Body
  ): MenuProfileProps = {
    val __obj = js.Dynamic.literal(getProfileItemImg = js.Any.fromFunction1(getProfileItemImg), getProfileItemImgText = js.Any.fromFunction1(getProfileItemImgText), getProfileItemLabels = js.Any.fromFunction1(getProfileItemLabels))
    __obj.asInstanceOf[MenuProfileProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuProfileProps] (val x: Self) extends AnyVal {
    
    inline def setGetProfileItemImg(value: /* item */ Item => String | ComponentType[Any]): Self = StObject.set(x, "getProfileItemImg", js.Any.fromFunction1(value))
    
    inline def setGetProfileItemImgText(value: /* item */ Item => String): Self = StObject.set(x, "getProfileItemImgText", js.Any.fromFunction1(value))
    
    inline def setGetProfileItemLabels(value: /* item */ Item => Body): Self = StObject.set(x, "getProfileItemLabels", js.Any.fromFunction1(value))
    
    inline def setOverrides(value: ProfileOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
  }
}
