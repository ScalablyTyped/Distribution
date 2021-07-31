package typings.baseui.menuMod

import typings.baseui.anon.Body
import typings.baseui.anon.ListItemProfile
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionProfileProps
  extends StObject
     with BaseMenuPropsT {
  
  @JSName("$isHighlighted")
  var $isHighlighted: js.UndefOr[Boolean] = js.undefined
  
  var getChildMenu: js.UndefOr[js.Function1[/* item */ js.Any, ReactNode]] = js.undefined
  
  def getProfileItemImg(item: js.Any): String | ComponentType[js.Any]
  
  def getProfileItemImgText(item: js.Any): String
  
  def getProfileItemLabels(item: js.Any): Body
  
  var item: js.Any
  
  var overrides: js.UndefOr[ListItemProfile] = js.undefined
  
  var resetMenu: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object OptionProfileProps {
  
  @scala.inline
  def apply(
    getProfileItemImg: js.Any => String | ComponentType[js.Any],
    getProfileItemImgText: js.Any => String,
    getProfileItemLabels: js.Any => Body,
    item: js.Any
  ): OptionProfileProps = {
    val __obj = js.Dynamic.literal(getProfileItemImg = js.Any.fromFunction1(getProfileItemImg), getProfileItemImgText = js.Any.fromFunction1(getProfileItemImgText), getProfileItemLabels = js.Any.fromFunction1(getProfileItemLabels), item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionProfileProps]
  }
  
  @scala.inline
  implicit class OptionProfilePropsMutableBuilder[Self <: OptionProfileProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$isHighlighted(value: Boolean): Self = StObject.set(x, "$isHighlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isHighlightedUndefined: Self = StObject.set(x, "$isHighlighted", js.undefined)
    
    @scala.inline
    def setGetChildMenu(value: /* item */ js.Any => ReactNode): Self = StObject.set(x, "getChildMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetChildMenuUndefined: Self = StObject.set(x, "getChildMenu", js.undefined)
    
    @scala.inline
    def setGetProfileItemImg(value: js.Any => String | ComponentType[js.Any]): Self = StObject.set(x, "getProfileItemImg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetProfileItemImgText(value: js.Any => String): Self = StObject.set(x, "getProfileItemImgText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetProfileItemLabels(value: js.Any => Body): Self = StObject.set(x, "getProfileItemLabels", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrides(value: ListItemProfile): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setResetMenu(value: () => Unit): Self = StObject.set(x, "resetMenu", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetMenuUndefined: Self = StObject.set(x, "resetMenu", js.undefined)
  }
}
