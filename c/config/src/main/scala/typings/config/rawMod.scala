package typings.config

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rawMod {
  
  @JSImport("config/raw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("config/raw", "RawConfig")
  @js.native
  open class RawConfig[T] protected () extends StObject {
    def this(rawObj: T) = this()
    
    def resolve(): T = js.native
  }
  
  inline def raw[T](obj: T): RawConfig[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")(obj.asInstanceOf[js.Any]).asInstanceOf[RawConfig[T]]
}
