package typings.concurrently.anon

import typings.concurrently.concurrentlyBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSupport extends StObject {
  
  /**
    * What the color support of the spawned processes should be.
    * If set to `false`, then no colors should be output.
    *
    * Defaults to whatever the terminal's stdout support is.
    */
  var colorSupport: js.UndefOr[Pickanylevel | `false`] = js.undefined
  
  /**
    * A custom working directory to spawn processes in.
    * Defaults to `process.cwd()`.
    */
  var cwd: js.UndefOr[String] = js.undefined
  
  /**
    * Map of custom environment variables to include in the spawn options.
    */
  var env: js.UndefOr[Record[String, Any]] = js.undefined
  
  /**
    * The NodeJS process.
    */
  var process: js.UndefOr[PickProcesscwdplatformenv] = js.undefined
  
  /**
    * Whether to customize the options for spawning processes in raw mode.
    * Defaults to false.
    */
  var raw: js.UndefOr[Boolean] = js.undefined
}
object ColorSupport {
  
  inline def apply(): ColorSupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorSupport]
  }
  
  extension [Self <: ColorSupport](x: Self) {
    
    inline def setColorSupport(value: Pickanylevel | `false`): Self = StObject.set(x, "colorSupport", value.asInstanceOf[js.Any])
    
    inline def setColorSupportUndefined: Self = StObject.set(x, "colorSupport", js.undefined)
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setEnv(value: Record[String, Any]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setProcess(value: PickProcesscwdplatformenv): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    
    inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
  }
}
