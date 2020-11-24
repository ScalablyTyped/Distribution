package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationOptionsDescription extends js.Object {
  
  /**
    *  A list of ConfigurationOptionDescription. 
    */
  var Options: js.UndefOr[ConfigurationOptionDescriptionsList] = js.native
  
  /**
    * The ARN of the platform version.
    */
  var PlatformArn: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformArn] = js.native
  
  /**
    * The name of the solution stack these configuration options belong to.
    */
  var SolutionStackName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SolutionStackName] = js.native
}
object ConfigurationOptionsDescription {
  
  @scala.inline
  def apply(): ConfigurationOptionsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationOptionsDescription]
  }
  
  @scala.inline
  implicit class ConfigurationOptionsDescriptionOps[Self <: ConfigurationOptionsDescription] (val x: Self) extends AnyVal {
    
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
    def setOptionsVarargs(value: ConfigurationOptionDescription*): Self = this.set("Options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: ConfigurationOptionDescriptionsList): Self = this.set("Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("Options", js.undefined)
    
    @scala.inline
    def setPlatformArn(value: PlatformArn): Self = this.set("PlatformArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformArn: Self = this.set("PlatformArn", js.undefined)
    
    @scala.inline
    def setSolutionStackName(value: SolutionStackName): Self = this.set("SolutionStackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolutionStackName: Self = this.set("SolutionStackName", js.undefined)
  }
}
