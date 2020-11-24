package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShaderCodeNode extends js.Object {
  
  var additionalDefineKey: js.UndefOr[String] = js.native
  
  var additionalDefineValue: js.UndefOr[String] = js.native
  
  var children: js.Array[ShaderCodeNode] = js.native
  
  def isValid(preprocessors: org.scalablytyped.runtime.StringDictionary[String]): Boolean = js.native
  
  var line: String = js.native
  
  def process(preprocessors: org.scalablytyped.runtime.StringDictionary[String], options: ProcessingOptions): String = js.native
}
object ShaderCodeNode {
  
  @scala.inline
  def apply(
    children: js.Array[ShaderCodeNode],
    isValid: org.scalablytyped.runtime.StringDictionary[String] => Boolean,
    line: String,
    process: (org.scalablytyped.runtime.StringDictionary[String], ProcessingOptions) => String
  ): ShaderCodeNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isValid = js.Any.fromFunction1(isValid), line = line.asInstanceOf[js.Any], process = js.Any.fromFunction2(process))
    __obj.asInstanceOf[ShaderCodeNode]
  }
  
  @scala.inline
  implicit class ShaderCodeNodeOps[Self <: ShaderCodeNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildrenVarargs(value: ShaderCodeNode*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ShaderCodeNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValid(value: org.scalablytyped.runtime.StringDictionary[String] => Boolean): Self = this.set("isValid", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLine(value: String): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcess(value: (org.scalablytyped.runtime.StringDictionary[String], ProcessingOptions) => String): Self = this.set("process", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAdditionalDefineKey(value: String): Self = this.set("additionalDefineKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalDefineKey: Self = this.set("additionalDefineKey", js.undefined)
    
    @scala.inline
    def setAdditionalDefineValue(value: String): Self = this.set("additionalDefineValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalDefineValue: Self = this.set("additionalDefineValue", js.undefined)
  }
}
