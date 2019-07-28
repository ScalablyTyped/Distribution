package typings.cacheableDashRequest.cacheableDashRequestMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cacheable-request", JSImport.Namespace)
@js.native
object `^Ns` extends js.Object {
  @js.native
  class CacheError protected () extends CacheErrorCls {
    def this(error: Error) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    override val name_CacheErrorCls: typings.cacheableDashRequest.cacheableDashRequestStrings.CacheError = js.native
  }
  
  @js.native
  class RequestError protected () extends RequestErrorCls {
    def this(error: Error) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    override val name_RequestErrorCls: typings.cacheableDashRequest.cacheableDashRequestStrings.RequestError = js.native
  }
  
}

