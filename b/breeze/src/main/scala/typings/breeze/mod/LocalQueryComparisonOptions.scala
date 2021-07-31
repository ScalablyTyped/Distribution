package typings.breeze.mod

import typings.breeze.anon.IsCaseSensitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "LocalQueryComparisonOptions")
@js.native
class LocalQueryComparisonOptions protected ()
  extends StObject
     with typings.breeze.breeze.LocalQueryComparisonOptions {
  def this(config: IsCaseSensitive) = this()
  
  /* CompleteClass */
  override def setAsDefault(): Unit = js.native
}
/* static members */
object LocalQueryComparisonOptions {
  
  @JSImport("breeze", "LocalQueryComparisonOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("breeze", "LocalQueryComparisonOptions.caseInsensitiveSQL")
  @js.native
  def caseInsensitiveSQL: typings.breeze.breeze.LocalQueryComparisonOptions = js.native
  @scala.inline
  def caseInsensitiveSQL_=(x: typings.breeze.breeze.LocalQueryComparisonOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("caseInsensitiveSQL")(x.asInstanceOf[js.Any])
  
  @JSImport("breeze", "LocalQueryComparisonOptions.defaultInstance")
  @js.native
  def defaultInstance: typings.breeze.breeze.LocalQueryComparisonOptions = js.native
  @scala.inline
  def defaultInstance_=(x: typings.breeze.breeze.LocalQueryComparisonOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultInstance")(x.asInstanceOf[js.Any])
}
