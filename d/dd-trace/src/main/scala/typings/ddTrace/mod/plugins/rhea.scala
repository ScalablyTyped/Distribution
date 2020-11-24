package typings.ddTrace.mod.plugins

import typings.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [rhea](https://github.com/amqp/rhea) module.
  */
@js.native
trait rhea
  extends Integration
     with Analyzable
object rhea {
  
  @scala.inline
  def apply(): rhea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[rhea]
  }
}
