package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ReactDivAttr
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileUploaderSkeletonMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/FileUploader/FileUploader.Skeleton", JSImport.Default)
  @js.native
  val default: FC[FileUploaderSkeletonProps] = js.native
  
  type FileUploaderSkeletonProps = ReactDivAttr
  
  type _To = FC[FileUploaderSkeletonProps]
  
  /* This means you don't have to write `default`, but can instead just say `fileUploaderSkeletonMod.foo` */
  override def _to: FC[FileUploaderSkeletonProps] = default
}
