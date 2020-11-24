package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RulesPackage extends js.Object {
  
  /**
    * The ARN of the rules package.
    */
  var arn: Arn = js.native
  
  /**
    * The description of the rules package.
    */
  var description: js.UndefOr[Text] = js.native
  
  /**
    * The name of the rules package.
    */
  var name: RulesPackageName = js.native
  
  /**
    * The provider of the rules package.
    */
  var provider: ProviderName = js.native
  
  /**
    * The version ID of the rules package.
    */
  var version: Version = js.native
}
object RulesPackage {
  
  @scala.inline
  def apply(arn: Arn, name: RulesPackageName, provider: ProviderName, version: Version): RulesPackage = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesPackage]
  }
  
  @scala.inline
  implicit class RulesPackageOps[Self <: RulesPackage] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: RulesPackageName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: ProviderName): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Version): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Text): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
}
