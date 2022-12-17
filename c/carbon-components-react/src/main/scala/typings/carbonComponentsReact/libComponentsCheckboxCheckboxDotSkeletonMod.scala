package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ReactDivAttr
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCheckboxCheckboxDotSkeletonMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Checkbox/Checkbox.Skeleton", JSImport.Default)
  @js.native
  val default: FC[CheckboxSkeletonProps] = js.native
  
  type CheckboxSkeletonProps = ReactDivAttr
  
  type _To = FC[CheckboxSkeletonProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsCheckboxCheckboxDotSkeletonMod.foo` */
  override def _to: FC[CheckboxSkeletonProps] = default
}
