package typings.ddTrace.mod.plugins

import typings.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [memcached](https://github.com/3rd-Eden/memcached) module.
  */
@js.native
trait memcached
  extends Integration
     with Analyzable
object memcached {
  
  @scala.inline
  def apply(): memcached = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[memcached]
  }
}
