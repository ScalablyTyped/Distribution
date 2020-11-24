package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsDynamoDbTableProjection extends js.Object {
  
  /**
    * The nonkey attributes that are projected into the index. For each attribute, provide the attribute name.
    */
  var NonKeyAttributes: js.UndefOr[StringList] = js.native
  
  /**
    * The types of attributes that are projected into the index.
    */
  var ProjectionType: js.UndefOr[NonEmptyString] = js.native
}
object AwsDynamoDbTableProjection {
  
  @scala.inline
  def apply(): AwsDynamoDbTableProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableProjection]
  }
  
  @scala.inline
  implicit class AwsDynamoDbTableProjectionOps[Self <: AwsDynamoDbTableProjection] (val x: Self) extends AnyVal {
    
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
    def setNonKeyAttributesVarargs(value: NonEmptyString*): Self = this.set("NonKeyAttributes", js.Array(value :_*))
    
    @scala.inline
    def setNonKeyAttributes(value: StringList): Self = this.set("NonKeyAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonKeyAttributes: Self = this.set("NonKeyAttributes", js.undefined)
    
    @scala.inline
    def setProjectionType(value: NonEmptyString): Self = this.set("ProjectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectionType: Self = this.set("ProjectionType", js.undefined)
  }
}
