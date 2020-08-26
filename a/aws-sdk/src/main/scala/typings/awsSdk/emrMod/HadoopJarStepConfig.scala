package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HadoopJarStepConfig extends js.Object {
  /**
    * A list of command line arguments passed to the JAR file's main function when executed.
    */
  var Args: js.UndefOr[XmlStringList] = js.native
  /**
    * A path to a JAR file run during the step.
    */
  var Jar: XmlString = js.native
  /**
    * The name of the main class in the specified Java file. If not specified, the JAR file should specify a Main-Class in its manifest file.
    */
  var MainClass: js.UndefOr[XmlString] = js.native
  /**
    * A list of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
    */
  var Properties: js.UndefOr[KeyValueList] = js.native
}

object HadoopJarStepConfig {
  @scala.inline
  def apply(Jar: XmlString): HadoopJarStepConfig = {
    val __obj = js.Dynamic.literal(Jar = Jar.asInstanceOf[js.Any])
    __obj.asInstanceOf[HadoopJarStepConfig]
  }
  @scala.inline
  implicit class HadoopJarStepConfigOps[Self <: HadoopJarStepConfig] (val x: Self) extends AnyVal {
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
    def setJar(value: XmlString): Self = this.set("Jar", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgsVarargs(value: XmlString*): Self = this.set("Args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: XmlStringList): Self = this.set("Args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("Args", js.undefined)
    @scala.inline
    def setMainClass(value: XmlString): Self = this.set("MainClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMainClass: Self = this.set("MainClass", js.undefined)
    @scala.inline
    def setPropertiesVarargs(value: KeyValue*): Self = this.set("Properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: KeyValueList): Self = this.set("Properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("Properties", js.undefined)
  }
  
}

