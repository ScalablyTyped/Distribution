package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexField extends js.Object {
  
  var DateArrayOptions: js.UndefOr[typings.awsSdk.cloudsearchMod.DateArrayOptions] = js.native
  
  var DateOptions: js.UndefOr[typings.awsSdk.cloudsearchMod.DateOptions] = js.native
  
  var DoubleArrayOptions: js.UndefOr[typings.awsSdk.cloudsearchMod.DoubleArrayOptions] = js.native
  
  var DoubleOptions: js.UndefOr[typings.awsSdk.cloudsearchMod.DoubleOptions] = js.native
  
  /**
    * A string that represents the name of an index field. CloudSearch supports regular index fields as well as dynamic fields. A dynamic field's name defines a pattern that begins or ends with a wildcard. Any document fields that don't map to a regular index field but do match a dynamic field's pattern are configured with the dynamic field's indexing options.  Regular field names begin with a letter and can contain the following characters: a-z (lowercase), 0-9, and _ (underscore). Dynamic field names must begin or end with a wildcard (*). The wildcard can also be the only character in a dynamic field name. Multiple wildcards, and wildcards embedded within a string are not supported.  The name score is reserved and cannot be used as a field name. To reference a document's ID, you can use the name _id. 
    */
  var IndexFieldName: DynamicFieldName = js.native
  
  var IndexFieldType: typings.awsSdk.cloudsearchMod.IndexFieldType = js.native
  
  var IntArrayOptions: js.UndefOr[typings.awsSdk.cloudsearchMod.IntArrayOptions] = js.native
  
  var IntOptions: js.UndefOr[typings.awsSdk.cloudsearchMod.IntOptions] = js.native
  
  var LatLonOptions: js.UndefOr[typings.awsSdk.cloudsearchMod.LatLonOptions] = js.native
  
  var LiteralArrayOptions: js.UndefOr[typings.awsSdk.cloudsearchMod.LiteralArrayOptions] = js.native
  
  var LiteralOptions: js.UndefOr[typings.awsSdk.cloudsearchMod.LiteralOptions] = js.native
  
  var TextArrayOptions: js.UndefOr[typings.awsSdk.cloudsearchMod.TextArrayOptions] = js.native
  
  var TextOptions: js.UndefOr[typings.awsSdk.cloudsearchMod.TextOptions] = js.native
}
object IndexField {
  
  @scala.inline
  def apply(IndexFieldName: DynamicFieldName, IndexFieldType: IndexFieldType): IndexField = {
    val __obj = js.Dynamic.literal(IndexFieldName = IndexFieldName.asInstanceOf[js.Any], IndexFieldType = IndexFieldType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexField]
  }
  
  @scala.inline
  implicit class IndexFieldOps[Self <: IndexField] (val x: Self) extends AnyVal {
    
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
    def setIndexFieldName(value: DynamicFieldName): Self = this.set("IndexFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexFieldType(value: IndexFieldType): Self = this.set("IndexFieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateArrayOptions(value: DateArrayOptions): Self = this.set("DateArrayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateArrayOptions: Self = this.set("DateArrayOptions", js.undefined)
    
    @scala.inline
    def setDateOptions(value: DateOptions): Self = this.set("DateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateOptions: Self = this.set("DateOptions", js.undefined)
    
    @scala.inline
    def setDoubleArrayOptions(value: DoubleArrayOptions): Self = this.set("DoubleArrayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleArrayOptions: Self = this.set("DoubleArrayOptions", js.undefined)
    
    @scala.inline
    def setDoubleOptions(value: DoubleOptions): Self = this.set("DoubleOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleOptions: Self = this.set("DoubleOptions", js.undefined)
    
    @scala.inline
    def setIntArrayOptions(value: IntArrayOptions): Self = this.set("IntArrayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntArrayOptions: Self = this.set("IntArrayOptions", js.undefined)
    
    @scala.inline
    def setIntOptions(value: IntOptions): Self = this.set("IntOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntOptions: Self = this.set("IntOptions", js.undefined)
    
    @scala.inline
    def setLatLonOptions(value: LatLonOptions): Self = this.set("LatLonOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatLonOptions: Self = this.set("LatLonOptions", js.undefined)
    
    @scala.inline
    def setLiteralArrayOptions(value: LiteralArrayOptions): Self = this.set("LiteralArrayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiteralArrayOptions: Self = this.set("LiteralArrayOptions", js.undefined)
    
    @scala.inline
    def setLiteralOptions(value: LiteralOptions): Self = this.set("LiteralOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiteralOptions: Self = this.set("LiteralOptions", js.undefined)
    
    @scala.inline
    def setTextArrayOptions(value: TextArrayOptions): Self = this.set("TextArrayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextArrayOptions: Self = this.set("TextArrayOptions", js.undefined)
    
    @scala.inline
    def setTextOptions(value: TextOptions): Self = this.set("TextOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextOptions: Self = this.set("TextOptions", js.undefined)
  }
}
