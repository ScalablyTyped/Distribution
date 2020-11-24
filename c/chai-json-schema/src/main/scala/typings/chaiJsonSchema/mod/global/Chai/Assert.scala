package typings.chaiJsonSchema.mod.global.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Assert extends js.Object {
  
  def jsonSchema(value: js.Any, schema: js.Any): Unit = js.native
  def jsonSchema(value: js.Any, schema: js.Any, msg: String): Unit = js.native
  
  def notJsonSchema(value: js.Any, schema: js.Any): Unit = js.native
  def notJsonSchema(value: js.Any, schema: js.Any, msg: String): Unit = js.native
}
