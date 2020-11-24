package typings.ddTrace.mod.plugins

import typings.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [mongoose](https://mongoosejs.com/) module.
  */
@js.native
trait mongoose
  extends Integration
     with Analyzable
object mongoose {
  
  @scala.inline
  def apply(): mongoose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[mongoose]
  }
}
