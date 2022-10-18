package typings.baseui

import typings.baseui.phoneInputTypesMod.CountryIso
import typings.baseui.phoneInputTypesMod.Size
import typings.react.mod.global.JSX.Element
import typings.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phoneInputFlagMod {
  
  @JSImport("baseui/phone-input/flag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: FlagProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/phone-input/flag", "StyledFlag")
  @js.native
  val StyledFlag: StyletronComponent[js.Function1[/* props */ FlagProps, Element], SizeStyleProps] = js.native
  
  trait FlagProps extends StObject {
    
    @JSName("$iso")
    var $iso: CountryIso
    
    var iso: js.UndefOr[CountryIso] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object FlagProps {
    
    inline def apply($iso: CountryIso): FlagProps = {
      val __obj = js.Dynamic.literal($iso = $iso.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlagProps]
    }
    
    extension [Self <: FlagProps](x: Self) {
      
      inline def set$iso(value: CountryIso): Self = StObject.set(x, "$iso", value.asInstanceOf[js.Any])
      
      inline def setIso(value: CountryIso): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
      
      inline def setIsoUndefined: Self = StObject.set(x, "iso", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SizeStyleProps extends StObject {
    
    @JSName("$size")
    var $size: js.UndefOr[Size] = js.undefined
  }
  object SizeStyleProps {
    
    inline def apply(): SizeStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeStyleProps]
    }
    
    extension [Self <: SizeStyleProps](x: Self) {
      
      inline def set$size(value: Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    }
  }
}
