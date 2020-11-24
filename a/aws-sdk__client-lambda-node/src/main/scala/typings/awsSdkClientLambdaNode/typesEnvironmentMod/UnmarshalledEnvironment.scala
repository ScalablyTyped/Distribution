package typings.awsSdkClientLambdaNode.typesEnvironmentMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledEnvironment extends Environment {
  
  /**
    * <p>Environment variable key-value pairs.</p>
    */
  @JSName("Variables")
  var Variables_UnmarshalledEnvironment: js.UndefOr[StringDictionary[String]] = js.native
}
object UnmarshalledEnvironment {
  
  @scala.inline
  def apply(): UnmarshalledEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEnvironment]
  }
  
  @scala.inline
  implicit class UnmarshalledEnvironmentOps[Self <: UnmarshalledEnvironment] (val x: Self) extends AnyVal {
    
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
    def setVariables(value: StringDictionary[String]): Self = this.set("Variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariables: Self = this.set("Variables", js.undefined)
  }
}
