package typings.deta

import typings.deta.distTypesBaseMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @JSImport("deta/dist/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Base(baseName: String): default = ^.asInstanceOf[js.Dynamic].applyDynamic("Base")(baseName.asInstanceOf[js.Any]).asInstanceOf[default]
  inline def Base(baseName: String, host: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("Base")(baseName.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[default]
  
  inline def Deta(): typings.deta.distTypesDetaMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("Deta")().asInstanceOf[typings.deta.distTypesDetaMod.default]
  inline def Deta(projectKey: String): typings.deta.distTypesDetaMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("Deta")(projectKey.asInstanceOf[js.Any]).asInstanceOf[typings.deta.distTypesDetaMod.default]
  inline def Deta(projectKey: String, authToken: String): typings.deta.distTypesDetaMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("Deta")(projectKey.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any])).asInstanceOf[typings.deta.distTypesDetaMod.default]
  inline def Deta(projectKey: Unit, authToken: String): typings.deta.distTypesDetaMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("Deta")(projectKey.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any])).asInstanceOf[typings.deta.distTypesDetaMod.default]
  
  inline def Drive(driveName: String): typings.deta.distTypesDriveMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("Drive")(driveName.asInstanceOf[js.Any]).asInstanceOf[typings.deta.distTypesDriveMod.default]
  inline def Drive(driveName: String, host: String): typings.deta.distTypesDriveMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("Drive")(driveName.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.deta.distTypesDriveMod.default]
}
