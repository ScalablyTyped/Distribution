package typings.breeze.global.breeze

import typings.breeze.breeze.QueryOptionsConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("breeze.QueryOptions")
@js.native
class QueryOptions ()
  extends StObject
     with typings.breeze.breeze.QueryOptions {
  def this(config: QueryOptionsConfiguration) = this()
}
/* static members */
object QueryOptions {
  
  @JSGlobal("breeze.QueryOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("breeze.QueryOptions.defaultInstance")
  @js.native
  def defaultInstance: typings.breeze.breeze.QueryOptions = js.native
  inline def defaultInstance_=(x: typings.breeze.breeze.QueryOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultInstance")(x.asInstanceOf[js.Any])
}
