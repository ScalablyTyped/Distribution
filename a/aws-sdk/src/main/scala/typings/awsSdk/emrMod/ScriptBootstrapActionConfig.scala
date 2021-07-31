package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptBootstrapActionConfig extends StObject {
  
  /**
    * A list of command line arguments to pass to the bootstrap action script.
    */
  var Args: js.UndefOr[XmlStringList] = js.undefined
  
  /**
    * Location of the script to run during a bootstrap action. Can be either a location in Amazon S3 or on a local file system.
    */
  var Path: XmlString
}
object ScriptBootstrapActionConfig {
  
  @scala.inline
  def apply(Path: XmlString): ScriptBootstrapActionConfig = {
    val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptBootstrapActionConfig]
  }
  
  @scala.inline
  implicit class ScriptBootstrapActionConfigMutableBuilder[Self <: ScriptBootstrapActionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: XmlStringList): Self = StObject.set(x, "Args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "Args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: XmlString*): Self = StObject.set(x, "Args", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: XmlString): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
  }
}
