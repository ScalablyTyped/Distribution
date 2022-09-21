package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModuleDetectionKind extends StObject
@JSGlobal("ts.ModuleDetectionKind")
@js.native
object ModuleDetectionKind extends StObject {
  
  /**
    * Legacy, but also files with jsx under react-jsx or react-jsxdev and esm mode files under moduleResolution: node16+
    */
  @js.native
  sealed trait Auto
    extends StObject
       with ModuleDetectionKind
  
  /**
    * Consider all non-declaration files modules, regardless of present syntax
    */
  @js.native
  sealed trait Force
    extends StObject
       with ModuleDetectionKind
  
  /**
    * Files with imports, exports and/or import.meta are considered modules
    */
  @js.native
  sealed trait Legacy
    extends StObject
       with ModuleDetectionKind
}
