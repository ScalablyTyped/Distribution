package typings.awsSdkClientXrayNode.typesAliasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledAlias extends Alias {
  
  /**
    * <p>A list of names for the alias, including the canonical name.</p>
    */
  @JSName("Names")
  var Names_UnmarshalledAlias: js.UndefOr[js.Array[String]] = js.native
}
object UnmarshalledAlias {
  
  @scala.inline
  def apply(): UnmarshalledAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledAlias]
  }
  
  @scala.inline
  implicit class UnmarshalledAliasOps[Self <: UnmarshalledAlias] (val x: Self) extends AnyVal {
    
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
    def setNamesVarargs(value: String*): Self = this.set("Names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("Names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNames: Self = this.set("Names", js.undefined)
  }
}
