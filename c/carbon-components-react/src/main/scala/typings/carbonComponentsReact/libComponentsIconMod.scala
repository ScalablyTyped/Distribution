package typings.carbonComponentsReact

import typings.carbonComponentsReact.anon.Name
import typings.carbonComponentsReact.carbonComponentsReactBooleans.`false`
import typings.carbonComponentsReact.libComponentsIconIconMod.IconProps
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsIconMod {
  
  @JSImport("carbon-components-react/lib/components/Icon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("carbon-components-react/lib/components/Icon", JSImport.Default)
  @js.native
  val default: FC[IconProps] = js.native
  
  inline def findIcon[T /* <: Name */](name: String): `false` | T = ^.asInstanceOf[js.Dynamic].applyDynamic("findIcon")(name.asInstanceOf[js.Any]).asInstanceOf[`false` | T]
  inline def findIcon[T /* <: Name */](name: String, iconsObj: js.Array[T]): `false` | T = (^.asInstanceOf[js.Dynamic].applyDynamic("findIcon")(name.asInstanceOf[js.Any], iconsObj.asInstanceOf[js.Any])).asInstanceOf[`false` | T]
  
  inline def getSvgData[R](iconName: String): R = ^.asInstanceOf[js.Dynamic].applyDynamic("getSvgData")(iconName.asInstanceOf[js.Any]).asInstanceOf[R]
  
  @JSImport("carbon-components-react/lib/components/Icon", "icons")
  @js.native
  val icons: Any = js.native
  
  inline def isPrefixed(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrefixed")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def setIconsList[T /* <: Name */](list: js.Array[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setIconsList")(list.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def svgShapes[D](svgData: D): js.Array[ReactNode | ReactNodeArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("svgShapes")(svgData.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReactNode | ReactNodeArray]]
}
