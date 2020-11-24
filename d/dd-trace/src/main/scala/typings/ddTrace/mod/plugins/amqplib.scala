package typings.ddTrace.mod.plugins

import typings.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [amqplib](https://github.com/squaremo/amqp.node) module.
  */
@js.native
trait amqplib
  extends Integration
     with Analyzable
object amqplib {
  
  @scala.inline
  def apply(): amqplib = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[amqplib]
  }
}
