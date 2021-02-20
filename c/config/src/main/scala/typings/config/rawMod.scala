package typings.config

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rawMod {
  
  @JSImport("config/raw", "RawConfig")
  @js.native
  class RawConfig[T] protected () extends StObject {
    def this(rawObj: T) = this()
    
    def resolve(): T = js.native
  }
  
  @JSImport("config/raw", "raw")
  @js.native
  def raw[T](obj: T): RawConfig[T] = js.native
}
