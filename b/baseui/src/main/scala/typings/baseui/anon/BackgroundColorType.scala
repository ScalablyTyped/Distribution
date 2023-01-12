package typings.baseui.anon

import typings.baseui.baseuiStrings.dark
import typings.baseui.baseuiStrings.light
import typings.baseui.baseuiStrings.top
import typings.baseui.baseuiStrings.trailing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColorType extends StObject {
  
  @JSName("$backgroundColor")
  var $backgroundColor: String
  
  @JSName("$backgroundColorType")
  var $backgroundColorType: /* keyof baseui.anon.Readonlyreadonlylightligh */ light | dark
  
  @JSName("$imageLayout")
  var $imageLayout: js.UndefOr[top | trailing] = js.undefined
}
object BackgroundColorType {
  
  inline def apply(
    $backgroundColor: String,
    $backgroundColorType: /* keyof baseui.anon.Readonlyreadonlylightligh */ light | dark
  ): BackgroundColorType = {
    val __obj = js.Dynamic.literal($backgroundColor = $backgroundColor.asInstanceOf[js.Any], $backgroundColorType = $backgroundColorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundColorType] (val x: Self) extends AnyVal {
    
    inline def set$backgroundColor(value: String): Self = StObject.set(x, "$backgroundColor", value.asInstanceOf[js.Any])
    
    inline def set$backgroundColorType(value: /* keyof baseui.anon.Readonlyreadonlylightligh */ light | dark): Self = StObject.set(x, "$backgroundColorType", value.asInstanceOf[js.Any])
    
    inline def set$imageLayout(value: top | trailing): Self = StObject.set(x, "$imageLayout", value.asInstanceOf[js.Any])
    
    inline def set$imageLayoutUndefined: Self = StObject.set(x, "$imageLayout", js.undefined)
  }
}
