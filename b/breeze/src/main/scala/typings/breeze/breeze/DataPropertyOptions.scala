package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataPropertyOptions extends js.Object {
  
  var complexTypeName: js.UndefOr[String] = js.native
  
  var concurrencyMode: js.UndefOr[String] = js.native
  
  var custom: js.UndefOr[js.Any] = js.native
  
  var dataType: js.UndefOr[DataTypeSymbol] = js.native
  
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var isNullable: js.UndefOr[Boolean] = js.native
  
  var isPartOfKey: js.UndefOr[Boolean] = js.native
  
  var isScalar: js.UndefOr[Boolean] = js.native
  
  var isUnmapped: js.UndefOr[Boolean] = js.native
  
  var maxLength: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var nameOnServer: js.UndefOr[String] = js.native
  
  var validators: js.UndefOr[js.Array[Validator]] = js.native
}
object DataPropertyOptions {
  
  @scala.inline
  def apply(): DataPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPropertyOptions]
  }
  
  @scala.inline
  implicit class DataPropertyOptionsOps[Self <: DataPropertyOptions] (val x: Self) extends AnyVal {
    
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
    def setComplexTypeName(value: String): Self = this.set("complexTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplexTypeName: Self = this.set("complexTypeName", js.undefined)
    
    @scala.inline
    def setConcurrencyMode(value: String): Self = this.set("concurrencyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrencyMode: Self = this.set("concurrencyMode", js.undefined)
    
    @scala.inline
    def setCustom(value: js.Any): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setDataType(value: DataTypeSymbol): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setIsNullable(value: Boolean): Self = this.set("isNullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNullable: Self = this.set("isNullable", js.undefined)
    
    @scala.inline
    def setIsPartOfKey(value: Boolean): Self = this.set("isPartOfKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPartOfKey: Self = this.set("isPartOfKey", js.undefined)
    
    @scala.inline
    def setIsScalar(value: Boolean): Self = this.set("isScalar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsScalar: Self = this.set("isScalar", js.undefined)
    
    @scala.inline
    def setIsUnmapped(value: Boolean): Self = this.set("isUnmapped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsUnmapped: Self = this.set("isUnmapped", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameOnServer(value: String): Self = this.set("nameOnServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameOnServer: Self = this.set("nameOnServer", js.undefined)
    
    @scala.inline
    def setValidatorsVarargs(value: Validator*): Self = this.set("validators", js.Array(value :_*))
    
    @scala.inline
    def setValidators(value: js.Array[Validator]): Self = this.set("validators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidators: Self = this.set("validators", js.undefined)
  }
}
