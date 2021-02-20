package typings.blueprintjsCore.mod

import typings.blueprintjsCore.fileInputMod.IFileInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "FileInput")
@js.native
class FileInput protected ()
  extends typings.blueprintjsCore.componentsMod.FileInput {
  def this(props: IFileInputProps) = this()
  def this(props: IFileInputProps, context: js.Any) = this()
}
/* static members */
object FileInput {
  
  @JSImport("@blueprintjs/core", "FileInput")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "FileInput.defaultProps")
  @js.native
  def defaultProps: IFileInputProps = js.native
  @scala.inline
  def defaultProps_=(x: IFileInputProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "FileInput.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
