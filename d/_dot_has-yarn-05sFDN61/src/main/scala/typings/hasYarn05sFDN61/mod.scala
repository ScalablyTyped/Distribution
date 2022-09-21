package typings.hasYarn05sFDN61

import typings.hasYarn05sFDN61.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	 * Check if a project is using [Yarn](https://yarnpkg.com).
  	 *
  	 * @param cwd - Current working directory. Default: `process.cwd()`.
  	 * @returns Whether the project uses Yarn.
  	 */
  inline def apply(): Boolean = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Boolean]
  inline def apply(cwd: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport(".has-yarn-05sFDN61/index.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	 * Check if a project is using [Yarn](https://yarnpkg.com).
  	 *
  	 * @param cwd - Current working directory. Default: `process.cwd()`.
  	 * @returns Whether the project uses Yarn.
  	 */
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function hasYarn(cwd?: string): boolean;
  // export = hasYarn;
  inline def default(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Boolean]
  inline def default(cwd: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(cwd.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function hasYarn(cwd?: string): boolean;
  // export = hasYarn;
  @JSImport(".has-yarn-05sFDN61/index.d.ts", "default")
  @js.native
  def default_Fmod: Call = js.native
  
  inline def default_Fmod_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
