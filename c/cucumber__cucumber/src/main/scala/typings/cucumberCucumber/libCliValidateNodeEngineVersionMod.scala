package typings.cucumberCucumber

import typings.cucumberCucumber.anon.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCliValidateNodeEngineVersionMod {
  
  @JSImport("@cucumber/cucumber/lib/cli/validate_node_engine_version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateNodeEngineVersion(
    currentVersion: String,
    onError: js.Function1[/* message */ String, Unit],
    onWarning: js.Function1[/* message */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateNodeEngineVersion")(currentVersion.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onWarning.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateNodeEngineVersion(
    currentVersion: String,
    onError: js.Function1[/* message */ String, Unit],
    onWarning: js.Function1[/* message */ String, Unit],
    readPackageJSON: js.Function0[PackageJSON]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateNodeEngineVersion")(currentVersion.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onWarning.asInstanceOf[js.Any], readPackageJSON.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait PackageJSON extends StObject {
    
    var engines: Node
    
    var enginesTested: Node
  }
  object PackageJSON {
    
    inline def apply(engines: Node, enginesTested: Node): PackageJSON = {
      val __obj = js.Dynamic.literal(engines = engines.asInstanceOf[js.Any], enginesTested = enginesTested.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageJSON]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PackageJSON] (val x: Self) extends AnyVal {
      
      inline def setEngines(value: Node): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
      
      inline def setEnginesTested(value: Node): Self = StObject.set(x, "enginesTested", value.asInstanceOf[js.Any])
    }
  }
}
