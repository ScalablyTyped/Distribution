package typings.breeze.mod

import typings.breeze.breeze.NamingConventionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "NamingConvention")
@js.native
class NamingConvention protected ()
  extends StObject
     with typings.breeze.breeze.NamingConvention {
  def this(config: NamingConventionOptions) = this()
}
/* static members */
object NamingConvention {
  
  @JSImport("breeze", "NamingConvention")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("breeze", "NamingConvention.camelCase")
  @js.native
  def camelCase: typings.breeze.breeze.NamingConvention = js.native
  @scala.inline
  def camelCase_=(x: typings.breeze.breeze.NamingConvention): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("camelCase")(x.asInstanceOf[js.Any])
  
  @JSImport("breeze", "NamingConvention.defaultInstance")
  @js.native
  def defaultInstance: typings.breeze.breeze.NamingConvention = js.native
  @scala.inline
  def defaultInstance_=(x: typings.breeze.breeze.NamingConvention): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultInstance")(x.asInstanceOf[js.Any])
  
  @JSImport("breeze", "NamingConvention.none")
  @js.native
  def none: typings.breeze.breeze.NamingConvention = js.native
  @scala.inline
  def none_=(x: typings.breeze.breeze.NamingConvention): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
}
