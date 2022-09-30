package typings.bsLogger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheGettersMod {
  
  @JSImport("bs-logger/dist/utils/cache-getters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cacheGetters[T](target: T, props: (/* keyof T */ String)*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cacheGetters")(scala.List(target.asInstanceOf[js.Any]).`++`(props.asInstanceOf[Seq[js.Any]])*).asInstanceOf[T]
}
