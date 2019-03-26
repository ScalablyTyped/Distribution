package typings
package cacheableDashRequestLib.cacheableDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cacheable-request", JSImport.Namespace)
@js.native
object namespacedNs extends js.Object {
  @js.native
  class CacheError protected ()
    extends cacheableDashRequestLib.cacheableDashRequestMod.CacheErrorCls {
    def this(error: stdLib.Error) = this()
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    @JSName("name")
    override val name_CacheErrorCls: cacheableDashRequestLib.cacheableDashRequestLibStrings.CacheError = js.native
  }
  
  @js.native
  class RequestError protected ()
    extends cacheableDashRequestLib.cacheableDashRequestMod.RequestErrorCls {
    def this(error: stdLib.Error) = this()
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    /* CompleteClass */
    @JSName("name")
    override val name_RequestErrorCls: cacheableDashRequestLib.cacheableDashRequestLibStrings.RequestError = js.native
  }
  
}

