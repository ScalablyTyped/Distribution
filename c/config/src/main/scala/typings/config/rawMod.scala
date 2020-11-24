package typings.config

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("config/raw", JSImport.Namespace)
@js.native
object rawMod extends js.Object {
  
  def raw[T](obj: T): RawConfig[T] = js.native
  
  @js.native
  class RawConfig[T] protected () extends js.Object {
    def this(rawObj: T) = this()
    
    def resolve(): T = js.native
  }
}
