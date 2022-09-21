package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.fileInputMod.FileInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "FileInput")
@js.native
open class FileInput protected ()
  extends typings.blueprintjsCore.fileInputMod.FileInput {
  def this(props: FileInputProps) = this()
  def this(props: FileInputProps, context: Any) = this()
}
/* static members */
object FileInput {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "FileInput")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "FileInput.defaultProps")
  @js.native
  def defaultProps: FileInputProps = js.native
  inline def defaultProps_=(x: FileInputProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "FileInput.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
