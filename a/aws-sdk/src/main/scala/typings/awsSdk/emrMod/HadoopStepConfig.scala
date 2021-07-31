package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HadoopStepConfig extends StObject {
  
  /**
    * The list of command line arguments to pass to the JAR file's main function for execution.
    */
  var Args: js.UndefOr[StringList] = js.undefined
  
  /**
    * The path to the JAR file that runs during the step.
    */
  var Jar: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the main class in the specified Java file. If not specified, the JAR file should specify a main class in its manifest file.
    */
  var MainClass: js.UndefOr[String] = js.undefined
  
  /**
    * The list of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
    */
  var Properties: js.UndefOr[StringMap] = js.undefined
}
object HadoopStepConfig {
  
  @scala.inline
  def apply(): HadoopStepConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HadoopStepConfig]
  }
  
  @scala.inline
  implicit class HadoopStepConfigMutableBuilder[Self <: HadoopStepConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: StringList): Self = StObject.set(x, "Args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "Args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "Args", js.Array(value :_*))
    
    @scala.inline
    def setJar(value: String): Self = StObject.set(x, "Jar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJarUndefined: Self = StObject.set(x, "Jar", js.undefined)
    
    @scala.inline
    def setMainClass(value: String): Self = StObject.set(x, "MainClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainClassUndefined: Self = StObject.set(x, "MainClass", js.undefined)
    
    @scala.inline
    def setProperties(value: StringMap): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
  }
}
