package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishSchemaRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the development schema. For more information, see arns.
    */
  var DevelopmentSchemaArn: Arn = js.native
  
  /**
    * The minor version under which the schema will be published. This parameter is recommended. Schemas have both a major and minor version associated with them.
    */
  var MinorVersion: js.UndefOr[Version] = js.native
  
  /**
    * The new name under which the schema will be published. If this is not provided, the development schema is considered.
    */
  var Name: js.UndefOr[SchemaName] = js.native
  
  /**
    * The major version under which the schema will be published. Schemas have both a major and minor version associated with them.
    */
  var Version: typings.awsSdk.clouddirectoryMod.Version = js.native
}
object PublishSchemaRequest {
  
  @scala.inline
  def apply(DevelopmentSchemaArn: Arn, Version: Version): PublishSchemaRequest = {
    val __obj = js.Dynamic.literal(DevelopmentSchemaArn = DevelopmentSchemaArn.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishSchemaRequest]
  }
  
  @scala.inline
  implicit class PublishSchemaRequestOps[Self <: PublishSchemaRequest] (val x: Self) extends AnyVal {
    
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
    def setDevelopmentSchemaArn(value: Arn): Self = this.set("DevelopmentSchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Version): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorVersion(value: Version): Self = this.set("MinorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorVersion: Self = this.set("MinorVersion", js.undefined)
    
    @scala.inline
    def setName(value: SchemaName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
