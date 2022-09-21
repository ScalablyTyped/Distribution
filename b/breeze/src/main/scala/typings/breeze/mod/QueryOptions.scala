package typings.breeze.mod

import typings.breeze.breeze.QueryOptionsConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "QueryOptions")
@js.native
open class QueryOptions ()
  extends StObject
     with typings.breeze.breeze.QueryOptions {
  def this(config: QueryOptionsConfiguration) = this()
}
/* static members */
object QueryOptions {
  
  @JSImport("breeze", "QueryOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("breeze", "QueryOptions.defaultInstance")
  @js.native
  def defaultInstance: typings.breeze.breeze.QueryOptions = js.native
  inline def defaultInstance_=(x: typings.breeze.breeze.QueryOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultInstance")(x.asInstanceOf[js.Any])
}
