package typings.carbonComponentsReact

import typings.carbonComponentsReact.libComponentsFileUploaderFileUploaderButtonMod.FileUploaderButtonProps
import typings.carbonComponentsReact.libComponentsFileUploaderFileUploaderDotSkeletonMod.FileUploaderSkeletonProps
import typings.carbonComponentsReact.libComponentsFileUploaderFileUploaderDropContainerMod.FileUploaderDropContainerProps
import typings.carbonComponentsReact.libComponentsFileUploaderFileUploaderItemMod.FileUploaderItemProps
import typings.carbonComponentsReact.libComponentsFileUploaderFileUploaderMod.FileUploaderProps
import typings.carbonComponentsReact.libComponentsFileUploaderFilenameMod.FilenameIconProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFileUploaderMod {
  
  @JSImport("carbon-components-react/lib/components/FileUploader", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.carbonComponentsReact.libComponentsFileUploaderFileUploaderMod.default {
    def this(props: FileUploaderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FileUploaderProps, context: Any) = this()
  }
  
  @JSImport("carbon-components-react/lib/components/FileUploader", "FileUploader")
  @js.native
  open class FileUploader protected ()
    extends typings.carbonComponentsReact.libComponentsFileUploaderFileUploaderMod.FileUploader {
    def this(props: FileUploaderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FileUploaderProps, context: Any) = this()
  }
  
  @JSImport("carbon-components-react/lib/components/FileUploader", "FileUploaderButton")
  @js.native
  val FileUploaderButton: FC[FileUploaderButtonProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/FileUploader", "FileUploaderDropContainer")
  @js.native
  val FileUploaderDropContainer: FC[FileUploaderDropContainerProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/FileUploader", "FileUploaderItem")
  @js.native
  val FileUploaderItem: FC[FileUploaderItemProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/FileUploader", "FileUploaderSkeleton")
  @js.native
  val FileUploaderSkeleton: FC[FileUploaderSkeletonProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/FileUploader", "Filename")
  @js.native
  val Filename: FC[FilenameIconProps] = js.native
}
