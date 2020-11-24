package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketCriteriaAdditionalProperties extends js.Object {
  
  /**
    * An equal to condition to apply to a specified attribute value for buckets.
    */
  @JSName("eq")
  var eq_FBucketCriteriaAdditionalProperties: js.UndefOr[listOfString] = js.native
  
  /**
    * A greater than condition to apply to a specified attribute value for buckets.
    */
  var gt: js.UndefOr[long] = js.native
  
  /**
    * A greater than or equal to condition to apply to a specified attribute value for buckets.
    */
  var gte: js.UndefOr[long] = js.native
  
  /**
    * A less than condition to apply to a specified attribute value for buckets.
    */
  var lt: js.UndefOr[long] = js.native
  
  /**
    * A less than or equal to condition to apply to a specified attribute value for buckets.
    */
  var lte: js.UndefOr[long] = js.native
  
  /**
    * A not equal to condition to apply to a specified attribute value for buckets.
    */
  var neq: js.UndefOr[listOfString] = js.native
  
  /**
    * The prefix of the buckets to include in the results.
    */
  var prefix: js.UndefOr[string] = js.native
}
object BucketCriteriaAdditionalProperties {
  
  @scala.inline
  def apply(): BucketCriteriaAdditionalProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketCriteriaAdditionalProperties]
  }
  
  @scala.inline
  implicit class BucketCriteriaAdditionalPropertiesOps[Self <: BucketCriteriaAdditionalProperties] (val x: Self) extends AnyVal {
    
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
    def setEqVarargs(value: string*): Self = this.set("eq", js.Array(value :_*))
    
    @scala.inline
    def setEq(value: listOfString): Self = this.set("eq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEq: Self = this.set("eq", js.undefined)
    
    @scala.inline
    def setGt(value: long): Self = this.set("gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGt: Self = this.set("gt", js.undefined)
    
    @scala.inline
    def setGte(value: long): Self = this.set("gte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGte: Self = this.set("gte", js.undefined)
    
    @scala.inline
    def setLt(value: long): Self = this.set("lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLt: Self = this.set("lt", js.undefined)
    
    @scala.inline
    def setLte(value: long): Self = this.set("lte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLte: Self = this.set("lte", js.undefined)
    
    @scala.inline
    def setNeqVarargs(value: string*): Self = this.set("neq", js.Array(value :_*))
    
    @scala.inline
    def setNeq(value: listOfString): Self = this.set("neq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeq: Self = this.set("neq", js.undefined)
    
    @scala.inline
    def setPrefix(value: string): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
}
