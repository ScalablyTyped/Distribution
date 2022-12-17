package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ReactDivAttr
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsRadioButtonRadioButtonDotSkeletonMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/RadioButton/RadioButton.Skeleton", JSImport.Default)
  @js.native
  val default: FC[RadioButtonSkeletonProps] = js.native
  
  type RadioButtonSkeletonProps = ReactDivAttr
  
  type _To = FC[RadioButtonSkeletonProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsRadioButtonRadioButtonDotSkeletonMod.foo` */
  override def _to: FC[RadioButtonSkeletonProps] = default
}
