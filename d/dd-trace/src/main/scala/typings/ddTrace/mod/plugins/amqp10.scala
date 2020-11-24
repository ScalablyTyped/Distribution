package typings.ddTrace.mod.plugins

import typings.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [amqp10](https://github.com/noodlefrenzy/node-amqp10) module.
  */
@js.native
trait amqp10
  extends Integration
     with Analyzable
object amqp10 {
  
  @scala.inline
  def apply(): amqp10 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[amqp10]
  }
}
