package typings.config

import typings.config.mod.IConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  @JSImport("config/async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asyncConfig[R](promise: js.Promise[Any]): js.Promise[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncConfig")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[R]]
  inline def asyncConfig[T, R](func: AsyncFunction[T, R]): js.Promise[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncConfig")(func.asInstanceOf[js.Any]).asInstanceOf[js.Promise[R]]
  
  inline def resolveAsyncConfigs(config: IConfig): js.Promise[IConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsyncConfigs")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IConfig]]
  
  type AsyncFunction[T, R] = js.ThisFunction2[/* this */ IConfig, /* config */ String, /* origValue */ T, js.Promise[R]]
}
