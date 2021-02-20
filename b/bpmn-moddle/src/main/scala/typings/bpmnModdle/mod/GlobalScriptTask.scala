package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalScriptTask extends GlobalTask {
  
  var script: String = js.native
  
  var scriptLanguage: String = js.native
}
object GlobalScriptTask {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    id: String,
    ioBinding: InputOutputBinding,
    ioSpecification: InputOutputSpecification,
    name: String,
    resources: ResourceRole,
    script: String,
    scriptLanguage: String,
    supportedInterfaceRef: Interface
  ): GlobalScriptTask = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ioBinding = ioBinding.asInstanceOf[js.Any], ioSpecification = ioSpecification.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], scriptLanguage = scriptLanguage.asInstanceOf[js.Any], supportedInterfaceRef = supportedInterfaceRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalScriptTask]
  }
  
  @scala.inline
  implicit class GlobalScriptTaskMutableBuilder[Self <: GlobalScriptTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptLanguage(value: String): Self = StObject.set(x, "scriptLanguage", value.asInstanceOf[js.Any])
  }
}
