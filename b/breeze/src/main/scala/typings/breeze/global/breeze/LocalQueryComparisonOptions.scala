package typings.breeze.global.breeze

import typings.breeze.anon.IsCaseSensitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("breeze.LocalQueryComparisonOptions")
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
  
  @JSGlobal("breeze.LocalQueryComparisonOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("breeze.LocalQueryComparisonOptions.caseInsensitiveSQL")
  @js.native
  def caseInsensitiveSQL: typings.breeze.breeze.LocalQueryComparisonOptions = js.native
  inline def caseInsensitiveSQL_=(x: typings.breeze.breeze.LocalQueryComparisonOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("caseInsensitiveSQL")(x.asInstanceOf[js.Any])
  
  @JSGlobal("breeze.LocalQueryComparisonOptions.defaultInstance")
  @js.native
  def defaultInstance: typings.breeze.breeze.LocalQueryComparisonOptions = js.native
  inline def defaultInstance_=(x: typings.breeze.breeze.LocalQueryComparisonOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultInstance")(x.asInstanceOf[js.Any])
}
