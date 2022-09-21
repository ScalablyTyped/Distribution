package typings.breeze.mod

import typings.breeze.anon.AllowConcurrentSaves
import typings.breeze.breeze.SaveOptionsConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "SaveOptions")
@js.native
open class SaveOptions ()
  extends StObject
     with typings.breeze.breeze.SaveOptions {
  def this(config: AllowConcurrentSaves) = this()
  
  /* CompleteClass */
  var allowConcurrentSaves: Boolean = js.native
  
  /* CompleteClass */
  var dataService: typings.breeze.breeze.DataService = js.native
  
  /* CompleteClass */
  var resourceName: String = js.native
  
  /* CompleteClass */
  override def setAsDefault(): typings.breeze.breeze.SaveOptions = js.native
  
  /* CompleteClass */
  var tag: js.Object = js.native
  
  /* CompleteClass */
  override def `using`(config: SaveOptionsConfiguration): typings.breeze.breeze.SaveOptions = js.native
}
/* static members */
object SaveOptions {
  
  @JSImport("breeze", "SaveOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("breeze", "SaveOptions.defaultInstance")
  @js.native
  def defaultInstance: typings.breeze.breeze.SaveOptions = js.native
  inline def defaultInstance_=(x: typings.breeze.breeze.SaveOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultInstance")(x.asInstanceOf[js.Any])
}
