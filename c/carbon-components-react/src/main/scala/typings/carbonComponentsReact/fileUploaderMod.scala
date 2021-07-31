package typings.carbonComponentsReact

import typings.carbonComponentsReact.fileUploaderButtonMod.FileUploaderButtonProps
import typings.carbonComponentsReact.fileUploaderDropContainerMod.FileUploaderDropContainerProps
import typings.carbonComponentsReact.fileUploaderFileUploaderMod.FileUploaderProps
import typings.carbonComponentsReact.fileUploaderItemMod.FileUploaderItemProps
import typings.carbonComponentsReact.fileUploaderSkeletonMod.FileUploaderSkeletonProps
import typings.carbonComponentsReact.filenameMod.FilenameIconProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileUploaderMod {
  
  @JSImport("carbon-components-react/lib/components/FileUploader", JSImport.Default)
  @js.native
  class default protected ()
    extends typings.carbonComponentsReact.fileUploaderFileUploaderMod.default {
    def this(props: FileUploaderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FileUploaderProps, context: js.Any) = this()
  }
  
  @JSImport("carbon-components-react/lib/components/FileUploader", "FileUploader")
  @js.native
  class FileUploader protected ()
    extends typings.carbonComponentsReact.fileUploaderFileUploaderMod.FileUploader {
    def this(props: FileUploaderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FileUploaderProps, context: js.Any) = this()
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
