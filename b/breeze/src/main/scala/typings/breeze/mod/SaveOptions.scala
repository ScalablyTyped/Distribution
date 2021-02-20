package typings.breeze.mod

import typings.breeze.anon.AllowConcurrentSaves
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "SaveOptions")
@js.native
class SaveOptions ()
  extends typings.breeze.breeze.SaveOptions {
  def this(config: AllowConcurrentSaves) = this()
}
/* static members */
object SaveOptions {
  
  @JSImport("breeze", "SaveOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("breeze", "SaveOptions.defaultInstance")
  @js.native
  def defaultInstance: typings.breeze.breeze.SaveOptions = js.native
  @scala.inline
  def defaultInstance_=(x: typings.breeze.breeze.SaveOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultInstance")(x.asInstanceOf[js.Any])
}
