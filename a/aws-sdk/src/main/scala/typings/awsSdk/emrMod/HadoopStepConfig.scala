package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HadoopStepConfig extends js.Object {
  
  /**
    * The list of command line arguments to pass to the JAR file's main function for execution.
    */
  var Args: js.UndefOr[StringList] = js.native
  
  /**
    * The path to the JAR file that runs during the step.
    */
  var Jar: js.UndefOr[String] = js.native
  
  /**
    * The name of the main class in the specified Java file. If not specified, the JAR file should specify a main class in its manifest file.
    */
  var MainClass: js.UndefOr[String] = js.native
  
  /**
    * The list of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
    */
  var Properties: js.UndefOr[StringMap] = js.native
}
object HadoopStepConfig {
  
  @scala.inline
  def apply(): HadoopStepConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HadoopStepConfig]
  }
  
  @scala.inline
  implicit class HadoopStepConfigOps[Self <: HadoopStepConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("Args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: StringList): Self = this.set("Args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("Args", js.undefined)
    
    @scala.inline
    def setJar(value: String): Self = this.set("Jar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJar: Self = this.set("Jar", js.undefined)
    
    @scala.inline
    def setMainClass(value: String): Self = this.set("MainClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainClass: Self = this.set("MainClass", js.undefined)
    
    @scala.inline
    def setProperties(value: StringMap): Self = this.set("Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("Properties", js.undefined)
  }
}
