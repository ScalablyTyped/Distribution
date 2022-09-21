package typings.blackEngine.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "VideoNullDriver")
@js.native
open class VideoNullDriver protected ()
  extends typings.blackEngine.videoNullDriverMod.VideoNullDriver {
  def this(containerElement: HTMLElement, width: Double, height: Double) = this()
}
object VideoNullDriver {
  
  @JSImport("black-engine", "VideoNullDriver.sessionPool")
  @js.native
  val sessionPool: typings.blackEngine.objectPoolMod.ObjectPool = js.native
}
