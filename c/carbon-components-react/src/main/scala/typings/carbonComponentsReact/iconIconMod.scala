package typings.carbonComponentsReact

import typings.carbonComponentsReact.anon.Name
import typings.carbonComponentsReact.carbonComponentsReactBooleans.`false`
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.Ref
import typings.react.mod.SVGAttributes
import typings.std.HTMLElement
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconIconMod {
  
  @JSImport("carbon-components-react/lib/components/Icon/Icon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("carbon-components-react/lib/components/Icon/Icon", JSImport.Default)
  @js.native
  val default: FC[IconProps] = js.native
  
  @scala.inline
  def findIcon[T /* <: Name */](name: String): `false` | T = ^.asInstanceOf[js.Dynamic].applyDynamic("findIcon")(name.asInstanceOf[js.Any]).asInstanceOf[`false` | T]
  @scala.inline
  def findIcon[T /* <: Name */](name: String, iconsObj: js.Array[T]): `false` | T = (^.asInstanceOf[js.Dynamic].applyDynamic("findIcon")(name.asInstanceOf[js.Any], iconsObj.asInstanceOf[js.Any])).asInstanceOf[`false` | T]
  
  @scala.inline
  def getSvgData[R](iconName: String): R = ^.asInstanceOf[js.Dynamic].applyDynamic("getSvgData")(iconName.asInstanceOf[js.Any]).asInstanceOf[R]
  
  @JSImport("carbon-components-react/lib/components/Icon/Icon", "icons")
  @js.native
  val icons: js.Any = js.native
  
  @scala.inline
  def isPrefixed(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrefixed")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def setIconsList[T /* <: Name */](list: js.Array[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setIconsList")(list.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def svgShapes[D](svgData: D): js.Array[ReactNode | ReactNodeArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("svgShapes")(svgData.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReactNode | ReactNodeArray]]
  
  trait IconData extends StObject {
    
    var height: js.UndefOr[String] = js.undefined
    
    var svgData: js.Any
    
    var viewBox: String
    
    var width: js.UndefOr[String] = js.undefined
  }
  object IconData {
    
    @scala.inline
    def apply(svgData: js.Any, viewBox: String): IconData = {
      val __obj = js.Dynamic.literal(svgData = svgData.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconData]
    }
    
    @scala.inline
    implicit class IconDataMutableBuilder[Self <: IconData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setSvgData(value: js.Any): Self = StObject.set(x, "svgData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IconProps
    extends StObject
       with SVGAttributes[SVGSVGElement] {
    
    var description: String
    
    var icon: js.UndefOr[IconData] = js.undefined
    
    var iconRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
    var iconTitle: js.UndefOr[String] = js.undefined
  }
  object IconProps {
    
    @scala.inline
    def apply(description: String): IconProps = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps]
    }
    
    @scala.inline
    implicit class IconPropsMutableBuilder[Self <: IconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: IconData): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconRef(value: Ref[HTMLElement]): Self = StObject.set(x, "iconRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "iconRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIconRefNull: Self = StObject.set(x, "iconRef", null)
      
      @scala.inline
      def setIconRefUndefined: Self = StObject.set(x, "iconRef", js.undefined)
      
      @scala.inline
      def setIconTitle(value: String): Self = StObject.set(x, "iconTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconTitleUndefined: Self = StObject.set(x, "iconTitle", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    }
  }
}
