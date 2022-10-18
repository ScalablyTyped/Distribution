package typings.blueprintjsCore.mod

import typings.blueprintjsCore.libEsmComponentsTagTagMod.TagProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Tag")
@js.native
open class Tag protected ()
  extends typings.blueprintjsCore.libEsmComponentsMod.Tag {
  def this(props: TagProps) = this()
  def this(props: TagProps, context: Any) = this()
}
/* static members */
object Tag {
  
  @JSImport("@blueprintjs/core", "Tag")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Tag.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
