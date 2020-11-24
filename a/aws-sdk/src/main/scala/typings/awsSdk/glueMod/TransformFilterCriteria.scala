package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformFilterCriteria extends js.Object {
  
  /**
    * The time and date after which the transforms were created.
    */
  var CreatedAfter: js.UndefOr[Timestamp] = js.native
  
  /**
    * The time and date before which the transforms were created.
    */
  var CreatedBefore: js.UndefOr[Timestamp] = js.native
  
  /**
    * This value determines which version of AWS Glue this machine learning transform is compatible with. Glue 1.0 is recommended for most customers. If the value is not set, the Glue compatibility defaults to Glue 0.9. For more information, see AWS Glue Versions in the developer guide.
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.native
  
  /**
    * Filter on transforms last modified after this date.
    */
  var LastModifiedAfter: js.UndefOr[Timestamp] = js.native
  
  /**
    * Filter on transforms last modified before this date.
    */
  var LastModifiedBefore: js.UndefOr[Timestamp] = js.native
  
  /**
    * A unique transform name that is used to filter the machine learning transforms.
    */
  var Name: js.UndefOr[NameString] = js.native
  
  /**
    * Filters on datasets with a specific schema. The Map&lt;Column, Type&gt; object is an array of key-value pairs representing the schema this transform accepts, where Column is the name of a column, and Type is the type of the data such as an integer or string. Has an upper bound of 100 columns.
    */
  var Schema: js.UndefOr[TransformSchema] = js.native
  
  /**
    * Filters the list of machine learning transforms by the last known status of the transforms (to indicate whether a transform can be used or not). One of "NOT_READY", "READY", or "DELETING".
    */
  var Status: js.UndefOr[TransformStatusType] = js.native
  
  /**
    * The type of machine learning transform that is used to filter the machine learning transforms.
    */
  var TransformType: js.UndefOr[typings.awsSdk.glueMod.TransformType] = js.native
}
object TransformFilterCriteria {
  
  @scala.inline
  def apply(): TransformFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformFilterCriteria]
  }
  
  @scala.inline
  implicit class TransformFilterCriteriaOps[Self <: TransformFilterCriteria] (val x: Self) extends AnyVal {
    
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
    def setCreatedAfter(value: Timestamp): Self = this.set("CreatedAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAfter: Self = this.set("CreatedAfter", js.undefined)
    
    @scala.inline
    def setCreatedBefore(value: Timestamp): Self = this.set("CreatedBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBefore: Self = this.set("CreatedBefore", js.undefined)
    
    @scala.inline
    def setGlueVersion(value: GlueVersionString): Self = this.set("GlueVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlueVersion: Self = this.set("GlueVersion", js.undefined)
    
    @scala.inline
    def setLastModifiedAfter(value: Timestamp): Self = this.set("LastModifiedAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedAfter: Self = this.set("LastModifiedAfter", js.undefined)
    
    @scala.inline
    def setLastModifiedBefore(value: Timestamp): Self = this.set("LastModifiedBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedBefore: Self = this.set("LastModifiedBefore", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setSchemaVarargs(value: SchemaColumn*): Self = this.set("Schema", js.Array(value :_*))
    
    @scala.inline
    def setSchema(value: TransformSchema): Self = this.set("Schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("Schema", js.undefined)
    
    @scala.inline
    def setStatus(value: TransformStatusType): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTransformType(value: TransformType): Self = this.set("TransformType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformType: Self = this.set("TransformType", js.undefined)
  }
}
