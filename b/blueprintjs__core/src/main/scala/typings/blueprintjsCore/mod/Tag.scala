package typings.blueprintjsCore.mod

import typings.blueprintjsCore.tagMod.ITagProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Tag")
@js.native
class Tag protected ()
  extends typings.blueprintjsCore.componentsMod.Tag {
  def this(props: ITagProps) = this()
  def this(props: ITagProps, context: js.Any) = this()
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
