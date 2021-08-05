package typings.carbonComponents.componentsMod

import typings.carbonComponents.fileUploaderMod.default
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components/globals/js/components", "FileUploader")
@js.native
class FileUploader protected () extends default {
  def this(element: js.Any) = this()
  def this(element: js.Any, options: js.Object) = this()
}
object FileUploader {
  
  @JSImport("carbon-components/globals/js/components", "FileUploader")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components/globals/js/components", "FileUploader.components")
  @js.native
  def components: WeakMap[js.Object, js.Any] = js.native
  inline def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
